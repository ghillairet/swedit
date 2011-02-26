/*
* generated by Xtext
*/
grammar InternalJenaRules;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipselabs.swedit.jenarules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleJenaRuleDocument
entryRuleJenaRuleDocument returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getJenaRuleDocumentRule(), currentNode); }
	 iv_ruleJenaRuleDocument=ruleJenaRuleDocument 
	 { $current=$iv_ruleJenaRuleDocument.current; } 
	 EOF 
;

// Rule JenaRuleDocument
ruleJenaRuleDocument returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getJenaRuleDocumentAccess().getPrefixesPrefixParserRuleCall_0_0(), currentNode); 
	    }
		lv_prefixes_0_0=rulePrefix		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getJenaRuleDocumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"prefixes",
	        		lv_prefixes_0_0, 
	        		"Prefix", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getJenaRuleDocumentAccess().getRulesRuleParserRuleCall_1_0(), currentNode); 
	    }
		lv_rules_1_0=ruleRule		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getJenaRuleDocumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"rules",
	        		lv_rules_1_0, 
	        		"Rule", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_0_0(), currentNode); 
	    }
		lv_bareRule_0_0=ruleBareRule		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"bareRule",
	        		lv_bareRule_0_0, 
	        		"BareRule", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(	'[' 
    {
        createLeafNode(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_1_1_0(), currentNode); 
	    }
		lv_bareRule_2_0=ruleBareRule		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"bareRule",
	        		lv_bareRule_2_0, 
	        		"BareRule", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	']' 
    {
        createLeafNode(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_1_2(), null); 
    }
)
    |(	'[' 
    {
        createLeafNode(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_2_0(), null); 
    }
(
(
		lv_ruleName_5_0=RULE_ID
		{
			createLeafNode(grammarAccess.getRuleAccess().getRuleNameIDTerminalRuleCall_2_1_0(), "ruleName"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"ruleName",
	        		lv_ruleName_5_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	':' 
    {
        createLeafNode(grammarAccess.getRuleAccess().getColonKeyword_2_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getBareRuleBareRuleParserRuleCall_2_3_0(), currentNode); 
	    }
		lv_bareRule_7_0=ruleBareRule		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"bareRule",
	        		lv_bareRule_7_0, 
	        		"BareRule", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	']' 
    {
        createLeafNode(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_2_4(), null); 
    }
))
;





// Entry rule entryRulePrefix
entryRulePrefix returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); }
	 iv_rulePrefix=rulePrefix 
	 { $current=$iv_rulePrefix.current; } 
	 EOF 
;

// Rule Prefix
rulePrefix returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'@prefix' 
    {
        createLeafNode(grammarAccess.getPrefixAccess().getPrefixKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	':' 
    {
        createLeafNode(grammarAccess.getPrefixAccess().getColonKeyword_2(), null); 
    }
(
(
		lv_uri_3_0=RULE_IRI_TERMINAL
		{
			createLeafNode(grammarAccess.getPrefixAccess().getUriIRI_TERMINALTerminalRuleCall_3_0(), "uri"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"uri",
	        		lv_uri_3_0, 
	        		"IRI_TERMINAL", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'.' 
    {
        createLeafNode(grammarAccess.getPrefixAccess().getFullStopKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleBareRule
entryRuleBareRule returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBareRuleRule(), currentNode); }
	 iv_ruleBareRule=ruleBareRule 
	 { $current=$iv_ruleBareRule.current; } 
	 EOF 
;

// Rule BareRule
ruleBareRule returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:

    { 
        currentNode=createCompositeNode(grammarAccess.getBareRuleAccess().getForwardRuleParserRuleCall(), currentNode); 
    }
    this_ForwardRule_0=ruleForwardRule
    { 
        $current = $this_ForwardRule_0.current; 
        currentNode = currentNode.getParent();
    }

;





// Entry rule entryRuleForwardRule
entryRuleForwardRule returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getForwardRuleRule(), currentNode); }
	 iv_ruleForwardRule=ruleForwardRule 
	 { $current=$iv_ruleForwardRule.current; } 
	 EOF 
;

// Rule ForwardRule
ruleForwardRule returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_0_0(), currentNode); 
	    }
		lv_leftTerms_0_0=ruleTerm		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"leftTerms",
	        		lv_leftTerms_0_0, 
	        		"Term", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getForwardRuleAccess().getCommaKeyword_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getLeftTermsTermParserRuleCall_1_1_0(), currentNode); 
	    }
		lv_leftTerms_2_0=ruleTerm		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"leftTerms",
	        		lv_leftTerms_2_0, 
	        		"Term", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	'->' 
    {
        createLeafNode(grammarAccess.getForwardRuleAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_3_0(), currentNode); 
	    }
		lv_rightTerms_4_0=ruleTerm		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"rightTerms",
	        		lv_rightTerms_4_0, 
	        		"Term", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getForwardRuleAccess().getCommaKeyword_4_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getForwardRuleAccess().getRightTermsTermParserRuleCall_4_1_0(), currentNode); 
	    }
		lv_rightTerms_6_0=ruleTerm		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getForwardRuleRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"rightTerms",
	        		lv_rightTerms_6_0, 
	        		"Term", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)
