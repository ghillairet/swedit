package org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.swedit.jenarules.services.JenaRulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJenaRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_IRI_TERMINAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "':'", "'@prefix'", "'.'", "'->'", "','", "'('", "')'", "'?'", "'^^'", "'@'"
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
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g"; }


     
     	private JenaRulesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JenaRulesGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleJenaRuleDocument
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:61:1: entryRuleJenaRuleDocument : ruleJenaRuleDocument EOF ;
    public final void entryRuleJenaRuleDocument() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:62:1: ( ruleJenaRuleDocument EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:63:1: ruleJenaRuleDocument EOF
            {
             before(grammarAccess.getJenaRuleDocumentRule()); 
            pushFollow(FOLLOW_ruleJenaRuleDocument_in_entryRuleJenaRuleDocument61);
            ruleJenaRuleDocument();
            _fsp--;

             after(grammarAccess.getJenaRuleDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJenaRuleDocument68); 

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
    // $ANTLR end entryRuleJenaRuleDocument


    // $ANTLR start ruleJenaRuleDocument
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:70:1: ruleJenaRuleDocument : ( ( rule__JenaRuleDocument__Group__0 ) ) ;
    public final void ruleJenaRuleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:74:2: ( ( ( rule__JenaRuleDocument__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:75:1: ( ( rule__JenaRuleDocument__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:75:1: ( ( rule__JenaRuleDocument__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:76:1: ( rule__JenaRuleDocument__Group__0 )
            {
             before(grammarAccess.getJenaRuleDocumentAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:77:1: ( rule__JenaRuleDocument__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:77:2: rule__JenaRuleDocument__Group__0
            {
            pushFollow(FOLLOW_rule__JenaRuleDocument__Group__0_in_ruleJenaRuleDocument94);
            rule__JenaRuleDocument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJenaRuleDocumentAccess().getGroup()); 

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
    // $ANTLR end ruleJenaRuleDocument


    // $ANTLR start entryRuleRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:89:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:90:1: ( ruleRule EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:91:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule121);
            ruleRule();
            _fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule128); 

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
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:98:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:102:2: ( ( ( rule__Rule__Alternatives ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:103:1: ( ( rule__Rule__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:103:1: ( ( rule__Rule__Alternatives ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:104:1: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:105:1: ( rule__Rule__Alternatives )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:105:2: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule154);
            rule__Rule__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

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
    // $ANTLR end ruleRule


    // $ANTLR start entryRulePrefix
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:117:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:118:1: ( rulePrefix EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:119:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix181);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix188); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:126:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:130:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:131:1: ( ( rule__Prefix__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:131:1: ( ( rule__Prefix__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:132:1: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:133:1: ( rule__Prefix__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:133:2: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0_in_rulePrefix214);
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


    // $ANTLR start entryRuleBareRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:145:1: entryRuleBareRule : ruleBareRule EOF ;
    public final void entryRuleBareRule() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:146:1: ( ruleBareRule EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:147:1: ruleBareRule EOF
            {
             before(grammarAccess.getBareRuleRule()); 
            pushFollow(FOLLOW_ruleBareRule_in_entryRuleBareRule241);
            ruleBareRule();
            _fsp--;

             after(grammarAccess.getBareRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBareRule248); 

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
    // $ANTLR end entryRuleBareRule


    // $ANTLR start ruleBareRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:154:1: ruleBareRule : ( ruleForwardRule ) ;
    public final void ruleBareRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:158:2: ( ( ruleForwardRule ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:159:1: ( ruleForwardRule )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:159:1: ( ruleForwardRule )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:160:1: ruleForwardRule
            {
             before(grammarAccess.getBareRuleAccess().getForwardRuleParserRuleCall()); 
            pushFollow(FOLLOW_ruleForwardRule_in_ruleBareRule274);
            ruleForwardRule();
            _fsp--;

             after(grammarAccess.getBareRuleAccess().getForwardRuleParserRuleCall()); 

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
    // $ANTLR end ruleBareRule


    // $ANTLR start entryRuleForwardRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:173:1: entryRuleForwardRule : ruleForwardRule EOF ;
    public final void entryRuleForwardRule() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:174:1: ( ruleForwardRule EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:175:1: ruleForwardRule EOF
            {
             before(grammarAccess.getForwardRuleRule()); 
            pushFollow(FOLLOW_ruleForwardRule_in_entryRuleForwardRule300);
            ruleForwardRule();
            _fsp--;

             after(grammarAccess.getForwardRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardRule307); 

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
    // $ANTLR end entryRuleForwardRule


    // $ANTLR start ruleForwardRule
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:182:1: ruleForwardRule : ( ( rule__ForwardRule__Group__0 ) ) ;
    public final void ruleForwardRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:186:2: ( ( ( rule__ForwardRule__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:187:1: ( ( rule__ForwardRule__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:187:1: ( ( rule__ForwardRule__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:188:1: ( rule__ForwardRule__Group__0 )
            {
             before(grammarAccess.getForwardRuleAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:189:1: ( rule__ForwardRule__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:189:2: rule__ForwardRule__Group__0
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__0_in_ruleForwardRule333);
            rule__ForwardRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getForwardRuleAccess().getGroup()); 

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
    // $ANTLR end ruleForwardRule


    // $ANTLR start entryRuleTerm
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:201:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:202:1: ( ruleTerm EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:203:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm360);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm367); 

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
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:210:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:214:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:215:1: ( ( rule__Term__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:215:1: ( ( rule__Term__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:216:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:217:1: ( rule__Term__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:217:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm393);
            rule__Term__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleFunction
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:229:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:230:1: ( ruleFunction EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:231:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction420);
            ruleFunction();
            _fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction427); 

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
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:238:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:242:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:243:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:243:1: ( ( rule__Function__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:244:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:245:1: ( rule__Function__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:245:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction453);
            rule__Function__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleNode
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:259:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:260:1: ( ruleNode EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:261:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode482);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode489); 

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
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:268:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:272:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:273:1: ( ( rule__Node__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:273:1: ( ( rule__Node__Alternatives ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:274:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:275:1: ( rule__Node__Alternatives )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:275:2: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_in_ruleNode515);
            rule__Node__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

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
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleURIRef
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:287:1: entryRuleURIRef : ruleURIRef EOF ;
    public final void entryRuleURIRef() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:288:1: ( ruleURIRef EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:289:1: ruleURIRef EOF
            {
             before(grammarAccess.getURIRefRule()); 
            pushFollow(FOLLOW_ruleURIRef_in_entryRuleURIRef542);
            ruleURIRef();
            _fsp--;

             after(grammarAccess.getURIRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURIRef549); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:296:1: ruleURIRef : ( ( rule__URIRef__UriAssignment ) ) ;
    public final void ruleURIRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:300:2: ( ( ( rule__URIRef__UriAssignment ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:301:1: ( ( rule__URIRef__UriAssignment ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:301:1: ( ( rule__URIRef__UriAssignment ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:302:1: ( rule__URIRef__UriAssignment )
            {
             before(grammarAccess.getURIRefAccess().getUriAssignment()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:303:1: ( rule__URIRef__UriAssignment )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:303:2: rule__URIRef__UriAssignment
            {
            pushFollow(FOLLOW_rule__URIRef__UriAssignment_in_ruleURIRef575);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:315:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:316:1: ( ruleQName EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:317:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName602);
            ruleQName();
            _fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName609); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:324:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:328:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:329:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:329:1: ( ( rule__QName__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:330:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:331:1: ( rule__QName__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:331:2: rule__QName__Group__0
            {
            pushFollow(FOLLOW_rule__QName__Group__0_in_ruleQName635);
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


    // $ANTLR start entryRuleVariable
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:343:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:344:1: ( ruleVariable EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:345:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable662);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable669); 

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:352:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:356:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:357:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:357:1: ( ( rule__Variable__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:358:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:359:1: ( rule__Variable__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:359:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable695);
            rule__Variable__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleLiteral
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:371:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:372:1: ( ruleLiteral EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:373:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral722);
            ruleLiteral();
            _fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral729); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:380:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:384:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:385:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:385:1: ( ( rule__Literal__Alternatives ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:386:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:387:1: ( rule__Literal__Alternatives )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:387:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral755);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:399:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:400:1: ( ruleStringValue EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:401:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue782);
            ruleStringValue();
            _fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue789); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:408:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:412:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:413:1: ( ( rule__StringValue__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:413:1: ( ( rule__StringValue__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:414:1: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:415:1: ( rule__StringValue__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:415:2: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0_in_ruleStringValue815);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:427:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:428:1: ( ruleIntegerValue EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:429:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue842);
            ruleIntegerValue();
            _fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue849); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:436:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:440:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:441:1: ( ( rule__IntegerValue__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:441:1: ( ( rule__IntegerValue__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:442:1: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:443:1: ( rule__IntegerValue__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:443:2: rule__IntegerValue__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue875);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:455:1: entryRuleRDFTag : ruleRDFTag EOF ;
    public final void entryRuleRDFTag() throws RecognitionException {
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:456:1: ( ruleRDFTag EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:457:1: ruleRDFTag EOF
            {
             before(grammarAccess.getRDFTagRule()); 
            pushFollow(FOLLOW_ruleRDFTag_in_entryRuleRDFTag902);
            ruleRDFTag();
            _fsp--;

             after(grammarAccess.getRDFTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDFTag909); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:464:1: ruleRDFTag : ( ( rule__RDFTag__Alternatives ) ) ;
    public final void ruleRDFTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:468:2: ( ( ( rule__RDFTag__Alternatives ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:469:1: ( ( rule__RDFTag__Alternatives ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:469:1: ( ( rule__RDFTag__Alternatives ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:470:1: ( rule__RDFTag__Alternatives )
            {
             before(grammarAccess.getRDFTagAccess().getAlternatives()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:471:1: ( rule__RDFTag__Alternatives )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:471:2: rule__RDFTag__Alternatives
            {
            pushFollow(FOLLOW_rule__RDFTag__Alternatives_in_ruleRDFTag935);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:483:1: entryRuleTypeTag : ruleTypeTag EOF ;
    public final void entryRuleTypeTag() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:487:1: ( ruleTypeTag EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:488:1: ruleTypeTag EOF
            {
             before(grammarAccess.getTypeTagRule()); 
            pushFollow(FOLLOW_ruleTypeTag_in_entryRuleTypeTag967);
            ruleTypeTag();
            _fsp--;

             after(grammarAccess.getTypeTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTag974); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:498:1: ruleTypeTag : ( ( rule__TypeTag__Group__0 ) ) ;
    public final void ruleTypeTag() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:503:2: ( ( ( rule__TypeTag__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:504:1: ( ( rule__TypeTag__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:504:1: ( ( rule__TypeTag__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:505:1: ( rule__TypeTag__Group__0 )
            {
             before(grammarAccess.getTypeTagAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:506:1: ( rule__TypeTag__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:506:2: rule__TypeTag__Group__0
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__0_in_ruleTypeTag1004);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:519:1: entryRuleLangTag : ruleLangTag EOF ;
    public final void entryRuleLangTag() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:523:1: ( ruleLangTag EOF )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:524:1: ruleLangTag EOF
            {
             before(grammarAccess.getLangTagRule()); 
            pushFollow(FOLLOW_ruleLangTag_in_entryRuleLangTag1036);
            ruleLangTag();
            _fsp--;

             after(grammarAccess.getLangTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangTag1043); 

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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:534:1: ruleLangTag : ( ( rule__LangTag__Group__0 ) ) ;
    public final void ruleLangTag() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:539:2: ( ( ( rule__LangTag__Group__0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:540:1: ( ( rule__LangTag__Group__0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:540:1: ( ( rule__LangTag__Group__0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:541:1: ( rule__LangTag__Group__0 )
            {
             before(grammarAccess.getLangTagAccess().getGroup()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:542:1: ( rule__LangTag__Group__0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:542:2: rule__LangTag__Group__0
            {
            pushFollow(FOLLOW_rule__LangTag__Group__0_in_ruleLangTag1073);
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


    // $ANTLR start rule__Rule__Alternatives
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:555:1: rule__Rule__Alternatives : ( ( ( rule__Rule__BareRuleAssignment_0 ) ) | ( ( rule__Rule__Group_1__0 ) ) | ( ( rule__Rule__Group_2__0 ) ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:559:1: ( ( ( rule__Rule__BareRuleAssignment_0 ) ) | ( ( rule__Rule__Group_1__0 ) ) | ( ( rule__Rule__Group_2__0 ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==19) ) {
                    alt1=2;
                }
                else if ( (LA1_2==RULE_ID) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("555:1: rule__Rule__Alternatives : ( ( ( rule__Rule__BareRuleAssignment_0 ) ) | ( ( rule__Rule__Group_1__0 ) ) | ( ( rule__Rule__Group_2__0 ) ) );", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("555:1: rule__Rule__Alternatives : ( ( ( rule__Rule__BareRuleAssignment_0 ) ) | ( ( rule__Rule__Group_1__0 ) ) | ( ( rule__Rule__Group_2__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:560:1: ( ( rule__Rule__BareRuleAssignment_0 ) )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:560:1: ( ( rule__Rule__BareRuleAssignment_0 ) )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:561:1: ( rule__Rule__BareRuleAssignment_0 )
                    {
                     before(grammarAccess.getRuleAccess().getBareRuleAssignment_0()); 
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:562:1: ( rule__Rule__BareRuleAssignment_0 )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:562:2: rule__Rule__BareRuleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__BareRuleAssignment_0_in_rule__Rule__Alternatives1109);
                    rule__Rule__BareRuleAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getBareRuleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:566:6: ( ( rule__Rule__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:566:6: ( ( rule__Rule__Group_1__0 ) )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:567:1: ( rule__Rule__Group_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_1()); 
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:568:1: ( rule__Rule__Group_1__0 )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:568:2: rule__Rule__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Alternatives1127);
                    rule__Rule__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:572:6: ( ( rule__Rule__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:572:6: ( ( rule__Rule__Group_2__0 ) )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:573:1: ( rule__Rule__Group_2__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2()); 
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:574:1: ( rule__Rule__Group_2__0 )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:574:2: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_2__0_in_rule__Rule__Alternatives1145);
                    rule__Rule__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_2()); 

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
    // $ANTLR end rule__Rule__Alternatives


    // $ANTLR start rule__Node__Alternatives
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:583:1: rule__Node__Alternatives : ( ( ruleURIRef ) | ( ruleQName ) | ( ruleVariable ) | ( ruleLiteral ) | ( ruleFunction ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:587:1: ( ( ruleURIRef ) | ( ruleQName ) | ( ruleVariable ) | ( ruleLiteral ) | ( ruleFunction ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_IRI_TERMINAL:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==19) ) {
                    alt2=5;
                }
                else if ( (LA2_2==14) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("583:1: rule__Node__Alternatives : ( ( ruleURIRef ) | ( ruleQName ) | ( ruleVariable ) | ( ruleLiteral ) | ( ruleFunction ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("583:1: rule__Node__Alternatives : ( ( ruleURIRef ) | ( ruleQName ) | ( ruleVariable ) | ( ruleLiteral ) | ( ruleFunction ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:588:1: ( ruleURIRef )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:588:1: ( ruleURIRef )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:589:1: ruleURIRef
                    {
                     before(grammarAccess.getNodeAccess().getURIRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleURIRef_in_rule__Node__Alternatives1178);
                    ruleURIRef();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getURIRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:594:6: ( ruleQName )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:594:6: ( ruleQName )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:595:1: ruleQName
                    {
                     before(grammarAccess.getNodeAccess().getQNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQName_in_rule__Node__Alternatives1195);
                    ruleQName();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getQNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:600:6: ( ruleVariable )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:600:6: ( ruleVariable )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:601:1: ruleVariable
                    {
                     before(grammarAccess.getNodeAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Node__Alternatives1212);
                    ruleVariable();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:606:6: ( ruleLiteral )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:606:6: ( ruleLiteral )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:607:1: ruleLiteral
                    {
                     before(grammarAccess.getNodeAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Node__Alternatives1229);
                    ruleLiteral();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:612:6: ( ruleFunction )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:612:6: ( ruleFunction )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:613:1: ruleFunction
                    {
                     before(grammarAccess.getNodeAccess().getFunctionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFunction_in_rule__Node__Alternatives1246);
                    ruleFunction();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getFunctionParserRuleCall_4()); 

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
    // $ANTLR end rule__Node__Alternatives


    // $ANTLR start rule__Literal__Alternatives
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:623:1: rule__Literal__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:627:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("623:1: rule__Literal__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:628:1: ( ruleStringValue )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:628:1: ( ruleStringValue )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:629:1: ruleStringValue
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Literal__Alternatives1278);
                    ruleStringValue();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:634:6: ( ruleIntegerValue )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:634:6: ( ruleIntegerValue )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:635:1: ruleIntegerValue
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__Literal__Alternatives1295);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:645:1: rule__RDFTag__Alternatives : ( ( ruleTypeTag ) | ( ruleLangTag ) );
    public final void rule__RDFTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:649:1: ( ( ruleTypeTag ) | ( ruleLangTag ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("645:1: rule__RDFTag__Alternatives : ( ( ruleTypeTag ) | ( ruleLangTag ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:650:1: ( ruleTypeTag )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:650:1: ( ruleTypeTag )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:651:1: ruleTypeTag
                    {
                     before(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeTag_in_rule__RDFTag__Alternatives1327);
                    ruleTypeTag();
                    _fsp--;

                     after(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:656:6: ( ruleLangTag )
                    {
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:656:6: ( ruleLangTag )
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:657:1: ruleLangTag
                    {
                     before(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLangTag_in_rule__RDFTag__Alternatives1344);
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


    // $ANTLR start rule__JenaRuleDocument__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:669:1: rule__JenaRuleDocument__Group__0 : rule__JenaRuleDocument__Group__0__Impl rule__JenaRuleDocument__Group__1 ;
    public final void rule__JenaRuleDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:673:1: ( rule__JenaRuleDocument__Group__0__Impl rule__JenaRuleDocument__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:674:2: rule__JenaRuleDocument__Group__0__Impl rule__JenaRuleDocument__Group__1
            {
            pushFollow(FOLLOW_rule__JenaRuleDocument__Group__0__Impl_in_rule__JenaRuleDocument__Group__01374);
            rule__JenaRuleDocument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__JenaRuleDocument__Group__1_in_rule__JenaRuleDocument__Group__01377);
            rule__JenaRuleDocument__Group__1();
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
    // $ANTLR end rule__JenaRuleDocument__Group__0


    // $ANTLR start rule__JenaRuleDocument__Group__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:681:1: rule__JenaRuleDocument__Group__0__Impl : ( ( rule__JenaRuleDocument__PrefixesAssignment_0 )* ) ;
    public final void rule__JenaRuleDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:685:1: ( ( ( rule__JenaRuleDocument__PrefixesAssignment_0 )* ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:686:1: ( ( rule__JenaRuleDocument__PrefixesAssignment_0 )* )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:686:1: ( ( rule__JenaRuleDocument__PrefixesAssignment_0 )* )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:687:1: ( rule__JenaRuleDocument__PrefixesAssignment_0 )*
            {
             before(grammarAccess.getJenaRuleDocumentAccess().getPrefixesAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:688:1: ( rule__JenaRuleDocument__PrefixesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:688:2: rule__JenaRuleDocument__PrefixesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__JenaRuleDocument__PrefixesAssignment_0_in_rule__JenaRuleDocument__Group__0__Impl1404);
            	    rule__JenaRuleDocument__PrefixesAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJenaRuleDocumentAccess().getPrefixesAssignment_0()); 

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
    // $ANTLR end rule__JenaRuleDocument__Group__0__Impl


    // $ANTLR start rule__JenaRuleDocument__Group__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:698:1: rule__JenaRuleDocument__Group__1 : rule__JenaRuleDocument__Group__1__Impl ;
    public final void rule__JenaRuleDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:702:1: ( rule__JenaRuleDocument__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:703:2: rule__JenaRuleDocument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JenaRuleDocument__Group__1__Impl_in_rule__JenaRuleDocument__Group__11435);
            rule__JenaRuleDocument__Group__1__Impl();
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
    // $ANTLR end rule__JenaRuleDocument__Group__1


    // $ANTLR start rule__JenaRuleDocument__Group__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:709:1: rule__JenaRuleDocument__Group__1__Impl : ( ( rule__JenaRuleDocument__RulesAssignment_1 )* ) ;
    public final void rule__JenaRuleDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:713:1: ( ( ( rule__JenaRuleDocument__RulesAssignment_1 )* ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:714:1: ( ( rule__JenaRuleDocument__RulesAssignment_1 )* )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:714:1: ( ( rule__JenaRuleDocument__RulesAssignment_1 )* )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:715:1: ( rule__JenaRuleDocument__RulesAssignment_1 )*
            {
             before(grammarAccess.getJenaRuleDocumentAccess().getRulesAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:716:1: ( rule__JenaRuleDocument__RulesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:716:2: rule__JenaRuleDocument__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__JenaRuleDocument__RulesAssignment_1_in_rule__JenaRuleDocument__Group__1__Impl1462);
            	    rule__JenaRuleDocument__RulesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJenaRuleDocumentAccess().getRulesAssignment_1()); 

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
    // $ANTLR end rule__JenaRuleDocument__Group__1__Impl


    // $ANTLR start rule__Rule__Group_1__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:730:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:734:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:735:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__01497);
            rule__Rule__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__01500);
            rule__Rule__Group_1__1();
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
    // $ANTLR end rule__Rule__Group_1__0


    // $ANTLR start rule__Rule__Group_1__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:742:1: rule__Rule__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:746:1: ( ( '[' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:747:1: ( '[' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:747:1: ( '[' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:748:1: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Rule__Group_1__0__Impl1528); 
             after(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end rule__Rule__Group_1__0__Impl


    // $ANTLR start rule__Rule__Group_1__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:761:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2 ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:765:1: ( rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:766:2: rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__11559);
            rule__Rule__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_1__2_in_rule__Rule__Group_1__11562);
            rule__Rule__Group_1__2();
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
    // $ANTLR end rule__Rule__Group_1__1


    // $ANTLR start rule__Rule__Group_1__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:773:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__BareRuleAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:777:1: ( ( ( rule__Rule__BareRuleAssignment_1_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:778:1: ( ( rule__Rule__BareRuleAssignment_1_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:778:1: ( ( rule__Rule__BareRuleAssignment_1_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:779:1: ( rule__Rule__BareRuleAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getBareRuleAssignment_1_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:780:1: ( rule__Rule__BareRuleAssignment_1_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:780:2: rule__Rule__BareRuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Rule__BareRuleAssignment_1_1_in_rule__Rule__Group_1__1__Impl1589);
            rule__Rule__BareRuleAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getBareRuleAssignment_1_1()); 

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
    // $ANTLR end rule__Rule__Group_1__1__Impl


    // $ANTLR start rule__Rule__Group_1__2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:790:1: rule__Rule__Group_1__2 : rule__Rule__Group_1__2__Impl ;
    public final void rule__Rule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:794:1: ( rule__Rule__Group_1__2__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:795:2: rule__Rule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_1__2__Impl_in_rule__Rule__Group_1__21619);
            rule__Rule__Group_1__2__Impl();
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
    // $ANTLR end rule__Rule__Group_1__2


    // $ANTLR start rule__Rule__Group_1__2__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:801:1: rule__Rule__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Rule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:805:1: ( ( ']' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:806:1: ( ']' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:806:1: ( ']' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:807:1: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_13_in_rule__Rule__Group_1__2__Impl1647); 
             after(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end rule__Rule__Group_1__2__Impl


    // $ANTLR start rule__Rule__Group_2__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:826:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:830:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:831:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__0__Impl_in_rule__Rule__Group_2__01684);
            rule__Rule__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2__1_in_rule__Rule__Group_2__01687);
            rule__Rule__Group_2__1();
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
    // $ANTLR end rule__Rule__Group_2__0


    // $ANTLR start rule__Rule__Group_2__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:838:1: rule__Rule__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:842:1: ( ( '[' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:843:1: ( '[' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:843:1: ( '[' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:844:1: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Rule__Group_2__0__Impl1715); 
             after(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Rule__Group_2__0__Impl


    // $ANTLR start rule__Rule__Group_2__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:857:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:861:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:862:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__1__Impl_in_rule__Rule__Group_2__11746);
            rule__Rule__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2__2_in_rule__Rule__Group_2__11749);
            rule__Rule__Group_2__2();
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
    // $ANTLR end rule__Rule__Group_2__1


    // $ANTLR start rule__Rule__Group_2__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:869:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__RuleNameAssignment_2_1 ) ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:873:1: ( ( ( rule__Rule__RuleNameAssignment_2_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:874:1: ( ( rule__Rule__RuleNameAssignment_2_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:874:1: ( ( rule__Rule__RuleNameAssignment_2_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:875:1: ( rule__Rule__RuleNameAssignment_2_1 )
            {
             before(grammarAccess.getRuleAccess().getRuleNameAssignment_2_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:876:1: ( rule__Rule__RuleNameAssignment_2_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:876:2: rule__Rule__RuleNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Rule__RuleNameAssignment_2_1_in_rule__Rule__Group_2__1__Impl1776);
            rule__Rule__RuleNameAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getRuleNameAssignment_2_1()); 

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
    // $ANTLR end rule__Rule__Group_2__1__Impl


    // $ANTLR start rule__Rule__Group_2__2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:886:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:890:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:891:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__2__Impl_in_rule__Rule__Group_2__21806);
            rule__Rule__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2__3_in_rule__Rule__Group_2__21809);
            rule__Rule__Group_2__3();
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
    // $ANTLR end rule__Rule__Group_2__2


    // $ANTLR start rule__Rule__Group_2__2__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:898:1: rule__Rule__Group_2__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:902:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:903:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:903:1: ( ':' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:904:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2_2()); 
            match(input,14,FOLLOW_14_in_rule__Rule__Group_2__2__Impl1837); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2_2()); 

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
    // $ANTLR end rule__Rule__Group_2__2__Impl


    // $ANTLR start rule__Rule__Group_2__3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:917:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:921:1: ( rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:922:2: rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__3__Impl_in_rule__Rule__Group_2__31868);
            rule__Rule__Group_2__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2__4_in_rule__Rule__Group_2__31871);
            rule__Rule__Group_2__4();
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
    // $ANTLR end rule__Rule__Group_2__3


    // $ANTLR start rule__Rule__Group_2__3__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:929:1: rule__Rule__Group_2__3__Impl : ( ( rule__Rule__BareRuleAssignment_2_3 ) ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:933:1: ( ( ( rule__Rule__BareRuleAssignment_2_3 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:934:1: ( ( rule__Rule__BareRuleAssignment_2_3 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:934:1: ( ( rule__Rule__BareRuleAssignment_2_3 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:935:1: ( rule__Rule__BareRuleAssignment_2_3 )
            {
             before(grammarAccess.getRuleAccess().getBareRuleAssignment_2_3()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:936:1: ( rule__Rule__BareRuleAssignment_2_3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:936:2: rule__Rule__BareRuleAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Rule__BareRuleAssignment_2_3_in_rule__Rule__Group_2__3__Impl1898);
            rule__Rule__BareRuleAssignment_2_3();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getBareRuleAssignment_2_3()); 

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
    // $ANTLR end rule__Rule__Group_2__3__Impl


    // $ANTLR start rule__Rule__Group_2__4
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:946:1: rule__Rule__Group_2__4 : rule__Rule__Group_2__4__Impl ;
    public final void rule__Rule__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:950:1: ( rule__Rule__Group_2__4__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:951:2: rule__Rule__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__4__Impl_in_rule__Rule__Group_2__41928);
            rule__Rule__Group_2__4__Impl();
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
    // $ANTLR end rule__Rule__Group_2__4


    // $ANTLR start rule__Rule__Group_2__4__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:957:1: rule__Rule__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Rule__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:961:1: ( ( ']' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:962:1: ( ']' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:962:1: ( ']' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:963:1: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,13,FOLLOW_13_in_rule__Rule__Group_2__4__Impl1956); 
             after(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_2_4()); 

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
    // $ANTLR end rule__Rule__Group_2__4__Impl


    // $ANTLR start rule__Prefix__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:986:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:990:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:991:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__01997);
            rule__Prefix__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02000);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:998:1: rule__Prefix__Group__0__Impl : ( '@prefix' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1002:1: ( ( '@prefix' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1003:1: ( '@prefix' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1003:1: ( '@prefix' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1004:1: '@prefix'
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Prefix__Group__0__Impl2028); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1017:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl rule__Prefix__Group__2 ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1021:1: ( rule__Prefix__Group__1__Impl rule__Prefix__Group__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1022:2: rule__Prefix__Group__1__Impl rule__Prefix__Group__2
            {
            pushFollow(FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12059);
            rule__Prefix__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12062);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1029:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__NameAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1033:1: ( ( ( rule__Prefix__NameAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1034:1: ( ( rule__Prefix__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1034:1: ( ( rule__Prefix__NameAssignment_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1035:1: ( rule__Prefix__NameAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1036:1: ( rule__Prefix__NameAssignment_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1036:2: rule__Prefix__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Prefix__NameAssignment_1_in_rule__Prefix__Group__1__Impl2089);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1046:1: rule__Prefix__Group__2 : rule__Prefix__Group__2__Impl rule__Prefix__Group__3 ;
    public final void rule__Prefix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1050:1: ( rule__Prefix__Group__2__Impl rule__Prefix__Group__3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1051:2: rule__Prefix__Group__2__Impl rule__Prefix__Group__3
            {
            pushFollow(FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22119);
            rule__Prefix__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__3_in_rule__Prefix__Group__22122);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1058:1: rule__Prefix__Group__2__Impl : ( ':' ) ;
    public final void rule__Prefix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1062:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1063:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1063:1: ( ':' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1064:1: ':'
            {
             before(grammarAccess.getPrefixAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Prefix__Group__2__Impl2150); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1077:1: rule__Prefix__Group__3 : rule__Prefix__Group__3__Impl rule__Prefix__Group__4 ;
    public final void rule__Prefix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1081:1: ( rule__Prefix__Group__3__Impl rule__Prefix__Group__4 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1082:2: rule__Prefix__Group__3__Impl rule__Prefix__Group__4
            {
            pushFollow(FOLLOW_rule__Prefix__Group__3__Impl_in_rule__Prefix__Group__32181);
            rule__Prefix__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__4_in_rule__Prefix__Group__32184);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1089:1: rule__Prefix__Group__3__Impl : ( ( rule__Prefix__UriAssignment_3 ) ) ;
    public final void rule__Prefix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1093:1: ( ( ( rule__Prefix__UriAssignment_3 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1094:1: ( ( rule__Prefix__UriAssignment_3 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1094:1: ( ( rule__Prefix__UriAssignment_3 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1095:1: ( rule__Prefix__UriAssignment_3 )
            {
             before(grammarAccess.getPrefixAccess().getUriAssignment_3()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1096:1: ( rule__Prefix__UriAssignment_3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1096:2: rule__Prefix__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__Prefix__UriAssignment_3_in_rule__Prefix__Group__3__Impl2211);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1106:1: rule__Prefix__Group__4 : rule__Prefix__Group__4__Impl ;
    public final void rule__Prefix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1110:1: ( rule__Prefix__Group__4__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1111:2: rule__Prefix__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group__4__Impl_in_rule__Prefix__Group__42241);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1117:1: rule__Prefix__Group__4__Impl : ( '.' ) ;
    public final void rule__Prefix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1121:1: ( ( '.' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1122:1: ( '.' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1122:1: ( '.' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1123:1: '.'
            {
             before(grammarAccess.getPrefixAccess().getFullStopKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Prefix__Group__4__Impl2269); 
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


    // $ANTLR start rule__ForwardRule__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1146:1: rule__ForwardRule__Group__0 : rule__ForwardRule__Group__0__Impl rule__ForwardRule__Group__1 ;
    public final void rule__ForwardRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1150:1: ( rule__ForwardRule__Group__0__Impl rule__ForwardRule__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1151:2: rule__ForwardRule__Group__0__Impl rule__ForwardRule__Group__1
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__0__Impl_in_rule__ForwardRule__Group__02310);
            rule__ForwardRule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group__1_in_rule__ForwardRule__Group__02313);
            rule__ForwardRule__Group__1();
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
    // $ANTLR end rule__ForwardRule__Group__0


    // $ANTLR start rule__ForwardRule__Group__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1158:1: rule__ForwardRule__Group__0__Impl : ( ( rule__ForwardRule__LeftTermsAssignment_0 ) ) ;
    public final void rule__ForwardRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1162:1: ( ( ( rule__ForwardRule__LeftTermsAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1163:1: ( ( rule__ForwardRule__LeftTermsAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1163:1: ( ( rule__ForwardRule__LeftTermsAssignment_0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1164:1: ( rule__ForwardRule__LeftTermsAssignment_0 )
            {
             before(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1165:1: ( rule__ForwardRule__LeftTermsAssignment_0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1165:2: rule__ForwardRule__LeftTermsAssignment_0
            {
            pushFollow(FOLLOW_rule__ForwardRule__LeftTermsAssignment_0_in_rule__ForwardRule__Group__0__Impl2340);
            rule__ForwardRule__LeftTermsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_0()); 

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
    // $ANTLR end rule__ForwardRule__Group__0__Impl


    // $ANTLR start rule__ForwardRule__Group__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1175:1: rule__ForwardRule__Group__1 : rule__ForwardRule__Group__1__Impl rule__ForwardRule__Group__2 ;
    public final void rule__ForwardRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1179:1: ( rule__ForwardRule__Group__1__Impl rule__ForwardRule__Group__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1180:2: rule__ForwardRule__Group__1__Impl rule__ForwardRule__Group__2
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__1__Impl_in_rule__ForwardRule__Group__12370);
            rule__ForwardRule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group__2_in_rule__ForwardRule__Group__12373);
            rule__ForwardRule__Group__2();
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
    // $ANTLR end rule__ForwardRule__Group__1


    // $ANTLR start rule__ForwardRule__Group__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1187:1: rule__ForwardRule__Group__1__Impl : ( ( rule__ForwardRule__Group_1__0 )* ) ;
    public final void rule__ForwardRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1191:1: ( ( ( rule__ForwardRule__Group_1__0 )* ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1192:1: ( ( rule__ForwardRule__Group_1__0 )* )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1192:1: ( ( rule__ForwardRule__Group_1__0 )* )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1193:1: ( rule__ForwardRule__Group_1__0 )*
            {
             before(grammarAccess.getForwardRuleAccess().getGroup_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1194:1: ( rule__ForwardRule__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1194:2: rule__ForwardRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ForwardRule__Group_1__0_in_rule__ForwardRule__Group__1__Impl2400);
            	    rule__ForwardRule__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getForwardRuleAccess().getGroup_1()); 

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
    // $ANTLR end rule__ForwardRule__Group__1__Impl


    // $ANTLR start rule__ForwardRule__Group__2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1204:1: rule__ForwardRule__Group__2 : rule__ForwardRule__Group__2__Impl rule__ForwardRule__Group__3 ;
    public final void rule__ForwardRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1208:1: ( rule__ForwardRule__Group__2__Impl rule__ForwardRule__Group__3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1209:2: rule__ForwardRule__Group__2__Impl rule__ForwardRule__Group__3
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__2__Impl_in_rule__ForwardRule__Group__22431);
            rule__ForwardRule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group__3_in_rule__ForwardRule__Group__22434);
            rule__ForwardRule__Group__3();
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
    // $ANTLR end rule__ForwardRule__Group__2


    // $ANTLR start rule__ForwardRule__Group__2__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1216:1: rule__ForwardRule__Group__2__Impl : ( '->' ) ;
    public final void rule__ForwardRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1220:1: ( ( '->' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1221:1: ( '->' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1221:1: ( '->' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1222:1: '->'
            {
             before(grammarAccess.getForwardRuleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__ForwardRule__Group__2__Impl2462); 
             after(grammarAccess.getForwardRuleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end rule__ForwardRule__Group__2__Impl


    // $ANTLR start rule__ForwardRule__Group__3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1235:1: rule__ForwardRule__Group__3 : rule__ForwardRule__Group__3__Impl rule__ForwardRule__Group__4 ;
    public final void rule__ForwardRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1239:1: ( rule__ForwardRule__Group__3__Impl rule__ForwardRule__Group__4 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1240:2: rule__ForwardRule__Group__3__Impl rule__ForwardRule__Group__4
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__3__Impl_in_rule__ForwardRule__Group__32493);
            rule__ForwardRule__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group__4_in_rule__ForwardRule__Group__32496);
            rule__ForwardRule__Group__4();
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
    // $ANTLR end rule__ForwardRule__Group__3


    // $ANTLR start rule__ForwardRule__Group__3__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1247:1: rule__ForwardRule__Group__3__Impl : ( ( rule__ForwardRule__RightTermsAssignment_3 ) ) ;
    public final void rule__ForwardRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1251:1: ( ( ( rule__ForwardRule__RightTermsAssignment_3 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1252:1: ( ( rule__ForwardRule__RightTermsAssignment_3 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1252:1: ( ( rule__ForwardRule__RightTermsAssignment_3 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1253:1: ( rule__ForwardRule__RightTermsAssignment_3 )
            {
             before(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_3()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1254:1: ( rule__ForwardRule__RightTermsAssignment_3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1254:2: rule__ForwardRule__RightTermsAssignment_3
            {
            pushFollow(FOLLOW_rule__ForwardRule__RightTermsAssignment_3_in_rule__ForwardRule__Group__3__Impl2523);
            rule__ForwardRule__RightTermsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_3()); 

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
    // $ANTLR end rule__ForwardRule__Group__3__Impl


    // $ANTLR start rule__ForwardRule__Group__4
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1264:1: rule__ForwardRule__Group__4 : rule__ForwardRule__Group__4__Impl ;
    public final void rule__ForwardRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1268:1: ( rule__ForwardRule__Group__4__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1269:2: rule__ForwardRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group__4__Impl_in_rule__ForwardRule__Group__42553);
            rule__ForwardRule__Group__4__Impl();
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
    // $ANTLR end rule__ForwardRule__Group__4


    // $ANTLR start rule__ForwardRule__Group__4__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1275:1: rule__ForwardRule__Group__4__Impl : ( ( rule__ForwardRule__Group_4__0 )* ) ;
    public final void rule__ForwardRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1279:1: ( ( ( rule__ForwardRule__Group_4__0 )* ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1280:1: ( ( rule__ForwardRule__Group_4__0 )* )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1280:1: ( ( rule__ForwardRule__Group_4__0 )* )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1281:1: ( rule__ForwardRule__Group_4__0 )*
            {
             before(grammarAccess.getForwardRuleAccess().getGroup_4()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1282:1: ( rule__ForwardRule__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1282:2: rule__ForwardRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ForwardRule__Group_4__0_in_rule__ForwardRule__Group__4__Impl2580);
            	    rule__ForwardRule__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getForwardRuleAccess().getGroup_4()); 

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
    // $ANTLR end rule__ForwardRule__Group__4__Impl


    // $ANTLR start rule__ForwardRule__Group_1__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1302:1: rule__ForwardRule__Group_1__0 : rule__ForwardRule__Group_1__0__Impl rule__ForwardRule__Group_1__1 ;
    public final void rule__ForwardRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1306:1: ( rule__ForwardRule__Group_1__0__Impl rule__ForwardRule__Group_1__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1307:2: rule__ForwardRule__Group_1__0__Impl rule__ForwardRule__Group_1__1
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group_1__0__Impl_in_rule__ForwardRule__Group_1__02621);
            rule__ForwardRule__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group_1__1_in_rule__ForwardRule__Group_1__02624);
            rule__ForwardRule__Group_1__1();
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
    // $ANTLR end rule__ForwardRule__Group_1__0


    // $ANTLR start rule__ForwardRule__Group_1__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1314:1: rule__ForwardRule__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ForwardRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1318:1: ( ( ',' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1319:1: ( ',' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1319:1: ( ',' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1320:1: ','
            {
             before(grammarAccess.getForwardRuleAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__ForwardRule__Group_1__0__Impl2652); 
             after(grammarAccess.getForwardRuleAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end rule__ForwardRule__Group_1__0__Impl


    // $ANTLR start rule__ForwardRule__Group_1__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1333:1: rule__ForwardRule__Group_1__1 : rule__ForwardRule__Group_1__1__Impl ;
    public final void rule__ForwardRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1337:1: ( rule__ForwardRule__Group_1__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1338:2: rule__ForwardRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group_1__1__Impl_in_rule__ForwardRule__Group_1__12683);
            rule__ForwardRule__Group_1__1__Impl();
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
    // $ANTLR end rule__ForwardRule__Group_1__1


    // $ANTLR start rule__ForwardRule__Group_1__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1344:1: rule__ForwardRule__Group_1__1__Impl : ( ( rule__ForwardRule__LeftTermsAssignment_1_1 ) ) ;
    public final void rule__ForwardRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1348:1: ( ( ( rule__ForwardRule__LeftTermsAssignment_1_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1349:1: ( ( rule__ForwardRule__LeftTermsAssignment_1_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1349:1: ( ( rule__ForwardRule__LeftTermsAssignment_1_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1350:1: ( rule__ForwardRule__LeftTermsAssignment_1_1 )
            {
             before(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_1_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1351:1: ( rule__ForwardRule__LeftTermsAssignment_1_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1351:2: rule__ForwardRule__LeftTermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ForwardRule__LeftTermsAssignment_1_1_in_rule__ForwardRule__Group_1__1__Impl2710);
            rule__ForwardRule__LeftTermsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getForwardRuleAccess().getLeftTermsAssignment_1_1()); 

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
    // $ANTLR end rule__ForwardRule__Group_1__1__Impl


    // $ANTLR start rule__ForwardRule__Group_4__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1365:1: rule__ForwardRule__Group_4__0 : rule__ForwardRule__Group_4__0__Impl rule__ForwardRule__Group_4__1 ;
    public final void rule__ForwardRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1369:1: ( rule__ForwardRule__Group_4__0__Impl rule__ForwardRule__Group_4__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1370:2: rule__ForwardRule__Group_4__0__Impl rule__ForwardRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group_4__0__Impl_in_rule__ForwardRule__Group_4__02744);
            rule__ForwardRule__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ForwardRule__Group_4__1_in_rule__ForwardRule__Group_4__02747);
            rule__ForwardRule__Group_4__1();
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
    // $ANTLR end rule__ForwardRule__Group_4__0


    // $ANTLR start rule__ForwardRule__Group_4__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1377:1: rule__ForwardRule__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForwardRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1381:1: ( ( ',' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1382:1: ( ',' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1382:1: ( ',' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1383:1: ','
            {
             before(grammarAccess.getForwardRuleAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__ForwardRule__Group_4__0__Impl2775); 
             after(grammarAccess.getForwardRuleAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end rule__ForwardRule__Group_4__0__Impl


    // $ANTLR start rule__ForwardRule__Group_4__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1396:1: rule__ForwardRule__Group_4__1 : rule__ForwardRule__Group_4__1__Impl ;
    public final void rule__ForwardRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1400:1: ( rule__ForwardRule__Group_4__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1401:2: rule__ForwardRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ForwardRule__Group_4__1__Impl_in_rule__ForwardRule__Group_4__12806);
            rule__ForwardRule__Group_4__1__Impl();
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
    // $ANTLR end rule__ForwardRule__Group_4__1


    // $ANTLR start rule__ForwardRule__Group_4__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1407:1: rule__ForwardRule__Group_4__1__Impl : ( ( rule__ForwardRule__RightTermsAssignment_4_1 ) ) ;
    public final void rule__ForwardRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1411:1: ( ( ( rule__ForwardRule__RightTermsAssignment_4_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1412:1: ( ( rule__ForwardRule__RightTermsAssignment_4_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1412:1: ( ( rule__ForwardRule__RightTermsAssignment_4_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1413:1: ( rule__ForwardRule__RightTermsAssignment_4_1 )
            {
             before(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_4_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1414:1: ( rule__ForwardRule__RightTermsAssignment_4_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1414:2: rule__ForwardRule__RightTermsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ForwardRule__RightTermsAssignment_4_1_in_rule__ForwardRule__Group_4__1__Impl2833);
            rule__ForwardRule__RightTermsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getForwardRuleAccess().getRightTermsAssignment_4_1()); 

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
    // $ANTLR end rule__ForwardRule__Group_4__1__Impl


    // $ANTLR start rule__Term__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1428:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1432:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1433:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02867);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02870);
            rule__Term__Group__1();
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
    // $ANTLR end rule__Term__Group__0


    // $ANTLR start rule__Term__Group__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1440:1: rule__Term__Group__0__Impl : ( '(' ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1444:1: ( ( '(' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1445:1: ( '(' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1445:1: ( '(' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1446:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group__0__Impl2898); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end rule__Term__Group__0__Impl


    // $ANTLR start rule__Term__Group__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1459:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1463:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1464:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12929);
            rule__Term__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__2_in_rule__Term__Group__12932);
            rule__Term__Group__2();
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
    // $ANTLR end rule__Term__Group__1


    // $ANTLR start rule__Term__Group__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1471:1: rule__Term__Group__1__Impl : ( ( rule__Term__SubjectAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1475:1: ( ( ( rule__Term__SubjectAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1476:1: ( ( rule__Term__SubjectAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1476:1: ( ( rule__Term__SubjectAssignment_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1477:1: ( rule__Term__SubjectAssignment_1 )
            {
             before(grammarAccess.getTermAccess().getSubjectAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1478:1: ( rule__Term__SubjectAssignment_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1478:2: rule__Term__SubjectAssignment_1
            {
            pushFollow(FOLLOW_rule__Term__SubjectAssignment_1_in_rule__Term__Group__1__Impl2959);
            rule__Term__SubjectAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getSubjectAssignment_1()); 

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
    // $ANTLR end rule__Term__Group__1__Impl


    // $ANTLR start rule__Term__Group__2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1488:1: rule__Term__Group__2 : rule__Term__Group__2__Impl rule__Term__Group__3 ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1492:1: ( rule__Term__Group__2__Impl rule__Term__Group__3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1493:2: rule__Term__Group__2__Impl rule__Term__Group__3
            {
            pushFollow(FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__22989);
            rule__Term__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__3_in_rule__Term__Group__22992);
            rule__Term__Group__3();
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
    // $ANTLR end rule__Term__Group__2


    // $ANTLR start rule__Term__Group__2__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1500:1: rule__Term__Group__2__Impl : ( ( rule__Term__PredicateAssignment_2 ) ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1504:1: ( ( ( rule__Term__PredicateAssignment_2 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1505:1: ( ( rule__Term__PredicateAssignment_2 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1505:1: ( ( rule__Term__PredicateAssignment_2 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1506:1: ( rule__Term__PredicateAssignment_2 )
            {
             before(grammarAccess.getTermAccess().getPredicateAssignment_2()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1507:1: ( rule__Term__PredicateAssignment_2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1507:2: rule__Term__PredicateAssignment_2
            {
            pushFollow(FOLLOW_rule__Term__PredicateAssignment_2_in_rule__Term__Group__2__Impl3019);
            rule__Term__PredicateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getPredicateAssignment_2()); 

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
    // $ANTLR end rule__Term__Group__2__Impl


    // $ANTLR start rule__Term__Group__3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1517:1: rule__Term__Group__3 : rule__Term__Group__3__Impl rule__Term__Group__4 ;
    public final void rule__Term__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1521:1: ( rule__Term__Group__3__Impl rule__Term__Group__4 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1522:2: rule__Term__Group__3__Impl rule__Term__Group__4
            {
            pushFollow(FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__33049);
            rule__Term__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__4_in_rule__Term__Group__33052);
            rule__Term__Group__4();
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
    // $ANTLR end rule__Term__Group__3


    // $ANTLR start rule__Term__Group__3__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1529:1: rule__Term__Group__3__Impl : ( ( rule__Term__ObjectAssignment_3 ) ) ;
    public final void rule__Term__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1533:1: ( ( ( rule__Term__ObjectAssignment_3 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1534:1: ( ( rule__Term__ObjectAssignment_3 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1534:1: ( ( rule__Term__ObjectAssignment_3 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1535:1: ( rule__Term__ObjectAssignment_3 )
            {
             before(grammarAccess.getTermAccess().getObjectAssignment_3()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1536:1: ( rule__Term__ObjectAssignment_3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1536:2: rule__Term__ObjectAssignment_3
            {
            pushFollow(FOLLOW_rule__Term__ObjectAssignment_3_in_rule__Term__Group__3__Impl3079);
            rule__Term__ObjectAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getObjectAssignment_3()); 

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
    // $ANTLR end rule__Term__Group__3__Impl


    // $ANTLR start rule__Term__Group__4
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1546:1: rule__Term__Group__4 : rule__Term__Group__4__Impl ;
    public final void rule__Term__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1550:1: ( rule__Term__Group__4__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1551:2: rule__Term__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__43109);
            rule__Term__Group__4__Impl();
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
    // $ANTLR end rule__Term__Group__4


    // $ANTLR start rule__Term__Group__4__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1557:1: rule__Term__Group__4__Impl : ( ')' ) ;
    public final void rule__Term__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1561:1: ( ( ')' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1562:1: ( ')' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1562:1: ( ')' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1563:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Term__Group__4__Impl3137); 
             after(grammarAccess.getTermAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Term__Group__4__Impl


    // $ANTLR start rule__Function__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1586:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1590:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1591:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03178);
            rule__Function__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03181);
            rule__Function__Group__1();
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
    // $ANTLR end rule__Function__Group__0


    // $ANTLR start rule__Function__Group__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1598:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1602:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1603:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1603:1: ( ( rule__Function__NameAssignment_0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1604:1: ( rule__Function__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1605:1: ( rule__Function__NameAssignment_0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1605:2: rule__Function__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl3208);
            rule__Function__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Function__Group__0__Impl


    // $ANTLR start rule__Function__Group__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1615:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1619:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1620:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13238);
            rule__Function__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13241);
            rule__Function__Group__2();
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
    // $ANTLR end rule__Function__Group__1


    // $ANTLR start rule__Function__Group__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1627:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1631:1: ( ( '(' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1632:1: ( '(' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1632:1: ( '(' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1633:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Function__Group__1__Impl3269); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Function__Group__1__Impl


    // $ANTLR start rule__Function__Group__2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1646:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1650:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1651:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23300);
            rule__Function__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__23303);
            rule__Function__Group__3();
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
    // $ANTLR end rule__Function__Group__2


    // $ANTLR start rule__Function__Group__2__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1658:1: rule__Function__Group__2__Impl : ( ( rule__Function__NodesAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1662:1: ( ( ( rule__Function__NodesAssignment_2 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1663:1: ( ( rule__Function__NodesAssignment_2 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1663:1: ( ( rule__Function__NodesAssignment_2 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1664:1: ( rule__Function__NodesAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNodesAssignment_2()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1665:1: ( rule__Function__NodesAssignment_2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1665:2: rule__Function__NodesAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__NodesAssignment_2_in_rule__Function__Group__2__Impl3330);
            rule__Function__NodesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNodesAssignment_2()); 

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
    // $ANTLR end rule__Function__Group__2__Impl


    // $ANTLR start rule__Function__Group__3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1675:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1679:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1680:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__33360);
            rule__Function__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__33363);
            rule__Function__Group__4();
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
    // $ANTLR end rule__Function__Group__3


    // $ANTLR start rule__Function__Group__3__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1687:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1691:1: ( ( ( rule__Function__Group_3__0 )* ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1692:1: ( ( rule__Function__Group_3__0 )* )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1692:1: ( ( rule__Function__Group_3__0 )* )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1693:1: ( rule__Function__Group_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1694:1: ( rule__Function__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1694:2: rule__Function__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl3390);
            	    rule__Function__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end rule__Function__Group__3__Impl


    // $ANTLR start rule__Function__Group__4
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1704:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1708:1: ( rule__Function__Group__4__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1709:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__43421);
            rule__Function__Group__4__Impl();
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
    // $ANTLR end rule__Function__Group__4


    // $ANTLR start rule__Function__Group__4__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1715:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1719:1: ( ( ')' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1720:1: ( ')' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1720:1: ( ')' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1721:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Function__Group__4__Impl3449); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Function__Group__4__Impl


    // $ANTLR start rule__Function__Group_3__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1744:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1748:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1749:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__03490);
            rule__Function__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__03493);
            rule__Function__Group_3__1();
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
    // $ANTLR end rule__Function__Group_3__0


    // $ANTLR start rule__Function__Group_3__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1756:1: rule__Function__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1760:1: ( ( ',' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1761:1: ( ',' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1761:1: ( ',' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1762:1: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Function__Group_3__0__Impl3521); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Function__Group_3__0__Impl


    // $ANTLR start rule__Function__Group_3__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1775:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1779:1: ( rule__Function__Group_3__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1780:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__13552);
            rule__Function__Group_3__1__Impl();
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
    // $ANTLR end rule__Function__Group_3__1


    // $ANTLR start rule__Function__Group_3__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1786:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__NodesAssignment_3_1 ) ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1790:1: ( ( ( rule__Function__NodesAssignment_3_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1791:1: ( ( rule__Function__NodesAssignment_3_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1791:1: ( ( rule__Function__NodesAssignment_3_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1792:1: ( rule__Function__NodesAssignment_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getNodesAssignment_3_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1793:1: ( rule__Function__NodesAssignment_3_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1793:2: rule__Function__NodesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Function__NodesAssignment_3_1_in_rule__Function__Group_3__1__Impl3579);
            rule__Function__NodesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNodesAssignment_3_1()); 

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
    // $ANTLR end rule__Function__Group_3__1__Impl


    // $ANTLR start rule__QName__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1807:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1811:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1812:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03613);
            rule__QName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03616);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1819:1: rule__QName__Group__0__Impl : ( ( rule__QName__PrefixAssignment_0 )? ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1823:1: ( ( ( rule__QName__PrefixAssignment_0 )? ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1824:1: ( ( rule__QName__PrefixAssignment_0 )? )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1824:1: ( ( rule__QName__PrefixAssignment_0 )? )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1825:1: ( rule__QName__PrefixAssignment_0 )?
            {
             before(grammarAccess.getQNameAccess().getPrefixAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1826:1: ( rule__QName__PrefixAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1826:2: rule__QName__PrefixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__QName__PrefixAssignment_0_in_rule__QName__Group__0__Impl3643);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1836:1: rule__QName__Group__1 : rule__QName__Group__1__Impl rule__QName__Group__2 ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1840:1: ( rule__QName__Group__1__Impl rule__QName__Group__2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1841:2: rule__QName__Group__1__Impl rule__QName__Group__2
            {
            pushFollow(FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13674);
            rule__QName__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QName__Group__2_in_rule__QName__Group__13677);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1848:1: rule__QName__Group__1__Impl : ( ':' ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1852:1: ( ( ':' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1853:1: ( ':' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1853:1: ( ':' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1854:1: ':'
            {
             before(grammarAccess.getQNameAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__QName__Group__1__Impl3705); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1867:1: rule__QName__Group__2 : rule__QName__Group__2__Impl ;
    public final void rule__QName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1871:1: ( rule__QName__Group__2__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1872:2: rule__QName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group__2__Impl_in_rule__QName__Group__23736);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1878:1: rule__QName__Group__2__Impl : ( ( rule__QName__NameAssignment_2 ) ) ;
    public final void rule__QName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1882:1: ( ( ( rule__QName__NameAssignment_2 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1883:1: ( ( rule__QName__NameAssignment_2 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1883:1: ( ( rule__QName__NameAssignment_2 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1884:1: ( rule__QName__NameAssignment_2 )
            {
             before(grammarAccess.getQNameAccess().getNameAssignment_2()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1885:1: ( rule__QName__NameAssignment_2 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1885:2: rule__QName__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__QName__NameAssignment_2_in_rule__QName__Group__2__Impl3763);
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


    // $ANTLR start rule__Variable__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1901:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1905:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1906:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03799);
            rule__Variable__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03802);
            rule__Variable__Group__1();
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
    // $ANTLR end rule__Variable__Group__0


    // $ANTLR start rule__Variable__Group__0__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1913:1: rule__Variable__Group__0__Impl : ( '?' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1917:1: ( ( '?' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1918:1: ( '?' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1918:1: ( '?' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1919:1: '?'
            {
             before(grammarAccess.getVariableAccess().getQuestionMarkKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Variable__Group__0__Impl3830); 
             after(grammarAccess.getVariableAccess().getQuestionMarkKeyword_0()); 

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
    // $ANTLR end rule__Variable__Group__0__Impl


    // $ANTLR start rule__Variable__Group__1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1932:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1936:1: ( rule__Variable__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1937:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13861);
            rule__Variable__Group__1__Impl();
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
    // $ANTLR end rule__Variable__Group__1


    // $ANTLR start rule__Variable__Group__1__Impl
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1943:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1947:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1948:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1948:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1949:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1950:1: ( rule__Variable__NameAssignment_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1950:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl3888);
            rule__Variable__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Variable__Group__1__Impl


    // $ANTLR start rule__StringValue__Group__0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1964:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1968:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1969:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03922);
            rule__StringValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03925);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1976:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__ValueAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1980:1: ( ( ( rule__StringValue__ValueAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1981:1: ( ( rule__StringValue__ValueAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1981:1: ( ( rule__StringValue__ValueAssignment_0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1982:1: ( rule__StringValue__ValueAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1983:1: ( rule__StringValue__ValueAssignment_0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1983:2: rule__StringValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_0_in_rule__StringValue__Group__0__Impl3952);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1993:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1997:1: ( rule__StringValue__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:1998:2: rule__StringValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13982);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2004:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__TagAssignment_1 )? ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2008:1: ( ( ( rule__StringValue__TagAssignment_1 )? ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2009:1: ( ( rule__StringValue__TagAssignment_1 )? )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2009:1: ( ( rule__StringValue__TagAssignment_1 )? )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2010:1: ( rule__StringValue__TagAssignment_1 )?
            {
             before(grammarAccess.getStringValueAccess().getTagAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2011:1: ( rule__StringValue__TagAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2011:2: rule__StringValue__TagAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StringValue__TagAssignment_1_in_rule__StringValue__Group__1__Impl4009);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2025:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2029:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2030:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__04044);
            rule__IntegerValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__04047);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2037:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__ValueAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2041:1: ( ( ( rule__IntegerValue__ValueAssignment_0 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2042:1: ( ( rule__IntegerValue__ValueAssignment_0 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2042:1: ( ( rule__IntegerValue__ValueAssignment_0 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2043:1: ( rule__IntegerValue__ValueAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2044:1: ( rule__IntegerValue__ValueAssignment_0 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2044:2: rule__IntegerValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_0_in_rule__IntegerValue__Group__0__Impl4074);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2054:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2058:1: ( rule__IntegerValue__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2059:2: rule__IntegerValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__14104);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2065:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__TagAssignment_1 )? ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2069:1: ( ( ( rule__IntegerValue__TagAssignment_1 )? ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2070:1: ( ( rule__IntegerValue__TagAssignment_1 )? )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2070:1: ( ( rule__IntegerValue__TagAssignment_1 )? )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2071:1: ( rule__IntegerValue__TagAssignment_1 )?
            {
             before(grammarAccess.getIntegerValueAccess().getTagAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2072:1: ( rule__IntegerValue__TagAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2072:2: rule__IntegerValue__TagAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IntegerValue__TagAssignment_1_in_rule__IntegerValue__Group__1__Impl4131);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2086:1: rule__TypeTag__Group__0 : rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1 ;
    public final void rule__TypeTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2090:1: ( rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2091:2: rule__TypeTag__Group__0__Impl rule__TypeTag__Group__1
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__0__Impl_in_rule__TypeTag__Group__04166);
            rule__TypeTag__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeTag__Group__1_in_rule__TypeTag__Group__04169);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2098:1: rule__TypeTag__Group__0__Impl : ( '^^' ) ;
    public final void rule__TypeTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2102:1: ( ( '^^' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2103:1: ( '^^' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2103:1: ( '^^' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2104:1: '^^'
            {
             before(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__TypeTag__Group__0__Impl4197); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2117:1: rule__TypeTag__Group__1 : rule__TypeTag__Group__1__Impl ;
    public final void rule__TypeTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2121:1: ( rule__TypeTag__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2122:2: rule__TypeTag__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeTag__Group__1__Impl_in_rule__TypeTag__Group__14228);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2128:1: rule__TypeTag__Group__1__Impl : ( ( rule__TypeTag__TypeAssignment_1 ) ) ;
    public final void rule__TypeTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2132:1: ( ( ( rule__TypeTag__TypeAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2133:1: ( ( rule__TypeTag__TypeAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2133:1: ( ( rule__TypeTag__TypeAssignment_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2134:1: ( rule__TypeTag__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeTagAccess().getTypeAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2135:1: ( rule__TypeTag__TypeAssignment_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2135:2: rule__TypeTag__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeTag__TypeAssignment_1_in_rule__TypeTag__Group__1__Impl4255);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2149:1: rule__LangTag__Group__0 : rule__LangTag__Group__0__Impl rule__LangTag__Group__1 ;
    public final void rule__LangTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2153:1: ( rule__LangTag__Group__0__Impl rule__LangTag__Group__1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2154:2: rule__LangTag__Group__0__Impl rule__LangTag__Group__1
            {
            pushFollow(FOLLOW_rule__LangTag__Group__0__Impl_in_rule__LangTag__Group__04289);
            rule__LangTag__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LangTag__Group__1_in_rule__LangTag__Group__04292);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2161:1: rule__LangTag__Group__0__Impl : ( '@' ) ;
    public final void rule__LangTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2165:1: ( ( '@' ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2166:1: ( '@' )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2166:1: ( '@' )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2167:1: '@'
            {
             before(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__LangTag__Group__0__Impl4320); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2180:1: rule__LangTag__Group__1 : rule__LangTag__Group__1__Impl ;
    public final void rule__LangTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2184:1: ( rule__LangTag__Group__1__Impl )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2185:2: rule__LangTag__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LangTag__Group__1__Impl_in_rule__LangTag__Group__14351);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2191:1: rule__LangTag__Group__1__Impl : ( ( rule__LangTag__LangAssignment_1 ) ) ;
    public final void rule__LangTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2195:1: ( ( ( rule__LangTag__LangAssignment_1 ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2196:1: ( ( rule__LangTag__LangAssignment_1 ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2196:1: ( ( rule__LangTag__LangAssignment_1 ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2197:1: ( rule__LangTag__LangAssignment_1 )
            {
             before(grammarAccess.getLangTagAccess().getLangAssignment_1()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2198:1: ( rule__LangTag__LangAssignment_1 )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2198:2: rule__LangTag__LangAssignment_1
            {
            pushFollow(FOLLOW_rule__LangTag__LangAssignment_1_in_rule__LangTag__Group__1__Impl4378);
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


    // $ANTLR start rule__JenaRuleDocument__PrefixesAssignment_0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2213:1: rule__JenaRuleDocument__PrefixesAssignment_0 : ( rulePrefix ) ;
    public final void rule__JenaRuleDocument__PrefixesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2217:1: ( ( rulePrefix ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2218:1: ( rulePrefix )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2218:1: ( rulePrefix )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2219:1: rulePrefix
            {
             before(grammarAccess.getJenaRuleDocumentAccess().getPrefixesPrefixParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__JenaRuleDocument__PrefixesAssignment_04417);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getJenaRuleDocumentAccess().getPrefixesPrefixParserRuleCall_0_0()); 

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
    // $ANTLR end rule__JenaRuleDocument__PrefixesAssignment_0


    // $ANTLR start rule__JenaRuleDocument__RulesAssignment_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2228:1: rule__JenaRuleDocument__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__JenaRuleDocument__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2232:1: ( ( ruleRule ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2233:1: ( ruleRule )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2233:1: ( ruleRule )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2234:1: ruleRule
            {
             before(grammarAccess.getJenaRuleDocumentAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__JenaRuleDocument__RulesAssignment_14448);
            ruleRule();
            _fsp--;

             after(grammarAccess.getJenaRuleDocumentAccess().getRulesRuleParserRuleCall_1_0()); 

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
    // $ANTLR end rule__JenaRuleDocument__RulesAssignment_1


    // $ANTLR start rule__Rule__BareRuleAssignment_0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2243:1: rule__Rule__BareRuleAssignment_0 : ( ruleBareRule ) ;
    public final void rule__Rule__BareRuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2247:1: ( ( ruleBareRule ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2248:1: ( ruleBareRule )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2248:1: ( ruleBareRule )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2249:1: ruleBareRule
            {
             before(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_04479);
            ruleBareRule();
            _fsp--;

             after(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Rule__BareRuleAssignment_0


    // $ANTLR start rule__Rule__BareRuleAssignment_1_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2258:1: rule__Rule__BareRuleAssignment_1_1 : ( ruleBareRule ) ;
    public final void rule__Rule__BareRuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2262:1: ( ( ruleBareRule ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2263:1: ( ruleBareRule )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2263:1: ( ruleBareRule )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2264:1: ruleBareRule
            {
             before(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_1_14510);
            ruleBareRule();
            _fsp--;

             after(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Rule__BareRuleAssignment_1_1


    // $ANTLR start rule__Rule__RuleNameAssignment_2_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2273:1: rule__Rule__RuleNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Rule__RuleNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2277:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2278:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2278:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2279:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRuleNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__RuleNameAssignment_2_14541); 
             after(grammarAccess.getRuleAccess().getRuleNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Rule__RuleNameAssignment_2_1


    // $ANTLR start rule__Rule__BareRuleAssignment_2_3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2288:1: rule__Rule__BareRuleAssignment_2_3 : ( ruleBareRule ) ;
    public final void rule__Rule__BareRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2292:1: ( ( ruleBareRule ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2293:1: ( ruleBareRule )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2293:1: ( ruleBareRule )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2294:1: ruleBareRule
            {
             before(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_2_34572);
            ruleBareRule();
            _fsp--;

             after(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_2_3_0()); 

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
    // $ANTLR end rule__Rule__BareRuleAssignment_2_3


    // $ANTLR start rule__Prefix__NameAssignment_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2303:1: rule__Prefix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2307:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2308:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2308:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2309:1: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_14603); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2318:1: rule__Prefix__UriAssignment_3 : ( RULE_IRI_TERMINAL ) ;
    public final void rule__Prefix__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2322:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2323:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2323:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2324:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_3_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__Prefix__UriAssignment_34634); 
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


    // $ANTLR start rule__ForwardRule__LeftTermsAssignment_0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2333:1: rule__ForwardRule__LeftTermsAssignment_0 : ( ruleTerm ) ;
    public final void rule__ForwardRule__LeftTermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2337:1: ( ( ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2338:1: ( ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2338:1: ( ruleTerm )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2339:1: ruleTerm
            {
             before(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__ForwardRule__LeftTermsAssignment_04665);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_0_0()); 

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
    // $ANTLR end rule__ForwardRule__LeftTermsAssignment_0


    // $ANTLR start rule__ForwardRule__LeftTermsAssignment_1_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2348:1: rule__ForwardRule__LeftTermsAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__ForwardRule__LeftTermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2352:1: ( ( ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2353:1: ( ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2353:1: ( ruleTerm )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2354:1: ruleTerm
            {
             before(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__ForwardRule__LeftTermsAssignment_1_14696);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end rule__ForwardRule__LeftTermsAssignment_1_1


    // $ANTLR start rule__ForwardRule__RightTermsAssignment_3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2363:1: rule__ForwardRule__RightTermsAssignment_3 : ( ruleTerm ) ;
    public final void rule__ForwardRule__RightTermsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2367:1: ( ( ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2368:1: ( ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2368:1: ( ruleTerm )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2369:1: ruleTerm
            {
             before(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__ForwardRule__RightTermsAssignment_34727);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_3_0()); 

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
    // $ANTLR end rule__ForwardRule__RightTermsAssignment_3


    // $ANTLR start rule__ForwardRule__RightTermsAssignment_4_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2378:1: rule__ForwardRule__RightTermsAssignment_4_1 : ( ruleTerm ) ;
    public final void rule__ForwardRule__RightTermsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2382:1: ( ( ruleTerm ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2383:1: ( ruleTerm )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2383:1: ( ruleTerm )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2384:1: ruleTerm
            {
             before(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__ForwardRule__RightTermsAssignment_4_14758);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__ForwardRule__RightTermsAssignment_4_1


    // $ANTLR start rule__Term__SubjectAssignment_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2393:1: rule__Term__SubjectAssignment_1 : ( ruleNode ) ;
    public final void rule__Term__SubjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2397:1: ( ( ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2398:1: ( ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2398:1: ( ruleNode )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2399:1: ruleNode
            {
             before(grammarAccess.getTermAccess().getSubjectNodeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Term__SubjectAssignment_14789);
            ruleNode();
            _fsp--;

             after(grammarAccess.getTermAccess().getSubjectNodeParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Term__SubjectAssignment_1


    // $ANTLR start rule__Term__PredicateAssignment_2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2408:1: rule__Term__PredicateAssignment_2 : ( ruleNode ) ;
    public final void rule__Term__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2412:1: ( ( ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2413:1: ( ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2413:1: ( ruleNode )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2414:1: ruleNode
            {
             before(grammarAccess.getTermAccess().getPredicateNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Term__PredicateAssignment_24820);
            ruleNode();
            _fsp--;

             after(grammarAccess.getTermAccess().getPredicateNodeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Term__PredicateAssignment_2


    // $ANTLR start rule__Term__ObjectAssignment_3
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2423:1: rule__Term__ObjectAssignment_3 : ( ruleNode ) ;
    public final void rule__Term__ObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2427:1: ( ( ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2428:1: ( ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2428:1: ( ruleNode )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2429:1: ruleNode
            {
             before(grammarAccess.getTermAccess().getObjectNodeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Term__ObjectAssignment_34851);
            ruleNode();
            _fsp--;

             after(grammarAccess.getTermAccess().getObjectNodeParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Term__ObjectAssignment_3


    // $ANTLR start rule__Function__NameAssignment_0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2438:1: rule__Function__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2442:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2443:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2443:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2444:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_04882); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Function__NameAssignment_0


    // $ANTLR start rule__Function__NodesAssignment_2
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2453:1: rule__Function__NodesAssignment_2 : ( ruleNode ) ;
    public final void rule__Function__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2457:1: ( ( ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2458:1: ( ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2458:1: ( ruleNode )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2459:1: ruleNode
            {
             before(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Function__NodesAssignment_24913);
            ruleNode();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Function__NodesAssignment_2


    // $ANTLR start rule__Function__NodesAssignment_3_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2468:1: rule__Function__NodesAssignment_3_1 : ( ruleNode ) ;
    public final void rule__Function__NodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2472:1: ( ( ruleNode ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2473:1: ( ruleNode )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2473:1: ( ruleNode )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2474:1: ruleNode
            {
             before(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Function__NodesAssignment_3_14944);
            ruleNode();
            _fsp--;

             after(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Function__NodesAssignment_3_1


    // $ANTLR start rule__URIRef__UriAssignment
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2483:1: rule__URIRef__UriAssignment : ( RULE_IRI_TERMINAL ) ;
    public final void rule__URIRef__UriAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2487:1: ( ( RULE_IRI_TERMINAL ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2488:1: ( RULE_IRI_TERMINAL )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2488:1: ( RULE_IRI_TERMINAL )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2489:1: RULE_IRI_TERMINAL
            {
             before(grammarAccess.getURIRefAccess().getUriIRI_TERMINALTerminalRuleCall_0()); 
            match(input,RULE_IRI_TERMINAL,FOLLOW_RULE_IRI_TERMINAL_in_rule__URIRef__UriAssignment4975); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2498:1: rule__QName__PrefixAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QName__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2502:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2503:1: ( ( RULE_ID ) )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2503:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2504:1: ( RULE_ID )
            {
             before(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0()); 
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2505:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2506:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getPrefixPrefixIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__PrefixAssignment_05010); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2517:1: rule__QName__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2521:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2522:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2522:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2523:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__NameAssignment_25045); 
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


    // $ANTLR start rule__Variable__NameAssignment_1
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2532:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2536:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2537:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2537:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2538:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_15076); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Variable__NameAssignment_1


    // $ANTLR start rule__StringValue__ValueAssignment_0
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2547:1: rule__StringValue__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2551:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2552:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2552:1: ( RULE_STRING )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2553:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment_05107); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2562:1: rule__StringValue__TagAssignment_1 : ( ruleRDFTag ) ;
    public final void rule__StringValue__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2566:1: ( ( ruleRDFTag ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2567:1: ( ruleRDFTag )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2567:1: ( ruleRDFTag )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2568:1: ruleRDFTag
            {
             before(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRDFTag_in_rule__StringValue__TagAssignment_15138);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2577:1: rule__IntegerValue__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntegerValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2581:1: ( ( RULE_INT ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2582:1: ( RULE_INT )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2582:1: ( RULE_INT )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2583:1: RULE_INT
            {
             before(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerValue__ValueAssignment_05169); 
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2592:1: rule__IntegerValue__TagAssignment_1 : ( ruleRDFTag ) ;
    public final void rule__IntegerValue__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2596:1: ( ( ruleRDFTag ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2597:1: ( ruleRDFTag )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2597:1: ( ruleRDFTag )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2598:1: ruleRDFTag
            {
             before(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRDFTag_in_rule__IntegerValue__TagAssignment_15200);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2607:1: rule__TypeTag__TypeAssignment_1 : ( ruleQName ) ;
    public final void rule__TypeTag__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2611:1: ( ( ruleQName ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2612:1: ( ruleQName )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2612:1: ( ruleQName )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2613:1: ruleQName
            {
             before(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__TypeTag__TypeAssignment_15231);
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
    // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2622:1: rule__LangTag__LangAssignment_1 : ( RULE_ID ) ;
    public final void rule__LangTag__LangAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2626:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2627:1: ( RULE_ID )
            {
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2627:1: ( RULE_ID )
            // ../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g:2628:1: RULE_ID
            {
             before(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LangTag__LangAssignment_15262); 
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


 

    public static final BitSet FOLLOW_ruleJenaRuleDocument_in_entryRuleJenaRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJenaRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__Group__0_in_ruleJenaRuleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0_in_rulePrefix214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_entryRuleBareRule241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBareRule248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardRule_in_ruleBareRule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardRule_in_entryRuleForwardRule300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardRule307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__0_in_ruleForwardRule333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_entryRuleURIRef542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURIRef549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URIRef__UriAssignment_in_ruleURIRef575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0_in_ruleStringValue815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_entryRuleRDFTag902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDFTag909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RDFTag__Alternatives_in_ruleRDFTag935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_entryRuleTypeTag967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTag974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__0_in_ruleTypeTag1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_entryRuleLangTag1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangTag1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__0_in_ruleLangTag1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BareRuleAssignment_0_in_rule__Rule__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__0_in_rule__Rule__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURIRef_in_rule__Node__Alternatives1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__Node__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Node__Alternatives1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Node__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Node__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Literal__Alternatives1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Literal__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTag_in_rule__RDFTag__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangTag_in_rule__RDFTag__Alternatives1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__Group__0__Impl_in_rule__JenaRuleDocument__Group__01374 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__Group__1_in_rule__JenaRuleDocument__Group__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__PrefixesAssignment_0_in_rule__JenaRuleDocument__Group__0__Impl1404 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__Group__1__Impl_in_rule__JenaRuleDocument__Group__11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JenaRuleDocument__RulesAssignment_1_in_rule__JenaRuleDocument__Group__1__Impl1462 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__01497 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__01500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Group_1__0__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__11559 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__2_in_rule__Rule__Group_1__11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BareRuleAssignment_1_1_in_rule__Rule__Group_1__1__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_1__2__Impl_in_rule__Rule__Group_1__21619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rule__Group_1__2__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__0__Impl_in_rule__Rule__Group_2__01684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__1_in_rule__Rule__Group_2__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Group_2__0__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__1__Impl_in_rule__Rule__Group_2__11746 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__2_in_rule__Rule__Group_2__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__RuleNameAssignment_2_1_in_rule__Rule__Group_2__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__2__Impl_in_rule__Rule__Group_2__21806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__3_in_rule__Rule__Group_2__21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rule__Group_2__2__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__3__Impl_in_rule__Rule__Group_2__31868 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__4_in_rule__Rule__Group_2__31871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__BareRuleAssignment_2_3_in_rule__Rule__Group_2__3__Impl1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__4__Impl_in_rule__Rule__Group_2__41928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rule__Group_2__4__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__01997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Prefix__Group__0__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__12059 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2_in_rule__Prefix__Group__12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__NameAssignment_1_in_rule__Prefix__Group__1__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__2__Impl_in_rule__Prefix__Group__22119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Prefix__Group__3_in_rule__Prefix__Group__22122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Prefix__Group__2__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__3__Impl_in_rule__Prefix__Group__32181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Prefix__Group__4_in_rule__Prefix__Group__32184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__UriAssignment_3_in_rule__Prefix__Group__3__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__4__Impl_in_rule__Prefix__Group__42241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Prefix__Group__4__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__0__Impl_in_rule__ForwardRule__Group__02310 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__1_in_rule__ForwardRule__Group__02313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__LeftTermsAssignment_0_in_rule__ForwardRule__Group__0__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__1__Impl_in_rule__ForwardRule__Group__12370 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__2_in_rule__ForwardRule__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_1__0_in_rule__ForwardRule__Group__1__Impl2400 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__2__Impl_in_rule__ForwardRule__Group__22431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__3_in_rule__ForwardRule__Group__22434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ForwardRule__Group__2__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__3__Impl_in_rule__ForwardRule__Group__32493 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__4_in_rule__ForwardRule__Group__32496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__RightTermsAssignment_3_in_rule__ForwardRule__Group__3__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group__4__Impl_in_rule__ForwardRule__Group__42553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_4__0_in_rule__ForwardRule__Group__4__Impl2580 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_1__0__Impl_in_rule__ForwardRule__Group_1__02621 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_1__1_in_rule__ForwardRule__Group_1__02624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForwardRule__Group_1__0__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_1__1__Impl_in_rule__ForwardRule__Group_1__12683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__LeftTermsAssignment_1_1_in_rule__ForwardRule__Group_1__1__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_4__0__Impl_in_rule__ForwardRule__Group_4__02744 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_4__1_in_rule__ForwardRule__Group_4__02747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForwardRule__Group_4__0__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__Group_4__1__Impl_in_rule__ForwardRule__Group_4__12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardRule__RightTermsAssignment_4_1_in_rule__ForwardRule__Group_4__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__02867 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__02870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group__0__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__12929 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__SubjectAssignment_1_in_rule__Term__Group__1__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__22989 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_rule__Term__Group__3_in_rule__Term__Group__22992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__PredicateAssignment_2_in_rule__Term__Group__2__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__33049 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Term__Group__4_in_rule__Term__Group__33052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ObjectAssignment_3_in_rule__Term__Group__3__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__43109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Term__Group__4__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_0_in_rule__Function__Group__0__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13238 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__1__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23300 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__23303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NodesAssignment_2_in_rule__Function__Group__2__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__33360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__33363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0_in_rule__Function__Group__3__Impl3390 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__43421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__4__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__0__Impl_in_rule__Function__Group_3__03490 = new BitSet(new long[]{0x00000000002040F0L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1_in_rule__Function__Group_3__03493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group_3__0__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group_3__1__Impl_in_rule__Function__Group_3__13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NodesAssignment_3_1_in_rule__Function__Group_3__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__PrefixAssignment_0_in_rule__QName__Group__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QName__Group__2_in_rule__QName__Group__13677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QName__Group__1__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__2__Impl_in_rule__QName__Group__23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__NameAssignment_2_in_rule__QName__Group__2__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Variable__Group__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03922 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_0_in_rule__StringValue__Group__0__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__TagAssignment_1_in_rule__StringValue__Group__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__04044 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_0_in_rule__IntegerValue__Group__0__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__TagAssignment_1_in_rule__IntegerValue__Group__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__0__Impl_in_rule__TypeTag__Group__04166 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__1_in_rule__TypeTag__Group__04169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeTag__Group__0__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__Group__1__Impl_in_rule__TypeTag__Group__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeTag__TypeAssignment_1_in_rule__TypeTag__Group__1__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__0__Impl_in_rule__LangTag__Group__04289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LangTag__Group__1_in_rule__LangTag__Group__04292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LangTag__Group__0__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__Group__1__Impl_in_rule__LangTag__Group__14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LangTag__LangAssignment_1_in_rule__LangTag__Group__1__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__JenaRuleDocument__PrefixesAssignment_04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__JenaRuleDocument__RulesAssignment_14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_04479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_1_14510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__RuleNameAssignment_2_14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBareRule_in_rule__Rule__BareRuleAssignment_2_34572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prefix__NameAssignment_14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__Prefix__UriAssignment_34634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__ForwardRule__LeftTermsAssignment_04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__ForwardRule__LeftTermsAssignment_1_14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__ForwardRule__RightTermsAssignment_34727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__ForwardRule__RightTermsAssignment_4_14758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Term__SubjectAssignment_14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Term__PredicateAssignment_24820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Term__ObjectAssignment_34851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_04882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Function__NodesAssignment_24913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Function__NodesAssignment_3_14944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IRI_TERMINAL_in_rule__URIRef__UriAssignment4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__PrefixAssignment_05010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__NameAssignment_25045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment_05107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_rule__StringValue__TagAssignment_15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerValue__ValueAssignment_05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDFTag_in_rule__IntegerValue__TagAssignment_15200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__TypeTag__TypeAssignment_15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LangTag__LangAssignment_15262 = new BitSet(new long[]{0x0000000000000002L});

}