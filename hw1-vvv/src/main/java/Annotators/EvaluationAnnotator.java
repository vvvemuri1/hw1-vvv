package Annotators;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.lti.types.processed.Evaluation;
import edu.cmu.lti.types.testElement.Answer;

public class EvaluationAnnotator extends JCasAnnotator_ImplBase
{
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex answerIndex = jcas.getAnnotationIndex(Answer.type);
    Iterator answerIter = answerIndex.iterator();
    
    int answerStart = 0;
    int answerEnd = 0;
    
    int correct = 0;
    int i = 0;
    FSArray answers = new FSArray(jcas, answerIndex.size());   
    while(answerIter.hasNext())
    {
      Answer answer = (Answer) answerIter.next();
      
      if (i == 0)
      {
        answerStart = answer.getBegin();
      }
      else if (i == answerIndex.size() - 1)
      {
        answerEnd = answer.getEnd();
      }
      
      answers.set(i++, answer);
      if (answer.getIsCorrect())
      {
        correct++;
      }
    }
    
    Evaluation annotation = new Evaluation(jcas);
    annotation.setBegin(answerStart);
    annotation.setEnd(answerEnd);
    annotation.setCasProcessorId(EvaluationAnnotator.class.getName());
    annotation.setConfidence(1.0f);
    
    // Sort answers
    sortAnswers(answerIndex, answers);    
    annotation.setSortedAnswers(answers);

    // Compute Precision
    float precision = ((float)correct)/(answers.size());
    annotation.setPrecision(precision);
    
    annotation.addToIndexes();
  }

  private void sortAnswers(FSIndex answerIndex, FSArray answers) 
  {
    for (int j = 0; j < answerIndex.size() - 1; j++)
    {
      Answer max = (Answer) answers.get(j);
      int maxIndex = j;
      
      for (int k = j + 1; k < answerIndex.size() - 1; k++)
      {
        Answer current = (Answer)answers.get(k);
        if ((current).getScore() > max.getScore())
        {
          max = current;
          maxIndex = k;
        }
      }

      Answer temp = (Answer)answers.get(j);
      answers.set(j, max);
      answers.set(maxIndex, temp);
    }
  }
}
