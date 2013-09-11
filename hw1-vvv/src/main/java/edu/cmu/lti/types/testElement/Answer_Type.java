
/* First created by JCasGen Tue Sep 10 21:29:12 EDT 2013 */
package edu.cmu.lti.types.testElement;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Proposed answer to question being asked in sample information processing task.
 * Updated by JCasGen Wed Sep 11 09:54:05 EDT 2013
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.types.testElement.Answer");
 
  /** @generated */
  final Feature casFeat_IsCorrect;
  /** @generated */
  final int     casFeatCode_IsCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "edu.cmu.lti.types.testElement.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_IsCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "edu.cmu.lti.types.testElement.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_IsCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Score;
  /** @generated */
  final int     casFeatCode_Score;
  /** @generated */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "edu.cmu.lti.types.testElement.Answer");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Score);
  }
  /** @generated */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_Score == null)
      jcas.throwFeatMissing("Score", "edu.cmu.lti.types.testElement.Answer");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
  * @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_IsCorrect = jcas.getRequiredFeatureDE(casType, "IsCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_IsCorrect  = (null == casFeat_IsCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCorrect).getCode();

 
    casFeat_Score = jcas.getRequiredFeatureDE(casType, "Score", "uima.cas.Float", featOkTst);
    casFeatCode_Score  = (null == casFeat_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Score).getCode();

  }
}



    