;





// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); }
	 iv_ruleTerm=ruleTerm 
	 { $current=$iv_ruleTerm.current; } 
	 EOF 
;

// Rule Term
ruleTerm returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'(' 
    {
        createLeafNode(grammarAccess.getTermAccess().getLeftParenthesisKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getSubjectNodeParserRuleCall_1_0(), currentNode); 
	    }
		lv_subject_1_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"subject",
	        		lv_subject_1_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getPredicateNodeParserRuleCall_2_0(), currentNode); 
	    }
		lv_predicate_2_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"predicate",
	        		lv_predicate_2_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getObjectNodeParserRuleCall_3_0(), currentNode); 
	    }
		lv_object_3_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"object",
	        		lv_object_3_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	')' 
    {
        createLeafNode(grammarAccess.getTermAccess().getRightParenthesisKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'(' 
    {
        createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_2_0(), currentNode); 
	    }
		lv_nodes_2_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"nodes",
	        		lv_nodes_2_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getFunctionAccess().getCommaKeyword_3_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFunctionAccess().getNodesNodeParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_nodes_4_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"nodes",
	        		lv_nodes_4_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	')' 
    {
        createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4(), null); 
    }
)
;







// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); }
	 iv_ruleNode=ruleNode 
	 { $current=$iv_ruleNode.current; } 
	 EOF 
;

// Rule Node
ruleNode returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getURIRefParserRuleCall_0(), currentNode); 
    }
    this_URIRef_0=ruleURIRef
    { 
        $current = $this_URIRef_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getQNameParserRuleCall_1(), currentNode); 
    }
    this_QName_1=ruleQName
    { 
        $current = $this_QName_1.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getVariableParserRuleCall_2(), currentNode); 
    }
    this_Variable_2=ruleVariable
    { 
        $current = $this_Variable_2.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getLiteralParserRuleCall_3(), currentNode); 
    }
    this_Literal_3=ruleLiteral
    { 
        $current = $this_Literal_3.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getFunctionParserRuleCall_4(), currentNode); 
    }
    this_Function_4=ruleFunction
    { 
        $current = $this_Function_4.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleURIRef
entryRuleURIRef returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getURIRefRule(), currentNode); }
	 iv_ruleURIRef=ruleURIRef 
	 { $current=$iv_ruleURIRef.current; } 
	 EOF 
;

// Rule URIRef
ruleURIRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_uri_0_0=RULE_IRI_TERMINAL
		{
			createLeafNode(grammarAccess.getURIRefAccess().getUriIRI_TERMINALTerminalRuleCall_0(), "uri"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getURIRefRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"uri",
	        		lv_uri_0_0, 
	        		"IRI_TERMINAL", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





// Entry rule entryRuleQName
entryRuleQName returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getQNameRule(), currentNode); }
	 iv_ruleQName=ruleQName 
	 { $current=$iv_ruleQName.current; } 
	 EOF 
;

