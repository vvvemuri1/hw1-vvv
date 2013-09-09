
/* First created by JCasGen Sun Sep 08 20:45:45 EDT 2013 */
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
import Types.AbstractAnnotation_Type;

import org.apache.uima.jcas.tcas.Annotation_Type;

/** Token in question/answer (delimited by whitespace and punctuation).
 * Updated by JCasGen Mon Sep 09 10:23:04 EDT 2013
 * @generated */
public class QAToken_Type extends AbstractAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAToken(addr, QAToken_Type.this);
  			   QAToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAToken(addr, QAToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Types.Processed.QAToken");



  /** @generated */
  final Feature casFeat_sentenceIndex;
  /** @generated */
  final int     casFeatCode_sentenceIndex;
  /** @generated */ 
  public int getSentenceIndex(int addr) {
        if (featOkTst && casFeat_sentenceIndex == null)
      jcas.throwFeatMissing("sentenceIndex", "Types.Processed.QAToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentenceIndex);
  }
  /** @generated */    
  public void setSentenceIndex(int addr, int v) {
        if (featOkTst && casFeat_sentenceIndex == null)
      jcas.throwFeatMissing("sentenceIndex", "Types.Processed.QAToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentenceIndex, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceIndex = jcas.getRequiredFeatureDE(casType, "sentenceIndex", "uima.cas.Integer", featOkTst);
    casFeatCode_sentenceIndex  = (null == casFeat_sentenceIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceIndex).getCode();

  }
}



    