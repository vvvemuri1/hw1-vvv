

/* First created by JCasGen Sun Sep 08 19:15:23 EDT 2013 */
package Types.TestElement;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Sep 08 20:27:03 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/TestElementAndToken.xml
 * @generated */
public class QA extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QA.class);
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
  protected QA() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QA(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QA(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QA(JCas jcas, int begin, int end) {
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

    