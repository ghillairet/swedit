package org.eclipselabs.swedit.turtle.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipselabs.swedit.turtle.services.TurtleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IRI_TERMINAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@prefix'", "':'", "'.'", "'@base'", "';'", "','", "'('", "')'", "'^^'", "'@'", "'_:'", "'['", "']'", "'a'", "'[]'"
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

        public InternalTurtleParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g"; }


     
     	private TurtleGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TurtleGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleTurtleDocument
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:61:1: entryRuleTurtleDocument : ruleTurtleDocument EOF ;
    public final void entryRuleTurtleDocument() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:62:1: ( ruleTurtleDocument EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:63:1: ruleTurtleDocument EOF
            {
             before(grammarAccess.getTurtleDocumentRule()); 
            pushFollow(FOLLOW_ruleTurtleDocument_in_entryRuleTurtleDocument61);
            ruleTurtleDocument();
            _fsp--;

             after(grammarAccess.getTurtleDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurtleDocument68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTurtleDocument


    // $ANTLR start ruleTurtleDocument
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:70:1: ruleTurtleDocument : ( ( rule__TurtleDocument__StatementsAssignment )* ) ;
    public final void ruleTurtleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:74:2: ( ( ( rule__TurtleDocument__StatementsAssignment )* ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:75:1: ( ( rule__TurtleDocument__StatementsAssignment )* )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:75:1: ( ( rule__TurtleDocument__StatementsAssignment )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:76:1: ( rule__TurtleDocument__StatementsAssignment )*
            {
             before(grammarAccess.getTurtleDocumentAccess().getStatementsAssignment()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:77:1: ( rule__TurtleDocument__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_IRI_TERMINAL)||(LA1_0>=12 && LA1_0<=13)||LA1_0==15||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:77:2: rule__TurtleDocument__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TurtleDocument__StatementsAssignment_in_ruleTurtleDocument94);
            	    rule__TurtleDocument__StatementsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTurtleDocumentAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTurtleDocument


    // $ANTLR start entryRuleStatement
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:90:1: ( ruleStatement EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:91:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement122);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:98:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:102:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:103:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:103:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:104:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:105:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:105:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement155);
            rule__Statement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleDirective
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:117:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:118:1: ( ruleDirective EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:119:1: ruleDirective EOF
            {
             before(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_ruleDirective_in_entryRuleDirective182);
            ruleDirective();
            _fsp--;

             after(grammarAccess.getDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirective189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDirective


    // $ANTLR start ruleDirective
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:126:1: ruleDirective : ( ( rule__Directive__Alternatives ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:130:2: ( ( ( rule__Directive__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:131:1: ( ( rule__Directive__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:131:1: ( ( rule__Directive__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:132:1: ( rule__Directive__Alternatives )
            {
             before(grammarAccess.getDirectiveAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:133:1: ( rule__Directive__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:133:2: rule__Directive__Alternatives
            {
            pushFollow(FOLLOW_rule__Directive__Alternatives_in_ruleDirective215);
            rule__Directive__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDirective


    // $ANTLR start entryRulePrefix
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:145:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:146:1: ( rulePrefix EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:147:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix242);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:154:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:158:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:159:1: ( ( rule__Prefix__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:159:1: ( ( rule__Prefix__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:160:1: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:161:1: ( rule__Prefix__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:161:2: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0_in_rulePrefix275);
            rule__Prefix__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleUnNamedPrefix
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:173:1: entryRuleUnNamedPrefix : ruleUnNamedPrefix EOF ;
    public final void entryRuleUnNamedPrefix() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:174:1: ( ruleUnNamedPrefix EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:175:1: ruleUnNamedPrefix EOF
            {
             before(grammarAccess.getUnNamedPrefixRule()); 
            pushFollow(FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix302);
            ruleUnNamedPrefix();
            _fsp--;

             after(grammarAccess.getUnNamedPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNamedPrefix309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUnNamedPrefix


    // $ANTLR start ruleUnNamedPrefix
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:182:1: ruleUnNamedPrefix : ( ( rule__UnNamedPrefix__Group__0 ) ) ;
    public final void ruleUnNamedPrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:186:2: ( ( ( rule__UnNamedPrefix__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:187:1: ( ( rule__UnNamedPrefix__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:187:1: ( ( rule__UnNamedPrefix__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:188:1: ( rule__UnNamedPrefix__Group__0 )
            {
             before(grammarAccess.getUnNamedPrefixAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:189:1: ( rule__UnNamedPrefix__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:189:2: rule__UnNamedPrefix__Group__0
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__0_in_ruleUnNamedPrefix335);
            rule__UnNamedPrefix__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUnNamedPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnNamedPrefix


    // $ANTLR start entryRuleBase
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:201:1: entryRuleBase : ruleBase EOF ;
    public final void entryRuleBase() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:202:1: ( ruleBase EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:203:1: ruleBase EOF
            {
             before(grammarAccess.getBaseRule()); 
            pushFollow(FOLLOW_ruleBase_in_entryRuleBase362);
            ruleBase();
            _fsp--;

             after(grammarAccess.getBaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBase369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBase


    // $ANTLR start ruleBase
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:210:1: ruleBase : ( ( rule__Base__Group__0 ) ) ;
    public final void ruleBase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:214:2: ( ( ( rule__Base__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:215:1: ( ( rule__Base__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:215:1: ( ( rule__Base__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:216:1: ( rule__Base__Group__0 )
            {
             before(grammarAccess.getBaseAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:217:1: ( rule__Base__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:217:2: rule__Base__Group__0
            {
            pushFollow(FOLLOW_rule__Base__Group__0_in_ruleBase395);
            rule__Base__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBase


    // $ANTLR start entryRuleTriple
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:229:1: entryRuleTriple : ruleTriple EOF ;
    public final void entryRuleTriple() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:230:1: ( ruleTriple EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:231:1: ruleTriple EOF
            {
             before(grammarAccess.getTripleRule()); 
            pushFollow(FOLLOW_ruleTriple_in_entryRuleTriple422);
            ruleTriple();
            _fsp--;

             after(grammarAccess.getTripleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriple429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTriple


    // $ANTLR start ruleTriple
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:238:1: ruleTriple : ( ( rule__Triple__Group__0 ) ) ;
    public final void ruleTriple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:242:2: ( ( ( rule__Triple__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:243:1: ( ( rule__Triple__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:243:1: ( ( rule__Triple__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:244:1: ( rule__Triple__Group__0 )
            {
             before(grammarAccess.getTripleAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:245:1: ( rule__Triple__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:245:2: rule__Triple__Group__0
            {
            pushFollow(FOLLOW_rule__Triple__Group__0_in_ruleTriple455);
            rule__Triple__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTripleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTriple


    // $ANTLR start entryRuleSubject
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:257:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:258:1: ( ruleSubject EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:259:1: ruleSubject EOF
            {
             before(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_ruleSubject_in_entryRuleSubject482);
            ruleSubject();
            _fsp--;

             after(grammarAccess.getSubjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubject489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSubject


    // $ANTLR start ruleSubject
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:266:1: ruleSubject : ( ( rule__Subject__Alternatives ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:270:2: ( ( ( rule__Subject__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:271:1: ( ( rule__Subject__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:271:1: ( ( rule__Subject__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:272:1: ( rule__Subject__Alternatives )
            {
             before(grammarAccess.getSubjectAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:273:1: ( rule__Subject__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:273:2: rule__Subject__Alternatives
            {
            pushFollow(FOLLOW_rule__Subject__Alternatives_in_ruleSubject515);
            rule__Subject__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSubjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSubject


    // $ANTLR start entryRulePredicateObjectList
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:285:1: entryRulePredicateObjectList : rulePredicateObjectList EOF ;
    public final void entryRulePredicateObjectList() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:286:1: ( rulePredicateObjectList EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:287:1: rulePredicateObjectList EOF
            {
             before(grammarAccess.getPredicateObjectListRule()); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_entryRulePredicateObjectList542);
            rulePredicateObjectList();
            _fsp--;

             after(grammarAccess.getPredicateObjectListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateObjectList549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePredicateObjectList


    // $ANTLR start rulePredicateObjectList
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:294:1: rulePredicateObjectList : ( ( rule__PredicateObjectList__Group__0 ) ) ;
    public final void rulePredicateObjectList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:298:2: ( ( ( rule__PredicateObjectList__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:299:1: ( ( rule__PredicateObjectList__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:299:1: ( ( rule__PredicateObjectList__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:300:1: ( rule__PredicateObjectList__Group__0 )
            {
             before(grammarAccess.getPredicateObjectListAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:301:1: ( rule__PredicateObjectList__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:301:2: rule__PredicateObjectList__Group__0
            {
            pushFollow(FOLLOW_rule__PredicateObjectList__Group__0_in_rulePredicateObjectList575);
            rule__PredicateObjectList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPredicateObjectListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePredicateObjectList


    // $ANTLR start entryRuleVerb
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:313:1: entryRuleVerb : ruleVerb EOF ;
    public final void entryRuleVerb() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:314:1: ( ruleVerb EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:315:1: ruleVerb EOF
            {
             before(grammarAccess.getVerbRule()); 
            pushFollow(FOLLOW_ruleVerb_in_entryRuleVerb602);
            ruleVerb();
            _fsp--;

             after(grammarAccess.getVerbRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerb609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVerb


    // $ANTLR start ruleVerb
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:322:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:326:2: ( ( ( rule__Verb__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:327:1: ( ( rule__Verb__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:327:1: ( ( rule__Verb__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:328:1: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:329:1: ( rule__Verb__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:329:2: rule__Verb__Alternatives
            {
            pushFollow(FOLLOW_rule__Verb__Alternatives_in_ruleVerb635);
            rule__Verb__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVerbAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVerb


    // $ANTLR start entryRuleAVerb
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:341:1: entryRuleAVerb : ruleAVerb EOF ;
    public final void entryRuleAVerb() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:342:1: ( ruleAVerb EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:343:1: ruleAVerb EOF
            {
             before(grammarAccess.getAVerbRule()); 
            pushFollow(FOLLOW_ruleAVerb_in_entryRuleAVerb662);
            ruleAVerb();
            _fsp--;

             after(grammarAccess.getAVerbRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAVerb669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAVerb


    // $ANTLR start ruleAVerb
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:350:1: ruleAVerb : ( ( rule__AVerb__NameAssignment ) ) ;
    public final void ruleAVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:354:2: ( ( ( rule__AVerb__NameAssignment ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:355:1: ( ( rule__AVerb__NameAssignment ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:355:1: ( ( rule__AVerb__NameAssignment ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:356:1: ( rule__AVerb__NameAssignment )
            {
             before(grammarAccess.getAVerbAccess().getNameAssignment()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:357:1: ( rule__AVerb__NameAssignment )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:357:2: rule__AVerb__NameAssignment
            {
            pushFollow(FOLLOW_rule__AVerb__NameAssignment_in_ruleAVerb695);
            rule__AVerb__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getAVerbAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAVerb


    // $ANTLR start entryRuleResource
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:369:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:370:1: ( ruleResource EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:371:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource722);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:378:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:382:2: ( ( ( rule__Resource__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:383:1: ( ( rule__Resource__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:383:1: ( ( rule__Resource__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:384:1: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:385:1: ( rule__Resource__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:385:2: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_rule__Resource__Alternatives_in_ruleResource755);
            rule__Resource__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleObjectList
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:397:1: entryRuleObjectList : ruleObjectList EOF ;
    public final void entryRuleObjectList() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:398:1: ( ruleObjectList EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:399:1: ruleObjectList EOF
            {
             before(grammarAccess.getObjectListRule()); 
            pushFollow(FOLLOW_ruleObjectList_in_entryRuleObjectList782);
            ruleObjectList();
            _fsp--;

             after(grammarAccess.getObjectListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectList789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleObjectList


    // $ANTLR start ruleObjectList
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:406:1: ruleObjectList : ( ( rule__ObjectList__Group__0 ) ) ;
    public final void ruleObjectList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:410:2: ( ( ( rule__ObjectList__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:411:1: ( ( rule__ObjectList__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:411:1: ( ( rule__ObjectList__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:412:1: ( rule__ObjectList__Group__0 )
            {
             before(grammarAccess.getObjectListAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:413:1: ( rule__ObjectList__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:413:2: rule__ObjectList__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectList__Group__0_in_ruleObjectList815);
            rule__ObjectList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getObjectListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObjectList


    // $ANTLR start entryRuleObject
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:425:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:426:1: ( ruleObject EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:427:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject842);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:434:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:438:2: ( ( ( rule__Object__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:439:1: ( ( rule__Object__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:439:1: ( ( rule__Object__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:440:1: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:441:1: ( rule__Object__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:441:2: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_rule__Object__Alternatives_in_ruleObject875);
            rule__Object__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObject


    // $ANTLR start entryRuleCollection
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:453:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:454:1: ( ruleCollection EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:455:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection902);
            ruleCollection();
            _fsp--;

             after(grammarAccess.getCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCollection


    // $ANTLR start ruleCollection
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:462:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:466:2: ( ( ( rule__Collection__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:467:1: ( ( rule__Collection__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:467:1: ( ( rule__Collection__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:468:1: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:469:1: ( rule__Collection__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:469:2: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_rule__Collection__Group__0_in_ruleCollection935);
            rule__Collection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollection


    // $ANTLR start entryRuleLiteral
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:481:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:482:1: ( ruleLiteral EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:483:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral962);
            ruleLiteral();
            _fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:490:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:494:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:495:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:495:1: ( ( rule__Literal__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:496:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:497:1: ( rule__Literal__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:497:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral995);
            rule__Literal__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleStringValue
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:509:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:510:1: ( ruleStringValue EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:511:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1022);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:518:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:522:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:523:1: ( ( rule__StringValue__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:523:1: ( ( rule__StringValue__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:524:1: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:525:1: ( rule__StringValue__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:525:2: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0_in_ruleStringValue1055);
            rule__StringValue__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleIntegerValue
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:537:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:538:1: ( ruleIntegerValue EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:539:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1082);
            ruleIntegerValue();
            _fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntegerValue


    // $ANTLR start ruleIntegerValue
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:546:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:550:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:551:1: ( ( rule__IntegerValue__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:551:1: ( ( rule__IntegerValue__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:552:1: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:553:1: ( rule__IntegerValue__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:553:2: rule__IntegerValue__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue1115);
            rule__IntegerValue__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntegerValue


    // $ANTLR start entryRuleRDFTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:565:1: entryRuleRDFTag : ruleRDFTag EOF ;
    public final void entryRuleRDFTag() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:566:1: ( ruleRDFTag EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:567:1: ruleRDFTag EOF
            {
             before(grammarAccess.getRDFTagRule()); 
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag1142);
            ruleRDFTag();
            _fsp--;

             after(grammarAccess.getRDFTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRDFTag


    // $ANTLR start ruleRDFTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:574:1: ruleRDFTag : ( ( rule__RDFTag__Alternatives ) ) ;
    public final void ruleRDFTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:578:2: ( ( ( rule__RDFTag__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:579:1: ( ( rule__RDFTag__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:579:1: ( ( rule__RDFTag__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:580:1: ( rule__RDFTag__Alternatives )
            {
             before(grammarAccess.getRDFTagAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:581:1: ( rule__RDFTag__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:581:2: rule__RDFTag__Alternatives
            {
            pushFollow(FOLLOW_rule__RDFTag__Alternatives_in_ruleRDFTag1175);
            rule__RDFTag__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRDFTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRDFTag


    // $ANTLR start entryRuleTypeTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:593:1: entryRuleTypeTag : ruleTypeTag EOF ;
    public final void entryRuleTypeTag() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:597:1: ( ruleTypeTag EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:598:1: ruleTypeTag EOF
            {
             before(grammarAccess.getTypeTagRule()); 
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag1207);
            ruleTypeTag();
            _fsp--;

             after(grammarAccess.getTypeTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag1214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleTypeTag


    // $ANTLR start ruleTypeTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:608:1: ruleTypeTag : ( ( rule__TypeTag__Group__0 ) ) ;
    public final void ruleTypeTag() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:613:2: ( ( ( rule__TypeTag__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:614:1: ( ( rule__TypeTag__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:614:1: ( ( rule__TypeTag__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:615:1: ( rule__TypeTag__Group__0 )
            {
             before(grammarAccess.getTypeTagAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:616:1: ( rule__TypeTag__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:616:2: rule__TypeTag__Group__0
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__0_in_ruleTypeTag1244);
            rule__TypeTag__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleTypeTag


    // $ANTLR start entryRuleLangTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:629:1: entryRuleLangTag : ruleLangTag EOF ;
    public final void entryRuleLangTag() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:633:1: ( ruleLangTag EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:634:1: ruleLangTag EOF
            {
             before(grammarAccess.getLangTagRule()); 
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag1276);
            ruleLangTag();
            _fsp--;

             after(grammarAccess.getLangTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag1283); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end entryRuleLangTag


    // $ANTLR start ruleLangTag
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:644:1: ruleLangTag : ( ( rule__LangTag__Group__0 ) ) ;
    public final void ruleLangTag() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:649:2: ( ( ( rule__LangTag__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:650:1: ( ( rule__LangTag__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:650:1: ( ( rule__LangTag__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:651:1: ( rule__LangTag__Group__0 )
            {
             before(grammarAccess.getLangTagAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:652:1: ( rule__LangTag__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:652:2: rule__LangTag__Group__0
            {
            pushFollow(FOLLOW_rule__LangTag__Group__0_in_ruleLangTag1313);
            rule__LangTag__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLangTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end ruleLangTag


    // $ANTLR start entryRuleURIRef
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:665:1: entryRuleURIRef : ruleURIRef EOF ;
    public final void entryRuleURIRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:666:1: ( ruleURIRef EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:667:1: ruleURIRef EOF
            {
             before(grammarAccess.getURIRefRule()); 
            pushFollow(FOLLOW_ruleURIRef_in_entryRuleURIRef1340);
            ruleURIRef();
            _fsp--;

             after(grammarAccess.getURIRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURIRef1347); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleURIRef


    // $ANTLR start ruleURIRef
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:674:1: ruleURIRef : ( ( rule__URIRef__UriAssignment ) ) ;
    public final void ruleURIRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:678:2: ( ( ( rule__URIRef__UriAssignment ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:679:1: ( ( rule__URIRef__UriAssignment ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:679:1: ( ( rule__URIRef__UriAssignment ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:680:1: ( rule__URIRef__UriAssignment )
            {
             before(grammarAccess.getURIRefAccess().getUriAssignment()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:681:1: ( rule__URIRef__UriAssignment )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:681:2: rule__URIRef__UriAssignment
            {
            pushFollow(FOLLOW_rule__URIRef__UriAssignment_in_ruleURIRef1373);
            rule__URIRef__UriAssignment();
            _fsp--;


            }

             after(grammarAccess.getURIRefAccess().getUriAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleURIRef


    // $ANTLR start entryRuleQName
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:693:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:694:1: ( ruleQName EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:695:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName1400);
            ruleQName();
            _fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName1407); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQName


    // $ANTLR start ruleQName
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:702:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:706:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:707:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:707:1: ( ( rule__QName__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:708:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:709:1: ( rule__QName__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:709:2: rule__QName__Group__0
            {
            pushFollow(FOLLOW_rule__QName__Group__0_in_ruleQName1433);
            rule__QName__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQName


    // $ANTLR start entryRuleBlank
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:721:1: entryRuleBlank : ruleBlank EOF ;
    public final void entryRuleBlank() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:722:1: ( ruleBlank EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:723:1: ruleBlank EOF
            {
             before(grammarAccess.getBlankRule()); 
            pushFollow(FOLLOW_ruleBlank_in_entryRuleBlank1460);
            ruleBlank();
            _fsp--;

             after(grammarAccess.getBlankRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlank1467); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBlank


    // $ANTLR start ruleBlank
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:730:1: ruleBlank : ( ( rule__Blank__Alternatives ) ) ;
    public final void ruleBlank() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:734:2: ( ( ( rule__Blank__Alternatives ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:735:1: ( ( rule__Blank__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:735:1: ( ( rule__Blank__Alternatives ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:736:1: ( rule__Blank__Alternatives )
            {
             before(grammarAccess.getBlankAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:737:1: ( rule__Blank__Alternatives )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:737:2: rule__Blank__Alternatives
            {
            pushFollow(FOLLOW_rule__Blank__Alternatives_in_ruleBlank1493);
            rule__Blank__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBlankAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBlank


    // $ANTLR start entryRuleNodeID
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:749:1: entryRuleNodeID : ruleNodeID EOF ;
    public final void entryRuleNodeID() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:750:1: ( ruleNodeID EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:751:1: ruleNodeID EOF
            {
             before(grammarAccess.getNodeIDRule()); 
            pushFollow(FOLLOW_ruleNodeID_in_entryRuleNodeID1520);
            ruleNodeID();
            _fsp--;

             after(grammarAccess.getNodeIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeID1527); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNodeID


    // $ANTLR start ruleNodeID
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:758:1: ruleNodeID : ( ( rule__NodeID__Group__0 ) ) ;
    public final void ruleNodeID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:762:2: ( ( ( rule__NodeID__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:763:1: ( ( rule__NodeID__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:763:1: ( ( rule__NodeID__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:764:1: ( rule__NodeID__Group__0 )
            {
             before(grammarAccess.getNodeIDAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:765:1: ( rule__NodeID__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:765:2: rule__NodeID__Group__0
            {
            pushFollow(FOLLOW_rule__NodeID__Group__0_in_ruleNodeID1553);
            rule__NodeID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNodeIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNodeID


    // $ANTLR start entryRuleVoid
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:777:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:778:1: ( ruleVoid EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:779:1: ruleVoid EOF
            {
             before(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_ruleVoid_in_entryRuleVoid1580);
            ruleVoid();
            _fsp--;

             after(grammarAccess.getVoidRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoid1587); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVoid


    // $ANTLR start ruleVoid
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:786:1: ruleVoid : ( ( rule__Void__NodeIDAssignment ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:790:2: ( ( ( rule__Void__NodeIDAssignment ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:791:1: ( ( rule__Void__NodeIDAssignment ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:791:1: ( ( rule__Void__NodeIDAssignment ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:792:1: ( rule__Void__NodeIDAssignment )
            {
             before(grammarAccess.getVoidAccess().getNodeIDAssignment()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:793:1: ( rule__Void__NodeIDAssignment )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:793:2: rule__Void__NodeIDAssignment
            {
            pushFollow(FOLLOW_rule__Void__NodeIDAssignment_in_ruleVoid1613);
            rule__Void__NodeIDAssignment();
            _fsp--;


            }

             after(grammarAccess.getVoidAccess().getNodeIDAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVoid


    // $ANTLR start entryRuleBlankNodeContent
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:805:1: entryRuleBlankNodeContent : ruleBlankNodeContent EOF ;
    public final void entryRuleBlankNodeContent() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:806:1: ( ruleBlankNodeContent EOF )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:807:1: ruleBlankNodeContent EOF
            {
             before(grammarAccess.getBlankNodeContentRule()); 
            pushFollow(FOLLOW_ruleBlankNodeContent_in_entryRuleBlankNodeContent1640);
            ruleBlankNodeContent();
            _fsp--;

             after(grammarAccess.getBlankNodeContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlankNodeContent1647); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBlankNodeContent


    // $ANTLR start ruleBlankNodeContent
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:814:1: ruleBlankNodeContent : ( ( rule__BlankNodeContent__Group__0 ) ) ;
    public final void ruleBlankNodeContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:818:2: ( ( ( rule__BlankNodeContent__Group__0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:819:1: ( ( rule__BlankNodeContent__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:819:1: ( ( rule__BlankNodeContent__Group__0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:820:1: ( rule__BlankNodeContent__Group__0 )
            {
             before(grammarAccess.getBlankNodeContentAccess().getGroup()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:821:1: ( rule__BlankNodeContent__Group__0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:821:2: rule__BlankNodeContent__Group__0
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group__0_in_ruleBlankNodeContent1673);
            rule__BlankNodeContent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBlankNodeContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBlankNodeContent


    // $ANTLR start rule__Statement__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:833:1: rule__Statement__Alternatives : ( ( ruleDirective ) | ( ruleTriple ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:837:1: ( ( ruleDirective ) | ( ruleTriple ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12||LA2_0==15) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_IRI_TERMINAL)||LA2_0==13||LA2_0==18||(LA2_0>=22 && LA2_0<=23)||LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("833:1: rule__Statement__Alternatives : ( ( ruleDirective ) | ( ruleTriple ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:838:1: ( ruleDirective )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:838:1: ( ruleDirective )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:839:1: ruleDirective
                    {
                     before(grammarAccess.getStatementAccess().getDirectiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirective_in_rule__Statement__Alternatives1709);
                    ruleDirective();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getDirectiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:844:6: ( ruleTriple )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:844:6: ( ruleTriple )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:845:1: ruleTriple
                    {
                     before(grammarAccess.getStatementAccess().getTripleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTriple_in_rule__Statement__Alternatives1726);
                    ruleTriple();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getTripleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__Directive__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:855:1: rule__Directive__Alternatives : ( ( rulePrefix ) | ( ruleUnNamedPrefix ) | ( ruleBase ) );
    public final void rule__Directive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:859:1: ( ( rulePrefix ) | ( ruleUnNamedPrefix ) | ( ruleBase ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("855:1: rule__Directive__Alternatives : ( ( rulePrefix ) | ( ruleUnNamedPrefix ) | ( ruleBase ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==15) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("855:1: rule__Directive__Alternatives : ( ( rulePrefix ) | ( ruleUnNamedPrefix ) | ( ruleBase ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:860:1: ( rulePrefix )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:860:1: ( rulePrefix )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:861:1: rulePrefix
                    {
                     before(grammarAccess.getDirectiveAccess().getPrefixParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrefix_in_rule__Directive__Alternatives1758);
                    rulePrefix();
                    _fsp--;

                     after(grammarAccess.getDirectiveAccess().getPrefixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:866:6: ( ruleUnNamedPrefix )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:866:6: ( ruleUnNamedPrefix )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:867:1: ruleUnNamedPrefix
                    {
                     before(grammarAccess.getDirectiveAccess().getUnNamedPrefixParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnNamedPrefix_in_rule__Directive__Alternatives1775);
                    ruleUnNamedPrefix();
                    _fsp--;

                     after(grammarAccess.getDirectiveAccess().getUnNamedPrefixParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:872:6: ( ruleBase )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:872:6: ( ruleBase )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:873:1: ruleBase
                    {
                     before(grammarAccess.getDirectiveAccess().getBaseParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBase_in_rule__Directive__Alternatives1792);
                    ruleBase();
                    _fsp--;

                     after(grammarAccess.getDirectiveAccess().getBaseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Directive__Alternatives


    // $ANTLR start rule__Subject__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:883:1: rule__Subject__Alternatives : ( ( ruleResource ) | ( ruleBlank ) );
    public final void rule__Subject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:887:1: ( ( ruleResource ) | ( ruleBlank ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_IRI_TERMINAL)||LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==18||(LA4_0>=22 && LA4_0<=23)||LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("883:1: rule__Subject__Alternatives : ( ( ruleResource ) | ( ruleBlank ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:888:1: ( ruleResource )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:888:1: ( ruleResource )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:889:1: ruleResource
                    {
                     before(grammarAccess.getSubjectAccess().getResourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Subject__Alternatives1824);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getSubjectAccess().getResourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:894:6: ( ruleBlank )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:894:6: ( ruleBlank )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:895:1: ruleBlank
                    {
                     before(grammarAccess.getSubjectAccess().getBlankParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBlank_in_rule__Subject__Alternatives1841);
                    ruleBlank();
                    _fsp--;

                     after(grammarAccess.getSubjectAccess().getBlankParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subject__Alternatives


    // $ANTLR start rule__Verb__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:905:1: rule__Verb__Alternatives : ( ( ruleResource ) | ( ruleAVerb ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:909:1: ( ( ruleResource ) | ( ruleAVerb ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_IRI_TERMINAL)||LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("905:1: rule__Verb__Alternatives : ( ( ruleResource ) | ( ruleAVerb ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:910:1: ( ruleResource )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:910:1: ( ruleResource )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:911:1: ruleResource
                    {
                     before(grammarAccess.getVerbAccess().getResourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Verb__Alternatives1873);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getVerbAccess().getResourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:916:6: ( ruleAVerb )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:916:6: ( ruleAVerb )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:917:1: ruleAVerb
                    {
                     before(grammarAccess.getVerbAccess().getAVerbParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAVerb_in_rule__Verb__Alternatives1890);
                    ruleAVerb();
                    _fsp--;

                     after(grammarAccess.getVerbAccess().getAVerbParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Verb__Alternatives


    // $ANTLR start rule__Resource__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:927:1: rule__Resource__Alternatives : ( ( ruleURIRef ) | ( ruleQName ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:931:1: ( ( ruleURIRef ) | ( ruleQName ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_IRI_TERMINAL) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("927:1: rule__Resource__Alternatives : ( ( ruleURIRef ) | ( ruleQName ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:932:1: ( ruleURIRef )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:932:1: ( ruleURIRef )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:933:1: ruleURIRef
                    {
                     before(grammarAccess.getResourceAccess().getURIRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleURIRef_in_rule__Resource__Alternatives1922);
                    ruleURIRef();
                    _fsp--;

                     after(grammarAccess.getResourceAccess().getURIRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:938:6: ( ruleQName )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:938:6: ( ruleQName )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:939:1: ruleQName
                    {
                     before(grammarAccess.getResourceAccess().getQNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQName_in_rule__Resource__Alternatives1939);
                    ruleQName();
                    _fsp--;

                     after(grammarAccess.getResourceAccess().getQNameParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Alternatives


    // $ANTLR start rule__Object__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:949:1: rule__Object__Alternatives : ( ( ruleResource ) | ( ruleBlank ) | ( ruleLiteral ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:953:1: ( ( ruleResource ) | ( ruleBlank ) | ( ruleLiteral ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_IRI_TERMINAL:
            case 13:
                {
                alt7=1;
                }
                break;
            case 18:
            case 22:
            case 23:
            case 26:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("949:1: rule__Object__Alternatives : ( ( ruleResource ) | ( ruleBlank ) | ( ruleLiteral ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:954:1: ( ruleResource )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:954:1: ( ruleResource )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:955:1: ruleResource
                    {
                     before(grammarAccess.getObjectAccess().getResourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Object__Alternatives1971);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getResourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:960:6: ( ruleBlank )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:960:6: ( ruleBlank )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:961:1: ruleBlank
                    {
                     before(grammarAccess.getObjectAccess().getBlankParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBlank_in_rule__Object__Alternatives1988);
                    ruleBlank();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getBlankParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:966:6: ( ruleLiteral )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:966:6: ( ruleLiteral )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:967:1: ruleLiteral
                    {
                     before(grammarAccess.getObjectAccess().getLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Object__Alternatives2005);
                    ruleLiteral();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Alternatives


    // $ANTLR start rule__Literal__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:977:1: rule__Literal__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:981:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("977:1: rule__Literal__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:982:1: ( ruleStringValue )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:982:1: ( ruleStringValue )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:983:1: ruleStringValue
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Literal__Alternatives2037);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:988:6: ( ruleIntegerValue )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:988:6: ( ruleIntegerValue )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:989:1: ruleIntegerValue
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__Literal__Alternatives2054);
                    ruleIntegerValue();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Literal__Alternatives


    // $ANTLR start rule__RDFTag__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:999:1: rule__RDFTag__Alternatives : ( ( ruleTypeTag ) | ( ruleLangTag ) );
    public final void rule__RDFTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1003:1: ( ( ruleTypeTag ) | ( ruleLangTag ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("999:1: rule__RDFTag__Alternatives : ( ( ruleTypeTag ) | ( ruleLangTag ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1004:1: ( ruleTypeTag )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1004:1: ( ruleTypeTag )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1005:1: ruleTypeTag
                    {
                     before(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeTag_in_rule__RDFTag__Alternatives2086);
                    ruleTypeTag();
                    _fsp--;

                     after(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1010:6: ( ruleLangTag )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1010:6: ( ruleLangTag )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1011:1: ruleLangTag
                    {
                     before(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLangTag_in_rule__RDFTag__Alternatives2103);
                    ruleLangTag();
                    _fsp--;

                     after(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RDFTag__Alternatives


    // $ANTLR start rule__Blank__Alternatives
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1021:1: rule__Blank__Alternatives : ( ( ruleNodeID ) | ( ruleVoid ) | ( ruleCollection ) | ( ruleBlankNodeContent ) );
    public final void rule__Blank__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1025:1: ( ( ruleNodeID ) | ( ruleVoid ) | ( ruleCollection ) | ( ruleBlankNodeContent ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1021:1: rule__Blank__Alternatives : ( ( ruleNodeID ) | ( ruleVoid ) | ( ruleCollection ) | ( ruleBlankNodeContent ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1026:1: ( ruleNodeID )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1026:1: ( ruleNodeID )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1027:1: ruleNodeID
                    {
                     before(grammarAccess.getBlankAccess().getNodeIDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNodeID_in_rule__Blank__Alternatives2135);
                    ruleNodeID();
                    _fsp--;

                     after(grammarAccess.getBlankAccess().getNodeIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1032:6: ( ruleVoid )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1032:6: ( ruleVoid )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1033:1: ruleVoid
                    {
                     before(grammarAccess.getBlankAccess().getVoidParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVoid_in_rule__Blank__Alternatives2152);
                    ruleVoid();
                    _fsp--;

                     after(grammarAccess.getBlankAccess().getVoidParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1038:6: ( ruleCollection )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1038:6: ( ruleCollection )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1039:1: ruleCollection
                    {
                     before(grammarAccess.getBlankAccess().getCollectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCollection_in_rule__Blank__Alternatives2169);
                    ruleCollection();
                    _fsp--;

                     after(grammarAccess.getBlankAccess().getCollectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1044:6: ( ruleBlankNodeContent )
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1044:6: ( ruleBlankNodeContent )
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1045:1: ruleBlankNodeContent
                    {
                     before(grammarAccess.getBlankAccess().getBlankNodeContentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBlankNodeContent_in_rule__Blank__Alternatives2186);
                    ruleBlankNodeContent();
                    _fsp--;

                     after(grammarAccess.getBlankAccess().getBlankNodeContentParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Blank__Alternatives


    // $ANTLR start rule__Prefix__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1057:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1061:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1062:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__02216);
            rule__Prefix__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02219);
            rule__Prefix__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__0


    // $ANTLR start rule__Prefix__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1069:1: rule__Prefix__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1073:1: ( ( '@prefix' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1074:1: ( '@prefix' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1074:1: ( '@prefix' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1075:1: '@prefix'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Prefix__Group__0__Impl2247); 
             after(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__0__Impl


    // $ANTLR start rule__Prefix__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1088:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1092:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1093:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12278);
            rule__Prefix__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12281);
            rule__Prefix__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__1


    // $ANTLR start rule__Prefix__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1100:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__NameAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1104:1: ( ( ( rule__Prefix__NameAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1105:1: ( ( rule__Prefix__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1105:1: ( ( rule__Prefix__NameAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1106:1: ( rule__Prefix__NameAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1107:1: ( rule__Prefix__NameAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1107:2: rule__Prefix__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Prefix__NameAssignment_1_in_rule__Prefix__Group__1__Impl2308);
            rule__Prefix__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__1__Impl


    // $ANTLR start rule__Prefix__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1117:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1121:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1122:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
            {
            pushFollow(FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22338);
            rule__Prefix__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__3_in_rule__Prefix__Group__22341);
            rule__Prefix__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__2


    // $ANTLR start rule__Prefix__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1129:1: rule__Prefix__Group__2__Impl : ( ':' ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1133:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1134:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1134:1: ( ':' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1135:1: ':'
            {
             before(grammarAccess.getPrefixAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Prefix__Group__2__Impl2369); 
             after(grammarAccess.getPrefixAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__2__Impl


    // $ANTLR start rule__Prefix__Group__3
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1148:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl rule__Prefix__Group__4 ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1152:1: ( rule__Prefix__Group__3__Impl rule__Prefix__Group__4 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1153:2: rule__Prefix__Group__3__Impl rule__Prefix__Group__4
            {
            pushFollow(FOLLOW_rule__Prefix__Group__3__Impl_in_rule__Prefix__Group__32400);
            rule__Prefix__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__4_in_rule__Prefix__Group__32403);
            rule__Prefix__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__3


    // $ANTLR start rule__Prefix__Group__3__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1160:1: rule__Prefix__Group__3__Impl : ( ( rule__Prefix__UriAssignment_3 ) ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1164:1: ( ( ( rule__Prefix__UriAssignment_3 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1165:1: ( ( rule__Prefix__UriAssignment_3 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1165:1: ( ( rule__Prefix__UriAssignment_3 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1166:1: ( rule__Prefix__UriAssignment_3 )
            {
             before(grammarAccess.getPrefixAccess().getUriAssignment_3()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1167:1: ( rule__Prefix__UriAssignment_3 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1167:2: rule__Prefix__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__Prefix__UriAssignment_3_in_rule__Prefix__Group__3__Impl2430);
            rule__Prefix__UriAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPrefixAccess().getUriAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__3__Impl


    // $ANTLR start rule__Prefix__Group__4
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1177:1: rule__Prefix__Group__4 : rule__Prefix__Group__4__Impl ;
    public final void rule__Prefix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1181:1: ( rule__Prefix__Group__4__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1182:2: rule__Prefix__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group__4__Impl_in_rule__Prefix__Group__42460);
            rule__Prefix__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__4


    // $ANTLR start rule__Prefix__Group__4__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1188:1: rule__Prefix__Group__4__Impl : ( '.' ) ;
    public final void rule__Prefix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1192:1: ( ( '.' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1193:1: ( '.' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1193:1: ( '.' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1194:1: '.'
            {
             before(grammarAccess.getPrefixAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Prefix__Group__4__Impl2488); 
             after(grammarAccess.getPrefixAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__Group__4__Impl


    // $ANTLR start rule__UnNamedPrefix__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1217:1: rule__UnNamedPrefix__Group__0 : rule__UnNamedPrefix__Group__0__Impl rule__UnNamedPrefix__Group__1 ;
    public final void rule__UnNamedPrefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1221:1: ( rule__UnNamedPrefix__Group__0__Impl rule__UnNamedPrefix__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1222:2: rule__UnNamedPrefix__Group__0__Impl rule__UnNamedPrefix__Group__1
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__0__Impl_in_rule__UnNamedPrefix__Group__02529);
            rule__UnNamedPrefix__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__1_in_rule__UnNamedPrefix__Group__02532);
            rule__UnNamedPrefix__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__0


    // $ANTLR start rule__UnNamedPrefix__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1229:1: rule__UnNamedPrefix__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__UnNamedPrefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1233:1: ( ( '@prefix' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1234:1: ( '@prefix' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1234:1: ( '@prefix' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1235:1: '@prefix'
            {
             before(grammarAccess.getUnNamedPrefixAccess().getPrefixKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__UnNamedPrefix__Group__0__Impl2560); 
             after(grammarAccess.getUnNamedPrefixAccess().getPrefixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__0__Impl


    // $ANTLR start rule__UnNamedPrefix__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1248:1: rule__UnNamedPrefix__Group__1 : rule__UnNamedPrefix__Group__1__Impl rule__UnNamedPrefix__Group__2 ;
    public final void rule__UnNamedPrefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1252:1: ( rule__UnNamedPrefix__Group__1__Impl rule__UnNamedPrefix__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1253:2: rule__UnNamedPrefix__Group__1__Impl rule__UnNamedPrefix__Group__2
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__1__Impl_in_rule__UnNamedPrefix__Group__12591);
            rule__UnNamedPrefix__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__2_in_rule__UnNamedPrefix__Group__12594);
            rule__UnNamedPrefix__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__1


    // $ANTLR start rule__UnNamedPrefix__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1260:1: rule__UnNamedPrefix__Group__1__Impl : ( ':' ) ;
    public final void rule__UnNamedPrefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1264:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1265:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1265:1: ( ':' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1266:1: ':'
            {
             before(grammarAccess.getUnNamedPrefixAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__UnNamedPrefix__Group__1__Impl2622); 
             after(grammarAccess.getUnNamedPrefixAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__1__Impl


    // $ANTLR start rule__UnNamedPrefix__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1279:1: rule__UnNamedPrefix__Group__2 : rule__UnNamedPrefix__Group__2__Impl rule__UnNamedPrefix__Group__3 ;
    public final void rule__UnNamedPrefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1283:1: ( rule__UnNamedPrefix__Group__2__Impl rule__UnNamedPrefix__Group__3 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1284:2: rule__UnNamedPrefix__Group__2__Impl rule__UnNamedPrefix__Group__3
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__2__Impl_in_rule__UnNamedPrefix__Group__22653);
            rule__UnNamedPrefix__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__3_in_rule__UnNamedPrefix__Group__22656);
            rule__UnNamedPrefix__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__2


    // $ANTLR start rule__UnNamedPrefix__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1291:1: rule__UnNamedPrefix__Group__2__Impl : ( ( rule__UnNamedPrefix__UriAssignment_2 ) ) ;
    public final void rule__UnNamedPrefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1295:1: ( ( ( rule__UnNamedPrefix__UriAssignment_2 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1296:1: ( ( rule__UnNamedPrefix__UriAssignment_2 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1296:1: ( ( rule__UnNamedPrefix__UriAssignment_2 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1297:1: ( rule__UnNamedPrefix__UriAssignment_2 )
            {
             before(grammarAccess.getUnNamedPrefixAccess().getUriAssignment_2()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1298:1: ( rule__UnNamedPrefix__UriAssignment_2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1298:2: rule__UnNamedPrefix__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__UriAssignment_2_in_rule__UnNamedPrefix__Group__2__Impl2683);
            rule__UnNamedPrefix__UriAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUnNamedPrefixAccess().getUriAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__2__Impl


    // $ANTLR start rule__UnNamedPrefix__Group__3
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1308:1: rule__UnNamedPrefix__Group__3 : rule__UnNamedPrefix__Group__3__Impl ;
    public final void rule__UnNamedPrefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1312:1: ( rule__UnNamedPrefix__Group__3__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1313:2: rule__UnNamedPrefix__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnNamedPrefix__Group__3__Impl_in_rule__UnNamedPrefix__Group__32713);
            rule__UnNamedPrefix__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__3


    // $ANTLR start rule__UnNamedPrefix__Group__3__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1319:1: rule__UnNamedPrefix__Group__3__Impl : ( '.' ) ;
    public final void rule__UnNamedPrefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1323:1: ( ( '.' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1324:1: ( '.' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1324:1: ( '.' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1325:1: '.'
            {
             before(grammarAccess.getUnNamedPrefixAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__UnNamedPrefix__Group__3__Impl2741); 
             after(grammarAccess.getUnNamedPrefixAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__Group__3__Impl


    // $ANTLR start rule__Base__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1346:1: rule__Base__Group__0 : rule__Base__Group__0__Impl rule__Base__Group__1 ;
    public final void rule__Base__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1350:1: ( rule__Base__Group__0__Impl rule__Base__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1351:2: rule__Base__Group__0__Impl rule__Base__Group__1
            {
            pushFollow(FOLLOW_rule__Base__Group__0__Impl_in_rule__Base__Group__02780);
            rule__Base__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Base__Group__1_in_rule__Base__Group__02783);
            rule__Base__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__0


    // $ANTLR start rule__Base__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1358:1: rule__Base__Group__0__Impl : ( '@base' ) ;
    public final void rule__Base__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1362:1: ( ( '@base' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1363:1: ( '@base' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1363:1: ( '@base' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1364:1: '@base'
            {
             before(grammarAccess.getBaseAccess().getBaseKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Base__Group__0__Impl2811); 
             after(grammarAccess.getBaseAccess().getBaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__0__Impl


    // $ANTLR start rule__Base__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1377:1: rule__Base__Group__1 : rule__Base__Group__1__Impl rule__Base__Group__2 ;
    public final void rule__Base__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1381:1: ( rule__Base__Group__1__Impl rule__Base__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1382:2: rule__Base__Group__1__Impl rule__Base__Group__2
            {
            pushFollow(FOLLOW_rule__Base__Group__1__Impl_in_rule__Base__Group__12842);
            rule__Base__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Base__Group__2_in_rule__Base__Group__12845);
            rule__Base__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__1


    // $ANTLR start rule__Base__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1389:1: rule__Base__Group__1__Impl : ( ( rule__Base__UriAssignment_1 ) ) ;
    public final void rule__Base__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1393:1: ( ( ( rule__Base__UriAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1394:1: ( ( rule__Base__UriAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1394:1: ( ( rule__Base__UriAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1395:1: ( rule__Base__UriAssignment_1 )
            {
             before(grammarAccess.getBaseAccess().getUriAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1396:1: ( rule__Base__UriAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1396:2: rule__Base__UriAssignment_1
            {
            pushFollow(FOLLOW_rule__Base__UriAssignment_1_in_rule__Base__Group__1__Impl2872);
            rule__Base__UriAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBaseAccess().getUriAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__1__Impl


    // $ANTLR start rule__Base__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1406:1: rule__Base__Group__2 : rule__Base__Group__2__Impl ;
    public final void rule__Base__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1410:1: ( rule__Base__Group__2__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1411:2: rule__Base__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Base__Group__2__Impl_in_rule__Base__Group__22902);
            rule__Base__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__2


    // $ANTLR start rule__Base__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1417:1: rule__Base__Group__2__Impl : ( '.' ) ;
    public final void rule__Base__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1421:1: ( ( '.' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1422:1: ( '.' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1422:1: ( '.' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1423:1: '.'
            {
             before(grammarAccess.getBaseAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Base__Group__2__Impl2930); 
             after(grammarAccess.getBaseAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__Group__2__Impl


    // $ANTLR start rule__Triple__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1442:1: rule__Triple__Group__0 : rule__Triple__Group__0__Impl rule__Triple__Group__1 ;
    public final void rule__Triple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1446:1: ( rule__Triple__Group__0__Impl rule__Triple__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1447:2: rule__Triple__Group__0__Impl rule__Triple__Group__1
            {
            pushFollow(FOLLOW_rule__Triple__Group__0__Impl_in_rule__Triple__Group__02967);
            rule__Triple__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Triple__Group__1_in_rule__Triple__Group__02970);
            rule__Triple__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__0


    // $ANTLR start rule__Triple__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1454:1: rule__Triple__Group__0__Impl : ( ( rule__Triple__SubjectAssignment_0 ) ) ;
    public final void rule__Triple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1458:1: ( ( ( rule__Triple__SubjectAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1459:1: ( ( rule__Triple__SubjectAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1459:1: ( ( rule__Triple__SubjectAssignment_0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1460:1: ( rule__Triple__SubjectAssignment_0 )
            {
             before(grammarAccess.getTripleAccess().getSubjectAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1461:1: ( rule__Triple__SubjectAssignment_0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1461:2: rule__Triple__SubjectAssignment_0
            {
            pushFollow(FOLLOW_rule__Triple__SubjectAssignment_0_in_rule__Triple__Group__0__Impl2997);
            rule__Triple__SubjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTripleAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__0__Impl


    // $ANTLR start rule__Triple__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1471:1: rule__Triple__Group__1 : rule__Triple__Group__1__Impl rule__Triple__Group__2 ;
    public final void rule__Triple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1475:1: ( rule__Triple__Group__1__Impl rule__Triple__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1476:2: rule__Triple__Group__1__Impl rule__Triple__Group__2
            {
            pushFollow(FOLLOW_rule__Triple__Group__1__Impl_in_rule__Triple__Group__13027);
            rule__Triple__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Triple__Group__2_in_rule__Triple__Group__13030);
            rule__Triple__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__1


    // $ANTLR start rule__Triple__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1483:1: rule__Triple__Group__1__Impl : ( ( rule__Triple__PredicateObjectListAssignment_1 ) ) ;
    public final void rule__Triple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1487:1: ( ( ( rule__Triple__PredicateObjectListAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1488:1: ( ( rule__Triple__PredicateObjectListAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1488:1: ( ( rule__Triple__PredicateObjectListAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1489:1: ( rule__Triple__PredicateObjectListAssignment_1 )
            {
             before(grammarAccess.getTripleAccess().getPredicateObjectListAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1490:1: ( rule__Triple__PredicateObjectListAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1490:2: rule__Triple__PredicateObjectListAssignment_1
            {
            pushFollow(FOLLOW_rule__Triple__PredicateObjectListAssignment_1_in_rule__Triple__Group__1__Impl3057);
            rule__Triple__PredicateObjectListAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTripleAccess().getPredicateObjectListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__1__Impl


    // $ANTLR start rule__Triple__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1500:1: rule__Triple__Group__2 : rule__Triple__Group__2__Impl rule__Triple__Group__3 ;
    public final void rule__Triple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1504:1: ( rule__Triple__Group__2__Impl rule__Triple__Group__3 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1505:2: rule__Triple__Group__2__Impl rule__Triple__Group__3
            {
            pushFollow(FOLLOW_rule__Triple__Group__2__Impl_in_rule__Triple__Group__23087);
            rule__Triple__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Triple__Group__3_in_rule__Triple__Group__23090);
            rule__Triple__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__2


    // $ANTLR start rule__Triple__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1512:1: rule__Triple__Group__2__Impl : ( ( rule__Triple__Group_2__0 )* ) ;
    public final void rule__Triple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1516:1: ( ( ( rule__Triple__Group_2__0 )* ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1517:1: ( ( rule__Triple__Group_2__0 )* )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1517:1: ( ( rule__Triple__Group_2__0 )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1518:1: ( rule__Triple__Group_2__0 )*
            {
             before(grammarAccess.getTripleAccess().getGroup_2()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1519:1: ( rule__Triple__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1519:2: rule__Triple__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Triple__Group_2__0_in_rule__Triple__Group__2__Impl3117);
            	    rule__Triple__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTripleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__2__Impl


    // $ANTLR start rule__Triple__Group__3
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1529:1: rule__Triple__Group__3 : rule__Triple__Group__3__Impl ;
    public final void rule__Triple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1533:1: ( rule__Triple__Group__3__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1534:2: rule__Triple__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Triple__Group__3__Impl_in_rule__Triple__Group__33148);
            rule__Triple__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__3


    // $ANTLR start rule__Triple__Group__3__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1540:1: rule__Triple__Group__3__Impl : ( '.' ) ;
    public final void rule__Triple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1544:1: ( ( '.' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1545:1: ( '.' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1545:1: ( '.' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1546:1: '.'
            {
             before(grammarAccess.getTripleAccess().getFullStopKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Triple__Group__3__Impl3176); 
             after(grammarAccess.getTripleAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group__3__Impl


    // $ANTLR start rule__Triple__Group_2__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1567:1: rule__Triple__Group_2__0 : rule__Triple__Group_2__0__Impl rule__Triple__Group_2__1 ;
    public final void rule__Triple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1571:1: ( rule__Triple__Group_2__0__Impl rule__Triple__Group_2__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1572:2: rule__Triple__Group_2__0__Impl rule__Triple__Group_2__1
            {
            pushFollow(FOLLOW_rule__Triple__Group_2__0__Impl_in_rule__Triple__Group_2__03215);
            rule__Triple__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Triple__Group_2__1_in_rule__Triple__Group_2__03218);
            rule__Triple__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group_2__0


    // $ANTLR start rule__Triple__Group_2__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1579:1: rule__Triple__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Triple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1583:1: ( ( ';' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1584:1: ( ';' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1584:1: ( ';' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1585:1: ';'
            {
             before(grammarAccess.getTripleAccess().getSemicolonKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Triple__Group_2__0__Impl3246); 
             after(grammarAccess.getTripleAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group_2__0__Impl


    // $ANTLR start rule__Triple__Group_2__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1598:1: rule__Triple__Group_2__1 : rule__Triple__Group_2__1__Impl ;
    public final void rule__Triple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1602:1: ( rule__Triple__Group_2__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1603:2: rule__Triple__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Triple__Group_2__1__Impl_in_rule__Triple__Group_2__13277);
            rule__Triple__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group_2__1


    // $ANTLR start rule__Triple__Group_2__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1609:1: rule__Triple__Group_2__1__Impl : ( ( rule__Triple__PredicateObjectListAssignment_2_1 ) ) ;
    public final void rule__Triple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1613:1: ( ( ( rule__Triple__PredicateObjectListAssignment_2_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1614:1: ( ( rule__Triple__PredicateObjectListAssignment_2_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1614:1: ( ( rule__Triple__PredicateObjectListAssignment_2_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1615:1: ( rule__Triple__PredicateObjectListAssignment_2_1 )
            {
             before(grammarAccess.getTripleAccess().getPredicateObjectListAssignment_2_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1616:1: ( rule__Triple__PredicateObjectListAssignment_2_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1616:2: rule__Triple__PredicateObjectListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Triple__PredicateObjectListAssignment_2_1_in_rule__Triple__Group_2__1__Impl3304);
            rule__Triple__PredicateObjectListAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTripleAccess().getPredicateObjectListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__Group_2__1__Impl


    // $ANTLR start rule__PredicateObjectList__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1630:1: rule__PredicateObjectList__Group__0 : rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1 ;
    public final void rule__PredicateObjectList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1634:1: ( rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1635:2: rule__PredicateObjectList__Group__0__Impl rule__PredicateObjectList__Group__1
            {
            pushFollow(FOLLOW_rule__PredicateObjectList__Group__0__Impl_in_rule__PredicateObjectList__Group__03338);
            rule__PredicateObjectList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PredicateObjectList__Group__1_in_rule__PredicateObjectList__Group__03341);
            rule__PredicateObjectList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__Group__0


    // $ANTLR start rule__PredicateObjectList__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1642:1: rule__PredicateObjectList__Group__0__Impl : ( ( rule__PredicateObjectList__PredicateAssignment_0 ) ) ;
    public final void rule__PredicateObjectList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1646:1: ( ( ( rule__PredicateObjectList__PredicateAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1647:1: ( ( rule__PredicateObjectList__PredicateAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1647:1: ( ( rule__PredicateObjectList__PredicateAssignment_0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1648:1: ( rule__PredicateObjectList__PredicateAssignment_0 )
            {
             before(grammarAccess.getPredicateObjectListAccess().getPredicateAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1649:1: ( rule__PredicateObjectList__PredicateAssignment_0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1649:2: rule__PredicateObjectList__PredicateAssignment_0
            {
            pushFollow(FOLLOW_rule__PredicateObjectList__PredicateAssignment_0_in_rule__PredicateObjectList__Group__0__Impl3368);
            rule__PredicateObjectList__PredicateAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPredicateObjectListAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__Group__0__Impl


    // $ANTLR start rule__PredicateObjectList__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1659:1: rule__PredicateObjectList__Group__1 : rule__PredicateObjectList__Group__1__Impl ;
    public final void rule__PredicateObjectList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1663:1: ( rule__PredicateObjectList__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1664:2: rule__PredicateObjectList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PredicateObjectList__Group__1__Impl_in_rule__PredicateObjectList__Group__13398);
            rule__PredicateObjectList__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__Group__1


    // $ANTLR start rule__PredicateObjectList__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1670:1: rule__PredicateObjectList__Group__1__Impl : ( ( rule__PredicateObjectList__ObjectListAssignment_1 ) ) ;
    public final void rule__PredicateObjectList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1674:1: ( ( ( rule__PredicateObjectList__ObjectListAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1675:1: ( ( rule__PredicateObjectList__ObjectListAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1675:1: ( ( rule__PredicateObjectList__ObjectListAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1676:1: ( rule__PredicateObjectList__ObjectListAssignment_1 )
            {
             before(grammarAccess.getPredicateObjectListAccess().getObjectListAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1677:1: ( rule__PredicateObjectList__ObjectListAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1677:2: rule__PredicateObjectList__ObjectListAssignment_1
            {
            pushFollow(FOLLOW_rule__PredicateObjectList__ObjectListAssignment_1_in_rule__PredicateObjectList__Group__1__Impl3425);
            rule__PredicateObjectList__ObjectListAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPredicateObjectListAccess().getObjectListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__Group__1__Impl


    // $ANTLR start rule__ObjectList__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1691:1: rule__ObjectList__Group__0 : rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1 ;
    public final void rule__ObjectList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1695:1: ( rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1696:2: rule__ObjectList__Group__0__Impl rule__ObjectList__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectList__Group__0__Impl_in_rule__ObjectList__Group__03459);
            rule__ObjectList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectList__Group__1_in_rule__ObjectList__Group__03462);
            rule__ObjectList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group__0


    // $ANTLR start rule__ObjectList__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1703:1: rule__ObjectList__Group__0__Impl : ( ( rule__ObjectList__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1707:1: ( ( ( rule__ObjectList__ObjectAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1708:1: ( ( rule__ObjectList__ObjectAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1708:1: ( ( rule__ObjectList__ObjectAssignment_0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1709:1: ( rule__ObjectList__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectListAccess().getObjectAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1710:1: ( rule__ObjectList__ObjectAssignment_0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1710:2: rule__ObjectList__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectList__ObjectAssignment_0_in_rule__ObjectList__Group__0__Impl3489);
            rule__ObjectList__ObjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getObjectListAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group__0__Impl


    // $ANTLR start rule__ObjectList__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1720:1: rule__ObjectList__Group__1 : rule__ObjectList__Group__1__Impl ;
    public final void rule__ObjectList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1724:1: ( rule__ObjectList__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1725:2: rule__ObjectList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectList__Group__1__Impl_in_rule__ObjectList__Group__13519);
            rule__ObjectList__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group__1


    // $ANTLR start rule__ObjectList__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1731:1: rule__ObjectList__Group__1__Impl : ( ( rule__ObjectList__Group_1__0 )* ) ;
    public final void rule__ObjectList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1735:1: ( ( ( rule__ObjectList__Group_1__0 )* ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1736:1: ( ( rule__ObjectList__Group_1__0 )* )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1736:1: ( ( rule__ObjectList__Group_1__0 )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1737:1: ( rule__ObjectList__Group_1__0 )*
            {
             before(grammarAccess.getObjectListAccess().getGroup_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1738:1: ( rule__ObjectList__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1738:2: rule__ObjectList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectList__Group_1__0_in_rule__ObjectList__Group__1__Impl3546);
            	    rule__ObjectList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getObjectListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group__1__Impl


    // $ANTLR start rule__ObjectList__Group_1__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1752:1: rule__ObjectList__Group_1__0 : rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1 ;
    public final void rule__ObjectList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1756:1: ( rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1757:2: rule__ObjectList__Group_1__0__Impl rule__ObjectList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectList__Group_1__0__Impl_in_rule__ObjectList__Group_1__03581);
            rule__ObjectList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectList__Group_1__1_in_rule__ObjectList__Group_1__03584);
            rule__ObjectList__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group_1__0


    // $ANTLR start rule__ObjectList__Group_1__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1764:1: rule__ObjectList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1768:1: ( ( ',' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1769:1: ( ',' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1769:1: ( ',' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1770:1: ','
            {
             before(grammarAccess.getObjectListAccess().getCommaKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__ObjectList__Group_1__0__Impl3612); 
             after(grammarAccess.getObjectListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group_1__0__Impl


    // $ANTLR start rule__ObjectList__Group_1__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1783:1: rule__ObjectList__Group_1__1 : rule__ObjectList__Group_1__1__Impl ;
    public final void rule__ObjectList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1787:1: ( rule__ObjectList__Group_1__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1788:2: rule__ObjectList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectList__Group_1__1__Impl_in_rule__ObjectList__Group_1__13643);
            rule__ObjectList__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group_1__1


    // $ANTLR start rule__ObjectList__Group_1__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1794:1: rule__ObjectList__Group_1__1__Impl : ( ( rule__ObjectList__ObjectAssignment_1_1 ) ) ;
    public final void rule__ObjectList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1798:1: ( ( ( rule__ObjectList__ObjectAssignment_1_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1799:1: ( ( rule__ObjectList__ObjectAssignment_1_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1799:1: ( ( rule__ObjectList__ObjectAssignment_1_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1800:1: ( rule__ObjectList__ObjectAssignment_1_1 )
            {
             before(grammarAccess.getObjectListAccess().getObjectAssignment_1_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1801:1: ( rule__ObjectList__ObjectAssignment_1_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1801:2: rule__ObjectList__ObjectAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ObjectList__ObjectAssignment_1_1_in_rule__ObjectList__Group_1__1__Impl3670);
            rule__ObjectList__ObjectAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getObjectListAccess().getObjectAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__Group_1__1__Impl


    // $ANTLR start rule__Collection__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1815:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1819:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1820:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_rule__Collection__Group__0__Impl_in_rule__Collection__Group__03704);
            rule__Collection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Collection__Group__1_in_rule__Collection__Group__03707);
            rule__Collection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__0


    // $ANTLR start rule__Collection__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1827:1: rule__Collection__Group__0__Impl : ( '(' ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1831:1: ( ( '(' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1832:1: ( '(' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1832:1: ( '(' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1833:1: '('
            {
             before(grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Collection__Group__0__Impl3735); 
             after(grammarAccess.getCollectionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__0__Impl


    // $ANTLR start rule__Collection__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1846:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl rule__Collection__Group__2 ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1850:1: ( rule__Collection__Group__1__Impl rule__Collection__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1851:2: rule__Collection__Group__1__Impl rule__Collection__Group__2
            {
            pushFollow(FOLLOW_rule__Collection__Group__1__Impl_in_rule__Collection__Group__13766);
            rule__Collection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Collection__Group__2_in_rule__Collection__Group__13769);
            rule__Collection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__1


    // $ANTLR start rule__Collection__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1858:1: rule__Collection__Group__1__Impl : ( ( ( rule__Collection__ItemsAssignment_1 ) ) ( ( rule__Collection__ItemsAssignment_1 )* ) ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1862:1: ( ( ( ( rule__Collection__ItemsAssignment_1 ) ) ( ( rule__Collection__ItemsAssignment_1 )* ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1863:1: ( ( ( rule__Collection__ItemsAssignment_1 ) ) ( ( rule__Collection__ItemsAssignment_1 )* ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1863:1: ( ( ( rule__Collection__ItemsAssignment_1 ) ) ( ( rule__Collection__ItemsAssignment_1 )* ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1864:1: ( ( rule__Collection__ItemsAssignment_1 ) ) ( ( rule__Collection__ItemsAssignment_1 )* )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1864:1: ( ( rule__Collection__ItemsAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1865:1: ( rule__Collection__ItemsAssignment_1 )
            {
             before(grammarAccess.getCollectionAccess().getItemsAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1866:1: ( rule__Collection__ItemsAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1866:2: rule__Collection__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__Collection__ItemsAssignment_1_in_rule__Collection__Group__1__Impl3798);
            rule__Collection__ItemsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionAccess().getItemsAssignment_1()); 

            }

            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1869:1: ( ( rule__Collection__ItemsAssignment_1 )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1870:1: ( rule__Collection__ItemsAssignment_1 )*
            {
             before(grammarAccess.getCollectionAccess().getItemsAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1871:1: ( rule__Collection__ItemsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==13||LA13_0==18||(LA13_0>=22 && LA13_0<=23)||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1871:2: rule__Collection__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Collection__ItemsAssignment_1_in_rule__Collection__Group__1__Impl3810);
            	    rule__Collection__ItemsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getItemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__1__Impl


    // $ANTLR start rule__Collection__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1882:1: rule__Collection__Group__2 : rule__Collection__Group__2__Impl ;
    public final void rule__Collection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1886:1: ( rule__Collection__Group__2__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1887:2: rule__Collection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Collection__Group__2__Impl_in_rule__Collection__Group__23843);
            rule__Collection__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__2


    // $ANTLR start rule__Collection__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1893:1: rule__Collection__Group__2__Impl : ( ')' ) ;
    public final void rule__Collection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1897:1: ( ( ')' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1898:1: ( ')' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1898:1: ( ')' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1899:1: ')'
            {
             before(grammarAccess.getCollectionAccess().getRightParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Collection__Group__2__Impl3871); 
             after(grammarAccess.getCollectionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__Group__2__Impl


    // $ANTLR start rule__StringValue__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1918:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1922:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1923:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03908);
            rule__StringValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03911);
            rule__StringValue__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__Group__0


    // $ANTLR start rule__StringValue__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1930:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__ValueAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1934:1: ( ( ( rule__StringValue__ValueAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1935:1: ( ( rule__StringValue__ValueAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1935:1: ( ( rule__StringValue__ValueAssignment_0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1936:1: ( rule__StringValue__ValueAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1937:1: ( rule__StringValue__ValueAssignment_0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1937:2: rule__StringValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_0_in_rule__StringValue__Group__0__Impl3938);
            rule__StringValue__ValueAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__Group__0__Impl


    // $ANTLR start rule__StringValue__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1947:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1951:1: ( rule__StringValue__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1952:2: rule__StringValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13968);
            rule__StringValue__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__Group__1


    // $ANTLR start rule__StringValue__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1958:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__TagAssignment_1 )? ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1962:1: ( ( ( rule__StringValue__TagAssignment_1 )? ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1963:1: ( ( rule__StringValue__TagAssignment_1 )? )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1963:1: ( ( rule__StringValue__TagAssignment_1 )? )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1964:1: ( rule__StringValue__TagAssignment_1 )?
            {
             before(grammarAccess.getStringValueAccess().getTagAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1965:1: ( rule__StringValue__TagAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1965:2: rule__StringValue__TagAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StringValue__TagAssignment_1_in_rule__StringValue__Group__1__Impl3995);
                    rule__StringValue__TagAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueAccess().getTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__Group__1__Impl


    // $ANTLR start rule__IntegerValue__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1979:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1983:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1984:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__04030);
            rule__IntegerValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__04033);
            rule__IntegerValue__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__Group__0


    // $ANTLR start rule__IntegerValue__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1991:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__ValueAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1995:1: ( ( ( rule__IntegerValue__ValueAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1996:1: ( ( rule__IntegerValue__ValueAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1996:1: ( ( rule__IntegerValue__ValueAssignment_0 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1997:1: ( rule__IntegerValue__ValueAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1998:1: ( rule__IntegerValue__ValueAssignment_0 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1998:2: rule__IntegerValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_0_in_rule__IntegerValue__Group__0__Impl4060);
            rule__IntegerValue__ValueAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__Group__0__Impl


    // $ANTLR start rule__IntegerValue__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2008:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2012:1: ( rule__IntegerValue__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2013:2: rule__IntegerValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__14090);
            rule__IntegerValue__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__Group__1


    // $ANTLR start rule__IntegerValue__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2019:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__TagAssignment_1 )? ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2023:1: ( ( ( rule__IntegerValue__TagAssignment_1 )? ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2024:1: ( ( rule__IntegerValue__TagAssignment_1 )? )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2024:1: ( ( rule__IntegerValue__TagAssignment_1 )? )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2025:1: ( rule__IntegerValue__TagAssignment_1 )?
            {
             before(grammarAccess.getIntegerValueAccess().getTagAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2026:1: ( rule__IntegerValue__TagAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=21)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2026:2: rule__IntegerValue__TagAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IntegerValue__TagAssignment_1_in_rule__IntegerValue__Group__1__Impl4117);
                    rule__IntegerValue__TagAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueAccess().getTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__Group__1__Impl


    // $ANTLR start rule__TypeTag__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2040:1: rule__TypeTag__Group__0 : rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1 ;
    public final void rule__TypeTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2044:1: ( rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2045:2: rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__0__Impl_in_rule__TypeTag__Group__04152);
            rule__TypeTag__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeTag__Group__1_in_rule__TypeTag__Group__04155);
            rule__TypeTag__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeTag__Group__0


    // $ANTLR start rule__TypeTag__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2052:1: rule__TypeTag__Group__0__Impl : ( '^^' ) ;
    public final void rule__TypeTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2056:1: ( ( '^^' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2057:1: ( '^^' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2057:1: ( '^^' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2058:1: '^^'
            {
             before(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__TypeTag__Group__0__Impl4183); 
             after(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeTag__Group__0__Impl


    // $ANTLR start rule__TypeTag__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2071:1: rule__TypeTag__Group__1 : rule__TypeTag__Group__1__Impl ;
    public final void rule__TypeTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2075:1: ( rule__TypeTag__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2076:2: rule__TypeTag__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__1__Impl_in_rule__TypeTag__Group__14214);
            rule__TypeTag__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeTag__Group__1


    // $ANTLR start rule__TypeTag__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2082:1: rule__TypeTag__Group__1__Impl : ( ( rule__TypeTag__TypeAssignment_1 ) ) ;
    public final void rule__TypeTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2086:1: ( ( ( rule__TypeTag__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2087:1: ( ( rule__TypeTag__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2087:1: ( ( rule__TypeTag__TypeAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2088:1: ( rule__TypeTag__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeTagAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2089:1: ( rule__TypeTag__TypeAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2089:2: rule__TypeTag__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeTag__TypeAssignment_1_in_rule__TypeTag__Group__1__Impl4241);
            rule__TypeTag__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypeTagAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeTag__Group__1__Impl


    // $ANTLR start rule__LangTag__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2103:1: rule__LangTag__Group__0 : rule__LangTag__Group__0__Impl rule__LangTag__Group__1 ;
    public final void rule__LangTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2107:1: ( rule__LangTag__Group__0__Impl rule__LangTag__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2108:2: rule__LangTag__Group__0__Impl rule__LangTag__Group__1
            {
            pushFollow(FOLLOW_rule__LangTag__Group__0__Impl_in_rule__LangTag__Group__04275);
            rule__LangTag__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LangTag__Group__1_in_rule__LangTag__Group__04278);
            rule__LangTag__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LangTag__Group__0


    // $ANTLR start rule__LangTag__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2115:1: rule__LangTag__Group__0__Impl : ( '@' ) ;
    public final void rule__LangTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2119:1: ( ( '@' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2120:1: ( '@' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2120:1: ( '@' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2121:1: '@'
            {
             before(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__LangTag__Group__0__Impl4306); 
             after(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LangTag__Group__0__Impl


    // $ANTLR start rule__LangTag__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2134:1: rule__LangTag__Group__1 : rule__LangTag__Group__1__Impl ;
    public final void rule__LangTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2138:1: ( rule__LangTag__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2139:2: rule__LangTag__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LangTag__Group__1__Impl_in_rule__LangTag__Group__14337);
            rule__LangTag__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LangTag__Group__1


    // $ANTLR start rule__LangTag__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2145:1: rule__LangTag__Group__1__Impl : ( ( rule__LangTag__LangAssignment_1 ) ) ;
    public final void rule__LangTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2149:1: ( ( ( rule__LangTag__LangAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2150:1: ( ( rule__LangTag__LangAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2150:1: ( ( rule__LangTag__LangAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2151:1: ( rule__LangTag__LangAssignment_1 )
            {
             before(grammarAccess.getLangTagAccess().getLangAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2152:1: ( rule__LangTag__LangAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2152:2: rule__LangTag__LangAssignment_1
            {
            pushFollow(FOLLOW_rule__LangTag__LangAssignment_1_in_rule__LangTag__Group__1__Impl4364);
            rule__LangTag__LangAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLangTagAccess().getLangAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LangTag__Group__1__Impl


    // $ANTLR start rule__QName__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2166:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2170:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2171:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__04398);
            rule__QName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QName__Group__1_in_rule__QName__Group__04401);
            rule__QName__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__0


    // $ANTLR start rule__QName__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2178:1: rule__QName__Group__0__Impl : ( ( rule__QName__PrefixAssignment_0 )? ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2182:1: ( ( ( rule__QName__PrefixAssignment_0 )? ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2183:1: ( ( rule__QName__PrefixAssignment_0 )? )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2183:1: ( ( rule__QName__PrefixAssignment_0 )? )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2184:1: ( rule__QName__PrefixAssignment_0 )?
            {
             before(grammarAccess.getQNameAccess().getPrefixAssignment_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2185:1: ( rule__QName__PrefixAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2185:2: rule__QName__PrefixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__QName__PrefixAssignment_0_in_rule__QName__Group__0__Impl4428);
                    rule__QName__PrefixAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQNameAccess().getPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__0__Impl


    // $ANTLR start rule__QName__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2195:1: rule__QName__Group__1 : rule__QName__Group__1__Impl rule__QName__Group__2 ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2199:1: ( rule__QName__Group__1__Impl rule__QName__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2200:2: rule__QName__Group__1__Impl rule__QName__Group__2
            {
            pushFollow(FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__14459);
            rule__QName__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QName__Group__2_in_rule__QName__Group__14462);
            rule__QName__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__1


    // $ANTLR start rule__QName__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2207:1: rule__QName__Group__1__Impl : ( ':' ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2211:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2212:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2212:1: ( ':' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2213:1: ':'
            {
             before(grammarAccess.getQNameAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__QName__Group__1__Impl4490); 
             after(grammarAccess.getQNameAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__1__Impl


    // $ANTLR start rule__QName__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2226:1: rule__QName__Group__2 : rule__QName__Group__2__Impl ;
    public final void rule__QName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2230:1: ( rule__QName__Group__2__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2231:2: rule__QName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group__2__Impl_in_rule__QName__Group__24521);
            rule__QName__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__2


    // $ANTLR start rule__QName__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2237:1: rule__QName__Group__2__Impl : ( ( rule__QName__NameAssignment_2 ) ) ;
    public final void rule__QName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2241:1: ( ( ( rule__QName__NameAssignment_2 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2242:1: ( ( rule__QName__NameAssignment_2 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2242:1: ( ( rule__QName__NameAssignment_2 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2243:1: ( rule__QName__NameAssignment_2 )
            {
             before(grammarAccess.getQNameAccess().getNameAssignment_2()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2244:1: ( rule__QName__NameAssignment_2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2244:2: rule__QName__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__QName__NameAssignment_2_in_rule__QName__Group__2__Impl4548);
            rule__QName__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getQNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__Group__2__Impl


    // $ANTLR start rule__NodeID__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2260:1: rule__NodeID__Group__0 : rule__NodeID__Group__0__Impl rule__NodeID__Group__1 ;
    public final void rule__NodeID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2264:1: ( rule__NodeID__Group__0__Impl rule__NodeID__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2265:2: rule__NodeID__Group__0__Impl rule__NodeID__Group__1
            {
            pushFollow(FOLLOW_rule__NodeID__Group__0__Impl_in_rule__NodeID__Group__04584);
            rule__NodeID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NodeID__Group__1_in_rule__NodeID__Group__04587);
            rule__NodeID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeID__Group__0


    // $ANTLR start rule__NodeID__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2272:1: rule__NodeID__Group__0__Impl : ( '_:' ) ;
    public final void rule__NodeID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2276:1: ( ( '_:' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2277:1: ( '_:' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2277:1: ( '_:' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2278:1: '_:'
            {
             before(grammarAccess.getNodeIDAccess().get_Keyword_0()); 
            match(input,22,FOLLOW_22_in_rule__NodeID__Group__0__Impl4615); 
             after(grammarAccess.getNodeIDAccess().get_Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeID__Group__0__Impl


    // $ANTLR start rule__NodeID__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2291:1: rule__NodeID__Group__1 : rule__NodeID__Group__1__Impl ;
    public final void rule__NodeID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2295:1: ( rule__NodeID__Group__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2296:2: rule__NodeID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeID__Group__1__Impl_in_rule__NodeID__Group__14646);
            rule__NodeID__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeID__Group__1


    // $ANTLR start rule__NodeID__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2302:1: rule__NodeID__Group__1__Impl : ( ( rule__NodeID__NodeIDAssignment_1 ) ) ;
    public final void rule__NodeID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2306:1: ( ( ( rule__NodeID__NodeIDAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2307:1: ( ( rule__NodeID__NodeIDAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2307:1: ( ( rule__NodeID__NodeIDAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2308:1: ( rule__NodeID__NodeIDAssignment_1 )
            {
             before(grammarAccess.getNodeIDAccess().getNodeIDAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2309:1: ( rule__NodeID__NodeIDAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2309:2: rule__NodeID__NodeIDAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeID__NodeIDAssignment_1_in_rule__NodeID__Group__1__Impl4673);
            rule__NodeID__NodeIDAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNodeIDAccess().getNodeIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeID__Group__1__Impl


    // $ANTLR start rule__BlankNodeContent__Group__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2323:1: rule__BlankNodeContent__Group__0 : rule__BlankNodeContent__Group__0__Impl rule__BlankNodeContent__Group__1 ;
    public final void rule__BlankNodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2327:1: ( rule__BlankNodeContent__Group__0__Impl rule__BlankNodeContent__Group__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2328:2: rule__BlankNodeContent__Group__0__Impl rule__BlankNodeContent__Group__1
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group__0__Impl_in_rule__BlankNodeContent__Group__04707);
            rule__BlankNodeContent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BlankNodeContent__Group__1_in_rule__BlankNodeContent__Group__04710);
            rule__BlankNodeContent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__0


    // $ANTLR start rule__BlankNodeContent__Group__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2335:1: rule__BlankNodeContent__Group__0__Impl : ( '[' ) ;
    public final void rule__BlankNodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2339:1: ( ( '[' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2340:1: ( '[' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2340:1: ( '[' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2341:1: '['
            {
             before(grammarAccess.getBlankNodeContentAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BlankNodeContent__Group__0__Impl4738); 
             after(grammarAccess.getBlankNodeContentAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__0__Impl


    // $ANTLR start rule__BlankNodeContent__Group__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2354:1: rule__BlankNodeContent__Group__1 : rule__BlankNodeContent__Group__1__Impl rule__BlankNodeContent__Group__2 ;
    public final void rule__BlankNodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2358:1: ( rule__BlankNodeContent__Group__1__Impl rule__BlankNodeContent__Group__2 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2359:2: rule__BlankNodeContent__Group__1__Impl rule__BlankNodeContent__Group__2
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group__1__Impl_in_rule__BlankNodeContent__Group__14769);
            rule__BlankNodeContent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BlankNodeContent__Group__2_in_rule__BlankNodeContent__Group__14772);
            rule__BlankNodeContent__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__1


    // $ANTLR start rule__BlankNodeContent__Group__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2366:1: rule__BlankNodeContent__Group__1__Impl : ( ( rule__BlankNodeContent__PredicateObjectListAssignment_1 ) ) ;
    public final void rule__BlankNodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2370:1: ( ( ( rule__BlankNodeContent__PredicateObjectListAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2371:1: ( ( rule__BlankNodeContent__PredicateObjectListAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2371:1: ( ( rule__BlankNodeContent__PredicateObjectListAssignment_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2372:1: ( rule__BlankNodeContent__PredicateObjectListAssignment_1 )
            {
             before(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListAssignment_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2373:1: ( rule__BlankNodeContent__PredicateObjectListAssignment_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2373:2: rule__BlankNodeContent__PredicateObjectListAssignment_1
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__PredicateObjectListAssignment_1_in_rule__BlankNodeContent__Group__1__Impl4799);
            rule__BlankNodeContent__PredicateObjectListAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__1__Impl


    // $ANTLR start rule__BlankNodeContent__Group__2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2383:1: rule__BlankNodeContent__Group__2 : rule__BlankNodeContent__Group__2__Impl rule__BlankNodeContent__Group__3 ;
    public final void rule__BlankNodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2387:1: ( rule__BlankNodeContent__Group__2__Impl rule__BlankNodeContent__Group__3 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2388:2: rule__BlankNodeContent__Group__2__Impl rule__BlankNodeContent__Group__3
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group__2__Impl_in_rule__BlankNodeContent__Group__24829);
            rule__BlankNodeContent__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BlankNodeContent__Group__3_in_rule__BlankNodeContent__Group__24832);
            rule__BlankNodeContent__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__2


    // $ANTLR start rule__BlankNodeContent__Group__2__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2395:1: rule__BlankNodeContent__Group__2__Impl : ( ( rule__BlankNodeContent__Group_2__0 )* ) ;
    public final void rule__BlankNodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2399:1: ( ( ( rule__BlankNodeContent__Group_2__0 )* ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2400:1: ( ( rule__BlankNodeContent__Group_2__0 )* )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2400:1: ( ( rule__BlankNodeContent__Group_2__0 )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2401:1: ( rule__BlankNodeContent__Group_2__0 )*
            {
             before(grammarAccess.getBlankNodeContentAccess().getGroup_2()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2402:1: ( rule__BlankNodeContent__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2402:2: rule__BlankNodeContent__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BlankNodeContent__Group_2__0_in_rule__BlankNodeContent__Group__2__Impl4859);
            	    rule__BlankNodeContent__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBlankNodeContentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__2__Impl


    // $ANTLR start rule__BlankNodeContent__Group__3
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2412:1: rule__BlankNodeContent__Group__3 : rule__BlankNodeContent__Group__3__Impl ;
    public final void rule__BlankNodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2416:1: ( rule__BlankNodeContent__Group__3__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2417:2: rule__BlankNodeContent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group__3__Impl_in_rule__BlankNodeContent__Group__34890);
            rule__BlankNodeContent__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__3


    // $ANTLR start rule__BlankNodeContent__Group__3__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2423:1: rule__BlankNodeContent__Group__3__Impl : ( ']' ) ;
    public final void rule__BlankNodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2427:1: ( ( ']' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2428:1: ( ']' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2428:1: ( ']' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2429:1: ']'
            {
             before(grammarAccess.getBlankNodeContentAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__BlankNodeContent__Group__3__Impl4918); 
             after(grammarAccess.getBlankNodeContentAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group__3__Impl


    // $ANTLR start rule__BlankNodeContent__Group_2__0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2450:1: rule__BlankNodeContent__Group_2__0 : rule__BlankNodeContent__Group_2__0__Impl rule__BlankNodeContent__Group_2__1 ;
    public final void rule__BlankNodeContent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2454:1: ( rule__BlankNodeContent__Group_2__0__Impl rule__BlankNodeContent__Group_2__1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2455:2: rule__BlankNodeContent__Group_2__0__Impl rule__BlankNodeContent__Group_2__1
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group_2__0__Impl_in_rule__BlankNodeContent__Group_2__04957);
            rule__BlankNodeContent__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BlankNodeContent__Group_2__1_in_rule__BlankNodeContent__Group_2__04960);
            rule__BlankNodeContent__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group_2__0


    // $ANTLR start rule__BlankNodeContent__Group_2__0__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2462:1: rule__BlankNodeContent__Group_2__0__Impl : ( ';' ) ;
    public final void rule__BlankNodeContent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2466:1: ( ( ';' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2467:1: ( ';' )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2467:1: ( ';' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2468:1: ';'
            {
             before(grammarAccess.getBlankNodeContentAccess().getSemicolonKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__BlankNodeContent__Group_2__0__Impl4988); 
             after(grammarAccess.getBlankNodeContentAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group_2__0__Impl


    // $ANTLR start rule__BlankNodeContent__Group_2__1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2481:1: rule__BlankNodeContent__Group_2__1 : rule__BlankNodeContent__Group_2__1__Impl ;
    public final void rule__BlankNodeContent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2485:1: ( rule__BlankNodeContent__Group_2__1__Impl )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2486:2: rule__BlankNodeContent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__Group_2__1__Impl_in_rule__BlankNodeContent__Group_2__15019);
            rule__BlankNodeContent__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group_2__1


    // $ANTLR start rule__BlankNodeContent__Group_2__1__Impl
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2492:1: rule__BlankNodeContent__Group_2__1__Impl : ( ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 ) ) ;
    public final void rule__BlankNodeContent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2496:1: ( ( ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2497:1: ( ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2497:1: ( ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2498:1: ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 )
            {
             before(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListAssignment_2_1()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2499:1: ( rule__BlankNodeContent__PredicateObjectListAssignment_2_1 )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2499:2: rule__BlankNodeContent__PredicateObjectListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BlankNodeContent__PredicateObjectListAssignment_2_1_in_rule__BlankNodeContent__Group_2__1__Impl5046);
            rule__BlankNodeContent__PredicateObjectListAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__Group_2__1__Impl


    // $ANTLR start rule__TurtleDocument__StatementsAssignment
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2514:1: rule__TurtleDocument__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TurtleDocument__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2518:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2519:1: ( ruleStatement )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2519:1: ( ruleStatement )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2520:1: ruleStatement
            {
             before(grammarAccess.getTurtleDocumentAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__TurtleDocument__StatementsAssignment5085);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getTurtleDocumentAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TurtleDocument__StatementsAssignment


    // $ANTLR start rule__Prefix__NameAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2529:1: rule__Prefix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2533:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2534:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2534:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2535:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_15116); 
             after(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__NameAssignment_1


    // $ANTLR start rule__Prefix__UriAssignment_3
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2544:1: rule__Prefix__UriAssignment_3 : ( RULE_IRI_TERMINAL ) ;
    public final void rule__Prefix__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2548:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2549:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2549:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2550:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_3_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__Prefix__UriAssignment_35147); 
             after(grammarAccess.getPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prefix__UriAssignment_3


    // $ANTLR start rule__UnNamedPrefix__UriAssignment_2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2559:1: rule__UnNamedPrefix__UriAssignment_2 : ( RULE_IRI_TERMINAL ) ;
    public final void rule__UnNamedPrefix__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2563:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2564:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2564:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2565:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getUnNamedPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_2_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__UnNamedPrefix__UriAssignment_25178); 
             after(grammarAccess.getUnNamedPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnNamedPrefix__UriAssignment_2


    // $ANTLR start rule__Base__UriAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2574:1: rule__Base__UriAssignment_1 : ( RULE_IRI_TERMINAL ) ;
    public final void rule__Base__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2578:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2579:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2579:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2580:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getBaseAccess().getUriIRI_TERMINALTerminalRuleCall_1_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__Base__UriAssignment_15209); 
             after(grammarAccess.getBaseAccess().getUriIRI_TERMINALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Base__UriAssignment_1


    // $ANTLR start rule__Triple__SubjectAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2589:1: rule__Triple__SubjectAssignment_0 : ( ruleSubject ) ;
    public final void rule__Triple__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2593:1: ( ( ruleSubject ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2594:1: ( ruleSubject )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2594:1: ( ruleSubject )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2595:1: ruleSubject
            {
             before(grammarAccess.getTripleAccess().getSubjectSubjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSubject_in_rule__Triple__SubjectAssignment_05240);
            ruleSubject();
            _fsp--;

             after(grammarAccess.getTripleAccess().getSubjectSubjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__SubjectAssignment_0


    // $ANTLR start rule__Triple__PredicateObjectListAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2604:1: rule__Triple__PredicateObjectListAssignment_1 : ( rulePredicateObjectList ) ;
    public final void rule__Triple__PredicateObjectListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2608:1: ( ( rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2609:1: ( rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2609:1: ( rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2610:1: rulePredicateObjectList
            {
             before(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_rule__Triple__PredicateObjectListAssignment_15271);
            rulePredicateObjectList();
            _fsp--;

             after(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__PredicateObjectListAssignment_1


    // $ANTLR start rule__Triple__PredicateObjectListAssignment_2_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2619:1: rule__Triple__PredicateObjectListAssignment_2_1 : ( rulePredicateObjectList ) ;
    public final void rule__Triple__PredicateObjectListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2623:1: ( ( rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2624:1: ( rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2624:1: ( rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2625:1: rulePredicateObjectList
            {
             before(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_rule__Triple__PredicateObjectListAssignment_2_15302);
            rulePredicateObjectList();
            _fsp--;

             after(grammarAccess.getTripleAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Triple__PredicateObjectListAssignment_2_1


    // $ANTLR start rule__PredicateObjectList__PredicateAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2634:1: rule__PredicateObjectList__PredicateAssignment_0 : ( ruleVerb ) ;
    public final void rule__PredicateObjectList__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2638:1: ( ( ruleVerb ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2639:1: ( ruleVerb )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2639:1: ( ruleVerb )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2640:1: ruleVerb
            {
             before(grammarAccess.getPredicateObjectListAccess().getPredicateVerbParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVerb_in_rule__PredicateObjectList__PredicateAssignment_05333);
            ruleVerb();
            _fsp--;

             after(grammarAccess.getPredicateObjectListAccess().getPredicateVerbParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__PredicateAssignment_0


    // $ANTLR start rule__PredicateObjectList__ObjectListAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2649:1: rule__PredicateObjectList__ObjectListAssignment_1 : ( ruleObjectList ) ;
    public final void rule__PredicateObjectList__ObjectListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2653:1: ( ( ruleObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2654:1: ( ruleObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2654:1: ( ruleObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2655:1: ruleObjectList
            {
             before(grammarAccess.getPredicateObjectListAccess().getObjectListObjectListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectList_in_rule__PredicateObjectList__ObjectListAssignment_15364);
            ruleObjectList();
            _fsp--;

             after(grammarAccess.getPredicateObjectListAccess().getObjectListObjectListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredicateObjectList__ObjectListAssignment_1


    // $ANTLR start rule__AVerb__NameAssignment
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2664:1: rule__AVerb__NameAssignment : ( ( 'a' ) ) ;
    public final void rule__AVerb__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2668:1: ( ( ( 'a' ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2669:1: ( ( 'a' ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2669:1: ( ( 'a' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2670:1: ( 'a' )
            {
             before(grammarAccess.getAVerbAccess().getNameAKeyword_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2671:1: ( 'a' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2672:1: 'a'
            {
             before(grammarAccess.getAVerbAccess().getNameAKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__AVerb__NameAssignment5400); 
             after(grammarAccess.getAVerbAccess().getNameAKeyword_0()); 

            }

             after(grammarAccess.getAVerbAccess().getNameAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AVerb__NameAssignment


    // $ANTLR start rule__ObjectList__ObjectAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2687:1: rule__ObjectList__ObjectAssignment_0 : ( ruleObject ) ;
    public final void rule__ObjectList__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2691:1: ( ( ruleObject ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2692:1: ( ruleObject )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2692:1: ( ruleObject )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2693:1: ruleObject
            {
             before(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__ObjectList__ObjectAssignment_05439);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__ObjectAssignment_0


    // $ANTLR start rule__ObjectList__ObjectAssignment_1_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2702:1: rule__ObjectList__ObjectAssignment_1_1 : ( ruleObject ) ;
    public final void rule__ObjectList__ObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2706:1: ( ( ruleObject ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2707:1: ( ruleObject )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2707:1: ( ruleObject )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2708:1: ruleObject
            {
             before(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__ObjectList__ObjectAssignment_1_15470);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectListAccess().getObjectObjectParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectList__ObjectAssignment_1_1


    // $ANTLR start rule__Collection__ItemsAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2717:1: rule__Collection__ItemsAssignment_1 : ( ruleObjectList ) ;
    public final void rule__Collection__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2721:1: ( ( ruleObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2722:1: ( ruleObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2722:1: ( ruleObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2723:1: ruleObjectList
            {
             before(grammarAccess.getCollectionAccess().getItemsObjectListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectList_in_rule__Collection__ItemsAssignment_15501);
            ruleObjectList();
            _fsp--;

             after(grammarAccess.getCollectionAccess().getItemsObjectListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Collection__ItemsAssignment_1


    // $ANTLR start rule__StringValue__ValueAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2732:1: rule__StringValue__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2736:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2737:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2737:1: ( RULE_STRING )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2738:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment_05532); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__ValueAssignment_0


    // $ANTLR start rule__StringValue__TagAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2747:1: rule__StringValue__TagAssignment_1 : ( ruleRDFTag ) ;
    public final void rule__StringValue__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2751:1: ( ( ruleRDFTag ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2752:1: ( ruleRDFTag )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2752:1: ( ruleRDFTag )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2753:1: ruleRDFTag
            {
             before(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRDFTag_in_rule__StringValue__TagAssignment_15563);
            ruleRDFTag();
            _fsp--;

             after(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringValue__TagAssignment_1


    // $ANTLR start rule__IntegerValue__ValueAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2762:1: rule__IntegerValue__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntegerValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2766:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2767:1: ( RULE_INT )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2767:1: ( RULE_INT )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2768:1: RULE_INT
            {
             before(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerValue__ValueAssignment_05594); 
             after(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__ValueAssignment_0


    // $ANTLR start rule__IntegerValue__TagAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2777:1: rule__IntegerValue__TagAssignment_1 : ( ruleRDFTag ) ;
    public final void rule__IntegerValue__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2781:1: ( ( ruleRDFTag ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2782:1: ( ruleRDFTag )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2782:1: ( ruleRDFTag )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2783:1: ruleRDFTag
            {
             before(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRDFTag_in_rule__IntegerValue__TagAssignment_15625);
            ruleRDFTag();
            _fsp--;

             after(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerValue__TagAssignment_1


    // $ANTLR start rule__TypeTag__TypeAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2792:1: rule__TypeTag__TypeAssignment_1 : ( ruleQName ) ;
    public final void rule__TypeTag__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2796:1: ( ( ruleQName ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2797:1: ( ruleQName )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2797:1: ( ruleQName )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2798:1: ruleQName
            {
             before(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__TypeTag__TypeAssignment_15656);
            ruleQName();
            _fsp--;

             after(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeTag__TypeAssignment_1


    // $ANTLR start rule__LangTag__LangAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2807:1: rule__LangTag__LangAssignment_1 : ( RULE_ID ) ;
    public final void rule__LangTag__LangAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2811:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2812:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2812:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2813:1: RULE_ID
            {
             before(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LangTag__LangAssignment_15687); 
             after(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LangTag__LangAssignment_1


    // $ANTLR start rule__URIRef__UriAssignment
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2822:1: rule__URIRef__UriAssignment : ( RULE_IRI_TERMINAL ) ;
    public final void rule__URIRef__UriAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2826:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2827:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2827:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2828:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getURIRefAccess().getUriIRI_TERMINALTerminalRuleCall_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__URIRef__UriAssignment5718); 
             after(grammarAccess.getURIRefAccess().getUriIRI_TERMINALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URIRef__UriAssignment


    // $ANTLR start rule__QName__PrefixAssignment_0
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2837:1: rule__QName__PrefixAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QName__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2841:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2842:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2842:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2843:1: ( RULE_ID )
            {
             before(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2844:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2845:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getPrefixPrefixIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__PrefixAssignment_05753); 
             after(grammarAccess.getQNameAccess().getPrefixPrefixIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__PrefixAssignment_0


    // $ANTLR start rule__QName__NameAssignment_2
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2856:1: rule__QName__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2860:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2861:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2861:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2862:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__NameAssignment_25788); 
             after(grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QName__NameAssignment_2


    // $ANTLR start rule__NodeID__NodeIDAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2871:1: rule__NodeID__NodeIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeID__NodeIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2875:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2876:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2876:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2877:1: RULE_ID
            {
             before(grammarAccess.getNodeIDAccess().getNodeIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeID__NodeIDAssignment_15819); 
             after(grammarAccess.getNodeIDAccess().getNodeIDIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeID__NodeIDAssignment_1


    // $ANTLR start rule__Void__NodeIDAssignment
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2886:1: rule__Void__NodeIDAssignment : ( ( '[]' ) ) ;
    public final void rule__Void__NodeIDAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2890:1: ( ( ( '[]' ) ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2891:1: ( ( '[]' ) )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2891:1: ( ( '[]' ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2892:1: ( '[]' )
            {
             before(grammarAccess.getVoidAccess().getNodeIDLeftSquareBracketRightSquareBracketKeyword_0()); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2893:1: ( '[]' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2894:1: '[]'
            {
             before(grammarAccess.getVoidAccess().getNodeIDLeftSquareBracketRightSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Void__NodeIDAssignment5855); 
             after(grammarAccess.getVoidAccess().getNodeIDLeftSquareBracketRightSquareBracketKeyword_0()); 

            }

             after(grammarAccess.getVoidAccess().getNodeIDLeftSquareBracketRightSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Void__NodeIDAssignment


    // $ANTLR start rule__BlankNodeContent__PredicateObjectListAssignment_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2909:1: rule__BlankNodeContent__PredicateObjectListAssignment_1 : ( rulePredicateObjectList ) ;
    public final void rule__BlankNodeContent__PredicateObjectListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2913:1: ( ( rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2914:1: ( rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2914:1: ( rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2915:1: rulePredicateObjectList
            {
             before(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_rule__BlankNodeContent__PredicateObjectListAssignment_15894);
            rulePredicateObjectList();
            _fsp--;

             after(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__PredicateObjectListAssignment_1


    // $ANTLR start rule__BlankNodeContent__PredicateObjectListAssignment_2_1
    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2924:1: rule__BlankNodeContent__PredicateObjectListAssignment_2_1 : ( rulePredicateObjectList ) ;
    public final void rule__BlankNodeContent__PredicateObjectListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2928:1: ( ( rulePredicateObjectList ) )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2929:1: ( rulePredicateObjectList )
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2929:1: ( rulePredicateObjectList )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2930:1: rulePredicateObjectList
            {
             before(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePredicateObjectList_in_rule__BlankNodeContent__PredicateObjectListAssignment_2_15925);
            rulePredicateObjectList();
            _fsp--;

             after(grammarAccess.getBlankNodeContentAccess().getPredicateObjectListPredicateObjectListParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BlankNodeContent__PredicateObjectListAssignment_2_1


 

    public static final BitSet FOLLOW_ruleTurtleDocument_in_entryRuleTurtleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurtleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurtleDocument__StatementsAssignment_in_ruleTurtleDocument94 = new BitSet(new long[]{0x0000000004C4B032L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_entryRuleDirective182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirective189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Alternatives_in_ruleDirective215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0_in_rulePrefix275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_entryRuleUnNamedPrefix302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNamedPrefix309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__0_in_ruleUnNamedPrefix335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_entryRuleBase362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBase369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Base__Group__0_in_ruleBase395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriple_in_entryRuleTriple422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriple429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group__0_in_ruleTriple455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_entryRuleSubject482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubject489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subject__Alternatives_in_ruleSubject515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_entryRulePredicateObjectList542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateObjectList549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__Group__0_in_rulePredicateObjectList575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerb_in_entryRuleVerb602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerb609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verb__Alternatives_in_ruleVerb635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVerb_in_entryRuleAVerb662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAVerb669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AVerb__NameAssignment_in_ruleAVerb695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Alternatives_in_ruleResource755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectList_in_entryRuleObjectList782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectList789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group__0_in_ruleObjectList815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Alternatives_in_ruleObject875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collection__Group__0_in_ruleCollection935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0_in_ruleStringValue1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDFTag__Alternatives_in_ruleRDFTag1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__0_in_ruleTypeTag1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__0_in_ruleLangTag1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_entryRuleURIRef1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURIRef1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URIRef__UriAssignment_in_ruleURIRef1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_entryRuleBlank1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlank1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Blank__Alternatives_in_ruleBlank1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeID_in_entryRuleNodeID1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeID1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeID__Group__0_in_ruleNodeID1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoid_in_entryRuleVoid1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoid1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Void__NodeIDAssignment_in_ruleVoid1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNodeContent_in_entryRuleBlankNodeContent1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlankNodeContent1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__0_in_ruleBlankNodeContent1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_rule__Statement__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriple_in_rule__Statement__Alternatives1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__Directive__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNamedPrefix_in_rule__Directive__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBase_in_rule__Directive__Alternatives1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Subject__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_rule__Subject__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Verb__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAVerb_in_rule__Verb__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_rule__Resource__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__Resource__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Object__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlank_in_rule__Object__Alternatives1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Object__Alternatives2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Literal__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Literal__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_rule__RDFTag__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_rule__RDFTag__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeID_in_rule__Blank__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoid_in_rule__Blank__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_rule__Blank__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlankNodeContent_in_rule__Blank__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__02216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Prefix__Group__0__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12278 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__NameAssignment_1_in_rule__Prefix__Group__1__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Prefix__Group__3_in_rule__Prefix__Group__22341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Prefix__Group__2__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__3__Impl_in_rule__Prefix__Group__32400 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Prefix__Group__4_in_rule__Prefix__Group__32403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__UriAssignment_3_in_rule__Prefix__Group__3__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__4__Impl_in_rule__Prefix__Group__42460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Prefix__Group__4__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__0__Impl_in_rule__UnNamedPrefix__Group__02529 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__1_in_rule__UnNamedPrefix__Group__02532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UnNamedPrefix__Group__0__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__1__Impl_in_rule__UnNamedPrefix__Group__12591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__2_in_rule__UnNamedPrefix__Group__12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnNamedPrefix__Group__1__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__2__Impl_in_rule__UnNamedPrefix__Group__22653 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__3_in_rule__UnNamedPrefix__Group__22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__UriAssignment_2_in_rule__UnNamedPrefix__Group__2__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnNamedPrefix__Group__3__Impl_in_rule__UnNamedPrefix__Group__32713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnNamedPrefix__Group__3__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Base__Group__0__Impl_in_rule__Base__Group__02780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Base__Group__1_in_rule__Base__Group__02783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Base__Group__0__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Base__Group__1__Impl_in_rule__Base__Group__12842 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Base__Group__2_in_rule__Base__Group__12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Base__UriAssignment_1_in_rule__Base__Group__1__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Base__Group__2__Impl_in_rule__Base__Group__22902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Base__Group__2__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group__0__Impl_in_rule__Triple__Group__02967 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_rule__Triple__Group__1_in_rule__Triple__Group__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__SubjectAssignment_0_in_rule__Triple__Group__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group__1__Impl_in_rule__Triple__Group__13027 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Triple__Group__2_in_rule__Triple__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__PredicateObjectListAssignment_1_in_rule__Triple__Group__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group__2__Impl_in_rule__Triple__Group__23087 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Triple__Group__3_in_rule__Triple__Group__23090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group_2__0_in_rule__Triple__Group__2__Impl3117 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Triple__Group__3__Impl_in_rule__Triple__Group__33148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Triple__Group__3__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group_2__0__Impl_in_rule__Triple__Group_2__03215 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_rule__Triple__Group_2__1_in_rule__Triple__Group_2__03218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Triple__Group_2__0__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__Group_2__1__Impl_in_rule__Triple__Group_2__13277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Triple__PredicateObjectListAssignment_2_1_in_rule__Triple__Group_2__1__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__Group__0__Impl_in_rule__PredicateObjectList__Group__03338 = new BitSet(new long[]{0x0000000004C420F0L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__Group__1_in_rule__PredicateObjectList__Group__03341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__PredicateAssignment_0_in_rule__PredicateObjectList__Group__0__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__Group__1__Impl_in_rule__PredicateObjectList__Group__13398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredicateObjectList__ObjectListAssignment_1_in_rule__PredicateObjectList__Group__1__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group__0__Impl_in_rule__ObjectList__Group__03459 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group__1_in_rule__ObjectList__Group__03462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__ObjectAssignment_0_in_rule__ObjectList__Group__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group__1__Impl_in_rule__ObjectList__Group__13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group_1__0_in_rule__ObjectList__Group__1__Impl3546 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group_1__0__Impl_in_rule__ObjectList__Group_1__03581 = new BitSet(new long[]{0x0000000004C420F0L});
    public static final BitSet FOLLOW_rule__ObjectList__Group_1__1_in_rule__ObjectList__Group_1__03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ObjectList__Group_1__0__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__Group_1__1__Impl_in_rule__ObjectList__Group_1__13643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectList__ObjectAssignment_1_1_in_rule__ObjectList__Group_1__1__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collection__Group__0__Impl_in_rule__Collection__Group__03704 = new BitSet(new long[]{0x0000000004C420F0L});
    public static final BitSet FOLLOW_rule__Collection__Group__1_in_rule__Collection__Group__03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Collection__Group__0__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collection__Group__1__Impl_in_rule__Collection__Group__13766 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Collection__Group__2_in_rule__Collection__Group__13769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collection__ItemsAssignment_1_in_rule__Collection__Group__1__Impl3798 = new BitSet(new long[]{0x0000000004C420F2L});
    public static final BitSet FOLLOW_rule__Collection__ItemsAssignment_1_in_rule__Collection__Group__1__Impl3810 = new BitSet(new long[]{0x0000000004C420F2L});
    public static final BitSet FOLLOW_rule__Collection__Group__2__Impl_in_rule__Collection__Group__23843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Collection__Group__2__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03908 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_0_in_rule__StringValue__Group__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__TagAssignment_1_in_rule__StringValue__Group__1__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__04030 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__04033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_0_in_rule__IntegerValue__Group__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__14090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__TagAssignment_1_in_rule__IntegerValue__Group__1__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__0__Impl_in_rule__TypeTag__Group__04152 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__1_in_rule__TypeTag__Group__04155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeTag__Group__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__1__Impl_in_rule__TypeTag__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__TypeAssignment_1_in_rule__TypeTag__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__0__Impl_in_rule__LangTag__Group__04275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LangTag__Group__1_in_rule__LangTag__Group__04278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LangTag__Group__0__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__1__Impl_in_rule__LangTag__Group__14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__LangAssignment_1_in_rule__LangTag__Group__1__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__04398 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__04401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__PrefixAssignment_0_in_rule__QName__Group__0__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__14459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QName__Group__2_in_rule__QName__Group__14462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QName__Group__1__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__2__Impl_in_rule__QName__Group__24521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__NameAssignment_2_in_rule__QName__Group__2__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeID__Group__0__Impl_in_rule__NodeID__Group__04584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeID__Group__1_in_rule__NodeID__Group__04587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NodeID__Group__0__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeID__Group__1__Impl_in_rule__NodeID__Group__14646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeID__NodeIDAssignment_1_in_rule__NodeID__Group__1__Impl4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__0__Impl_in_rule__BlankNodeContent__Group__04707 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__1_in_rule__BlankNodeContent__Group__04710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BlankNodeContent__Group__0__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__1__Impl_in_rule__BlankNodeContent__Group__14769 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__2_in_rule__BlankNodeContent__Group__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__PredicateObjectListAssignment_1_in_rule__BlankNodeContent__Group__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__2__Impl_in_rule__BlankNodeContent__Group__24829 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__3_in_rule__BlankNodeContent__Group__24832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group_2__0_in_rule__BlankNodeContent__Group__2__Impl4859 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group__3__Impl_in_rule__BlankNodeContent__Group__34890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BlankNodeContent__Group__3__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group_2__0__Impl_in_rule__BlankNodeContent__Group_2__04957 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group_2__1_in_rule__BlankNodeContent__Group_2__04960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BlankNodeContent__Group_2__0__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__Group_2__1__Impl_in_rule__BlankNodeContent__Group_2__15019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlankNodeContent__PredicateObjectListAssignment_2_1_in_rule__BlankNodeContent__Group_2__1__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__TurtleDocument__StatementsAssignment5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__Prefix__UriAssignment_35147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__UnNamedPrefix__UriAssignment_25178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__Base__UriAssignment_15209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubject_in_rule__Triple__SubjectAssignment_05240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_rule__Triple__PredicateObjectListAssignment_15271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_rule__Triple__PredicateObjectListAssignment_2_15302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerb_in_rule__PredicateObjectList__PredicateAssignment_05333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectList_in_rule__PredicateObjectList__ObjectListAssignment_15364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AVerb__NameAssignment5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__ObjectList__ObjectAssignment_05439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__ObjectList__ObjectAssignment_1_15470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectList_in_rule__Collection__ItemsAssignment_15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment_05532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_rule__StringValue__TagAssignment_15563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerValue__ValueAssignment_05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_rule__IntegerValue__TagAssignment_15625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__TypeTag__TypeAssignment_15656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LangTag__LangAssignment_15687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__URIRef__UriAssignment5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__PrefixAssignment_05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__NameAssignment_25788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeID__NodeIDAssignment_15819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Void__NodeIDAssignment5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_rule__BlankNodeContent__PredicateObjectListAssignment_15894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateObjectList_in_rule__BlankNodeContent__PredicateObjectListAssignment_2_15925 = new BitSet(new long[]{0x0000000000000002L});

}