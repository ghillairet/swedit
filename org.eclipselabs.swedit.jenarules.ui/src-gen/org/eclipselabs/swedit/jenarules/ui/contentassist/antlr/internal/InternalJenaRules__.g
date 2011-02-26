lexer grammar InternalJenaRules;
@header {
package org.eclipselabs.swedit.jenarules.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '[' ;
T13 : ']' ;
T14 : ':' ;
T15 : '@prefix' ;
T16 : '.' ;
T17 : '->' ;
T18 : ',' ;
T19 : '(' ;
T20 : ')' ;
T21 : '?' ;
T22 : '^^' ;
T23 : '@' ;

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2638
RULE_IRI_TERMINAL : '<' ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|':'|'.'|'#'|'?'|'@'|'$'|'&'|'=')* '>';

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2640
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2642
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|'.'|'#'|'?')*;

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2644
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2646
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2648
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2650
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.swedit.jenarules.ui/src-gen/org/eclipselabs/swedit/jenarules/ui/contentassist/antlr/internal/InternalJenaRules.g" 2652
RULE_ANY_OTHER : .;


