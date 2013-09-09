

/* First created by JCasGen Sun Sep 08 20:45:45 EDT 2013 */
package Types.Processed;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import Types.AbstractAnnotation;


import org.apache.uima.jcas.tcas.Annotation;


/** Token in question/answer (delimited by whitespace and punctuation).
 * Updated by JCasGen Sun Sep 08 22:52:37 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/NGramAnnotator.xml
 * @generated */
public class QAToken extends AbstractAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAToken.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected QAToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QAToken(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    