package Annotators;

import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import Types.Processed.Token;
import Types.TestElement.Sentence;

public class TokenAnnotator extends JCasAnnotator_ImplBase 
{
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex qaIndex = jcas.getAnnotationIndex(Sentence.type);
    Iterator qaIter = qaIndex.iterator();
    int sentenceIndex = 0;
    
    while(qaIter.hasNext())
    {
      Sentence questionAnswer = (Sentence) qaIter.next();
      StringTokenizer st = new StringTokenizer(questionAnswer.getCoveredText()," ?.");
      
      int begin = questionAnswer.getBegin();
      int end = begin;
              
      while (st.hasMoreTokens())
      {
        Token annotation = new Token(jcas);
        end = begin + st.nextToken().length();
        annotation.setBegin(begin);
        annotation.setEnd(end);
        annotation.setConfidence(questionAnswer.getConfidence());
        annotation.setCasProcessorId(TokenAnnotator.class.getName());
        annotation.setSentenceIndex(sentenceIndex);
        annotation.addToIndexes();
        begin = end + 1;
      }
      
      sentenceIndex++;
    }
  }
}
