package org.eclipselabs.swedit.jenarules.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipselabs.swedit.jenarules.services.JenaRulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJenaRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IRI_TERMINAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "':'", "'@prefix'", "'.'", "','", "'->'", "'('", "')'", "'?'", "'^^'", "'@'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_IRI_TERMINAL=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalJenaRulesParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g"; }



     	private JenaRulesGrammarAccess grammarAccess;
     	
        public InternalJenaRulesParser(TokenStream input, IAstFactory factory, JenaRulesGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "JenaRuleDocument";	
       	}
       	
       	@Override
       	protected JenaRulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleJenaRuleDocument
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:77:1: entryRuleJenaRuleDocument returns [EObject current=null] : iv_ruleJenaRuleDocument= ruleJenaRuleDocument EOF ;
    public final EObject entryRuleJenaRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJenaRuleDocument = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:78:2: (iv_ruleJenaRuleDocument= ruleJenaRuleDocument EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:79:2: iv_ruleJenaRuleDocument= ruleJenaRuleDocument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJenaRuleDocumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleJenaRuleDocument_in_entryRuleJenaRuleDocument75);
            iv_ruleJenaRuleDocument=ruleJenaRuleDocument();
            _fsp--;

             current =iv_ruleJenaRuleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJenaRuleDocument85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJenaRuleDocument


    // $ANTLR start ruleJenaRuleDocument
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:86:1: ruleJenaRuleDocument returns [EObject current=null] : ( ( (lv_prefixes_0_0= rulePrefix ) )* ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleJenaRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_prefixes_0_0 = null;

        EObject lv_rules_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:91:6: ( ( ( (lv_prefixes_0_0= rulePrefix ) )* ( (lv_rules_1_0= ruleRule ) )* ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:92:1: ( ( (lv_prefixes_0_0= rulePrefix ) )* ( (lv_rules_1_0= ruleRule ) )* )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:92:1: ( ( (lv_prefixes_0_0= rulePrefix ) )* ( (lv_rules_1_0= ruleRule ) )* )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:92:2: ( (lv_prefixes_0_0= rulePrefix ) )* ( (lv_rules_1_0= ruleRule ) )*
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:92:2: ( (lv_prefixes_0_0= rulePrefix ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:93:1: (lv_prefixes_0_0= rulePrefix )
            	    {
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:93:1: (lv_prefixes_0_0= rulePrefix )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:94:3: lv_prefixes_0_0= rulePrefix
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getJenaRuleDocumentAccess().getPrefixesPrefixParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefix_in_ruleJenaRuleDocument131);
            	    lv_prefixes_0_0=rulePrefix();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getJenaRuleDocumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"prefixes",
            	    	        		lv_prefixes_0_0, 
            	    	        		"Prefix", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:116:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:117:1: (lv_rules_1_0= ruleRule )
            	    {
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:117:1: (lv_rules_1_0= ruleRule )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:118:3: lv_rules_1_0= ruleRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getJenaRuleDocumentAccess().getRulesRuleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleJenaRuleDocument153);
            	    lv_rules_1_0=ruleRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getJenaRuleDocumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rules",
            	    	        		lv_rules_1_0, 
            	    	        		"Rule", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJenaRuleDocument


    // $ANTLR start entryRuleRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:148:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:149:2: (iv_ruleRule= ruleRule EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:150:2: iv_ruleRule= ruleRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule190);
            iv_ruleRule=ruleRule();
            _fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:157:1: ruleRule returns [EObject current=null] : ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_ruleName_5_0=null;
        EObject lv_bareRule_0_0 = null;

        EObject lv_bareRule_2_0 = null;

        EObject lv_bareRule_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:162:6: ( ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:163:1: ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:163:1: ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    alt3=3;
                }
                else if ( (LA3_2==19) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("163:1: ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) )", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("163:1: ( ( (lv_bareRule_0_0= ruleBareRule ) ) | ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' ) | ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' ) )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:163:2: ( (lv_bareRule_0_0= ruleBareRule ) )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:163:2: ( (lv_bareRule_0_0= ruleBareRule ) )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:164:1: (lv_bareRule_0_0= ruleBareRule )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:164:1: (lv_bareRule_0_0= ruleBareRule )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:165:3: lv_bareRule_0_0= ruleBareRule
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBareRule_in_ruleRule246);
                    lv_bareRule_0_0=ruleBareRule();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bareRule",
                    	        		lv_bareRule_0_0, 
                    	        		"BareRule", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:188:6: ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:188:6: ( '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']' )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:188:8: '[' ( (lv_bareRule_2_0= ruleBareRule ) ) ']'
                    {
                    match(input,12,FOLLOW_12_in_ruleRule263); 

                            createLeafNode(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:192:1: ( (lv_bareRule_2_0= ruleBareRule ) )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:193:1: (lv_bareRule_2_0= ruleBareRule )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:193:1: (lv_bareRule_2_0= ruleBareRule )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:194:3: lv_bareRule_2_0= ruleBareRule
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBareRule_in_ruleRule284);
                    lv_bareRule_2_0=ruleBareRule();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bareRule",
                    	        		lv_bareRule_2_0, 
                    	        		"BareRule", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,13,FOLLOW_13_in_ruleRule294); 

                            createLeafNode(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:221:6: ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:221:6: ( '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']' )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:221:8: '[' ( (lv_ruleName_5_0= RULE_ID ) ) ':' ( (lv_bareRule_7_0= ruleBareRule ) ) ']'
                    {
                    match(input,12,FOLLOW_12_in_ruleRule312); 

                            createLeafNode(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:225:1: ( (lv_ruleName_5_0= RULE_ID ) )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:226:1: (lv_ruleName_5_0= RULE_ID )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:226:1: (lv_ruleName_5_0= RULE_ID )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:227:3: lv_ruleName_5_0= RULE_ID
                    {
                    lv_ruleName_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule329); 

                    			createLeafNode(grammarAccess.getRuleAccess().getRuleNameIDTerminalRuleCall_2_1_0(), "ruleName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ruleName",
                    	        		lv_ruleName_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleRule344); 

                            createLeafNode(grammarAccess.getRuleAccess().getColonKeyword_2_2(), null); 
                        
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:253:1: ( (lv_bareRule_7_0= ruleBareRule ) )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:254:1: (lv_bareRule_7_0= ruleBareRule )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:254:1: (lv_bareRule_7_0= ruleBareRule )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:255:3: lv_bareRule_7_0= ruleBareRule
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBareRule_in_ruleRule365);
                    lv_bareRule_7_0=ruleBareRule();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"bareRule",
                    	        		lv_bareRule_7_0, 
                    	        		"BareRule", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,13,FOLLOW_13_in_ruleRule375); 

                            createLeafNode(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_2_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRule


    // $ANTLR start entryRulePrefix
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:289:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:290:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:291:2: iv_rulePrefix= rulePrefix EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix412);
            iv_rulePrefix=rulePrefix();
            _fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:298:1: rulePrefix returns [EObject current=null] : ( '@prefix' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) '.' ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_uri_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:303:6: ( ( '@prefix' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) '.' ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:304:1: ( '@prefix' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) '.' )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:304:1: ( '@prefix' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) '.' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:304:3: '@prefix' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) '.'
            {
            match(input,15,FOLLOW_15_in_rulePrefix457); 

                    createLeafNode(grammarAccess.getPrefixAccess().getPrefixKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:309:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix474); 

            			createLeafNode(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePrefix489); 

                    createLeafNode(grammarAccess.getPrefixAccess().getColonKeyword_2(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:336:1: ( (lv_uri_3_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:337:1: (lv_uri_3_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:337:1: (lv_uri_3_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:338:3: lv_uri_3_0= RULE_IRI_TERMINAL
            {
            lv_uri_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix506); 

            			createLeafNode(grammarAccess.getPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_3_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_3_0, 
            	        		"IRI_TERMINAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_rulePrefix521); 

                    createLeafNode(grammarAccess.getPrefixAccess().getFullStopKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleBareRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:372:1: entryRuleBareRule returns [EObject current=null] : iv_ruleBareRule= ruleBareRule EOF ;
    public final EObject entryRuleBareRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBareRule = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:373:2: (iv_ruleBareRule= ruleBareRule EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:374:2: iv_ruleBareRule= ruleBareRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBareRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBareRule_in_entryRuleBareRule557);
            iv_ruleBareRule=ruleBareRule();
            _fsp--;

             current =iv_ruleBareRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBareRule567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBareRule


    // $ANTLR start ruleBareRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:381:1: ruleBareRule returns [EObject current=null] : this_ForwardRule_0= ruleForwardRule ;
    public final EObject ruleBareRule() throws RecognitionException {
        EObject current = null;

        EObject this_ForwardRule_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:386:6: (this_ForwardRule_0= ruleForwardRule )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:388:5: this_ForwardRule_0= ruleForwardRule
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBareRuleAccess().getForwardRuleParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleForwardRule_in_ruleBareRule613);
            this_ForwardRule_0=ruleForwardRule();
            _fsp--;

             
                    current = this_ForwardRule_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBareRule


    // $ANTLR start entryRuleForwardRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:404:1: entryRuleForwardRule returns [EObject current=null] : iv_ruleForwardRule= ruleForwardRule EOF ;
    public final EObject entryRuleForwardRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardRule = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:405:2: (iv_ruleForwardRule= ruleForwardRule EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:406:2: iv_ruleForwardRule= ruleForwardRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForwardRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleForwardRule_in_entryRuleForwardRule647);
            iv_ruleForwardRule=ruleForwardRule();
            _fsp--;

             current =iv_ruleForwardRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardRule657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleForwardRule


    // $ANTLR start ruleForwardRule
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:413:1: ruleForwardRule returns [EObject current=null] : ( ( (lv_leftTerms_0_0= ruleTerm ) ) ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )* '->' ( (lv_rightTerms_4_0= ruleTerm ) ) ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )* ) ;
    public final EObject ruleForwardRule() throws RecognitionException {
        EObject current = null;

        EObject lv_leftTerms_0_0 = null;

        EObject lv_leftTerms_2_0 = null;

        EObject lv_rightTerms_4_0 = null;

        EObject lv_rightTerms_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:418:6: ( ( ( (lv_leftTerms_0_0= ruleTerm ) ) ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )* '->' ( (lv_rightTerms_4_0= ruleTerm ) ) ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )* ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:419:1: ( ( (lv_leftTerms_0_0= ruleTerm ) ) ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )* '->' ( (lv_rightTerms_4_0= ruleTerm ) ) ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )* )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:419:1: ( ( (lv_leftTerms_0_0= ruleTerm ) ) ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )* '->' ( (lv_rightTerms_4_0= ruleTerm ) ) ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )* )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:419:2: ( (lv_leftTerms_0_0= ruleTerm ) ) ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )* '->' ( (lv_rightTerms_4_0= ruleTerm ) ) ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )*
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:419:2: ( (lv_leftTerms_0_0= ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:420:1: (lv_leftTerms_0_0= ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:420:1: (lv_leftTerms_0_0= ruleTerm )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:421:3: lv_leftTerms_0_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleForwardRule703);
            lv_leftTerms_0_0=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"leftTerms",
            	        		lv_leftTerms_0_0, 
            	        		"Term", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:443:2: ( ',' ( (lv_leftTerms_2_0= ruleTerm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:443:4: ',' ( (lv_leftTerms_2_0= ruleTerm ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleForwardRule714); 

            	            createLeafNode(grammarAccess.getForwardRuleAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:447:1: ( (lv_leftTerms_2_0= ruleTerm ) )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:448:1: (lv_leftTerms_2_0= ruleTerm )
            	    {
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:448:1: (lv_leftTerms_2_0= ruleTerm )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:449:3: lv_leftTerms_2_0= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleForwardRule735);
            	    lv_leftTerms_2_0=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"leftTerms",
            	    	        		lv_leftTerms_2_0, 
            	    	        		"Term", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleForwardRule747); 

                    createLeafNode(grammarAccess.getForwardRuleAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:475:1: ( (lv_rightTerms_4_0= ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:476:1: (lv_rightTerms_4_0= ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:476:1: (lv_rightTerms_4_0= ruleTerm )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:477:3: lv_rightTerms_4_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleForwardRule768);
            lv_rightTerms_4_0=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"rightTerms",
            	        		lv_rightTerms_4_0, 
            	        		"Term", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:499:2: ( ',' ( (lv_rightTerms_6_0= ruleTerm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:499:4: ',' ( (lv_rightTerms_6_0= ruleTerm ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleForwardRule779); 

            	            createLeafNode(grammarAccess.getForwardRuleAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:503:1: ( (lv_rightTerms_6_0= ruleTerm ) )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:504:1: (lv_rightTerms_6_0= ruleTerm )
            	    {
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:504:1: (lv_rightTerms_6_0= ruleTerm )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:505:3: lv_rightTerms_6_0= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleForwardRule800);
            	    lv_rightTerms_6_0=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rightTerms",
            	    	        		lv_rightTerms_6_0, 
            	    	        		"Term", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleForwardRule


    // $ANTLR start entryRuleTerm
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:535:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:536:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:537:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm838);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:544:1: ruleTerm returns [EObject current=null] : ( '(' ( (lv_subject_1_0= ruleNode ) ) ( (lv_predicate_2_0= ruleNode ) ) ( (lv_object_3_0= ruleNode ) ) ')' ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_1_0 = null;

        EObject lv_predicate_2_0 = null;

        EObject lv_object_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:549:6: ( ( '(' ( (lv_subject_1_0= ruleNode ) ) ( (lv_predicate_2_0= ruleNode ) ) ( (lv_object_3_0= ruleNode ) ) ')' ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:550:1: ( '(' ( (lv_subject_1_0= ruleNode ) ) ( (lv_predicate_2_0= ruleNode ) ) ( (lv_object_3_0= ruleNode ) ) ')' )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:550:1: ( '(' ( (lv_subject_1_0= ruleNode ) ) ( (lv_predicate_2_0= ruleNode ) ) ( (lv_object_3_0= ruleNode ) ) ')' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:550:3: '(' ( (lv_subject_1_0= ruleNode ) ) ( (lv_predicate_2_0= ruleNode ) ) ( (lv_object_3_0= ruleNode ) ) ')'
            {
            match(input,19,FOLLOW_19_in_ruleTerm883); 

                    createLeafNode(grammarAccess.getTermAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:554:1: ( (lv_subject_1_0= ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:555:1: (lv_subject_1_0= ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:555:1: (lv_subject_1_0= ruleNode )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:556:3: lv_subject_1_0= ruleNode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getSubjectNodeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleTerm904);
            lv_subject_1_0=ruleNode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"subject",
            	        		lv_subject_1_0, 
            	        		"Node", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:578:2: ( (lv_predicate_2_0= ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:579:1: (lv_predicate_2_0= ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:579:1: (lv_predicate_2_0= ruleNode )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:580:3: lv_predicate_2_0= ruleNode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getPredicateNodeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleTerm925);
            lv_predicate_2_0=ruleNode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"predicate",
            	        		lv_predicate_2_0, 
            	        		"Node", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:602:2: ( (lv_object_3_0= ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:603:1: (lv_object_3_0= ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:603:1: (lv_object_3_0= ruleNode )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:604:3: lv_object_3_0= ruleNode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getObjectNodeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleTerm946);
            lv_object_3_0=ruleNode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"object",
            	        		lv_object_3_0, 
            	        		"Node", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleTerm956); 

                    createLeafNode(grammarAccess.getTermAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:638:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:639:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:640:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction992);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:647:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_nodes_2_0= ruleNode ) ) ( ',' ( (lv_nodes_4_0= ruleNode ) ) )* ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_nodes_2_0 = null;

        EObject lv_nodes_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:652:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_nodes_2_0= ruleNode ) ) ( ',' ( (lv_nodes_4_0= ruleNode ) ) )* ')' ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_nodes_2_0= ruleNode ) ) ( ',' ( (lv_nodes_4_0= ruleNode ) ) )* ')' )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_nodes_2_0= ruleNode ) ) ( ',' ( (lv_nodes_4_0= ruleNode ) ) )* ')' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:653:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_nodes_2_0= ruleNode ) ) ( ',' ( (lv_nodes_4_0= ruleNode ) ) )* ')'
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:653:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:654:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:654:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:655:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1044); 

            			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleFunction1059); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:681:1: ( (lv_nodes_2_0= ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:682:1: (lv_nodes_2_0= ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:682:1: (lv_nodes_2_0= ruleNode )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:683:3: lv_nodes_2_0= ruleNode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleFunction1080);
            lv_nodes_2_0=ruleNode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"nodes",
            	        		lv_nodes_2_0, 
            	        		"Node", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:705:2: ( ',' ( (lv_nodes_4_0= ruleNode ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:705:4: ',' ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleFunction1091); 

            	            createLeafNode(grammarAccess.getFunctionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:709:1: ( (lv_nodes_4_0= ruleNode ) )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:710:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:710:1: (lv_nodes_4_0= ruleNode )
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:711:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleFunction1112);
            	    lv_nodes_4_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"nodes",
            	    	        		lv_nodes_4_0, 
            	    	        		"Node", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleFunction1124); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleNode
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:747:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:748:2: (iv_ruleNode= ruleNode EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:749:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1162);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:756:1: ruleNode returns [EObject current=null] : (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_URIRef_0 = null;

        EObject this_QName_1 = null;

        EObject this_Variable_2 = null;

        EObject this_Literal_3 = null;

        EObject this_Function_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:761:6: ( (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:762:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:762:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_IRI_TERMINAL:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==19) ) {
                    alt7=5;
                }
                else if ( (LA7_2==14) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("762:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction )", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("762:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName | this_Variable_2= ruleVariable | this_Literal_3= ruleLiteral | this_Function_4= ruleFunction )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:763:5: this_URIRef_0= ruleURIRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getURIRefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleURIRef_in_ruleNode1219);
                    this_URIRef_0=ruleURIRef();
                    _fsp--;

                     
                            current = this_URIRef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:773:5: this_QName_1= ruleQName
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getQNameParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleNode1246);
                    this_QName_1=ruleQName();
                    _fsp--;

                     
                            current = this_QName_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:783:5: this_Variable_2= ruleVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getVariableParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleNode1273);
                    this_Variable_2=ruleVariable();
                    _fsp--;

                     
                            current = this_Variable_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:793:5: this_Literal_3= ruleLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getLiteralParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleNode1300);
                    this_Literal_3=ruleLiteral();
                    _fsp--;

                     
                            current = this_Literal_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:803:5: this_Function_4= ruleFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getFunctionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleNode1327);
                    this_Function_4=ruleFunction();
                    _fsp--;

                     
                            current = this_Function_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleURIRef
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:819:1: entryRuleURIRef returns [EObject current=null] : iv_ruleURIRef= ruleURIRef EOF ;
    public final EObject entryRuleURIRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIRef = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:820:2: (iv_ruleURIRef= ruleURIRef EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:821:2: iv_ruleURIRef= ruleURIRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURIRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleURIRef_in_entryRuleURIRef1362);
            iv_ruleURIRef=ruleURIRef();
            _fsp--;

             current =iv_ruleURIRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURIRef1372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleURIRef


    // $ANTLR start ruleURIRef
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:828:1: ruleURIRef returns [EObject current=null] : ( (lv_uri_0_0= RULE_IRI_TERMINAL ) ) ;
    public final EObject ruleURIRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:833:6: ( ( (lv_uri_0_0= RULE_IRI_TERMINAL ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:834:1: ( (lv_uri_0_0= RULE_IRI_TERMINAL ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:834:1: ( (lv_uri_0_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:835:1: (lv_uri_0_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:835:1: (lv_uri_0_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:836:3: lv_uri_0_0= RULE_IRI_TERMINAL
            {
            lv_uri_0_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleURIRef1413); 

            			createLeafNode(grammarAccess.getURIRefAccess().getUriIRI_TERMINALTerminalRuleCall_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getURIRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_0_0, 
            	        		"IRI_TERMINAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleURIRef


    // $ANTLR start entryRuleQName
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:866:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:867:2: (iv_ruleQName= ruleQName EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:868:2: iv_ruleQName= ruleQName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName1453);
            iv_ruleQName=ruleQName();
            _fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName1463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQName


    // $ANTLR start ruleQName
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:875:1: ruleQName returns [EObject current=null] : ( ( ( RULE_ID ) )? ':' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:880:6: ( ( ( ( RULE_ID ) )? ':' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:881:1: ( ( ( RULE_ID ) )? ':' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:881:1: ( ( ( RULE_ID ) )? ':' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:881:2: ( ( RULE_ID ) )? ':' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:881:2: ( ( RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:882:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:882:1: ( RULE_ID )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:883:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getQNameRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName1506); 

                    		createLeafNode(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
                    	

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleQName1517); 

                    createLeafNode(grammarAccess.getQNameAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:899:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:900:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:900:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:901:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName1534); 

            			createLeafNode(grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQName


    // $ANTLR start entryRuleVariable
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:931:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:932:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:933:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1575);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:940:1: ruleVariable returns [EObject current=null] : ( '?' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:945:6: ( ( '?' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:946:1: ( '?' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:946:1: ( '?' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:946:3: '?' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleVariable1620); 

                    createLeafNode(grammarAccess.getVariableAccess().getQuestionMarkKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:950:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:951:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:951:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:952:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1637); 

            			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleLiteral
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:982:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:983:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:984:2: iv_ruleLiteral= ruleLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1678);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:991:1: ruleLiteral returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:996:6: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:997:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:997:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("997:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:998:5: this_StringValue_0= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLiteral1735);
                    this_StringValue_0=ruleStringValue();
                    _fsp--;

                     
                            current = this_StringValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1008:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleLiteral1762);
                    this_IntegerValue_1=ruleIntegerValue();
                    _fsp--;

                     
                            current = this_IntegerValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleStringValue
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1024:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1025:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1026:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1797);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1807); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1033:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1038:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1039:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1039:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1039:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1039:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1040:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1040:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1041:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue1849); 

            			createLeafNode(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1063:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1064:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1064:1: (lv_tag_1_0= ruleRDFTag )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1065:3: lv_tag_1_0= ruleRDFTag
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleStringValue1875);
                    lv_tag_1_0=ruleRDFTag();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tag",
                    	        		lv_tag_1_0, 
                    	        		"RDFTag", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleIntegerValue
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1095:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1096:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1097:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1912);
            iv_ruleIntegerValue=ruleIntegerValue();
            _fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntegerValue


    // $ANTLR start ruleIntegerValue
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1104:1: ruleIntegerValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1109:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1110:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1110:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1110:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1110:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1111:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1111:1: (lv_value_0_0= RULE_INT )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1112:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerValue1964); 

            			createLeafNode(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1134:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1135:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1135:1: (lv_tag_1_0= ruleRDFTag )
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1136:3: lv_tag_1_0= ruleRDFTag
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleIntegerValue1990);
                    lv_tag_1_0=ruleRDFTag();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tag",
                    	        		lv_tag_1_0, 
                    	        		"RDFTag", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntegerValue


    // $ANTLR start entryRuleRDFTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1166:1: entryRuleRDFTag returns [EObject current=null] : iv_ruleRDFTag= ruleRDFTag EOF ;
    public final EObject entryRuleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDFTag = null;


        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1167:2: (iv_ruleRDFTag= ruleRDFTag EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1168:2: iv_ruleRDFTag= ruleRDFTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRDFTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag2027);
            iv_ruleRDFTag=ruleRDFTag();
            _fsp--;

             current =iv_ruleRDFTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag2037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRDFTag


    // $ANTLR start ruleRDFTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1175:1: ruleRDFTag returns [EObject current=null] : (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) ;
    public final EObject ruleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject this_TypeTag_0 = null;

        EObject this_LangTag_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1180:6: ( (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1181:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1181:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1181:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1182:5: this_TypeTag_0= ruleTypeTag
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypeTag_in_ruleRDFTag2084);
                    this_TypeTag_0=ruleTypeTag();
                    _fsp--;

                     
                            current = this_TypeTag_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1192:5: this_LangTag_1= ruleLangTag
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLangTag_in_ruleRDFTag2111);
                    this_LangTag_1=ruleLangTag();
                    _fsp--;

                     
                            current = this_LangTag_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRDFTag


    // $ANTLR start entryRuleTypeTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1208:1: entryRuleTypeTag returns [EObject current=null] : iv_ruleTypeTag= ruleTypeTag EOF ;
    public final EObject entryRuleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1212:2: (iv_ruleTypeTag= ruleTypeTag EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1213:2: iv_ruleTypeTag= ruleTypeTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag2152);
            iv_ruleTypeTag=ruleTypeTag();
            _fsp--;

             current =iv_ruleTypeTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag2162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleTypeTag


    // $ANTLR start ruleTypeTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1223:1: ruleTypeTag returns [EObject current=null] : ( '^^' ( (lv_type_1_0= ruleQName ) ) ) ;
    public final EObject ruleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1229:6: ( ( '^^' ( (lv_type_1_0= ruleQName ) ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1230:1: ( '^^' ( (lv_type_1_0= ruleQName ) ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1230:1: ( '^^' ( (lv_type_1_0= ruleQName ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1230:3: '^^' ( (lv_type_1_0= ruleQName ) )
            {
            match(input,22,FOLLOW_22_in_ruleTypeTag2201); 

                    createLeafNode(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1234:1: ( (lv_type_1_0= ruleQName ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1235:1: (lv_type_1_0= ruleQName )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1235:1: (lv_type_1_0= ruleQName )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1236:3: lv_type_1_0= ruleQName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleTypeTag2222);
            lv_type_1_0=ruleQName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeTagRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"QName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleTypeTag


    // $ANTLR start entryRuleLangTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1269:1: entryRuleLangTag returns [EObject current=null] : iv_ruleLangTag= ruleLangTag EOF ;
    public final EObject entryRuleLangTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1273:2: (iv_ruleLangTag= ruleLangTag EOF )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1274:2: iv_ruleLangTag= ruleLangTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLangTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag2268);
            iv_ruleLangTag=ruleLangTag();
            _fsp--;

             current =iv_ruleLangTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag2278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleLangTag


    // $ANTLR start ruleLangTag
    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1284:1: ruleLangTag returns [EObject current=null] : ( '@' ( (lv_lang_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLangTag() throws RecognitionException {
        EObject current = null;

        Token lv_lang_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1290:6: ( ( '@' ( (lv_lang_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1291:1: ( '@' ( (lv_lang_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1291:1: ( '@' ( (lv_lang_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1291:3: '@' ( (lv_lang_1_0= RULE_ID ) )
            {
            match(input,23,FOLLOW_23_in_ruleLangTag2317); 

                    createLeafNode(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1295:1: ( (lv_lang_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1296:1: (lv_lang_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1296:1: (lv_lang_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1297:3: lv_lang_1_0= RULE_ID
            {
            lv_lang_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangTag2334); 

            			createLeafNode(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0(), "lang"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLangTagRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lang",
            	        		lv_lang_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end ruleLangTag


 

    public static final BitSet FOLLOW_ruleJenaRuleDocument_in_entryRuleJenaRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJenaRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleJenaRuleDocument131 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleJenaRuleDocument153 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_ruleRule246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRule263 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBareRule_in_ruleRule284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRule294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRule312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBareRule_in_ruleRule365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRule375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrefix457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrefix489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix506 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrefix521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_entryRuleBareRule557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBareRule567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardRule_in_ruleBareRule613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardRule_in_entryRuleForwardRule647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardRule657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleForwardRule703 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleForwardRule714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleForwardRule735 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleForwardRule747 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleForwardRule768 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleForwardRule779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleForwardRule800 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTerm883 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_ruleNode_in_ruleTerm904 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_ruleNode_in_ruleTerm925 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_ruleNode_in_ruleTerm946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTerm956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1044 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction1059 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_ruleNode_in_ruleFunction1080 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleFunction1091 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_ruleNode_in_ruleFunction1112 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleFunction1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_ruleNode1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNode1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNode1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleNode1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleNode1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_entryRuleURIRef1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURIRef1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleURIRef1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName1506 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQName1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariable1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLiteral1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleLiteral1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue1849 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleStringValue1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerValue1964 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleIntegerValue1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_ruleRDFTag2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_ruleRDFTag2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag2152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeTag2201 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleTypeTag2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLangTag2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangTag2334 = new BitSet(new long[]{0x0000000000000002L});

}