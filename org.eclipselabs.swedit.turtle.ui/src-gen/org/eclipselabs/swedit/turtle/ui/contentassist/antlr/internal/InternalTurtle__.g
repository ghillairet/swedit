lexer grammar InternalTurtle;
@header {
package org.eclipselabs.swedit.turtle.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '@prefix' ;
T13 : ':' ;
T14 : '.' ;
T15 : '@base' ;
T16 : ';' ;
T17 : ',' ;
T18 : '(' ;
T19 : ')' ;
T20 : '^^' ;
T21 : '@' ;
T22 : '_:' ;
T23 : '[' ;
T24 : ']' ;
T25 : 'a' ;
T26 : '[]' ;

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2940
RULE_IRI_TERMINAL : '<' ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|':'|'.'|'#'|'?'|'@'|'$'|'&'|'=')* '>';

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2942
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2944
RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9'|'/'|'.'|'#'|'?')*;

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2946
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2948
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2950
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2952
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g" 2954
RULE_ANY_OTHER : .;


