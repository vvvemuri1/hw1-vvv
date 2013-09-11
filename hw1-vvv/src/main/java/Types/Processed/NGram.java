

/* First created by JCasGen Sun Sep 08 20:45:45 EDT 2013 */
package Types.Processed;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import Types.Base.BaseAnnotation;

import Types.TestElement.Answer;

/** Type representing unigram, bigram or trigram in question/answer.
 * Updated by JCasGen Tue Sep 10 21:03:17 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/AnalysisEngineDescriptors/Primitive/NGramAnnotator.xml
 * @generated */
public class NGram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: ElementType

  /** getter for ElementType - gets Type of the Objects stored in 'elements' array.
   * @generated */
  public String getElementType() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ElementType == null)
      jcasType.jcas.throwFeatMissing("ElementType", "Types.Processed.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ElementType);}
    
  /** setter for ElementType - sets Type of the Objects stored in 'elements' array. 
   * @generated */
  public void setElementType(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_ElementType == null)
      jcasType.jcas.throwFeatMissing("ElementType", "Types.Processed.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_ElementType, v);}    
    //*--------------*
  //* Feature: Elements

  /** getter for Elements - gets Tokens in NGram.
   * @generated */
  public FSArray getElements() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Types.Processed.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements)));}
    
  /** setter for Elements - sets Tokens in NGram. 
   * @generated */
  public void setElements(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Types.Processed.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated */
  public Answer getElements(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Types.Processed.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i)));}

  /** indexed setter for elements - sets an indexed value - 
   * @generated */
  public void setElements(int i, Answer v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Types.Processed.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    