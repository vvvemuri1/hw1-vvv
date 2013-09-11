
/* First created by JCasGen Tue Sep 10 21:24:19 EDT 2013 */
package edu.cmu.lti.types.processed;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.lti.types.base.BaseAnnotation_Type;

/** Evaluation of the answers to the question.
 * Updated by JCasGen Tue Sep 10 21:29:12 EDT 2013
 * @generated */
public class Evaluation_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.types.processed.Evaluation");
 
  /** @generated */
  final Feature casFeat_SortedAnswers;
  /** @generated */
  final int     casFeatCode_SortedAnswers;
  /** @generated */ 
  public int getSortedAnswers(int addr) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers);
  }
  /** @generated */    
  public void setSortedAnswers(int addr, int v) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_SortedAnswers, v);}
    
   /** @generated */
  public int getSortedAnswers(int addr, int i) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i);
  }
   
  /** @generated */ 
  public void setSortedAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "edu.cmu.lti.types.processed.Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Precision;
  /** @generated */
  final int     casFeatCode_Precision;
  /** @generated */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.lti.types.processed.Evaluation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Precision);
  }
  /** @generated */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.lti.types.processed.Evaluation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SortedAnswers = jcas.getRequiredFeatureDE(casType, "SortedAnswers", "uima.cas.FSArray", featOkTst);
    casFeatCode_SortedAnswers  = (null == casFeat_SortedAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SortedAnswers).getCode();

 
    casFeat_Precision = jcas.getRequiredFeatureDE(casType, "Precision", "uima.cas.Float", featOkTst);
    casFeatCode_Precision  = (null == casFeat_Precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Precision).getCode();

  }
}



    