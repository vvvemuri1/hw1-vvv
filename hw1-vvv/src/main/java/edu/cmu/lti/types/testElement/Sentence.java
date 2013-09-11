

/* First created by JCasGen Tue Sep 10 21:25:37 EDT 2013 */
package edu.cmu.lti.types.testElement;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.lti.types.base.BaseAnnotation;
import edu.cmu.lti.types.processed.Token;

/** SuperType of Question and Answer.
 * Updated by JCasGen Wed Sep 11 09:54:05 EDT 2013
 * XML source: /Users/vvvemuri1/Masters/11791/hw1/hw1-vvv/hw1-vvv/src/main/resources/hw1-vvv-typesystem.xml
 * @generated */
public class Sentence extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: Id

  /** getter for Id - gets Unique number assigned to each sentence to allow token to determine which sentence it is part of.
   * @generated */
  public int getId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "edu.cmu.lti.types.testElement.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets Unique number assigned to each sentence to allow token to determine which sentence it is part of. 
   * @generated */
  public void setId(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "edu.cmu.lti.types.testElement.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: TokenList

  /** getter for TokenList - gets List of tokens in sentence.
   * @generated */
  public FSArray getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets List of tokens in sentence. 
   * @generated */
  public void setTokenList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - List of tokens in sentence.
   * @generated */
  public Token getTokenList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - List of tokens in sentence.
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.types.testElement.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    