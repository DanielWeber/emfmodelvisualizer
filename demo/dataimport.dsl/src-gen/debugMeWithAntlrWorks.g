grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleImportSpec
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleImportSpec 

:
(('import')

('ext')

('=')

(RULE_STRING)

('{')

(ruleOtherFile)*

(ruleDataSection)?

(ruleRecordSection)?

('}')
)
;

ruleOtherFile 

:
(('ref')

( RULE_STRING
)
)
;

ruleDataStructure 

:
(('data')

(RULE_ID)

('persistent')?

('{')

((ruleAttribute)
	|
(ruleReference)
)*

('}')
)
;

ruleReference 

:
(('->')

(RULE_ID)

(':')

(RULE_ID
)

('*')?
)
;

ruleAttribute 

:
((RULE_ID)

(':')

(ruleAttributeType)
)
;

ruleAttributeType 
:
        temp_inttype=ruleIntType 	|        temp_booleantype=ruleBooleanType 	|        temp_stringtype=ruleStringType 	;

ruleIntType 

:
(('int')

(ruleRange)?
)
;

ruleRange 

:
(('range')

(RULE_INT)

('..')

(RULE_INT)
)
;

ruleBooleanType 

:
('boolean')
;

ruleStringType 

:
(('String')

(('[')

(RULE_INT)

(']')
)?

(('regex')

(RULE_STRING)
)?
)
;

ruleDataSection 

:
(('data')

('{')

(ruleDataStructure)*

('}')
)
;

ruleRecordSection 

:
(('records')

('{')

(ruleRecordHandler)*

('}')
)
;

ruleRecordHandler 

:
(('record')

(RULE_ID)

('{')

((ruleInstance)
	|
(ruleFieldMapping)
	|
(ruleGraphBuild)
)*

(ruleRecordHandler)*

(ruleJump)?

('}')
)
;

ruleJump 

:
(('next')

(RULE_ID
)
)
;

ruleGraphBuild 

:
((RULE_ID
)

('.')

(RULE_ID
)

(('=')
	|
('+=')
)

(RULE_ID
)
)
;

ruleFieldMapping 

:
((RULE_INT)

('->')

(RULE_ID
)

('.')

(RULE_ID
)
)
;

ruleInstance 

:
((RULE_ID)

(':')

(RULE_ID
)
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

