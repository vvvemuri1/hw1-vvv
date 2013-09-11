

/* First created by JCasGen Tue Sep 10 21:24:19 EDT 2013 */
package edu.cmu.lti.types.processed;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.lti.types.base.BaseAnnotation;
import edu.cmu.lti.types.testElement.Answer;


/** Evaluation of the answers to the question.
 * Updated by JCasGen Tue Sep 10 22:39:55 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/Primitive/EvaluationAnnotator.xml
 * @generated */
public class Evaluation extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
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
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
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
  //* Feature: SortedAnswers

  /** getter for SortedAnswers - gets Answers sorted according to their scores.
   * @generated */
  public FSArray getSortedAnswers() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers)));}
    
  /** setter for SortedAnswers - sets Answers sorted according to their scores. 
   * @generated */
  public void setSortedAnswers(FSArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for SortedAnswers - gets an indexed value - Answers sorted according to their scores.
   * @generated */
  public Answer getSortedAnswers(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i)));}

  /** indexed setter for SortedAnswers - sets an indexed value - Answers sorted according to their scores.
   * @generated */
  public void setSortedAnswers(int i, Answer v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets Average Precision of the answers to the question (#correct / #predicted).
   * @generated */
  public float getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "edu.cmu.lti.types.processed.Evaluation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets Average Precision of the answers to the question (#correct / #predicted). 
   * @generated */
  public void setPrecision(float v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "edu.cmu.lti.types.processed.Evaluation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision, v);}    
  }


