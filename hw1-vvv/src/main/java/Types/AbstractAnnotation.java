

/* First created by JCasGen Sun Sep 08 22:52:08 EDT 2013 */
package Types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 09 10:29:11 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/Primitive/EvaluationAnnotator.xml
 * @generated */
public class AbstractAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractAnnotation.class);
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
  protected AbstractAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AbstractAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AbstractAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AbstractAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets componentId of creator.
   * @generated */
  public String getCasProcessorId() {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "Types.AbstractAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets componentId of creator. 
   * @generated */
  public void setCasProcessorId(String v) {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "Types.AbstractAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence of the creator in the correctness of the output on a scale of 0 to 1.0.
   * @generated */
  public float getConfidence() {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Types.AbstractAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence of the creator in the correctness of the output on a scale of 0 to 1.0. 
   * @generated */
  public void setConfidence(float v) {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Types.AbstractAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    