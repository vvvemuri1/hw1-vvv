
/* First created by JCasGen Mon Sep 09 12:22:36 EDT 2013 */
package Types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Common core attributes shared by all types.
 * Updated by JCasGen Mon Sep 09 13:18:06 EDT 2013
 * @generated */
public class BaseAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseAnnotation(addr, BaseAnnotation_Type.this);
  			   BaseAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseAnnotation(addr, BaseAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Types.BaseAnnotation");
 
  /** @generated */
  final Feature casFeat_CasProcessorId;
  /** @generated */
  final int     casFeatCode_CasProcessorId;
  /** @generated */ 
  public String getCasProcessorId(int addr) {
        if (featOkTst && casFeat_CasProcessorId == null)
      jcas.throwFeatMissing("CasProcessorId", "Types.BaseAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_CasProcessorId);
  }
  /** @generated */    
  public void setCasProcessorId(int addr, String v) {
        if (featOkTst && casFeat_CasProcessorId == null)
      jcas.throwFeatMissing("CasProcessorId", "Types.BaseAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_CasProcessorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Types.BaseAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Types.BaseAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_CasProcessorId = jcas.getRequiredFeatureDE(casType, "CasProcessorId", "uima.cas.String", featOkTst);
    casFeatCode_CasProcessorId  = (null == casFeat_CasProcessorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_CasProcessorId).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Float", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    