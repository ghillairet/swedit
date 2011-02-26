lexer grammar InternalJenaRules;
@header {
package org.eclipselabs.swedit.jenarules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '[' ;
T13 : ']' ;
T14 : ':' ;
T15 : '@prefix' ;
T16 : '.' ;
T17 : ',' ;
T18 : '->' ;
T19 : '(' ;
T20 : ')' ;
T21 : '?' ;
T22 : '^^' ;
T23 : '@' ;

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1329
RULE_IRI_TERMINAL : '<' ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|':'|'.'|'#'|'?'|'@'|'$'|'&'|'=')* '>';

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1331
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1333
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|'.'|'#'|'?')*;

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1335
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1337
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1339
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1341
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g" 1343
RULE_ANY_OTHER : .;


