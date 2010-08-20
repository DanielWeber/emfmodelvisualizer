// $ANTLR 3.0 L:\\jax-ws\\xtext.core\\bin\\XText.g 2008-02-07 15:56:13

package org.openarchitectureware.xtext.parser.antlr; 

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class XTextLexer extends Lexer {
    public static final int T21=21;
    public static final int T14=14;
    public static final int T29=29;
    public static final int T22=22;
    public static final int T11=11;
    public static final int STRING=5;
    public static final int XTEXT_ML_COMMENT=7;
    public static final int T12=12;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int XTEXT_SL_COMMENT=8;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int XTEXT_INT=6;
    public static final int T17=17;
    public static final int Tokens=31;
    public static final int XTEXT_WS=9;
    public static final int T16=16;
    public static final int T27=27;
    public static final int T30=30;
    public static final int T24=24;
    public static final int T19=19;
    public static final int ID=4;
    
       private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}
    	
    	public String getErrorMessage(RecognitionException e, String[] tokenNames) { 
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg; 
    	} 

    public XTextLexer() {;} 
    public XTextLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "L:\\jax-ws\\xtext.core\\bin\\XText.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:30:7: ( 'grammar_name' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:30:7: 'grammar_name'
            {
            match("grammar_name"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:31:7: ( 'grammar_nsURI' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:31:7: 'grammar_nsURI'
            {
            match("grammar_nsURI"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:32:7: ( 'commentsDisabled' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:32:7: 'commentsDisabled'
            {
            match("commentsDisabled"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:33:7: ( 'importGrammar' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:33:7: 'importGrammar'
            {
            match("importGrammar"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:34:7: ( 'Native' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:34:7: 'Native'
            {
            match("Native"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:35:7: ( ':' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:35:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:36:7: ( ';' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:36:7: ';'
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
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:37:7: ( 'String' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:37:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:38:7: ( 'Enum' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:38:7: 'Enum'
            {
            match("Enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:39:7: ( '|' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:39:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:40:7: ( '=' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:40:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:41:7: ( '(' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:41:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:42:7: ( ')' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:42:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:43:7: ( 'URI' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:43:7: 'URI'
            {
            match("URI"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:44:7: ( '[' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:44:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:45:7: ( ']' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:45:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:46:7: ( '?=' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:46:7: '?='
            {
            match("?="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:47:7: ( '+=' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:47:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:48:7: ( '?' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:48:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:49:7: ( '*' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:49:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:50:7: ( '+' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:50:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start STRING
    public void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:299:5: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("298:1: STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:299:5: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:299:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:299:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:299:55: ~ ( '\\\\' | '\"' )
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
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:300:5: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:300:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:300:12: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:300:56: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start ID
    public void mID() throws RecognitionException {
        try {
            int _type = ID;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:303:2: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:303:2: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:303:2: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:303:3: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:303:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start XTEXT_INT
    public void mXTEXT_INT() throws RecognitionException {
        try {
            int _type = XTEXT_INT;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:307:2: ( ( '0' .. '9' )+ )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:307:2: ( '0' .. '9' )+
            {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:307:2: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:307:3: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XTEXT_INT

    // $ANTLR start XTEXT_ML_COMMENT
    public void mXTEXT_ML_COMMENT() throws RecognitionException {
        try {
            int _type = XTEXT_ML_COMMENT;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:311:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:311:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:311:14: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:311:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XTEXT_ML_COMMENT

    // $ANTLR start XTEXT_SL_COMMENT
    public void mXTEXT_SL_COMMENT() throws RecognitionException {
        try {
            int _type = XTEXT_SL_COMMENT;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:12: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:12: ~ ( '\\n' | '\\r' )
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
            	    break loop8;
                }
            } while (true);

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:26: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:315:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XTEXT_SL_COMMENT

    // $ANTLR start XTEXT_WS
    public void mXTEXT_WS() throws RecognitionException {
        try {
            int _type = XTEXT_WS;
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:318:12: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:318:12: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:318:12: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XTEXT_WS

    public void mTokens() throws RecognitionException {
        // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | STRING | ID | XTEXT_INT | XTEXT_ML_COMMENT | XTEXT_SL_COMMENT | XTEXT_WS )
        int alt11=27;
        switch ( input.LA(1) ) {
        case 'g':
            {
            int LA11_1 = input.LA(2);

            if ( (LA11_1=='r') ) {
                int LA11_24 = input.LA(3);

                if ( (LA11_24=='a') ) {
                    int LA11_37 = input.LA(4);

                    if ( (LA11_37=='m') ) {
                        int LA11_44 = input.LA(5);

                        if ( (LA11_44=='m') ) {
                            int LA11_51 = input.LA(6);

                            if ( (LA11_51=='a') ) {
                                int LA11_57 = input.LA(7);

                                if ( (LA11_57=='r') ) {
                                    int LA11_62 = input.LA(8);

                                    if ( (LA11_62=='_') ) {
                                        int LA11_67 = input.LA(9);

                                        if ( (LA11_67=='n') ) {
                                            switch ( input.LA(10) ) {
                                            case 'a':
                                                {
                                                int LA11_73 = input.LA(11);

                                                if ( (LA11_73=='m') ) {
                                                    int LA11_77 = input.LA(12);

                                                    if ( (LA11_77=='e') ) {
                                                        int LA11_81 = input.LA(13);

                                                        if ( ((LA11_81>='0' && LA11_81<='9')||(LA11_81>='A' && LA11_81<='Z')||LA11_81=='_'||(LA11_81>='a' && LA11_81<='z')) ) {
                                                            alt11=23;
                                                        }
                                                        else {
                                                            alt11=1;}
                                                    }
                                                    else {
                                                        alt11=23;}
                                                }
                                                else {
                                                    alt11=23;}
                                                }
                                                break;
                                            case 's':
                                                {
                                                int LA11_74 = input.LA(11);

                                                if ( (LA11_74=='U') ) {
                                                    int LA11_78 = input.LA(12);

                                                    if ( (LA11_78=='R') ) {
                                                        int LA11_82 = input.LA(13);

                                                        if ( (LA11_82=='I') ) {
                                                            int LA11_86 = input.LA(14);

                                                            if ( ((LA11_86>='0' && LA11_86<='9')||(LA11_86>='A' && LA11_86<='Z')||LA11_86=='_'||(LA11_86>='a' && LA11_86<='z')) ) {
                                                                alt11=23;
                                                            }
                                                            else {
                                                                alt11=2;}
                                                        }
                                                        else {
                                                            alt11=23;}
                                                    }
                                                    else {
                                                        alt11=23;}
                                                }
                                                else {
                                                    alt11=23;}
                                                }
                                                break;
                                            default:
                                                alt11=23;}

                                        }
                                        else {
                                            alt11=23;}
                                    }
                                    else {
                                        alt11=23;}
                                }
                                else {
                                    alt11=23;}
                            }
                            else {
                                alt11=23;}
                        }
                        else {
                            alt11=23;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case 'c':
            {
            int LA11_2 = input.LA(2);

            if ( (LA11_2=='o') ) {
                int LA11_25 = input.LA(3);

                if ( (LA11_25=='m') ) {
                    int LA11_38 = input.LA(4);

                    if ( (LA11_38=='m') ) {
                        int LA11_45 = input.LA(5);

                        if ( (LA11_45=='e') ) {
                            int LA11_52 = input.LA(6);

                            if ( (LA11_52=='n') ) {
                                int LA11_58 = input.LA(7);

                                if ( (LA11_58=='t') ) {
                                    int LA11_63 = input.LA(8);

                                    if ( (LA11_63=='s') ) {
                                        int LA11_68 = input.LA(9);

                                        if ( (LA11_68=='D') ) {
                                            int LA11_71 = input.LA(10);

                                            if ( (LA11_71=='i') ) {
                                                int LA11_75 = input.LA(11);

                                                if ( (LA11_75=='s') ) {
                                                    int LA11_79 = input.LA(12);

                                                    if ( (LA11_79=='a') ) {
                                                        int LA11_83 = input.LA(13);

                                                        if ( (LA11_83=='b') ) {
                                                            int LA11_87 = input.LA(14);

                                                            if ( (LA11_87=='l') ) {
                                                                int LA11_90 = input.LA(15);

                                                                if ( (LA11_90=='e') ) {
                                                                    int LA11_92 = input.LA(16);

                                                                    if ( (LA11_92=='d') ) {
                                                                        int LA11_93 = input.LA(17);

                                                                        if ( ((LA11_93>='0' && LA11_93<='9')||(LA11_93>='A' && LA11_93<='Z')||LA11_93=='_'||(LA11_93>='a' && LA11_93<='z')) ) {
                                                                            alt11=23;
                                                                        }
                                                                        else {
                                                                            alt11=3;}
                                                                    }
                                                                    else {
                                                                        alt11=23;}
                                                                }
                                                                else {
                                                                    alt11=23;}
                                                            }
                                                            else {
                                                                alt11=23;}
                                                        }
                                                        else {
                                                            alt11=23;}
                                                    }
                                                    else {
                                                        alt11=23;}
                                                }
                                                else {
                                                    alt11=23;}
                                            }
                                            else {
                                                alt11=23;}
                                        }
                                        else {
                                            alt11=23;}
                                    }
                                    else {
                                        alt11=23;}
                                }
                                else {
                                    alt11=23;}
                            }
                            else {
                                alt11=23;}
                        }
                        else {
                            alt11=23;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case 'i':
            {
            int LA11_3 = input.LA(2);

            if ( (LA11_3=='m') ) {
                int LA11_26 = input.LA(3);

                if ( (LA11_26=='p') ) {
                    int LA11_39 = input.LA(4);

                    if ( (LA11_39=='o') ) {
                        int LA11_46 = input.LA(5);

                        if ( (LA11_46=='r') ) {
                            int LA11_53 = input.LA(6);

                            if ( (LA11_53=='t') ) {
                                int LA11_59 = input.LA(7);

                                if ( (LA11_59=='G') ) {
                                    int LA11_64 = input.LA(8);

                                    if ( (LA11_64=='r') ) {
                                        int LA11_69 = input.LA(9);

                                        if ( (LA11_69=='a') ) {
                                            int LA11_72 = input.LA(10);

                                            if ( (LA11_72=='m') ) {
                                                int LA11_76 = input.LA(11);

                                                if ( (LA11_76=='m') ) {
                                                    int LA11_80 = input.LA(12);

                                                    if ( (LA11_80=='a') ) {
                                                        int LA11_84 = input.LA(13);

                                                        if ( (LA11_84=='r') ) {
                                                            int LA11_88 = input.LA(14);

                                                            if ( ((LA11_88>='0' && LA11_88<='9')||(LA11_88>='A' && LA11_88<='Z')||LA11_88=='_'||(LA11_88>='a' && LA11_88<='z')) ) {
                                                                alt11=23;
                                                            }
                                                            else {
                                                                alt11=4;}
                                                        }
                                                        else {
                                                            alt11=23;}
                                                    }
                                                    else {
                                                        alt11=23;}
                                                }
                                                else {
                                                    alt11=23;}
                                            }
                                            else {
                                                alt11=23;}
                                        }
                                        else {
                                            alt11=23;}
                                    }
                                    else {
                                        alt11=23;}
                                }
                                else {
                                    alt11=23;}
                            }
                            else {
                                alt11=23;}
                        }
                        else {
                            alt11=23;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case 'N':
            {
            int LA11_4 = input.LA(2);

            if ( (LA11_4=='a') ) {
                int LA11_27 = input.LA(3);

                if ( (LA11_27=='t') ) {
                    int LA11_40 = input.LA(4);

                    if ( (LA11_40=='i') ) {
                        int LA11_47 = input.LA(5);

                        if ( (LA11_47=='v') ) {
                            int LA11_54 = input.LA(6);

                            if ( (LA11_54=='e') ) {
                                int LA11_60 = input.LA(7);

                                if ( ((LA11_60>='0' && LA11_60<='9')||(LA11_60>='A' && LA11_60<='Z')||LA11_60=='_'||(LA11_60>='a' && LA11_60<='z')) ) {
                                    alt11=23;
                                }
                                else {
                                    alt11=5;}
                            }
                            else {
                                alt11=23;}
                        }
                        else {
                            alt11=23;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case ':':
            {
            alt11=6;
            }
            break;
        case ';':
            {
            alt11=7;
            }
            break;
        case 'S':
            {
            int LA11_7 = input.LA(2);

            if ( (LA11_7=='t') ) {
                int LA11_28 = input.LA(3);

                if ( (LA11_28=='r') ) {
                    int LA11_41 = input.LA(4);

                    if ( (LA11_41=='i') ) {
                        int LA11_48 = input.LA(5);

                        if ( (LA11_48=='n') ) {
                            int LA11_55 = input.LA(6);

                            if ( (LA11_55=='g') ) {
                                int LA11_61 = input.LA(7);

                                if ( ((LA11_61>='0' && LA11_61<='9')||(LA11_61>='A' && LA11_61<='Z')||LA11_61=='_'||(LA11_61>='a' && LA11_61<='z')) ) {
                                    alt11=23;
                                }
                                else {
                                    alt11=8;}
                            }
                            else {
                                alt11=23;}
                        }
                        else {
                            alt11=23;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case 'E':
            {
            int LA11_8 = input.LA(2);

            if ( (LA11_8=='n') ) {
                int LA11_29 = input.LA(3);

                if ( (LA11_29=='u') ) {
                    int LA11_42 = input.LA(4);

                    if ( (LA11_42=='m') ) {
                        int LA11_49 = input.LA(5);

                        if ( ((LA11_49>='0' && LA11_49<='9')||(LA11_49>='A' && LA11_49<='Z')||LA11_49=='_'||(LA11_49>='a' && LA11_49<='z')) ) {
                            alt11=23;
                        }
                        else {
                            alt11=9;}
                    }
                    else {
                        alt11=23;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case '|':
            {
            alt11=10;
            }
            break;
        case '=':
            {
            alt11=11;
            }
            break;
        case '(':
            {
            alt11=12;
            }
            break;
        case ')':
            {
            alt11=13;
            }
            break;
        case 'U':
            {
            int LA11_13 = input.LA(2);

            if ( (LA11_13=='R') ) {
                int LA11_30 = input.LA(3);

                if ( (LA11_30=='I') ) {
                    int LA11_43 = input.LA(4);

                    if ( ((LA11_43>='0' && LA11_43<='9')||(LA11_43>='A' && LA11_43<='Z')||LA11_43=='_'||(LA11_43>='a' && LA11_43<='z')) ) {
                        alt11=23;
                    }
                    else {
                        alt11=14;}
                }
                else {
                    alt11=23;}
            }
            else {
                alt11=23;}
            }
            break;
        case '[':
            {
            alt11=15;
            }
            break;
        case ']':
            {
            alt11=16;
            }
            break;
        case '?':
            {
            int LA11_16 = input.LA(2);

            if ( (LA11_16=='=') ) {
                alt11=17;
            }
            else {
                alt11=19;}
            }
            break;
        case '+':
            {
            int LA11_17 = input.LA(2);

            if ( (LA11_17=='=') ) {
                alt11=18;
            }
            else {
                alt11=21;}
            }
            break;
        case '*':
            {
            alt11=20;
            }
            break;
        case '\"':
        case '\'':
            {
            alt11=22;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'T':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt11=23;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt11=24;
            }
            break;
        case '/':
            {
            int LA11_22 = input.LA(2);

            if ( (LA11_22=='*') ) {
                alt11=25;
            }
            else if ( (LA11_22=='/') ) {
                alt11=26;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | STRING | ID | XTEXT_INT | XTEXT_ML_COMMENT | XTEXT_SL_COMMENT | XTEXT_WS );", 11, 22, input);

                throw nvae;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt11=27;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | STRING | ID | XTEXT_INT | XTEXT_ML_COMMENT | XTEXT_SL_COMMENT | XTEXT_WS );", 11, 0, input);

            throw nvae;
        }

        switch (alt11) {
            case 1 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:94: STRING
                {
                mSTRING(); 

                }
                break;
            case 23 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:101: ID
                {
                mID(); 

                }
                break;
            case 24 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:104: XTEXT_INT
                {
                mXTEXT_INT(); 

                }
                break;
            case 25 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:114: XTEXT_ML_COMMENT
                {
                mXTEXT_ML_COMMENT(); 

                }
                break;
            case 26 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:131: XTEXT_SL_COMMENT
                {
                mXTEXT_SL_COMMENT(); 

                }
                break;
            case 27 :
                // L:\\jax-ws\\xtext.core\\bin\\XText.g:1:148: XTEXT_WS
                {
                mXTEXT_WS(); 

                }
                break;

        }

    }


 

}