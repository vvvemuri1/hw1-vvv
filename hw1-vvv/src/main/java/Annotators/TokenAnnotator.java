package Annotators;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import Types.TestElement.QA;
import Types.Token.QAToken;

public class TokenAnnotator extends JCasAnnotator_ImplBase 
{
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex qaIndex = jcas.getAnnotationIndex(QA.type);
    Iterator qaIter = qaIndex.iterator();
    while(qaIter.hasNext())
    {
      QA questionAnswer = (QA) qaIter.next();
      StringTokenizer st = new StringTokenizer(questionAnswer.getCoveredText()," ?.");
      
      int begin = questionAnswer.getBegin();
      int end = begin;
              
      while (st.hasMoreTokens())
      {
        QAToken annotation = new QAToken(jcas);
        end = begin + st.nextToken().length();
        annotation.setBegin(begin);
        annotation.setEnd(end);
        annotation.addToIndexes();
        System.out.println(annotation.getCoveredText());
        begin = end + 1;
      }
    }
  }
}
