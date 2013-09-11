
/* First created by JCasGen Tue Sep 10 21:25:37 EDT 2013 */
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

import edu.cmu.lti.types.base.BaseAnnotation_Type;

/** SuperType of Question and Answer.
 * Updated by JCasGen Wed Sep 11 09:54:05 EDT 2013
 * @generated */
public class Sentence_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.types.testElement.Sentence");
 
  /** @generated */
  final Feature casFeat_Id;
  /** @generated */
  final int     casFeatCode_Id;
  /** @generated */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "edu.cmu.lti.types.testElement.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Id);
  }
  /** @generated */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "edu.cmu.lti.types.testElement.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_Id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
   /** @generated */
  public int getTokenList(int addr, int i) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
  }
   
  /** @generated */ 
  public void setTokenList(int addr, int i, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
  * @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Id = jcas.getRequiredFeatureDE(casType, "Id", "uima.cas.Integer", featOkTst);
    casFeatCode_Id  = (null == casFeat_Id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Id).getCode();

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.FSArray", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

  }
}



    