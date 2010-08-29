lexer grammar InternalDot;
@header {
package org.openarchitectureware.vis.graphviz.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'graphs' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'graph' ;
T16 : 'strict' ;
T17 : ';' ;
T18 : '=' ;
T19 : '[' ;
T20 : ']' ;
T21 : ',' ;
T22 : 'subgraph' ;
T23 : '->' ;
T24 : '--' ;
T25 : 'digraph' ;
T26 : 'node' ;
T27 : 'edge' ;

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1304
RULE_DOT_ID : ('^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~('"'))* '"'|'-'? ('.' ('0'..'9')+|('0'..'9')+ ('.' ('0'..'9')*)?));

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1306
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1308
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1310
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1312
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1314
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1316
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g" 1318
RULE_ANY_OTHER : .;


