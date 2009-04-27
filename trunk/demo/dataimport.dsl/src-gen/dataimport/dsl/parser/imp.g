grammar imp;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package dataimport.dsl.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package dataimport.dsl.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import dataimport.dsl.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == impLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==impLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==impLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
		
	}

	public ParseTreeManagerNeu getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
	public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		ptm.addError(msg, e);
		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
		// two nodes will be finished instead of one.
		// ptm.ruleFinished(null, end());
	}

    private boolean skipCurrentToken;
    
	@Override
	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
		skipCurrentToken = true;
		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
	}
}


parse returns [Node r]:
	 result=ruleImportSpec
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
{
if (result != null)
  ptm.setModelElement(result);
$r = ptm.getCurrent();
ptm.ruleFinished(result);}	 EOF
;

ruleImportSpec returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ImportSpec");
			 }
(({skipCurrentToken = false;}'import'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'ext'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'='{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)));
  factory.set($result,"fileExt",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(4)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(5)));}temp_OtherFile=
ruleOtherFile{if (temp_OtherFile != null) {
  hasContent = true;
  ptm.setModelElement(temp_OtherFile);
  factory.add($result,"refs",convert(temp_OtherFile),false);
  ptm.ruleFinished(temp_OtherFile);
} else {
  ptm.destroyNode();
}
}
)*

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(6)));}temp_DataSection=
ruleDataSection{if (temp_DataSection != null) {
  hasContent = true;
  ptm.setModelElement(temp_DataSection);
  factory.set($result,"dataSection",convert(temp_DataSection),false);
  ptm.ruleFinished(temp_DataSection);
} else {
  ptm.destroyNode();
}
}
)?

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(7)));}temp_RecordSection=
ruleRecordSection{if (temp_RecordSection != null) {
  hasContent = true;
  ptm.setModelElement(temp_RecordSection);
  factory.set($result,"recordSection",convert(temp_RecordSection),false);
  ptm.ruleFinished(temp_RecordSection);
} else {
  ptm.destroyNode();
}
}
)?

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(8)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleOtherFile returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "OtherFile");
			 }
(({skipCurrentToken = false;}'ref'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
 RULE_STRING
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"file",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleDataStructure returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "DataStructure");
			 }
(({skipCurrentToken = false;}'data'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}
'persistent'{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"isPersistent",true);
  ptm.ruleFinished(temp);
}}
)?

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)).eContents().get(0)));}temp_Attribute=
ruleAttribute{if (temp_Attribute != null) {
  hasContent = true;
  ptm.setModelElement(temp_Attribute);
  factory.add($result,"attributes",convert(temp_Attribute),false);
  ptm.ruleFinished(temp_Attribute);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)).eContents().get(1)));}temp_Reference=
ruleReference{if (temp_Reference != null) {
  hasContent = true;
  ptm.setModelElement(temp_Reference);
  factory.add($result,"references",convert(temp_Reference),false);
  ptm.ruleFinished(temp_Reference);
} else {
  ptm.destroyNode();
}
}
)
)*

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleReference returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Reference");
			 }
(({skipCurrentToken = false;}'->'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}':'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
  factory.set($result,"type",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}
'*'{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
  factory.set($result,"ismulti",true);
  ptm.ruleFinished(temp);
}}
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAttribute returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Attribute");
			 }
(({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}':'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)));}temp_AttributeType=
ruleAttributeType{if (temp_AttributeType != null) {
  hasContent = true;
  ptm.setModelElement(temp_AttributeType);
  factory.set($result,"type",convert(temp_AttributeType),false);
  ptm.ruleFinished(temp_AttributeType);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAttributeType returns [EObject result]
:
        temp_inttype=ruleIntType {$result=temp_inttype;}	|        temp_booleantype=ruleBooleanType {$result=temp_booleantype;}	|        temp_stringtype=ruleStringType {$result=temp_stringtype;}	;

ruleIntType returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "IntType");
			 }
(({skipCurrentToken = false;}'int'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)));}temp_Range=
ruleRange{if (temp_Range != null) {
  hasContent = true;
  ptm.setModelElement(temp_Range);
  factory.set($result,"range",convert(temp_Range),false);
  ptm.ruleFinished(temp_Range);
} else {
  ptm.destroyNode();
}
}
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRange returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Range");
			 }
(({skipCurrentToken = false;}'range'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"min",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'..'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)));
  factory.set($result,"max",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleBooleanType returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "BooleanType");
			 }
