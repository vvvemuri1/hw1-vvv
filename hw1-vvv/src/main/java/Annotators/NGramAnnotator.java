package Annotators;

import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import Types.Processed.NGram;
import Types.TestElement.QuestionAnswer;

public class NGramAnnotator extends JCasAnnotator_ImplBase 
{  
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex qaIndex = jcas.getAnnotationIndex(QuestionAnswer.type);
    Iterator qaIter = qaIndex.iterator();
    while(qaIter.hasNext())
    {
      QuestionAnswer questionAnswer = (QuestionAnswer) qaIter.next();
      StringTokenizer st = new StringTokenizer(questionAnswer.getCoveredText()," ?.");
      
      int begin = questionAnswer.getBegin();
      int end = begin;
      
      int prevPrevBegin = -1;
      int prevBegin = -1;
      
      while (st.hasMoreTokens())
      {
        String current = st.nextToken();
        end = begin + current.length();
        
        // Unigram
        NGram annotation = new NGram(jcas);
        annotation.setBegin(begin);
        annotation.setEnd(end);
        annotation.addToIndexes();
        
        // Bigram
        if (prevBegin != -1)
        {
          annotation = new NGram(jcas);
          annotation.setBegin(prevBegin);
          annotation.setEnd(end);
          annotation.addToIndexes();
        }
        
        // Trigram
        if (prevPrevBegin != -1)
        {
          annotation = new NGram(jcas);
          annotation.setBegin(prevPrevBegin);
          annotation.setEnd(end);
          annotation.addToIndexes();
        }
        
        prevPrevBegin = prevBegin;
        prevBegin = begin;
        begin = end + 1;
      }
    }
  }
}
