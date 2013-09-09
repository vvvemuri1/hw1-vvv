package Annotators;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import Types.Processed.NGram;
import Types.Processed.QAToken;

public class NGramAnnotator extends JCasAnnotator_ImplBase 
{  
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex tokenIndex = jcas.getAnnotationIndex(QAToken.type);
    Iterator tokenIter = tokenIndex.iterator();
    
    QAToken prevPrevToken = null;
    QAToken prevToken = null;
    
    while(tokenIter.hasNext())
    {
      QAToken qaToken = (QAToken) tokenIter.next();
      
      // Unigram
      NGram annotation = new NGram(jcas);
      annotation.setBegin(qaToken.getBegin());
      annotation.setEnd(qaToken.getEnd());
      annotation.setConfidence(qaToken.getConfidence());
      annotation.setCasProcessorId(NGramAnnotator.class.getName());
      
      int sentenceIndex = qaToken.getSentenceIndex();
      FSArray elements = new FSArray(jcas,1);
      elements.set(0, qaToken);
      
      annotation.setElements(elements);
      annotation.addToIndexes();
        
      // Bigram
      if (prevToken != null && 
              sentenceIndex == prevToken.getSentenceIndex())
      {
        annotation = new NGram(jcas);
        annotation.setBegin(prevToken.getBegin());
        annotation.setEnd(qaToken.getEnd());
        
        annotation.setConfidence(qaToken.getConfidence());
        annotation.setCasProcessorId(NGramAnnotator.class.getName());
        
        elements = new FSArray(jcas,2);
        elements.set(0, prevToken);
        elements.set(1, qaToken);

        annotation.setElements(elements);
        annotation.addToIndexes();
      }
        
      // Trigram
      if (prevPrevToken != null && 
              sentenceIndex == prevPrevToken.getSentenceIndex())
      {
        annotation = new NGram(jcas);
        annotation.setBegin(prevPrevToken.getBegin());
        annotation.setEnd(qaToken.getEnd());
        
        annotation.setConfidence(qaToken.getConfidence());
        annotation.setCasProcessorId(NGramAnnotator.class.getName());
        
        elements = new FSArray(jcas,3);
        elements.set(0, prevPrevToken);
        elements.set(1, prevToken);
        elements.set(2, qaToken);
  
        annotation.setElements(elements);
        annotation.addToIndexes();
      }
        
      prevPrevToken = prevToken;
      prevToken = qaToken;
    }
  }
}
