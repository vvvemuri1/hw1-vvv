package Annotators;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;

import Types.Processed.Token;
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
      annotation.setId(sentenceId++);
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
      annotation.setId(sentenceId++);
      annotation.setCasProcessorId(TestElementAnnotator.class.getName());

      String answer = annotation.getCoveredText();
      StringTokenizer st = new StringTokenizer(answer);
            
      int begin = annotation.getBegin();
      int end = begin;
      
      if (st.hasMoreTokens())
      {
        String tokenString = st.nextToken();
        end = begin + tokenString.length();
        begin = end + 1;
      }
      else
      {
        throw new NoSuchElementException("Invalid answer: " + answer);
      }
      
      if (st.hasMoreTokens())
      {
          String isCorrect = st.nextToken();
          end = begin + isCorrect.length();

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
          
          begin = end + 1;
      }
      else
      {
        throw new NoSuchElementException("Invalid answer: " + answer);
      }
      
      FSArray tokens = new FSArray(jcas, st.countTokens());

      int i = 0;
      
      while(st.hasMoreTokens())
      {
        String tokenString = st.nextToken();
        end = begin + tokenString.length();
        
        Token token = new Token(jcas);
        token.setBegin(begin);
        token.setEnd(end);
        token.setText(tokenString);
        token.setSentenceId(sentenceId);
        tokens.set(i++, token);
        
        begin = end + 1;
      }
      
      annotation.setTokenList(tokens);            
      annotation.setBegin(matcher.start() + 4);
      annotation.addToIndexes();
      position = matcher.end();
    }
  } 
}
