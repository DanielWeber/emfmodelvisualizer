lexer grammar XText;
@members {
   private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}
	
	public String getErrorMessage(RecognitionException e, String[] tokenNames) { 
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg; 
	} 
}
@header {
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
}

T10 : 'grammar_name' ;
T11 : 'grammar_nsURI' ;
T12 : 'commentsDisabled' ;
T13 : 'importGrammar' ;
T14 : 'Native' ;
T15 : ':' ;
T16 : ';' ;
T17 : 'String' ;
T18 : 'Enum' ;
T19 : '|' ;
T20 : '=' ;
T21 : '(' ;
T22 : ')' ;
T23 : 'URI' ;
T24 : '[' ;
T25 : ']' ;
T26 : '?=' ;
T27 : '+=' ;
T28 : '?' ;
T29 : '*' ;
T30 : '+' ;

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 298
STRING :  
    '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
    '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 302
ID	:
	('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
;

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 306
XTEXT_INT :
	('0'..'9')+ 
;

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 310
XTEXT_ML_COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 314
XTEXT_SL_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// $ANTLR src "L:\jax-ws\xtext.core\bin\XText.g" 318
XTEXT_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;} ; 
