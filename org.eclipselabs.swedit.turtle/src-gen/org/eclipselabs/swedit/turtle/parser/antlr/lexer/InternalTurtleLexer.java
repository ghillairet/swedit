package org.eclipselabs.swedit.turtle.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleLexer extends Lexer {
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
    public static final int Tokens=27;
    public static final int RULE_SL_COMMENT=24;
    public static final int KEYWORD_12=7;
    public static final int EOF=-1;
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
    public InternalTurtleLexer() {;} 
    public InternalTurtleLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g"; }

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:19:12: ( '@' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:19:14: '@' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            match('@'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:21:12: ( '@' ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:21:14: '@' ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:23:12: ( '[' ']' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:23:14: '[' ']'
            {
            match('['); 
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:25:12: ( '^' '^' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:25:14: '^' '^'
            {
            match('^'); 
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:27:12: ( '_' ':' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:27:14: '_' ':'
            {
            match('_'); 
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:29:11: ( '(' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:29:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:31:11: ( ')' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:31:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:33:11: ( ',' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:33:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:35:11: ( '.' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:35:13: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:37:11: ( ':' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:37:13: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:39:11: ( ';' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:39:13: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:41:11: ( '@' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:41:13: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:43:11: ( '[' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:43:13: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:45:11: ( ']' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:45:13: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:47:12: ( ( 'A' | 'a' ) )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:47:14: ( 'A' | 'a' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start RULE_IRI_TERMINAL
    public final void mRULE_IRI_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IRI_TERMINAL;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:51:19: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:51:21: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>'
            {
            match('<'); 
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:51:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='-' && LA1_0<=':')||LA1_0=='='||(LA1_0>='?' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_IRI_TERMINAL

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:53:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:53:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:53:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:53:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:53:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:55:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )* )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:55:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:55:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='-' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:
            	    {
            	    if ( input.LA(1)=='#'||(input.LA(1)>='-' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:57:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:57:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:57:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:57:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:59:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:59:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:59:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:59:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:61:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:63:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:63:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:63:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:65:16: ( . )
            // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:65:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:8: ( KEYWORD_15 | KEYWORD_14 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=23;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='@') ) {
            switch ( input.LA(2) ) {
            case 'B':
            case 'b':
                {
                alt10=2;
                }
                break;
            case 'P':
            case 'p':
                {
                alt10=1;
                }
                break;
            default:
                alt10=12;}

        }
        else if ( (LA10_0=='[') ) {
            int LA10_2 = input.LA(2);

            if ( (LA10_2==']') ) {
                alt10=3;
            }
            else {
                alt10=13;}
        }
        else if ( (LA10_0=='^') ) {
            int LA10_3 = input.LA(2);

            if ( (LA10_3=='^') ) {
                alt10=4;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='_') ) {
            int LA10_4 = input.LA(2);

            if ( (LA10_4==':') ) {
                alt10=5;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='(') ) {
            alt10=6;
        }
        else if ( (LA10_0==')') ) {
            alt10=7;
        }
        else if ( (LA10_0==',') ) {
            alt10=8;
        }
        else if ( (LA10_0=='.') ) {
            alt10=9;
        }
        else if ( (LA10_0==':') ) {
            alt10=10;
        }
        else if ( (LA10_0==';') ) {
            alt10=11;
        }
        else if ( (LA10_0==']') ) {
            alt10=14;
        }
        else if ( (LA10_0=='A'||LA10_0=='a') ) {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='#'||(LA10_12>='-' && LA10_12<='9')||LA10_12=='?'||(LA10_12>='A' && LA10_12<='Z')||LA10_12=='_'||(LA10_12>='a' && LA10_12<='z')) ) {
                alt10=18;
            }
            else {
                alt10=15;}
        }
        else if ( (LA10_0=='<') ) {
            int LA10_13 = input.LA(2);

            if ( ((LA10_13>='#' && LA10_13<='$')||LA10_13=='&'||(LA10_13>='-' && LA10_13<=':')||(LA10_13>='=' && LA10_13<='Z')||LA10_13=='_'||(LA10_13>='a' && LA10_13<='z')) ) {
                alt10=16;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='\"') ) {
            int LA10_14 = input.LA(2);

            if ( ((LA10_14>='\u0000' && LA10_14<='\uFFFE')) ) {
                alt10=17;
            }
            else {
                alt10=23;}
        }
        else if ( ((LA10_0>='B' && LA10_0<='Z')||(LA10_0>='b' && LA10_0<='z')) ) {
            alt10=18;
        }
        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
            alt10=19;
        }
        else if ( (LA10_0=='/') ) {
            int LA10_17 = input.LA(2);

            if ( (LA10_17=='*') ) {
                alt10=20;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='#') ) {
            alt10=21;
        }
        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            alt10=22;
        }
        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='$' && LA10_0<='\'')||(LA10_0>='*' && LA10_0<='+')||LA10_0=='-'||(LA10_0>='=' && LA10_0<='?')||LA10_0=='\\'||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFE')) ) {
            alt10=23;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( KEYWORD_15 | KEYWORD_14 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:10: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:21: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:32: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:43: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:54: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:65: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:75: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:85: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:95: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:105: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:115: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:125: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:135: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:145: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:155: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:166: RULE_IRI_TERMINAL
                {
                mRULE_IRI_TERMINAL(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:184: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:204: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.swedit.turtle/src-gen/org/eclipselabs/swedit/turtle/parser/antlr/lexer/InternalTurtle.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}