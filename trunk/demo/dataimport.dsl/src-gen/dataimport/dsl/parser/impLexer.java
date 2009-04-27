// $ANTLR 3.0 ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g 2009-01-21 10:07:21

package dataimport.dsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class impLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public impLexer() {;} 
    public impLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:22:7: ( 'import' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:22:7: 'import'
            {
            match("import"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:23:7: ( 'ext' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:23:7: 'ext'
            {
            match("ext"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:24:7: ( '=' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:24:7: '='
            {
            match('='); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:25:7: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:25:7: '{'
            {
            match('{'); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:26:7: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:26:7: '}'
            {
            match('}'); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:27:7: ( 'ref' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:27:7: 'ref'
            {
            match("ref"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:28:7: ( 'data' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:28:7: 'data'
            {
            match("data"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:29:7: ( 'persistent' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:29:7: 'persistent'
            {
            match("persistent"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:30:7: ( '->' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:30:7: '->'
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
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:31:7: ( ':' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:31:7: ':'
            {
            match(':'); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:32:7: ( '*' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:32:7: '*'
            {
            match('*'); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:33:7: ( 'int' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:33:7: 'int'
            {
            match("int"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:34:7: ( 'range' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:34:7: 'range'
            {
            match("range"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:35:7: ( '..' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:35:7: '..'
            {
            match(".."); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:36:7: ( 'boolean' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:36:7: 'boolean'
            {
            match("boolean"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:37:7: ( 'String' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:37:7: 'String'
            {
            match("String"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:38:7: ( '[' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:38:7: '['
            {
            match('['); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:39:7: ( ']' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:39:7: ']'
            {
            match(']'); 

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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:40:7: ( 'regex' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:40:7: 'regex'
            {
            match("regex"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:41:7: ( 'records' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:41:7: 'records'
            {
            match("records"); 


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
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:42:7: ( 'record' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:42:7: 'record'
            {
            match("record"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:43:7: ( 'next' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:43:7: 'next'
            {
            match("next"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:44:7: ( '.' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:44:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:45:7: ( '+=' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:45:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:951:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:951:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:951:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:951:4: '^'
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

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:951:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:
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
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:957:3: ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("955:1: RULE_STRING : ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:957:3: '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:957:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:957:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:957:54: ~ ( '\\\\' | '\\\"' )
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
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:958:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:958:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:958:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:958:54: ~ ( '\\\\' | '\\'' )
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
                    	    break loop4;
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
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:964:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:970:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:970:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:970:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:976:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:976:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:976:8: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:976:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:8: ~ ( '\\n' | '\\r' )
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
            	    break loop10;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:982:22: '\\r'
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
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=30;
        switch ( input.LA(1) ) {
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='p') ) {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='o') ) {
                        int LA12_51 = input.LA(5);

                        if ( (LA12_51=='r') ) {
                            int LA12_63 = input.LA(6);

                            if ( (LA12_63=='t') ) {
                                int LA12_72 = input.LA(7);

                                if ( ((LA12_72>='0' && LA12_72<='9')||(LA12_72>='A' && LA12_72<='Z')||LA12_72=='_'||(LA12_72>='a' && LA12_72<='z')) ) {
                                    alt12=25;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
                }
                break;
            case 'n':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='t') ) {
                    int LA12_40 = input.LA(4);

                    if ( ((LA12_40>='0' && LA12_40<='9')||(LA12_40>='A' && LA12_40<='Z')||LA12_40=='_'||(LA12_40>='a' && LA12_40<='z')) ) {
                        alt12=25;
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=25;}
                }
                break;
            default:
                alt12=25;}

            }
            break;
        case 'e':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='x') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='t') ) {
                    int LA12_41 = input.LA(4);

                    if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                        alt12=25;
                    }
                    else {
                        alt12=2;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case '=':
            {
            alt12=3;
            }
            break;
        case '{':
            {
            alt12=4;
            }
            break;
        case '}':
            {
            alt12=5;
            }
            break;
        case 'r':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='o') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='r') ) {
                            int LA12_64 = input.LA(6);

                            if ( (LA12_64=='d') ) {
                                switch ( input.LA(7) ) {
                                case 's':
                                    {
                                    int LA12_80 = input.LA(8);

                                    if ( ((LA12_80>='0' && LA12_80<='9')||(LA12_80>='A' && LA12_80<='Z')||LA12_80=='_'||(LA12_80>='a' && LA12_80<='z')) ) {
                                        alt12=25;
                                    }
                                    else {
                                        alt12=20;}
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
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    alt12=25;
                                    }
                                    break;
                                default:
                                    alt12=21;}

                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                    }
                    break;
                case 'g':
                    {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='e') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55=='x') ) {
                            int LA12_65 = input.LA(6);

                            if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                                alt12=25;
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_44 = input.LA(4);

                    if ( ((LA12_44>='0' && LA12_44<='9')||(LA12_44>='A' && LA12_44<='Z')||LA12_44=='_'||(LA12_44>='a' && LA12_44<='z')) ) {
                        alt12=25;
                    }
                    else {
                        alt12=6;}
                    }
                    break;
                default:
                    alt12=25;}

                }
                break;
            case 'a':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='n') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='g') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='e') ) {
                            int LA12_66 = input.LA(6);

                            if ( ((LA12_66>='0' && LA12_66<='9')||(LA12_66>='A' && LA12_66<='Z')||LA12_66=='_'||(LA12_66>='a' && LA12_66<='z')) ) {
                                alt12=25;
                            }
                            else {
                                alt12=13;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
                }
                break;
            default:
                alt12=25;}

            }
            break;
        case 'd':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='a') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='t') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='a') ) {
                        int LA12_58 = input.LA(5);

                        if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                            alt12=25;
                        }
                        else {
                            alt12=7;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case 'p':
            {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='e') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='r') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='s') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='i') ) {
                            int LA12_68 = input.LA(6);

                            if ( (LA12_68=='s') ) {
                                int LA12_76 = input.LA(7);

                                if ( (LA12_76=='t') ) {
                                    int LA12_82 = input.LA(8);

                                    if ( (LA12_82=='e') ) {
                                        int LA12_86 = input.LA(9);

                                        if ( (LA12_86=='n') ) {
                                            int LA12_88 = input.LA(10);

                                            if ( (LA12_88=='t') ) {
                                                int LA12_89 = input.LA(11);

                                                if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                                                    alt12=25;
                                                }
                                                else {
                                                    alt12=8;}
                                            }
                                            else {
                                                alt12=25;}
                                        }
                                        else {
                                            alt12=25;}
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case '-':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='>') ) {
                alt12=9;
            }
            else if ( ((LA12_9>='0' && LA12_9<='9')) ) {
                alt12=27;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 9, input);

                throw nvae;
            }
            }
            break;
        case ':':
            {
            alt12=10;
            }
            break;
        case '*':
            {
            alt12=11;
            }
            break;
        case '.':
            {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='.') ) {
                alt12=14;
            }
            else {
                alt12=23;}
            }
            break;
        case 'b':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='o') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='o') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='l') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='e') ) {
                            int LA12_69 = input.LA(6);

                            if ( (LA12_69=='a') ) {
                                int LA12_77 = input.LA(7);

                                if ( (LA12_77=='n') ) {
                                    int LA12_83 = input.LA(8);

                                    if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                                        alt12=25;
                                    }
                                    else {
                                        alt12=15;}
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case 'S':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='t') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='r') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='i') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='n') ) {
                            int LA12_70 = input.LA(6);

                            if ( (LA12_70=='g') ) {
                                int LA12_78 = input.LA(7);

                                if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                                    alt12=25;
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case '[':
            {
            alt12=17;
            }
            break;
        case ']':
            {
            alt12=18;
            }
            break;
        case 'n':
            {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='e') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='x') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='t') ) {
                        int LA12_62 = input.LA(5);

                        if ( ((LA12_62>='0' && LA12_62<='9')||(LA12_62>='A' && LA12_62<='Z')||LA12_62=='_'||(LA12_62>='a' && LA12_62<='z')) ) {
                            alt12=25;
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=25;}
            }
            else {
                alt12=25;}
            }
            break;
        case '+':
            {
            alt12=24;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'c':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'q':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=25;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=26;
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
            alt12=27;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=28;
            }
            break;
        case '/':
            {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='*') ) {
                alt12=29;
            }
            else if ( (LA12_23=='/') ) {
                alt12=30;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 23, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:106: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:114: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:126: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}