({skipCurrentToken = false;}'boolean'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleStringType returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "StringType");
			 }
(({skipCurrentToken = false;}'String'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

(({skipCurrentToken = false;}'['{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"len",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}']'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})
)?

(({skipCurrentToken = false;}'regex'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_STRING{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
  factory.set($result,"regex",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)
)?
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleDataSection returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "DataSection");
			 }
(({skipCurrentToken = false;}'data'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)));}temp_DataStructure=
ruleDataStructure{if (temp_DataStructure != null) {
  hasContent = true;
  ptm.setModelElement(temp_DataStructure);
  factory.add($result,"dataStructures",convert(temp_DataStructure),false);
  ptm.ruleFinished(temp_DataStructure);
} else {
  ptm.destroyNode();
}
}
)*

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRecordSection returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "RecordSection");
			 }
(({skipCurrentToken = false;}'records'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));}temp_RecordHandler=
ruleRecordHandler{if (temp_RecordHandler != null) {
  hasContent = true;
  ptm.setModelElement(temp_RecordHandler);
  factory.add($result,"recordHandlers",convert(temp_RecordHandler),false);
  ptm.ruleFinished(temp_RecordHandler);
} else {
  ptm.destroyNode();
}
}
)*

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRecordHandler returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "RecordHandler");
			 }
(({skipCurrentToken = false;}'record'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'{'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)));
  ptm.ruleFinished(getLastToken());
}})

(({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(0)));}temp_Instance=
ruleInstance{if (temp_Instance != null) {
  hasContent = true;
  ptm.setModelElement(temp_Instance);
  factory.add($result,"instances",convert(temp_Instance),false);
  ptm.ruleFinished(temp_Instance);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)));}temp_FieldMapping=
ruleFieldMapping{if (temp_FieldMapping != null) {
  hasContent = true;
  ptm.setModelElement(temp_FieldMapping);
  factory.add($result,"fieldMappings",convert(temp_FieldMapping),false);
  ptm.ruleFinished(temp_FieldMapping);
} else {
  ptm.destroyNode();
}
}
)
	|
({ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(2)));}temp_GraphBuild=
ruleGraphBuild{if (temp_GraphBuild != null) {
  hasContent = true;
  ptm.setModelElement(temp_GraphBuild);
  factory.add($result,"graphBuilds",convert(temp_GraphBuild),false);
  ptm.ruleFinished(temp_GraphBuild);
} else {
  ptm.destroyNode();
}
}
)
)*

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)));}temp_RecordHandler=
ruleRecordHandler{if (temp_RecordHandler != null) {
  hasContent = true;
  ptm.setModelElement(temp_RecordHandler);
  factory.add($result,"nextSteps",convert(temp_RecordHandler),false);
  ptm.ruleFinished(temp_RecordHandler);
} else {
  ptm.destroyNode();
}
}
)*

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(5)));}temp_Jump=
ruleJump{if (temp_Jump != null) {
  hasContent = true;
  ptm.setModelElement(temp_Jump);
  factory.set($result,"jump",convert(temp_Jump),false);
  ptm.ruleFinished(temp_Jump);
} else {
  ptm.destroyNode();
}
}
)?

({skipCurrentToken = false;}'}'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(6)));
  ptm.ruleFinished(getLastToken());
}})
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleJump returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Jump");
			 }
(({skipCurrentToken = false;}'next'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));
  factory.set($result,"nextRecord",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleGraphBuild returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "GraphBuild");
			 }
(({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"ownerInstance",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'.'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"ownerRef",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)

(({skipCurrentToken = false;}
'='{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
  factory.set($result,"one",true);
  ptm.ruleFinished(temp);
}}
)
	|
({skipCurrentToken = false;}
'+='{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
  factory.set($result,"several",true);
  ptm.ruleFinished(temp);
}}
)
)

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)));
  factory.set($result,"targetInstance",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleFieldMapping returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "FieldMapping");
			 }
(({skipCurrentToken = false;}
RULE_INT{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"index",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'->'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"instance",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}'.'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)));
  factory.set($result,"field",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleInstance returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Instance");
			 }
(({skipCurrentToken = false;}
RULE_ID{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"name",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({skipCurrentToken = false;}':'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})

({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)));
  factory.set($result,"type",convert(temp),true);
  ptm.ruleFinished(temp);
}}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

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

