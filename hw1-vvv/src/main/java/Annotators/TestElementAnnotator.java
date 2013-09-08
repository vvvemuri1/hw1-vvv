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

    // search for Question
    Matcher matcher = questionPattern.matcher(docText);
    int position = 0;
    while (matcher.find(position)) 
    {
      Question annotation = new Question(jcas);
      annotation.setBegin(matcher.start());
      annotation.setEnd(matcher.end());
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
            annotation.setIsCorrect(false);
          }
          else if (Integer.parseInt(isCorrect) == 1)
          {
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
      
      System.out.println(annotation.getCoveredText());
      
      annotation.addToIndexes();
      position = matcher.end();
    }
  } 
}
