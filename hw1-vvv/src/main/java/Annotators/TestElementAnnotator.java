package Annotators;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import Types.TestElement.Answer;
import Types.TestElement.Question;

public class TestElementAnnotator extends JCasAnnotator_ImplBase 
{
  private Pattern questionPattern = Pattern.compile("Q\\s.+\\?");
  private Pattern answerPattern = Pattern.compile("A\\s\\d\\s.+");
  
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    // get document text
    String docText = jcas.getDocumentText();

    int sentenceId = 0;
    
    // search for Question
    Matcher matcher = questionPattern.matcher(docText);
    int position = 0;
    while (matcher.find(position)) 
    {
      Question annotation = new Question(jcas);
      annotation.setBegin(matcher.start() + 2);
      annotation.setEnd(matcher.end());
      annotation.setCasProcessorId(TestElementAnnotator.class.getName());
      annotation.setConfidence(1.0f);
      annotation.setSentenceId(sentenceId++);
      annotation.addToIndexes();
      position = matcher.end();
    }
    
    // search for Answer(s)
    matcher = answerPattern.matcher(docText);
    position = 0;
    while (matcher.find(position))
    {
      Answer annotation = new Answer(jcas);
      annotation.setBegin(matcher.start());
      annotation.setEnd(matcher.end());
      annotation.setSentenceId(sentenceId++);
      annotation.setCasProcessorId(TestElementAnnotator.class.getName());

      String answer = annotation.getCoveredText();
      StringTokenizer st = new StringTokenizer(answer);
            
      if (st.hasMoreTokens())
      {
        st.nextToken();
      }
      else
      {
        throw new NoSuchElementException("Invalid answer: " + answer);
      }
      
      if (st.hasMoreTokens())
      {
          String isCorrect = st.nextToken();
          if (Integer.parseInt(isCorrect) == 0)
          {
            annotation.setConfidence(0f);
            annotation.setIsCorrect(false);
          }
          else if (Integer.parseInt(isCorrect) == 1)
          {
            annotation.setConfidence(1.0f);
            annotation.setIsCorrect(true);
          }
          else
          {
            throw new IllegalArgumentException("Invalid answer: " + answer);
          }
      }
      else
      {
        throw new NoSuchElementException("Invalid answer: " + answer);
      }
            
      annotation.setBegin(matcher.start() + 4);
      annotation.addToIndexes();
      position = matcher.end();
    }
  } 
}
