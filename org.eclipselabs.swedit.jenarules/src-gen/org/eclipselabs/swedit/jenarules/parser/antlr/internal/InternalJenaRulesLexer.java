package org.eclipselabs.swedit.jenarules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJenaRulesLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int Tokens=24;
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
    public InternalJenaRulesLexer() {;} 
    public InternalJenaRulesLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:10:5: ( '[' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:10:7: '['
            {
            match('['); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:11:5: ( ']' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:11:7: ']'
            {
            match(']'); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:12:5: ( ':' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:12:7: ':'
            {
            match(':'); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:13:5: ( '@prefix' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:13:7: '@prefix'
            {
            match("@prefix"); 


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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:14:5: ( '.' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:14:7: '.'
            {
            match('.'); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:15:5: ( ',' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:15:7: ','
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:16:5: ( '->' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:16:7: '->'
            {
            match("->"); 


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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:17:5: ( '(' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:17:7: '('
            {
            match('('); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:18:5: ( ')' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:18:7: ')'
            {
            match(')'); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:19:5: ( '?' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:19:7: '?'
            {
            match('?'); 

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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:20:5: ( '^^' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:20:7: '^^'
            {
            match("^^"); 


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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:21:5: ( '@' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:21:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start RULE_IRI_TERMINAL
    public final void mRULE_IRI_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_IRI_TERMINAL;
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1329:19: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1329:21: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )* '>'
            {
            match('<'); 
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1329:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | ':' | '.' | '#' | '?' | '@' | '$' | '&' | '=' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='-' && LA1_0<=':')||LA1_0=='='||(LA1_0>='?' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1331:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1331:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1331:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1331:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1331:61: ~ ( ( '\\\\' | '\"' ) )
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1333:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )* )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1333:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1333:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '#' | '?' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||(LA3_0>='-' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1335:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1335:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1335:12: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1335:13: '0' .. '9'
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1337:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1337:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1337:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1337:52: .
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1339:40: '\\r'
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1341:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1341:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:
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
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1343:16: ( . )
            // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1343:18: .
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
        // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=20;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='[') ) {
            alt10=1;
        }
        else if ( (LA10_0==']') ) {
            alt10=2;
        }
        else if ( (LA10_0==':') ) {
            alt10=3;
        }
        else if ( (LA10_0=='@') ) {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='p') ) {
                alt10=4;
            }
            else {
                alt10=12;}
        }
        else if ( (LA10_0=='.') ) {
            alt10=5;
        }
        else if ( (LA10_0==',') ) {
            alt10=6;
        }
        else if ( (LA10_0=='-') ) {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='>') ) {
                alt10=7;
            }
            else {
                alt10=20;}
        }
        else if ( (LA10_0=='(') ) {
            alt10=8;
        }
        else if ( (LA10_0==')') ) {
            alt10=9;
        }
        else if ( (LA10_0=='?') ) {
            alt10=10;
        }
        else if ( (LA10_0=='^') ) {
            int LA10_11 = input.LA(2);

            if ( (LA10_11=='^') ) {
                alt10=11;
            }
            else {
                alt10=20;}
        }
        else if ( (LA10_0=='<') ) {
            int LA10_12 = input.LA(2);

            if ( ((LA10_12>='#' && LA10_12<='$')||LA10_12=='&'||(LA10_12>='-' && LA10_12<=':')||(LA10_12>='=' && LA10_12<='Z')||LA10_12=='_'||(LA10_12>='a' && LA10_12<='z')) ) {
                alt10=13;
            }
            else {
                alt10=20;}
        }
        else if ( (LA10_0=='\"') ) {
            int LA10_13 = input.LA(2);

            if ( ((LA10_13>='\u0000' && LA10_13<='\uFFFE')) ) {
                alt10=14;
            }
            else {
                alt10=20;}
        }
        else if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
            alt10=15;
        }
        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
            alt10=16;
        }
        else if ( (LA10_0=='/') ) {
            int LA10_16 = input.LA(2);

            if ( (LA10_16=='*') ) {
                alt10=17;
            }
            else {
                alt10=20;}
        }
        else if ( (LA10_0=='#') ) {
            alt10=18;
        }
        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            alt10=19;
        }
        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='$' && LA10_0<='\'')||(LA10_0>='*' && LA10_0<='+')||LA10_0==';'||(LA10_0>='=' && LA10_0<='>')||LA10_0=='\\'||(LA10_0>='_' && LA10_0<='`')||(LA10_0>='{' && LA10_0<='\uFFFE')) ) {
            alt10=20;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | RULE_IRI_TERMINAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:58: RULE_IRI_TERMINAL
                {
                mRULE_IRI_TERMINAL(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:76: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:88: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:96: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.swedit.jenarules/src-gen/org/eclipselabs/swedit/jenarules/parser/antlr/internal/InternalJenaRules.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}