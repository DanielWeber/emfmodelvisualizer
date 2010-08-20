lexer grammar imp;
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
package dataimport.dsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'import' ;
T11 : 'ext' ;
T12 : '=' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'ref' ;
T16 : 'data' ;
T17 : 'persistent' ;
T18 : '->' ;
T19 : ':' ;
T20 : '*' ;
T21 : 'int' ;
T22 : 'range' ;
T23 : '..' ;
T24 : 'boolean' ;
T25 : 'String' ;
T26 : '[' ;
T27 : ']' ;
T28 : 'regex' ;
T29 : 'records' ;
T30 : 'record' ;
T31 : 'next' ;
T32 : '.' ;
T33 : '+=' ;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 949
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 955
RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 962
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 968
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 974
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g" 980
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

