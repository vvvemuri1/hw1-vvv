package Annotators;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import Types.Processed.Evaluation;
import Types.TestElement.Answer;

public class EvaluationAnnotator extends JCasAnnotator_ImplBase
{
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex answerIndex = jcas.getAnnotationIndex(Answer.type);
    Iterator answerIter = answerIndex.iterator();
    
    int correct = 0;
    int i = 0;
    FSArray answers = new FSArray(jcas, answerIndex.size());   
    while(answerIter.hasNext())
    {
      Answer answer = (Answer) answerIter.next();
      answers.set(i++, (FeatureStructure) answer);
      if (answer.getIsCorrect())
      {
        correct++;
      }
    }
    
    Evaluation annotation = new Evaluation(jcas);
    annotation.setCasProcessorId(EvaluationAnnotator.class.getName());
    
    // Sort answers
    Arrays.sort(answers.toArray());
    annotation.setSortedAnswers(answers);

    // Compute Precision
    float precision = correct/(answers.size());
    annotation.setPrecision(precision);
    
    annotation.addToIndexes();
  }
}
