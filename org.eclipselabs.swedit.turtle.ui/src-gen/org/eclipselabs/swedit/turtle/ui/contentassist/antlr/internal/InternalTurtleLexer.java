package org.eclipselabs.swedit.turtle.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTurtleLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=27;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=6;
    public static final int RULE_IRI_TERMINAL=5;
    public static final int RULE_INT=7;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalTurtleLexer() {;} 
    public InternalTurtleLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:10:5: ( '@prefix' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:10:7: '@prefix'
            {
            match("@prefix"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:11:5: ( ':' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:11:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:12:5: ( '.' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:12:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:13:5: ( '@base' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:13:7: '@base'
            {
            match("@base"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:14:5: ( ';' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:14:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:15:5: ( ',' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:15:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:16:5: ( '(' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:17:5: ( ')' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:17:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:18:5: ( '^^' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:18:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:19:5: ( '@' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:19:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:20:5: ( '_:' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:20:7: '_:'
            {
            match("_:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:21:5: ( '[' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:21:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:22:5: ( ']' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:22:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:23:5: ( 'a' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:23:7: 'a'
            {
            match('a'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:24:5: ( '[]' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:24:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start RULE_IRI_TERMINAL
    public final void mRULE_IRI_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IRI_TERMINAL;
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2940:19: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2940:21: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>'
            {
            match('<'); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2940:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='-' && LA1_0<=':')||LA1_0=='='||(LA1_0>='?' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2942:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2942:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2942:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2942:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2942:61: ~ ( ( '\\\\' | '\"' ) )
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2944:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )* )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2944:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2944:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='-' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2946:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2946:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2946:12: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2946:13: '0' .. '9'
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2948:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2948:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2948:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2948:52: .
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2950:40: '\\r'
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2952:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2952:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2952:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:
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
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2954:16: ( . )
            // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:2954:18: .
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
        // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=23;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='@') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                alt10=4;
                }
                break;
            case 'p':
                {
                alt10=1;
                }
                break;
            default:
                alt10=10;}

        }
        else if ( (LA10_0==':') ) {
            alt10=2;
        }
        else if ( (LA10_0=='.') ) {
            alt10=3;
        }
        else if ( (LA10_0==';') ) {
            alt10=5;
        }
        else if ( (LA10_0==',') ) {
            alt10=6;
        }
        else if ( (LA10_0=='(') ) {
            alt10=7;
        }
        else if ( (LA10_0==')') ) {
            alt10=8;
        }
        else if ( (LA10_0=='^') ) {
            int LA10_8 = input.LA(2);

            if ( (LA10_8=='^') ) {
                alt10=9;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='_') ) {
            int LA10_9 = input.LA(2);

            if ( (LA10_9==':') ) {
                alt10=11;
            }
            else {
                alt10=23;}
        }
        else if ( (LA10_0=='[') ) {
            int LA10_10 = input.LA(2);

            if ( (LA10_10==']') ) {
                alt10=15;
            }
            else {
                alt10=12;}
        }
        else if ( (LA10_0==']') ) {
            alt10=13;
        }
        else if ( (LA10_0=='a') ) {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='#'||(LA10_12>='-' && LA10_12<='9')||LA10_12=='?'||(LA10_12>='A' && LA10_12<='Z')||LA10_12=='_'||(LA10_12>='a' && LA10_12<='z')) ) {
                alt10=18;
            }
            else {
                alt10=14;}
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
        else if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='b' && LA10_0<='z')) ) {
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
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:70: RULE_IRI_TERMINAL
                {
                mRULE_IRI_TERMINAL(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:88: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:100: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:108: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:117: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:133: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:149: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.swedit.turtle.ui/src-gen/org/eclipselabs/swedit/turtle/ui/contentassist/antlr/internal/InternalTurtle.g:1:157: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}