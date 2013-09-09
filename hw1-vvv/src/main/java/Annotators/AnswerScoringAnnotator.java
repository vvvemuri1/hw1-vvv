package Annotators;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import Types.Processed.NGram;
import Types.Processed.QAToken;
import Types.TestElement.Answer;
import Types.TestElement.Question;

public class AnswerScoringAnnotator extends JCasAnnotator_ImplBase 
{
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex answerIndex = jcas.getAnnotationIndex(Answer.type);
    Iterator answerIter = answerIndex.iterator();

    while(answerIter.hasNext())
    {
      Answer answer = (Answer) answerIter.next();
      if (answer.getIsCorrect())
      {
        answer.setScore(1.0f);
        answer.setCasProcessorId(AnswerScoringAnnotator.class.getName());
      }
      else
      {
        answer.setScore(0);
        answer.setCasProcessorId(AnswerScoringAnnotator.class.getName());
      }
    }
  }
}
