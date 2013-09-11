
/* First created by JCasGen Mon Sep 09 12:59:41 EDT 2013 */
package Types.Processed;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import Types.Base.BaseAnnotation_Type;

/** Token in question/answer (delimited by whitespace and punctuation).
 * Updated by JCasGen Tue Sep 10 21:04:01 EDT 2013
 * @generated */
public class Token_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Types.Processed.Token");
 
  /** @generated */
  final Feature casFeat_SentenceId;
  /** @generated */
  final int     casFeatCode_SentenceId;
  /** @generated */ 
  public int getSentenceId(int addr) {
        if (featOkTst && casFeat_SentenceId == null)
      jcas.throwFeatMissing("SentenceId", "Types.Processed.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_SentenceId);
  }
  /** @generated */    
  public void setSentenceId(int addr, int v) {
        if (featOkTst && casFeat_SentenceId == null)
      jcas.throwFeatMissing("SentenceId", "Types.Processed.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_SentenceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PartOfSpeech;
  /** @generated */
  final int     casFeatCode_PartOfSpeech;
  /** @generated */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_PartOfSpeech == null)
      jcas.throwFeatMissing("PartOfSpeech", "Types.Processed.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_PartOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_PartOfSpeech == null)
      jcas.throwFeatMissing("PartOfSpeech", "Types.Processed.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_PartOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Text;
  /** @generated */
  final int     casFeatCode_Text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Types.Processed.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Types.Processed.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceId = jcas.getRequiredFeatureDE(casType, "SentenceId", "uima.cas.Integer", featOkTst);
    casFeatCode_SentenceId  = (null == casFeat_SentenceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceId).getCode();

 
    casFeat_PartOfSpeech = jcas.getRequiredFeatureDE(casType, "PartOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_PartOfSpeech  = (null == casFeat_PartOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PartOfSpeech).getCode();

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

  }
}



    