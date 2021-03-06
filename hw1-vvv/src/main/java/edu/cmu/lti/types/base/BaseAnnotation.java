

/* First created by JCasGen Tue Sep 10 21:24:19 EDT 2013 */
package edu.cmu.lti.types.base;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Common core attributes shared by all types.
 * Updated by JCasGen Wed Sep 11 09:54:05 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/hw1-vvv-typesystem.xml
 * @generated */
public class BaseAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotation.class);
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
  protected BaseAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: CasProcessorId

  /** getter for CasProcessorId - gets componentId of creator.
   * @generated */
  public String getCasProcessorId() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_CasProcessorId == null)
      jcasType.jcas.throwFeatMissing("CasProcessorId", "edu.cmu.lti.types.base.BaseAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_CasProcessorId);}
    
  /** setter for CasProcessorId - sets componentId of creator. 
   * @generated */
  public void setCasProcessorId(String v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_CasProcessorId == null)
      jcasType.jcas.throwFeatMissing("CasProcessorId", "edu.cmu.lti.types.base.BaseAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_CasProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence of the creator in the correctness of the output on a scale of 0 to 1.0.
   * @generated */
  public float getConfidence() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "edu.cmu.lti.types.base.BaseAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Confidence of the creator in the correctness of the output on a scale of 0 to 1.0. 
   * @generated */
  public void setConfidence(float v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "edu.cmu.lti.types.base.BaseAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    