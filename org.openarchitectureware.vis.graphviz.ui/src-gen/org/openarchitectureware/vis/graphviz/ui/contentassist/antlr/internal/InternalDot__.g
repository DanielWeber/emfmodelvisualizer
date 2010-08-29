lexer grammar InternalDot;
@header {
package org.openarchitectureware.vis.graphviz.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '->' ;
T13 : '--' ;
T14 : 'graph' ;
T15 : 'digraph' ;
T16 : 'node' ;
T17 : 'edge' ;
T18 : 'graphs' ;
T19 : '{' ;
T20 : '}' ;
T21 : ';' ;
T22 : '=' ;
T23 : '[' ;
T24 : ']' ;
T25 : ',' ;
T26 : 'subgraph' ;
T27 : 'strict' ;

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2503
RULE_DOT_ID : ('^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~('"'))* '"'|'-'? ('.' ('0'..'9')+|('0'..'9')+ ('.' ('0'..'9')*)?));

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2505
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2507
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2509
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2511
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2513
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2515
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g" 2517
RULE_ANY_OTHER : .;


