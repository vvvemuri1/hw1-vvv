

/* First created by JCasGen Mon Sep 09 12:44:53 EDT 2013 */
package Types.TestElement;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import Types.BaseAnnotation;


/** SuperType of Question and Answer.
 * Updated by JCasGen Mon Sep 09 13:18:06 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/Primitive/TokenAnnotator.xml
 * @generated */
public class Sentence extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
     
  //*--------------*
  //* Feature: SentenceId

  /** getter for SentenceId - gets Unique number assigned to each sentence to allow token to determine which sentence it is part of.
   * @generated */
  public int getSentenceId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "Types.TestElement.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceId);}
    
  /** setter for SentenceId - sets Unique number assigned to each sentence to allow token to determine which sentence it is part of. 
   * @generated */
  public void setSentenceId(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "Types.TestElement.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceId, v);}    
  }

    