

/* First created by JCasGen Tue Sep 10 21:29:12 EDT 2013 */
package edu.cmu.lti.types.processed;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.types.base.BaseAnnotation;


/** Token in question/answer (delimited by whitespace and punctuation).
 * Updated by JCasGen Tue Sep 10 21:29:12 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/hw1-vvv-typesystem.xml
 * @generated */
public class Token extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: SentenceId

  /** getter for SentenceId - gets Unique number assigned to each sentence to allow token to determine which sentence it is part of.
   * @generated */
  public int getSentenceId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "edu.cmu.lti.types.processed.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_SentenceId);}
    
  /** setter for SentenceId - sets Unique number assigned to each sentence to allow token to determine which sentence it is part of. 
   * @generated */
  public void setSentenceId(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_SentenceId == null)
      jcasType.jcas.throwFeatMissing("SentenceId", "edu.cmu.lti.types.processed.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_SentenceId, v);}    
   
    
  //*--------------*
  //* Feature: PartOfSpeech

  /** getter for PartOfSpeech - gets Linguistic category of token.
   * @generated */
  public String getPartOfSpeech() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_PartOfSpeech == null)
      jcasType.jcas.throwFeatMissing("PartOfSpeech", "edu.cmu.lti.types.processed.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_PartOfSpeech);}
    
  /** setter for PartOfSpeech - sets Linguistic category of token. 
   * @generated */
  public void setPartOfSpeech(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_PartOfSpeech == null)
      jcasType.jcas.throwFeatMissing("PartOfSpeech", "edu.cmu.lti.types.processed.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_PartOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets Text contained in token.
   * @generated */
  public String getText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "edu.cmu.lti.types.processed.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets Text contained in token. 
   * @generated */
  public void setText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "edu.cmu.lti.types.processed.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_Text, v);}    
  }

    