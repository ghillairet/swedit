package org.eclipselabs.swedit.turtle.parser.antlr.internal; 

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
import org.eclipselabs.swedit.turtle.services.TurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_15", "KEYWORD_14", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "RULE_IRI_TERMINAL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=21;
    public static final int RULE_ANY_OTHER=26;
    public static final int KEYWORD_1=9;
    public static final int KEYWORD_15=4;
    public static final int KEYWORD_5=13;
    public static final int KEYWORD_4=12;
    public static final int KEYWORD_13=8;
    public static final int KEYWORD_3=11;
    public static final int KEYWORD_14=5;
    public static final int KEYWORD_2=10;
    public static final int KEYWORD_11=6;
    public static final int EOF=-1;
    public static final int Tokens=27;
    public static final int RULE_SL_COMMENT=24;
    public static final int KEYWORD_12=7;
    public static final int KEYWORD_10=18;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_STRING=20;
    public static final int RULE_IRI_TERMINAL=19;
    public static final int KEYWORD_6=14;
    public static final int KEYWORD_7=15;
    public static final int KEYWORD_8=16;
    public static final int KEYWORD_9=17;
    public static final int RULE_INT=22;
    public static final int RULE_WS=25;

        public InternalTurtleParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g"; }




     	private TurtleGrammarAccess grammarAccess;
     	
        public InternalTurtleParser(TokenStream input, IAstFactory factory, TurtleGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TurtleDocument";	
       	} 
       	   	
       	@Override
       	protected TurtleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleTurtleDocument
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:71:1: entryRuleTurtleDocument returns [EObject current=null] : iv_ruleTurtleDocument= ruleTurtleDocument EOF ;
    public final EObject entryRuleTurtleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurtleDocument = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:72:2: (iv_ruleTurtleDocument= ruleTurtleDocument EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:73:2: iv_ruleTurtleDocument= ruleTurtleDocument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTurtleDocumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleTurtleDocument_in_entryRuleTurtleDocument67);
            iv_ruleTurtleDocument=ruleTurtleDocument();
            _fsp--;

             current =iv_ruleTurtleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurtleDocument77); 

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
    // $ANTLR end entryRuleTurtleDocument


    // $ANTLR start ruleTurtleDocument
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:80:1: ruleTurtleDocument returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleTurtleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:85:6: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:86:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_15 && LA1_0<=KEYWORD_11)||(LA1_0>=KEYWORD_13 && LA1_0<=KEYWORD_1)||LA1_0==KEYWORD_5||LA1_0==KEYWORD_8||LA1_0==RULE_IRI_TERMINAL||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:87:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:87:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:88:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTurtleDocumentAccess().getStatementsStatementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTurtleDocument122);
            	    lv_statements_0_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTurtleDocumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_0_0, 
            	    	        		"Statement", 
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
    // $ANTLR end ruleTurtleDocument


    // $ANTLR start entryRuleStatement
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:118:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:119:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:120:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement157);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement167); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:127:1: ruleStatement returns [EObject current=null] : (this_Directive_0= ruleDirective | this_Triple_1= ruleTriple ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Directive_0 = null;

        EObject this_Triple_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:132:6: ( (this_Directive_0= ruleDirective | this_Triple_1= ruleTriple ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:133:1: (this_Directive_0= ruleDirective | this_Triple_1= ruleTriple )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:133:1: (this_Directive_0= ruleDirective | this_Triple_1= ruleTriple )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=KEYWORD_15 && LA2_0<=KEYWORD_14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==KEYWORD_11||(LA2_0>=KEYWORD_13 && LA2_0<=KEYWORD_1)||LA2_0==KEYWORD_5||LA2_0==KEYWORD_8||LA2_0==RULE_IRI_TERMINAL||LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("133:1: (this_Directive_0= ruleDirective | this_Triple_1= ruleTriple )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:134:5: this_Directive_0= ruleDirective
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getDirectiveParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirective_in_ruleStatement214);
                    this_Directive_0=ruleDirective();
                    _fsp--;


                            current = this_Directive_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:144:5: this_Triple_1= ruleTriple
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getTripleParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTriple_in_ruleStatement241);
                    this_Triple_1=ruleTriple();
                    _fsp--;


                            current = this_Triple_1;
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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleDirective
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:160:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:161:2: (iv_ruleDirective= ruleDirective EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:162:2: iv_ruleDirective= ruleDirective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirective_in_entryRuleDirective275);
            iv_ruleDirective=ruleDirective();
            _fsp--;

             current =iv_ruleDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirective285); 

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
    // $ANTLR end entryRuleDirective


    // $ANTLR start ruleDirective
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:169:1: ruleDirective returns [EObject current=null] : (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        EObject this_Prefix_0 = null;

        EObject this_UnNamedPrefix_1 = null;

        EObject this_Base_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:174:6: ( (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:175:1: (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:175:1: (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_15) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==KEYWORD_5) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("175:1: (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase )", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==KEYWORD_14) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("175:1: (this_Prefix_0= rulePrefix | this_UnNamedPrefix_1= ruleUnNamedPrefix | this_Base_2= ruleBase )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:176:5: this_Prefix_0= rulePrefix
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectiveAccess().getPrefixParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrefix_in_ruleDirective332);
                    this_Prefix_0=rulePrefix();
                    _fsp--;


                            current = this_Prefix_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:186:5: this_UnNamedPrefix_1= ruleUnNamedPrefix
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectiveAccess().getUnNamedPrefixParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnNamedPrefix_in_ruleDirective359);
                    this_UnNamedPrefix_1=ruleUnNamedPrefix();
                    _fsp--;


                            current = this_UnNamedPrefix_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:196:5: this_Base_2= ruleBase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDirectiveAccess().getBaseParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBase_in_ruleDirective386);
                    this_Base_2=ruleBase();
                    _fsp--;


                            current = this_Base_2;
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
    // $ANTLR end ruleDirective


    // $ANTLR start entryRulePrefix
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:212:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:213:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:214:2: iv_rulePrefix= rulePrefix EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix420);
            iv_rulePrefix=rulePrefix();
            _fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix430); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:221:1: rulePrefix returns [EObject current=null] : ( KEYWORD_15 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_5 ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_uri_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:226:6: ( ( KEYWORD_15 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_5 ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:227:1: ( KEYWORD_15 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_5 ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:227:1: ( KEYWORD_15 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_5 ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:228:2: KEYWORD_15 ( (lv_name_1_0= RULE_ID ) ) KEYWORD_5 ( (lv_uri_3_0= RULE_IRI_TERMINAL ) ) KEYWORD_4
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rulePrefix466); 

                    createLeafNode(grammarAccess.getPrefixAccess().getPrefixKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:232:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:233:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:233:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:234:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrefix483); 

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

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulePrefix499); 

                    createLeafNode(grammarAccess.getPrefixAccess().getColonKeyword_2(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:261:1: ( (lv_uri_3_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:262:1: (lv_uri_3_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:262:1: (lv_uri_3_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:263:3: lv_uri_3_0= RULE_IRI_TERMINAL
            {
            lv_uri_3_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix516); 

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

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePrefix532); 

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


    // $ANTLR start entryRuleUnNamedPrefix
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:298:1: entryRuleUnNamedPrefix returns [EObject current=null] : iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF ;
    public final EObject entryRuleUnNamedPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNamedPrefix = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:299:2: (iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:300:2: iv_ruleUnNamedPrefix= ruleUnNamedPrefix EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnNamedPrefixRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix567);
            iv_ruleUnNamedPrefix=ruleUnNamedPrefix();
            _fsp--;

             current =iv_ruleUnNamedPrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNamedPrefix577); 

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
    // $ANTLR end entryRuleUnNamedPrefix


    // $ANTLR start ruleUnNamedPrefix
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:307:1: ruleUnNamedPrefix returns [EObject current=null] : ( KEYWORD_15 KEYWORD_5 ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) ;
    public final EObject ruleUnNamedPrefix() throws RecognitionException {
        EObject current = null;

        Token lv_uri_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:312:6: ( ( KEYWORD_15 KEYWORD_5 ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:313:1: ( KEYWORD_15 KEYWORD_5 ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:313:1: ( KEYWORD_15 KEYWORD_5 ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:314:2: KEYWORD_15 KEYWORD_5 ( (lv_uri_2_0= RULE_IRI_TERMINAL ) ) KEYWORD_4
            {
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleUnNamedPrefix613); 

                    createLeafNode(grammarAccess.getUnNamedPrefixAccess().getPrefixKeyword_0(), null); 
                
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleUnNamedPrefix624); 

                    createLeafNode(grammarAccess.getUnNamedPrefixAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:323:1: ( (lv_uri_2_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:324:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:324:1: (lv_uri_2_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:325:3: lv_uri_2_0= RULE_IRI_TERMINAL
            {
            lv_uri_2_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleUnNamedPrefix641); 

            			createLeafNode(grammarAccess.getUnNamedPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_2_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnNamedPrefixRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_2_0, 
            	        		"IRI_TERMINAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnNamedPrefix657); 

                    createLeafNode(grammarAccess.getUnNamedPrefixAccess().getFullStopKeyword_3(), null); 
                

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
    // $ANTLR end ruleUnNamedPrefix


    // $ANTLR start entryRuleBase
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:360:1: entryRuleBase returns [EObject current=null] : iv_ruleBase= ruleBase EOF ;
    public final EObject entryRuleBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:361:2: (iv_ruleBase= ruleBase EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:362:2: iv_ruleBase= ruleBase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleBase_in_entryRuleBase692);
            iv_ruleBase=ruleBase();
            _fsp--;

             current =iv_ruleBase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBase702); 

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
    // $ANTLR end entryRuleBase


    // $ANTLR start ruleBase
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:369:1: ruleBase returns [EObject current=null] : ( KEYWORD_14 ( (lv_uri_1_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) ;
    public final EObject ruleBase() throws RecognitionException {
        EObject current = null;

        Token lv_uri_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:374:6: ( ( KEYWORD_14 ( (lv_uri_1_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:375:1: ( KEYWORD_14 ( (lv_uri_1_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:375:1: ( KEYWORD_14 ( (lv_uri_1_0= RULE_IRI_TERMINAL ) ) KEYWORD_4 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:376:2: KEYWORD_14 ( (lv_uri_1_0= RULE_IRI_TERMINAL ) ) KEYWORD_4
            {
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleBase738); 

                    createLeafNode(grammarAccess.getBaseAccess().getBaseKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:380:1: ( (lv_uri_1_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:381:1: (lv_uri_1_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:381:1: (lv_uri_1_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:382:3: lv_uri_1_0= RULE_IRI_TERMINAL
            {
            lv_uri_1_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleBase755); 

            			createLeafNode(grammarAccess.getBaseAccess().getUriIRI_TERMINALTerminalRuleCall_1_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_1_0, 
            	        		"IRI_TERMINAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleBase771); 

                    createLeafNode(grammarAccess.getBaseAccess().getFullStopKeyword_2(), null); 
                

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
    // $ANTLR end ruleBase


    // $ANTLR start entryRuleTriple
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:417:1: entryRuleTriple returns [EObject current=null] : iv_ruleTriple= ruleTriple EOF ;
    public final EObject entryRuleTriple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriple = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:418:2: (iv_ruleTriple= ruleTriple EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:419:2: iv_ruleTriple= ruleTriple EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTripleRule(), currentNode); 
            pushFollow(FOLLOW_ruleTriple_in_entryRuleTriple806);
            iv_ruleTriple=ruleTriple();
            _fsp--;

             current =iv_ruleTriple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriple816); 

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
    // $ANTLR end entryRuleTriple


    // $ANTLR start ruleTriple
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:426:1: ruleTriple returns [EObject current=null] : ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_4 ) ;
    public final EObject ruleTriple() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_0_0 = null;

        EObject lv_predicateObjectList_1_0 = null;

        EObject lv_predicateObjectList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:431:6: ( ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_4 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:432:1: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_4 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:432:1: ( ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_4 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:432:2: ( (lv_subject_0_0= ruleSubject ) ) ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_4
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:432:2: ( (lv_subject_0_0= ruleSubject ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:433:1: (lv_subject_0_0= ruleSubject )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:433:1: (lv_subject_0_0= ruleSubject )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:434:3: lv_subject_0_0= ruleSubject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTripleAccess().getSubjectSubjectParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSubject_in_ruleTriple862);
            lv_subject_0_0=ruleSubject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTripleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"subject",
            	        		lv_subject_0_0, 
            	        		"Subject", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:456:2: ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:457:1: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:457:1: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:458:3: lv_predicateObjectList_1_0= rulePredicateObjectList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePredicateObjectList_in_ruleTriple883);
            lv_predicateObjectList_1_0=rulePredicateObjectList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTripleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"predicateObjectList",
            	        		lv_predicateObjectList_1_0, 
            	        		"PredicateObjectList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:480:2: ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_6) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:481:2: KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) )
            	    {
            	    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleTriple895); 

            	            createLeafNode(grammarAccess.getTripleAccess().getSemicolonKeyword_2_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:485:1: ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:486:1: (lv_predicateObjectList_3_0= rulePredicateObjectList )
            	    {
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:486:1: (lv_predicateObjectList_3_0= rulePredicateObjectList )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:487:3: lv_predicateObjectList_3_0= rulePredicateObjectList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateObjectList_in_ruleTriple916);
            	    lv_predicateObjectList_3_0=rulePredicateObjectList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTripleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"predicateObjectList",
            	    	        		lv_predicateObjectList_3_0, 
            	    	        		"PredicateObjectList", 
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

            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleTriple929); 

                    createLeafNode(grammarAccess.getTripleAccess().getFullStopKeyword_3(), null); 
                

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
    // $ANTLR end ruleTriple


    // $ANTLR start entryRuleSubject
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:522:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:523:2: (iv_ruleSubject= ruleSubject EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:524:2: iv_ruleSubject= ruleSubject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubject_in_entryRuleSubject964);
            iv_ruleSubject=ruleSubject();
            _fsp--;

             current =iv_ruleSubject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubject974); 

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
    // $ANTLR end entryRuleSubject


    // $ANTLR start ruleSubject
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:531:1: ruleSubject returns [EObject current=null] : (this_Resource_0= ruleResource | this_Blank_1= ruleBlank ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_Blank_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:536:6: ( (this_Resource_0= ruleResource | this_Blank_1= ruleBlank ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:537:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:537:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_5||LA5_0==RULE_IRI_TERMINAL||LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_11||(LA5_0>=KEYWORD_13 && LA5_0<=KEYWORD_1)||LA5_0==KEYWORD_8) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("537:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:538:5: this_Resource_0= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubjectAccess().getResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleSubject1021);
                    this_Resource_0=ruleResource();
                    _fsp--;


                            current = this_Resource_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:548:5: this_Blank_1= ruleBlank
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSubjectAccess().getBlankParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlank_in_ruleSubject1048);
                    this_Blank_1=ruleBlank();
                    _fsp--;


                            current = this_Blank_1;
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
    // $ANTLR end ruleSubject


    // $ANTLR start entryRulePredicateObjectList
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:564:1: entryRulePredicateObjectList returns [EObject current=null] : iv_rulePredicateObjectList= rulePredicateObjectList EOF ;
    public final EObject entryRulePredicateObjectList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateObjectList = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:565:2: (iv_rulePredicateObjectList= rulePredicateObjectList EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:566:2: iv_rulePredicateObjectList= rulePredicateObjectList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPredicateObjectListRule(), currentNode); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_entryRulePredicateObjectList1082);
            iv_rulePredicateObjectList=rulePredicateObjectList();
            _fsp--;

             current =iv_rulePredicateObjectList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateObjectList1092); 

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
    // $ANTLR end entryRulePredicateObjectList


    // $ANTLR start rulePredicateObjectList
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:573:1: rulePredicateObjectList returns [EObject current=null] : ( ( (lv_predicate_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) ) ;
    public final EObject rulePredicateObjectList() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_0_0 = null;

        EObject lv_objectList_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:578:6: ( ( ( (lv_predicate_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:579:1: ( ( (lv_predicate_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:579:1: ( ( (lv_predicate_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:579:2: ( (lv_predicate_0_0= ruleVerb ) ) ( (lv_objectList_1_0= ruleObjectList ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:579:2: ( (lv_predicate_0_0= ruleVerb ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:580:1: (lv_predicate_0_0= ruleVerb )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:580:1: (lv_predicate_0_0= ruleVerb )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:581:3: lv_predicate_0_0= ruleVerb
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPredicateObjectListAccess().getPredicateVerbParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVerb_in_rulePredicateObjectList1138);
            lv_predicate_0_0=ruleVerb();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPredicateObjectListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"predicate",
            	        		lv_predicate_0_0, 
            	        		"Verb", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:603:2: ( (lv_objectList_1_0= ruleObjectList ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:604:1: (lv_objectList_1_0= ruleObjectList )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:604:1: (lv_objectList_1_0= ruleObjectList )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:605:3: lv_objectList_1_0= ruleObjectList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPredicateObjectListAccess().getObjectListObjectListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleObjectList_in_rulePredicateObjectList1159);
            lv_objectList_1_0=ruleObjectList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPredicateObjectListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"objectList",
            	        		lv_objectList_1_0, 
            	        		"ObjectList", 
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
        }
        return current;
    }
    // $ANTLR end rulePredicateObjectList


    // $ANTLR start entryRuleVerb
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:635:1: entryRuleVerb returns [EObject current=null] : iv_ruleVerb= ruleVerb EOF ;
    public final EObject entryRuleVerb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerb = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:636:2: (iv_ruleVerb= ruleVerb EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:637:2: iv_ruleVerb= ruleVerb EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVerbRule(), currentNode); 
            pushFollow(FOLLOW_ruleVerb_in_entryRuleVerb1194);
            iv_ruleVerb=ruleVerb();
            _fsp--;

             current =iv_ruleVerb; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerb1204); 

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
    // $ANTLR end entryRuleVerb


    // $ANTLR start ruleVerb
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:644:1: ruleVerb returns [EObject current=null] : (this_Resource_0= ruleResource | this_AVerb_1= ruleAVerb ) ;
    public final EObject ruleVerb() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_AVerb_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:649:6: ( (this_Resource_0= ruleResource | this_AVerb_1= ruleAVerb ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:650:1: (this_Resource_0= ruleResource | this_AVerb_1= ruleAVerb )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:650:1: (this_Resource_0= ruleResource | this_AVerb_1= ruleAVerb )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_5||LA6_0==RULE_IRI_TERMINAL||LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_10) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("650:1: (this_Resource_0= ruleResource | this_AVerb_1= ruleAVerb )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:651:5: this_Resource_0= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVerbAccess().getResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleVerb1251);
                    this_Resource_0=ruleResource();
                    _fsp--;


                            current = this_Resource_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:661:5: this_AVerb_1= ruleAVerb
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getVerbAccess().getAVerbParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAVerb_in_ruleVerb1278);
                    this_AVerb_1=ruleAVerb();
                    _fsp--;


                            current = this_AVerb_1;
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
    // $ANTLR end ruleVerb


    // $ANTLR start entryRuleAVerb
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:677:1: entryRuleAVerb returns [EObject current=null] : iv_ruleAVerb= ruleAVerb EOF ;
    public final EObject entryRuleAVerb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVerb = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:678:2: (iv_ruleAVerb= ruleAVerb EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:679:2: iv_ruleAVerb= ruleAVerb EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAVerbRule(), currentNode); 
            pushFollow(FOLLOW_ruleAVerb_in_entryRuleAVerb1312);
            iv_ruleAVerb=ruleAVerb();
            _fsp--;

             current =iv_ruleAVerb; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAVerb1322); 

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
    // $ANTLR end entryRuleAVerb


    // $ANTLR start ruleAVerb
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:686:1: ruleAVerb returns [EObject current=null] : ( (lv_name_0_0= KEYWORD_10 ) ) ;
    public final EObject ruleAVerb() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:691:6: ( ( (lv_name_0_0= KEYWORD_10 ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:692:1: ( (lv_name_0_0= KEYWORD_10 ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:692:1: ( (lv_name_0_0= KEYWORD_10 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:693:1: (lv_name_0_0= KEYWORD_10 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:693:1: (lv_name_0_0= KEYWORD_10 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:694:3: lv_name_0_0= KEYWORD_10
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleAVerb1365); 

                    createLeafNode(grammarAccess.getAVerbAccess().getNameAKeyword_0(), "name"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAVerbRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0_0, "a", lastConsumedNode);
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
    // $ANTLR end ruleAVerb


    // $ANTLR start entryRuleResource
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:722:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:723:2: (iv_ruleResource= ruleResource EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:724:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1412);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1422); 

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
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:731:1: ruleResource returns [EObject current=null] : (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_URIRef_0 = null;

        EObject this_QName_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:736:6: ( (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:737:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:737:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IRI_TERMINAL) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_5||LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("737:1: (this_URIRef_0= ruleURIRef | this_QName_1= ruleQName )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:738:5: this_URIRef_0= ruleURIRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getURIRefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleURIRef_in_ruleResource1469);
                    this_URIRef_0=ruleURIRef();
                    _fsp--;


                            current = this_URIRef_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:748:5: this_QName_1= ruleQName
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getQNameParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleResource1496);
                    this_QName_1=ruleQName();
                    _fsp--;


                            current = this_QName_1;
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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleObjectList
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:764:1: entryRuleObjectList returns [EObject current=null] : iv_ruleObjectList= ruleObjectList EOF ;
    public final EObject entryRuleObjectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectList = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:765:2: (iv_ruleObjectList= ruleObjectList EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:766:2: iv_ruleObjectList= ruleObjectList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectListRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectList_in_entryRuleObjectList1530);
            iv_ruleObjectList=ruleObjectList();
            _fsp--;

             current =iv_ruleObjectList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectList1540); 

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
    // $ANTLR end entryRuleObjectList


    // $ANTLR start ruleObjectList
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:773:1: ruleObjectList returns [EObject current=null] : ( ( (lv_object_0_0= ruleObject ) ) ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )* ) ;
    public final EObject ruleObjectList() throws RecognitionException {
        EObject current = null;

        EObject lv_object_0_0 = null;

        EObject lv_object_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:778:6: ( ( ( (lv_object_0_0= ruleObject ) ) ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )* ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:779:1: ( ( (lv_object_0_0= ruleObject ) ) ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )* )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:779:1: ( ( (lv_object_0_0= ruleObject ) ) ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )* )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:779:2: ( (lv_object_0_0= ruleObject ) ) ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )*
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:779:2: ( (lv_object_0_0= ruleObject ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:780:1: (lv_object_0_0= ruleObject )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:780:1: (lv_object_0_0= ruleObject )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:781:3: lv_object_0_0= ruleObject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleObject_in_ruleObjectList1586);
            lv_object_0_0=ruleObject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObjectListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"object",
            	        		lv_object_0_0, 
            	        		"Object", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:803:2: ( KEYWORD_3 ( (lv_object_2_0= ruleObject ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_3) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:804:2: KEYWORD_3 ( (lv_object_2_0= ruleObject ) )
            	    {
            	    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleObjectList1598); 

            	            createLeafNode(grammarAccess.getObjectListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:808:1: ( (lv_object_2_0= ruleObject ) )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:809:1: (lv_object_2_0= ruleObject )
            	    {
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:809:1: (lv_object_2_0= ruleObject )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:810:3: lv_object_2_0= ruleObject
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleObject_in_ruleObjectList1619);
            	    lv_object_2_0=ruleObject();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getObjectListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"object",
            	    	        		lv_object_2_0, 
            	    	        		"Object", 
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
            	    break loop8;
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
    // $ANTLR end ruleObjectList


    // $ANTLR start entryRuleObject
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:840:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:841:2: (iv_ruleObject= ruleObject EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:842:2: iv_ruleObject= ruleObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject1656);
            iv_ruleObject=ruleObject();
            _fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject1666); 

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
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:849:1: ruleObject returns [EObject current=null] : (this_Resource_0= ruleResource | this_Blank_1= ruleBlank | this_Literal_2= ruleLiteral ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_Blank_1 = null;

        EObject this_Literal_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:854:6: ( (this_Resource_0= ruleResource | this_Blank_1= ruleBlank | this_Literal_2= ruleLiteral ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:855:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank | this_Literal_2= ruleLiteral )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:855:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank | this_Literal_2= ruleLiteral )
            int alt9=3;
            switch ( input.LA(1) ) {
            case KEYWORD_5:
            case RULE_IRI_TERMINAL:
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case KEYWORD_11:
            case KEYWORD_13:
            case KEYWORD_1:
            case KEYWORD_8:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("855:1: (this_Resource_0= ruleResource | this_Blank_1= ruleBlank | this_Literal_2= ruleLiteral )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:856:5: this_Resource_0= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getResourceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleObject1713);
                    this_Resource_0=ruleResource();
                    _fsp--;


                            current = this_Resource_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:866:5: this_Blank_1= ruleBlank
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getBlankParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlank_in_ruleObject1740);
                    this_Blank_1=ruleBlank();
                    _fsp--;


                            current = this_Blank_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:876:5: this_Literal_2= ruleLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleObject1767);
                    this_Literal_2=ruleLiteral();
                    _fsp--;


                            current = this_Literal_2;
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
    // $ANTLR end ruleObject


    // $ANTLR start entryRuleCollection
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:892:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:893:2: (iv_ruleCollection= ruleCollection EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:894:2: iv_ruleCollection= ruleCollection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection1801);
            iv_ruleCollection=ruleCollection();
            _fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection1811); 

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
    // $ANTLR end entryRuleCollection


    // $ANTLR start ruleCollection
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:901:1: ruleCollection returns [EObject current=null] : ( KEYWORD_1 ( (lv_items_1_0= ruleObjectList ) )+ KEYWORD_2 ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:906:6: ( ( KEYWORD_1 ( (lv_items_1_0= ruleObjectList ) )+ KEYWORD_2 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:907:1: ( KEYWORD_1 ( (lv_items_1_0= ruleObjectList ) )+ KEYWORD_2 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:907:1: ( KEYWORD_1 ( (lv_items_1_0= ruleObjectList ) )+ KEYWORD_2 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:908:2: KEYWORD_1 ( (lv_items_1_0= ruleObjectList ) )+ KEYWORD_2
            {
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCollection1847); 

                    createLeafNode(grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:912:1: ( (lv_items_1_0= ruleObjectList ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_11||(LA10_0>=KEYWORD_13 && LA10_0<=KEYWORD_1)||LA10_0==KEYWORD_5||LA10_0==KEYWORD_8||(LA10_0>=RULE_IRI_TERMINAL && LA10_0<=RULE_INT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:913:1: (lv_items_1_0= ruleObjectList )
            	    {
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:913:1: (lv_items_1_0= ruleObjectList )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:914:3: lv_items_1_0= ruleObjectList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionAccess().getItemsObjectListParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectList_in_ruleCollection1868);
            	    lv_items_1_0=ruleObjectList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_1_0, 
            	    	        		"ObjectList", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCollection1880); 

                    createLeafNode(grammarAccess.getCollectionAccess().getRightParenthesisKeyword_2(), null); 
                

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
    // $ANTLR end ruleCollection


    // $ANTLR start entryRuleLiteral
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:949:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:950:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:951:2: iv_ruleLiteral= ruleLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1915);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1925); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:958:1: ruleLiteral returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:963:6: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:964:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:964:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("964:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:965:5: this_StringValue_0= ruleStringValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleLiteral1972);
                    this_StringValue_0=ruleStringValue();
                    _fsp--;


                            current = this_StringValue_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:975:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleLiteral1999);
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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:991:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:992:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:993:2: iv_ruleStringValue= ruleStringValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2033);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2043); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1000:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1005:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1006:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1006:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1006:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1006:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1007:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1007:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1008:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue2085); 

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

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1030:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_12||LA12_0==KEYWORD_7) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1031:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1031:1: (lv_tag_1_0= ruleRDFTag )
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1032:3: lv_tag_1_0= ruleRDFTag
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleStringValue2111);
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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1062:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1063:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1064:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue2147);
            iv_ruleIntegerValue=ruleIntegerValue();
            _fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue2157); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1071:1: ruleIntegerValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_tag_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1076:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1077:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1077:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )? )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1077:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_tag_1_0= ruleRDFTag ) )?
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1077:2: ( (lv_value_0_0= RULE_INT ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1078:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1078:1: (lv_value_0_0= RULE_INT )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1079:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerValue2199); 

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

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1101:2: ( (lv_tag_1_0= ruleRDFTag ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_12||LA13_0==KEYWORD_7) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1102:1: (lv_tag_1_0= ruleRDFTag )
                    {
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1102:1: (lv_tag_1_0= ruleRDFTag )
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1103:3: lv_tag_1_0= ruleRDFTag
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRDFTag_in_ruleIntegerValue2225);
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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1133:1: entryRuleRDFTag returns [EObject current=null] : iv_ruleRDFTag= ruleRDFTag EOF ;
    public final EObject entryRuleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDFTag = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1134:2: (iv_ruleRDFTag= ruleRDFTag EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1135:2: iv_ruleRDFTag= ruleRDFTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRDFTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag2261);
            iv_ruleRDFTag=ruleRDFTag();
            _fsp--;

             current =iv_ruleRDFTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag2271); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1142:1: ruleRDFTag returns [EObject current=null] : (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) ;
    public final EObject ruleRDFTag() throws RecognitionException {
        EObject current = null;

        EObject this_TypeTag_0 = null;

        EObject this_LangTag_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1147:6: ( (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1148:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1148:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_12) ) {
                alt14=1;
            }
            else if ( (LA14_0==KEYWORD_7) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1148:1: (this_TypeTag_0= ruleTypeTag | this_LangTag_1= ruleLangTag )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1149:5: this_TypeTag_0= ruleTypeTag
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTypeTag_in_ruleRDFTag2318);
                    this_TypeTag_0=ruleTypeTag();
                    _fsp--;


                            current = this_TypeTag_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1159:5: this_LangTag_1= ruleLangTag
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLangTag_in_ruleRDFTag2345);
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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1175:1: entryRuleTypeTag returns [EObject current=null] : iv_ruleTypeTag= ruleTypeTag EOF ;
    public final EObject entryRuleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1179:2: (iv_ruleTypeTag= ruleTypeTag EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1180:2: iv_ruleTypeTag= ruleTypeTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag2385);
            iv_ruleTypeTag=ruleTypeTag();
            _fsp--;

             current =iv_ruleTypeTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag2395); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1190:1: ruleTypeTag returns [EObject current=null] : ( KEYWORD_12 ( (lv_type_1_0= ruleQName ) ) ) ;
    public final EObject ruleTypeTag() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1196:6: ( ( KEYWORD_12 ( (lv_type_1_0= ruleQName ) ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1197:1: ( KEYWORD_12 ( (lv_type_1_0= ruleQName ) ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1197:1: ( KEYWORD_12 ( (lv_type_1_0= ruleQName ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1198:2: KEYWORD_12 ( (lv_type_1_0= ruleQName ) )
            {
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleTypeTag2435); 

                    createLeafNode(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1202:1: ( (lv_type_1_0= ruleQName ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1203:1: (lv_type_1_0= ruleQName )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1203:1: (lv_type_1_0= ruleQName )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1204:3: lv_type_1_0= ruleQName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleTypeTag2456);
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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1237:1: entryRuleLangTag returns [EObject current=null] : iv_ruleLangTag= ruleLangTag EOF ;
    public final EObject entryRuleLangTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1241:2: (iv_ruleLangTag= ruleLangTag EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1242:2: iv_ruleLangTag= ruleLangTag EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLangTagRule(), currentNode); 
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag2501);
            iv_ruleLangTag=ruleLangTag();
            _fsp--;

             current =iv_ruleLangTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag2511); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1252:1: ruleLangTag returns [EObject current=null] : ( KEYWORD_7 ( (lv_lang_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLangTag() throws RecognitionException {
        EObject current = null;

        Token lv_lang_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1258:6: ( ( KEYWORD_7 ( (lv_lang_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1259:1: ( KEYWORD_7 ( (lv_lang_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1259:1: ( KEYWORD_7 ( (lv_lang_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1260:2: KEYWORD_7 ( (lv_lang_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleLangTag2551); 

                    createLeafNode(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1264:1: ( (lv_lang_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1265:1: (lv_lang_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1265:1: (lv_lang_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1266:3: lv_lang_1_0= RULE_ID
            {
            lv_lang_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangTag2568); 

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


    // $ANTLR start entryRuleURIRef
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1299:1: entryRuleURIRef returns [EObject current=null] : iv_ruleURIRef= ruleURIRef EOF ;
    public final EObject entryRuleURIRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIRef = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1300:2: (iv_ruleURIRef= ruleURIRef EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1301:2: iv_ruleURIRef= ruleURIRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURIRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleURIRef_in_entryRuleURIRef2612);
            iv_ruleURIRef=ruleURIRef();
            _fsp--;

             current =iv_ruleURIRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURIRef2622); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1308:1: ruleURIRef returns [EObject current=null] : ( (lv_uri_0_0= RULE_IRI_TERMINAL ) ) ;
    public final EObject ruleURIRef() throws RecognitionException {
        EObject current = null;

        Token lv_uri_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1313:6: ( ( (lv_uri_0_0= RULE_IRI_TERMINAL ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1314:1: ( (lv_uri_0_0= RULE_IRI_TERMINAL ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1314:1: ( (lv_uri_0_0= RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1315:1: (lv_uri_0_0= RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1315:1: (lv_uri_0_0= RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1316:3: lv_uri_0_0= RULE_IRI_TERMINAL
            {
            lv_uri_0_0=(Token)input.LT(1);
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_ruleURIRef2663); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1346:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1347:2: (iv_ruleQName= ruleQName EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1348:2: iv_ruleQName= ruleQName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName2702);
            iv_ruleQName=ruleQName();
            _fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName2712); 

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
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1355:1: ruleQName returns [EObject current=null] : ( ( ( RULE_ID ) )? KEYWORD_5 ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1360:6: ( ( ( ( RULE_ID ) )? KEYWORD_5 ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1361:1: ( ( ( RULE_ID ) )? KEYWORD_5 ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1361:1: ( ( ( RULE_ID ) )? KEYWORD_5 ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1361:2: ( ( RULE_ID ) )? KEYWORD_5 ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1361:2: ( ( RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1362:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1362:1: ( RULE_ID )
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1363:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getQNameRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName2755); 

                    		createLeafNode(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
                    	

                    }


                    }
                    break;

            }

            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleQName2767); 

                    createLeafNode(grammarAccess.getQNameAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1380:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1381:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1381:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1382:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName2784); 

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


    // $ANTLR start entryRuleBlank
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1412:1: entryRuleBlank returns [EObject current=null] : iv_ruleBlank= ruleBlank EOF ;
    public final EObject entryRuleBlank() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlank = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1413:2: (iv_ruleBlank= ruleBlank EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1414:2: iv_ruleBlank= ruleBlank EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlankRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlank_in_entryRuleBlank2824);
            iv_ruleBlank=ruleBlank();
            _fsp--;

             current =iv_ruleBlank; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlank2834); 

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
    // $ANTLR end entryRuleBlank


    // $ANTLR start ruleBlank
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1421:1: ruleBlank returns [EObject current=null] : (this_NodeID_0= ruleNodeID | this_Void_1= ruleVoid | this_Collection_2= ruleCollection | this_BlankNodeContent_3= ruleBlankNodeContent ) ;
    public final EObject ruleBlank() throws RecognitionException {
        EObject current = null;

        EObject this_NodeID_0 = null;

        EObject this_Void_1 = null;

        EObject this_Collection_2 = null;

        EObject this_BlankNodeContent_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1426:6: ( (this_NodeID_0= ruleNodeID | this_Void_1= ruleVoid | this_Collection_2= ruleCollection | this_BlankNodeContent_3= ruleBlankNodeContent ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1427:1: (this_NodeID_0= ruleNodeID | this_Void_1= ruleVoid | this_Collection_2= ruleCollection | this_BlankNodeContent_3= ruleBlankNodeContent )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1427:1: (this_NodeID_0= ruleNodeID | this_Void_1= ruleVoid | this_Collection_2= ruleCollection | this_BlankNodeContent_3= ruleBlankNodeContent )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
                {
                alt16=1;
                }
                break;
            case KEYWORD_11:
                {
                alt16=2;
                }
                break;
            case KEYWORD_1:
                {
                alt16=3;
                }
                break;
            case KEYWORD_8:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1427:1: (this_NodeID_0= ruleNodeID | this_Void_1= ruleVoid | this_Collection_2= ruleCollection | this_BlankNodeContent_3= ruleBlankNodeContent )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1428:5: this_NodeID_0= ruleNodeID
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlankAccess().getNodeIDParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeID_in_ruleBlank2881);
                    this_NodeID_0=ruleNodeID();
                    _fsp--;


                            current = this_NodeID_0;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1438:5: this_Void_1= ruleVoid
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlankAccess().getVoidParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVoid_in_ruleBlank2908);
                    this_Void_1=ruleVoid();
                    _fsp--;


                            current = this_Void_1;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1448:5: this_Collection_2= ruleCollection
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlankAccess().getCollectionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollection_in_ruleBlank2935);
                    this_Collection_2=ruleCollection();
                    _fsp--;


                            current = this_Collection_2;
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1458:5: this_BlankNodeContent_3= ruleBlankNodeContent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBlankAccess().getBlankNodeContentParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlankNodeContent_in_ruleBlank2962);
                    this_BlankNodeContent_3=ruleBlankNodeContent();
                    _fsp--;


                            current = this_BlankNodeContent_3;
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
    // $ANTLR end ruleBlank


    // $ANTLR start entryRuleNodeID
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1474:1: entryRuleNodeID returns [EObject current=null] : iv_ruleNodeID= ruleNodeID EOF ;
    public final EObject entryRuleNodeID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeID = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1475:2: (iv_ruleNodeID= ruleNodeID EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1476:2: iv_ruleNodeID= ruleNodeID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeID_in_entryRuleNodeID2996);
            iv_ruleNodeID=ruleNodeID();
            _fsp--;

             current =iv_ruleNodeID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeID3006); 

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
    // $ANTLR end entryRuleNodeID


    // $ANTLR start ruleNodeID
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1483:1: ruleNodeID returns [EObject current=null] : ( KEYWORD_13 ( (lv_nodeID_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeID() throws RecognitionException {
        EObject current = null;

        Token lv_nodeID_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1488:6: ( ( KEYWORD_13 ( (lv_nodeID_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1489:1: ( KEYWORD_13 ( (lv_nodeID_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1489:1: ( KEYWORD_13 ( (lv_nodeID_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1490:2: KEYWORD_13 ( (lv_nodeID_1_0= RULE_ID ) )
            {
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleNodeID3042); 

                    createLeafNode(grammarAccess.getNodeIDAccess().get_Keyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1494:1: ( (lv_nodeID_1_0= RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1495:1: (lv_nodeID_1_0= RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1495:1: (lv_nodeID_1_0= RULE_ID )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1496:3: lv_nodeID_1_0= RULE_ID
            {
            lv_nodeID_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeID3059); 

            			createLeafNode(grammarAccess.getNodeIDAccess().getNodeIDIDTerminalRuleCall_1_0(), "nodeID"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeIDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"nodeID",
            	        		lv_nodeID_1_0, 
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
    // $ANTLR end ruleNodeID


    // $ANTLR start entryRuleVoid
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1526:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1527:2: (iv_ruleVoid= ruleVoid EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1528:2: iv_ruleVoid= ruleVoid EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVoidRule(), currentNode); 
            pushFollow(FOLLOW_ruleVoid_in_entryRuleVoid3099);
            iv_ruleVoid=ruleVoid();
            _fsp--;

             current =iv_ruleVoid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoid3109); 

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
    // $ANTLR end entryRuleVoid


    // $ANTLR start ruleVoid
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1535:1: ruleVoid returns [EObject current=null] : ( (lv_nodeID_0_0= KEYWORD_11 ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token lv_nodeID_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1540:6: ( ( (lv_nodeID_0_0= KEYWORD_11 ) ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1541:1: ( (lv_nodeID_0_0= KEYWORD_11 ) )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1541:1: ( (lv_nodeID_0_0= KEYWORD_11 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1542:1: (lv_nodeID_0_0= KEYWORD_11 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1542:1: (lv_nodeID_0_0= KEYWORD_11 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1543:3: lv_nodeID_0_0= KEYWORD_11
            {
            lv_nodeID_0_0=(Token)input.LT(1);
            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleVoid3152); 

                    createLeafNode(grammarAccess.getVoidAccess().getNodeIDLeftSquareBracketRightSquareBracketKeyword_0(), "nodeID"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVoidRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "nodeID", lv_nodeID_0_0, "[]", lastConsumedNode);
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
    // $ANTLR end ruleVoid


    // $ANTLR start entryRuleBlankNodeContent
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1571:1: entryRuleBlankNodeContent returns [EObject current=null] : iv_ruleBlankNodeContent= ruleBlankNodeContent EOF ;
    public final EObject entryRuleBlankNodeContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlankNodeContent = null;


        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1572:2: (iv_ruleBlankNodeContent= ruleBlankNodeContent EOF )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1573:2: iv_ruleBlankNodeContent= ruleBlankNodeContent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlankNodeContentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlankNodeContent_in_entryRuleBlankNodeContent3199);
            iv_ruleBlankNodeContent=ruleBlankNodeContent();
            _fsp--;

             current =iv_ruleBlankNodeContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankNodeContent3209); 

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
    // $ANTLR end entryRuleBlankNodeContent


    // $ANTLR start ruleBlankNodeContent
    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1580:1: ruleBlankNodeContent returns [EObject current=null] : ( KEYWORD_8 ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_9 ) ;
    public final EObject ruleBlankNodeContent() throws RecognitionException {
        EObject current = null;

        EObject lv_predicateObjectList_1_0 = null;

        EObject lv_predicateObjectList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1585:6: ( ( KEYWORD_8 ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_9 ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1586:1: ( KEYWORD_8 ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_9 )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1586:1: ( KEYWORD_8 ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_9 )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1587:2: KEYWORD_8 ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) ) ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )* KEYWORD_9
            {
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleBlankNodeContent3245); 

                    createLeafNode(grammarAccess.getBlankNodeContentAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1591:1: ( (lv_predicateObjectList_1_0= rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1592:1: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1592:1: (lv_predicateObjectList_1_0= rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1593:3: lv_predicateObjectList_1_0= rulePredicateObjectList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePredicateObjectList_in_ruleBlankNodeContent3266);
            lv_predicateObjectList_1_0=rulePredicateObjectList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBlankNodeContentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"predicateObjectList",
            	        		lv_predicateObjectList_1_0, 
            	        		"PredicateObjectList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1615:2: ( KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==KEYWORD_6) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1616:2: KEYWORD_6 ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) )
            	    {
            	    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleBlankNodeContent3278); 

            	            createLeafNode(grammarAccess.getBlankNodeContentAccess().getSemicolonKeyword_2_0(), null); 
            	        
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1620:1: ( (lv_predicateObjectList_3_0= rulePredicateObjectList ) )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1621:1: (lv_predicateObjectList_3_0= rulePredicateObjectList )
            	    {
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1621:1: (lv_predicateObjectList_3_0= rulePredicateObjectList )
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/internal/InternalTurtle.g:1622:3: lv_predicateObjectList_3_0= rulePredicateObjectList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicateObjectList_in_ruleBlankNodeContent3299);
            	    lv_predicateObjectList_3_0=rulePredicateObjectList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBlankNodeContentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"predicateObjectList",
            	    	        		lv_predicateObjectList_3_0, 
            	    	        		"PredicateObjectList", 
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
            	    break loop17;
                }
            } while (true);

            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleBlankNodeContent3312); 

                    createLeafNode(grammarAccess.getBlankNodeContentAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleBlankNodeContent


 

    public static final BitSet FOLLOW_ruleTurtleDocument_in_entryRuleTurtleDocument67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurtleDocument77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTurtleDocument122 = new BitSet(new long[]{0x0000000000292372L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriple_in_ruleStatement241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_entryRuleDirective275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirective285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleDirective332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_ruleDirective359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_ruleDirective386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rulePrefix466 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrefix483 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulePrefix499 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rulePrefix516 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePrefix532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNamedPrefix577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleUnNamedPrefix613 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUnNamedPrefix624 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleUnNamedPrefix641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnNamedPrefix657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_entryRuleBase692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBase702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleBase738 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleBase755 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleBase771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriple_in_entryRuleTriple806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriple816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_ruleTriple862 = new BitSet(new long[]{0x00000000002C2000L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_ruleTriple883 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleTriple895 = new BitSet(new long[]{0x00000000002C2000L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_ruleTriple916 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleTriple929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_entryRuleSubject964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubject974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleSubject1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_ruleSubject1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_entryRulePredicateObjectList1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateObjectList1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerb_in_rulePredicateObjectList1138 = new BitSet(new long[]{0x0000000000792340L});
    public static final BitSet FOLLOW_ruleObjectList_in_rulePredicateObjectList1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerb_in_entryRuleVerb1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerb1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleVerb1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVerb_in_ruleVerb1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVerb_in_entryRuleAVerb1312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAVerb1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleAVerb1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_ruleResource1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleResource1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectList_in_entryRuleObjectList1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectList1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_ruleObjectList1586 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleObjectList1598 = new BitSet(new long[]{0x0000000000792340L});
    public static final BitSet FOLLOW_ruleObject_in_ruleObjectList1619 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject1656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleObject1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_ruleObject1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleObject1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCollection1847 = new BitSet(new long[]{0x0000000000792340L});
    public static final BitSet FOLLOW_ruleObjectList_in_ruleCollection1868 = new BitSet(new long[]{0x0000000000792740L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCollection1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleLiteral1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleLiteral1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2085 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleStringValue2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue2147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerValue2199 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_ruleRDFTag_in_ruleIntegerValue2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_ruleRDFTag2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_ruleRDFTag2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleTypeTag2435 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_ruleQName_in_ruleTypeTag2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleLangTag2551 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangTag2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_entryRuleURIRef2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURIRef2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_ruleURIRef2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName2755 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleQName2767 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_entryRuleBlank2824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlank2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeID_in_ruleBlank2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoid_in_ruleBlank2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleBlank2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNodeContent_in_ruleBlank2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeID_in_entryRuleNodeID2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeID3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleNodeID3042 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeID3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoid_in_entryRuleVoid3099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoid3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleVoid3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNodeContent_in_entryRuleBlankNodeContent3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankNodeContent3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleBlankNodeContent3245 = new BitSet(new long[]{0x00000000002C2000L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_ruleBlankNodeContent3266 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleBlankNodeContent3278 = new BitSet(new long[]{0x00000000002C2000L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_ruleBlankNodeContent3299 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleBlankNodeContent3312 = new BitSet(new long[]{0x0000000000000002L});

}