// Rule QName
ruleQName returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getQNameRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getQNameAccess().getPrefixPrefixCrossReference_0_0(), "prefix"); 
	}

)
)?	':' 
    {
        createLeafNode(grammarAccess.getQNameAccess().getColonKeyword_1(), null); 
    }
(
(
		lv_name_2_0=RULE_ID
		{
			createLeafNode(grammarAccess.getQNameAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getQNameRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_2_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'?' 
    {
        createLeafNode(grammarAccess.getVariableAccess().getQuestionMarkKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); }
	 iv_ruleLiteral=ruleLiteral 
	 { $current=$iv_ruleLiteral.current; } 
	 EOF 
;

// Rule Literal
ruleLiteral returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getStringValueParserRuleCall_0(), currentNode); 
    }
    this_StringValue_0=ruleStringValue
    { 
        $current = $this_StringValue_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getIntegerValueParserRuleCall_1(), currentNode); 
    }
    this_IntegerValue_1=ruleIntegerValue
    { 
        $current = $this_IntegerValue_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); }
	 iv_ruleStringValue=ruleStringValue 
	 { $current=$iv_ruleStringValue.current; } 
	 EOF 
;

// Rule StringValue
ruleStringValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_value_0_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_0_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getStringValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
	    }
		lv_tag_1_0=ruleRDFTag		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"tag",
	        		lv_tag_1_0, 
	        		"RDFTag", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)?)
;





// Entry rule entryRuleIntegerValue
entryRuleIntegerValue returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getIntegerValueRule(), currentNode); }
	 iv_ruleIntegerValue=ruleIntegerValue 
	 { $current=$iv_ruleIntegerValue.current; } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_value_0_0=RULE_INT
		{
			createLeafNode(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_0_0, 
	        		"INT", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getIntegerValueAccess().getTagRDFTagParserRuleCall_1_0(), currentNode); 
	    }
		lv_tag_1_0=ruleRDFTag		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getIntegerValueRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"tag",
	        		lv_tag_1_0, 
	        		"RDFTag", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)?)
;





// Entry rule entryRuleRDFTag
entryRuleRDFTag returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRDFTagRule(), currentNode); }
	 iv_ruleRDFTag=ruleRDFTag 
	 { $current=$iv_ruleRDFTag.current; } 
	 EOF 
;

// Rule RDFTag
ruleRDFTag returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getTypeTagParserRuleCall_0(), currentNode); 
    }
    this_TypeTag_0=ruleTypeTag
    { 
        $current = $this_TypeTag_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getRDFTagAccess().getLangTagParserRuleCall_1(), currentNode); 
    }
    this_LangTag_1=ruleLangTag
    { 
        $current = $this_LangTag_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleTypeTag
entryRuleTypeTag returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
	}
	:
	{ currentNode = createCompositeNode(grammarAccess.getTypeTagRule(), currentNode); }
	 iv_ruleTypeTag=ruleTypeTag 
	 { $current=$iv_ruleTypeTag.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule TypeTag
ruleTypeTag returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'^^' 
    {
        createLeafNode(grammarAccess.getTypeTagAccess().getCircumflexAccentCircumflexAccentKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTypeTagAccess().getTypeQNameParserRuleCall_1_0(), currentNode); 
	    }
		lv_type_1_0=ruleQName		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeTagRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_1_0, 
	        		"QName", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleLangTag
entryRuleLangTag returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
	}
	:
	{ currentNode = createCompositeNode(grammarAccess.getLangTagRule(), currentNode); }
	 iv_ruleLangTag=ruleLangTag 
	 { $current=$iv_ruleLangTag.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule LangTag
ruleLangTag returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'@' 
    {
        createLeafNode(grammarAccess.getLangTagAccess().getCommercialAtKeyword_0(), null); 
    }
(
(
		lv_lang_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getLangTagAccess().getLangIDTerminalRuleCall_1_0(), "lang"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLangTagRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"lang",
	        		lv_lang_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;
finally {
	myHiddenTokenState.restore();
}





RULE_IRI_TERMINAL : '<' ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|':'|'.'|'#'|'?'|'@'|'$'|'&'|'=')* '>';

RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|'.'|'#'|'?')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


