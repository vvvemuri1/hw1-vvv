

/* First created by JCasGen Mon Sep 09 10:22:11 EDT 2013 */
package Types.Processed;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import Types.TestElement.Answer;
import Types.AbstractAnnotation;


/** Evaluation of the answers to the question.
 * Updated by JCasGen Mon Sep 09 11:23:35 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/Aggregate/TestElementAndEvaluation.xml
 * @generated */
public class Evaluation extends AbstractAnnotation {
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
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Types.Processed.Evaluation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers)));}
    
  /** setter for SortedAnswers - sets Answers sorted according to their scores. 
   * @generated */
  public void setSortedAnswers(FSArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Types.Processed.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for SortedAnswers - gets an indexed value - 
   * @generated */
  public Answer getSortedAnswers(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Types.Processed.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i)));}

  /** indexed setter for SortedAnswers - sets an indexed value - 
   * @generated */
  public void setSortedAnswers(int i, Answer v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Types.Processed.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_SortedAnswers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets Average Precision of the answers to the question (#correct / #predicted).
   * @generated */
  public float getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Types.Processed.Evaluation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets Average Precision of the answers to the question (#correct / #predicted). 
   * @generated */
  public void setPrecision(float v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Types.Processed.Evaluation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision, v);}    
  }

    