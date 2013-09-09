

/* First created by JCasGen Sun Sep 08 15:51:41 EDT 2013 */
package Types.TestElement;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import Types.AbstractAnnotation;


/** Proposed answer to question being asked in sample information processing task.
 * Updated by JCasGen Mon Sep 09 10:03:55 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/EvaluationAnnotator.xml
 * @generated */
public class Answer extends QuestionAnswer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: IsCorrect

  /** getter for IsCorrect - gets Boolean Flag indicating whether or not the proposed answer is correct.
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Types.TestElement.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect);}
    
  /** setter for IsCorrect - sets Boolean Flag indicating whether or not the proposed answer is correct. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Types.TestElement.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_IsCorrect, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Answer score (assigned using Gold Answer Scoring System).
   * @generated */
  public float getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Types.TestElement.Answer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Answer score (assigned using Gold Answer Scoring System). 
   * @generated */
  public void setScore(float v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Types.TestElement.Answer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
  }

    