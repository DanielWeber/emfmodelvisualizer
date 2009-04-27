// $ANTLR 3.0 L:\\jax-ws\\xtext.core\\bin\\XText.g 2008-02-07 15:56:12

package org.openarchitectureware.xtext.parser.antlr; 

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.xtext.MetaModelRegistration;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class XTextParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "XTEXT_INT", "XTEXT_ML_COMMENT", "XTEXT_SL_COMMENT", "XTEXT_WS", "'grammar_name'", "'grammar_nsURI'", "'commentsDisabled'", "'importGrammar'", "'Native'", "':'", "';'", "'String'", "'Enum'", "'|'", "'='", "'('", "')'", "'URI'", "'['", "']'", "'?='", "'+='", "'?'", "'*'", "'+'"
    };
    public static final int XTEXT_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int XTEXT_INT=6;
    public static final int STRING=5;
    public static final int XTEXT_ML_COMMENT=7;
    public static final int XTEXT_WS=9;
    public static final int ID=4;

        public XTextParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "L:\\jax-ws\\xtext.core\\bin\\XText.g"; }

    
    
       	private Token getLastToken() {
    		return input.LT(-1);
    	}
    	private Token getNextToken() {
    		return input.LT(1);
    	}
    	
    	private int line() {
    		Token t = getNextToken();
    		if (t==null)
    			return 1;
    		return t.getLine();
    	}
    	
    	private int start() {
    		Token t = getNextToken();
    		if (t==null)
    			return 0;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStartIndex();
    		}
    		return t.getTokenIndex();
    	}
    	
    	private int end() {
    		Token t = getLastToken();
    		if (t==null)
    			return 1;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStopIndex()+1;
    		}
    		return t.getTokenIndex();
    	}
    	
    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == XTextLexer.ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==XTextLexer.STRING) {
    				return s.substring(1,s.length()-1);
    			}
    			return s;
    		}
    		return arg;
    	}
    	
    	
    	private EcoreModelFactory f= new EcoreModelFactory(MetaModelRegistration.getEPackage());
        private ParseTreeManager ptm = new ParseTreeManager();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	public ParseTreeManager getResult() {
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
        	ptm.ruleFinished(null, end());
        }



    // $ANTLR start parse
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:128:1: parse returns [Node r] : result= xtextFile EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;

        EObject result = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:129:3: (result= xtextFile EOF )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:129:3: result= xtextFile EOF
            {
            pushFollow(FOLLOW_xtextFile_in_parse54);
            result=xtextFile();
            _fsp--;

            match(input,EOF,FOLLOW_EOF_in_parse56); 
            ptm.ruleFinished(result,end());r = ptm.getCurrent();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start xtextFile
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:132:1: xtextFile returns [EObject result] : ( 'grammar_name' name= ID )? ( 'grammar_nsURI' nsuri= STRING )? (commentsflag= 'commentsDisabled' )? (i= importGrammar )* (r= rule )* ;
    public EObject xtextFile() throws RecognitionException {
        EObject result = null;

        Token name=null;
        Token nsuri=null;
        Token commentsflag=null;
        EObject i = null;

        EObject r = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:133:5: ( ( 'grammar_name' name= ID )? ( 'grammar_nsURI' nsuri= STRING )? (commentsflag= 'commentsDisabled' )? (i= importGrammar )* (r= rule )* )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:133:5: ( 'grammar_name' name= ID )? ( 'grammar_nsURI' nsuri= STRING )? (commentsflag= 'commentsDisabled' )? (i= importGrammar )* (r= rule )*
            {
             result = f.create("XtextFile"); 
                   ptm.setModelElement(result);
                 
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:136:5: ( 'grammar_name' name= ID )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:136:6: 'grammar_name' name= ID
                    {
                    ptm.invokeRule(null,line(),start());
                    match(input,10,FOLLOW_10_in_xtextFile87); 
                    ptm.ruleFinished(getLastToken(),end());
                    name=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_xtextFile92); 
                    f.set(result, "name", convert(name));
                    ptm.ruleFinished(getLastToken(),end());

                    }
                    break;

            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:137:5: ( 'grammar_nsURI' nsuri= STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:137:6: 'grammar_nsURI' nsuri= STRING
                    {
                    ptm.invokeRule(null,line(),start());
                    match(input,11,FOLLOW_11_in_xtextFile105); 
                    ptm.ruleFinished(getLastToken(),end());
                    ptm.invokeRule(null,line(),start());
                    nsuri=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_xtextFile111); 
                    f.set(result, "nsURI", convert(nsuri));
                    ptm.ruleFinished(getLastToken(),end());

                    }
                    break;

            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:138:5: (commentsflag= 'commentsDisabled' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:138:6: commentsflag= 'commentsDisabled'
                    {
                    ptm.invokeRule(null,line(),start());
                    commentsflag=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_xtextFile126); 
                    f.set(result, "commentsDisabledFlag", true);
                    ptm.ruleFinished(getLastToken(),end());

                    }
                    break;

            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:139:5: (i= importGrammar )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:139:6: i= importGrammar
            	    {
            	    ptm.invokeRule(null,line(),start());
            	    pushFollow(FOLLOW_importGrammar_in_xtextFile141);
            	    i=importGrammar();
            	    _fsp--;

            	    f.add(result,"imports",convert(i));
            	    ptm.ruleFinished(i,end());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:140:5: (r= rule )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||LA5_0==14||(LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:140:6: r= rule
            	    {
            	    ptm.invokeRule(null,line(),start());
            	    pushFollow(FOLLOW_rule_in_xtextFile156);
            	    r=rule();
            	    _fsp--;

            	    f.add(result,"rules",convert(r));
            	    ptm.ruleFinished(r,end());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end xtextFile


    // $ANTLR start importGrammar
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:143:1: importGrammar returns [EObject result] : 'importGrammar' location= STRING ;
    public EObject importGrammar() throws RecognitionException {
        EObject result = null;

        Token location=null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:144:5: ( 'importGrammar' location= STRING )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:144:5: 'importGrammar' location= STRING
            {
            result = f.create("Import"); 
                   ptm.setModelElement(result);
                
            ptm.invokeRule(null,line(),start());
            match(input,13,FOLLOW_13_in_importGrammar190); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            location=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_importGrammar202); 
            f.set(result,"location",convert(location));
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end importGrammar


    // $ANTLR start rule
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:151:1: rule returns [EObject result] : (a= typeRule | b= stringRule | x= lexerRule | c= enumRule );
    public EObject rule() throws RecognitionException {
        EObject result = null;

        EObject a = null;

        EObject b = null;

        EObject x = null;

        EObject c = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:152:6: (a= typeRule | b= stringRule | x= lexerRule | c= enumRule )
            int alt6=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("151:1: rule returns [EObject result] : (a= typeRule | b= stringRule | x= lexerRule | c= enumRule );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:152:6: a= typeRule
                    {
                    pushFollow(FOLLOW_typeRule_in_rule226);
                    a=typeRule();
                    _fsp--;

                    result =a;

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:153:7: b= stringRule
                    {
                    pushFollow(FOLLOW_stringRule_in_rule238);
                    b=stringRule();
                    _fsp--;

                    result =b;

                    }
                    break;
                case 3 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:154:7: x= lexerRule
                    {
                    pushFollow(FOLLOW_lexerRule_in_rule250);
                    x=lexerRule();
                    _fsp--;

                    result =x;

                    }
                    break;
                case 4 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:155:7: c= enumRule
                    {
                    pushFollow(FOLLOW_enumRule_in_rule262);
                    c=enumRule();
                    _fsp--;

                    result =c;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end rule


    // $ANTLR start lexerRule
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:158:1: lexerRule returns [EObject result] : 'Native' name= ID ':' impl= STRING ';' ;
    public EObject lexerRule() throws RecognitionException {
        EObject result = null;

        Token name=null;
        Token impl=null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:159:4: ( 'Native' name= ID ':' impl= STRING ';' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:159:4: 'Native' name= ID ':' impl= STRING ';'
            {
            result = f.create("NativeLexerRule"); 
                   ptm.setModelElement(result);
                 
            ptm.invokeRule(null,line(),start());
            match(input,14,FOLLOW_14_in_lexerRule287); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lexerRule296); 
            f.set(result,"name",convert(name));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,15,FOLLOW_15_in_lexerRule304); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            impl=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_lexerRule313); 
            f.set(result,"impl",convert(impl));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,16,FOLLOW_16_in_lexerRule322); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end lexerRule


    // $ANTLR start typeRule
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:169:1: typeRule returns [EObject result] : name= ID ':' content= alternatives ';' ;
    public EObject typeRule() throws RecognitionException {
        EObject result = null;

        Token name=null;
        EObject content = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:170:5: (name= ID ':' content= alternatives ';' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:170:5: name= ID ':' content= alternatives ';'
            {
            result = f.create("TypeRule"); 
                   ptm.setModelElement(result);
                 
            ptm.invokeRule(null,line(),start());
            name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_typeRule354); 
            f.set(result,"name",convert(name));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,15,FOLLOW_15_in_typeRule364); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            pushFollow(FOLLOW_alternatives_in_typeRule375);
            content=alternatives();
            _fsp--;

            f.set(result,"content",convert(content));
            ptm.ruleFinished(content,end());
            ptm.invokeRule(null,line(),start());
            match(input,16,FOLLOW_16_in_typeRule387); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end typeRule


    // $ANTLR start stringRule
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:179:1: stringRule returns [EObject result] : 'String' name= ID ':' content= alternatives ';' ;
    public EObject stringRule() throws RecognitionException {
        EObject result = null;

        Token name=null;
        EObject content = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:180:5: ( 'String' name= ID ':' content= alternatives ';' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:180:5: 'String' name= ID ':' content= alternatives ';'
            {
            result = f.create("StringRule"); 
                   ptm.setModelElement(result);
                 
            ptm.invokeRule(null,line(),start());
            match(input,17,FOLLOW_17_in_stringRule414); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_stringRule425); 
            f.set(result,"name",convert(name));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,15,FOLLOW_15_in_stringRule436); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            pushFollow(FOLLOW_alternatives_in_stringRule447);
            content=alternatives();
            _fsp--;

            f.set(result,"content",convert(content));
            ptm.ruleFinished(content,end());
            ptm.invokeRule(null,line(),start());
            match(input,16,FOLLOW_16_in_stringRule457); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end stringRule


    // $ANTLR start enumRule
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:190:1: enumRule returns [EObject result] : 'Enum' name= ID ':' lit= enumLiteral ( '|' lit1= enumLiteral )* ';' ;
    public EObject enumRule() throws RecognitionException {
        EObject result = null;

        Token name=null;
        EObject lit = null;

        EObject lit1 = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:191:5: ( 'Enum' name= ID ':' lit= enumLiteral ( '|' lit1= enumLiteral )* ';' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:191:5: 'Enum' name= ID ':' lit= enumLiteral ( '|' lit1= enumLiteral )* ';'
            {
             result = f.create("EnumRule"); 
                   ptm.setModelElement(result);
                 
            ptm.invokeRule(null,line(),start());
            match(input,18,FOLLOW_18_in_enumRule484); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_enumRule495); 
            f.set(result,"name",convert(name));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,15,FOLLOW_15_in_enumRule506); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            pushFollow(FOLLOW_enumLiteral_in_enumRule517);
            lit=enumLiteral();
            _fsp--;

            f.add(result,"literals",convert(lit));
            ptm.ruleFinished(lit,end());
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:198:5: ( '|' lit1= enumLiteral )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:198:6: '|' lit1= enumLiteral
            	    {
            	    ptm.invokeRule(null,line(),start());
            	    match(input,19,FOLLOW_19_in_enumRule528); 
            	    ptm.ruleFinished(getLastToken(),end());
            	    ptm.invokeRule(null,line(),start());
            	    pushFollow(FOLLOW_enumLiteral_in_enumRule540);
            	    lit1=enumLiteral();
            	    _fsp--;

            	    f.add(result,"literals",convert(lit1));
            	    ptm.ruleFinished(lit1,end());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            ptm.invokeRule(null,line(),start());
            match(input,16,FOLLOW_16_in_enumRule552); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end enumRule


    // $ANTLR start enumLiteral
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:203:1: enumLiteral returns [EObject result] : name= ID '=' kw= STRING ;
    public EObject enumLiteral() throws RecognitionException {
        EObject result = null;

        Token name=null;
        Token kw=null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:204:5: (name= ID '=' kw= STRING )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:204:5: name= ID '=' kw= STRING
            {
             result = f.create("EnumLiteral"); 
                   ptm.setModelElement(result);
                 
            ptm.invokeRule(null,line(),start());
            name=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_enumLiteral580); 
            f.set(result,"name",convert(name));
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            match(input,20,FOLLOW_20_in_enumLiteral590); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            kw=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_enumLiteral601); 
            f.set(result,"keyword",convert(kw));
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end enumLiteral


    // $ANTLR start alternatives
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:212:1: alternatives returns [EObject r] : s1= assignment ( '|' s2= assignment )* ;
    public EObject alternatives() throws RecognitionException {
        EObject r = null;

        EObject s1 = null;

        EObject s2 = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:213:4: (s1= assignment ( '|' s2= assignment )* )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:213:4: s1= assignment ( '|' s2= assignment )*
            {
            r = f.create("Alternatives"); 
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            pushFollow(FOLLOW_assignment_in_alternatives628);
            s1=assignment();
            _fsp--;

            f.add(r,"alternatives",convert(s1));
            ptm.ruleFinished(s1,end());
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:217:5: ( '|' s2= assignment )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // L:\\jax-ws\\xtext.core\\bin\\XText.g:217:6: '|' s2= assignment
            	    {
            	    ptm.invokeRule(null,line(),start());
            	    match(input,19,FOLLOW_19_in_alternatives639); 
            	    ptm.ruleFinished(getLastToken(),end());
            	    ptm.invokeRule(null,line(),start());
            	    pushFollow(FOLLOW_assignment_in_alternatives651);
            	    s2=assignment();
            	    _fsp--;

            	    f.add(r,"alternatives",convert(s2));
            	    ptm.ruleFinished(s2,end());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end alternatives


    // $ANTLR start assignment
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:221:1: assignment returns [EObject r] : ( (feature= ID op= assignOperator tok= abstractToken ) | x= element ) (ct= cardinalityType )? (next= assignment )? ;
    public EObject assignment() throws RecognitionException {
        EObject r = null;

        Token feature=null;
        Object op = null;

        EObject tok = null;

        EObject x = null;

        Object ct = null;

        EObject next = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:4: ( ( (feature= ID op= assignOperator tok= abstractToken ) | x= element ) (ct= cardinalityType )? (next= assignment )? )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:4: ( (feature= ID op= assignOperator tok= abstractToken ) | x= element ) (ct= cardinalityType )? (next= assignment )?
            {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:4: ( (feature= ID op= assignOperator tok= abstractToken ) | x= element )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20||(LA9_1>=26 && LA9_1<=27)) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=ID && LA9_1<=STRING)||LA9_1==16||LA9_1==19||(LA9_1>=21 && LA9_1<=24)||(LA9_1>=28 && LA9_1<=30)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("222:4: ( (feature= ID op= assignOperator tok= abstractToken ) | x= element )", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==STRING||LA9_0==21||(LA9_0>=23 && LA9_0<=24)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("222:4: ( (feature= ID op= assignOperator tok= abstractToken ) | x= element )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:5: (feature= ID op= assignOperator tok= abstractToken )
                    {
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:5: (feature= ID op= assignOperator tok= abstractToken )
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:222:6: feature= ID op= assignOperator tok= abstractToken
                    {
                    r = f.create("Assignment"); 
                           ptm.setModelElement(r);
                         
                    ptm.invokeRule(null,line(),start());
                    feature=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_assignment681); 
                    f.set(r,"feature",convert(feature));
                    ptm.ruleFinished(getLastToken(),end());
                    ptm.invokeRule(null,line(),start());
                    pushFollow(FOLLOW_assignOperator_in_assignment693);
                    op=assignOperator();
                    _fsp--;

                    f.set(r,"operator",convert(op));
                    ptm.ruleFinished(op,end());
                    ptm.invokeRule(null,line(),start());
                    pushFollow(FOLLOW_abstractToken_in_assignment705);
                    tok=abstractToken();
                    _fsp--;

                    f.set(r,"token",convert(tok));

                    }

                    ptm.ruleFinished(tok,end());

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:228:5: x= element
                    {
                    pushFollow(FOLLOW_element_in_assignment717);
                    x=element();
                    _fsp--;

                    r =x;

                    }
                    break;

            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:229:4: (ct= cardinalityType )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=28 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:229:5: ct= cardinalityType
                    {
                    ptm.invokeRule(null,line(),start());
                    pushFollow(FOLLOW_cardinalityType_in_assignment729);
                    ct=cardinalityType();
                    _fsp--;

                    f.set(r,"cardinality",convert(ct));
                    ptm.ruleFinished(ct,end());

                    }
                    break;

            }

            // L:\\jax-ws\\xtext.core\\bin\\XText.g:230:4: (next= assignment )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=ID && LA11_0<=STRING)||LA11_0==21||(LA11_0>=23 && LA11_0<=24)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:230:5: next= assignment
                    {
                    ptm.invokeRule(null,line(),start());
                    pushFollow(FOLLOW_assignment_in_assignment743);
                    next=assignment();
                    _fsp--;

                    f.set(r,"next",convert(next));
                    ptm.ruleFinished(next,end());

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end assignment


    // $ANTLR start element
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:232:1: element returns [EObject r] : (x1= abstractToken | x2= group );
    public EObject element() throws RecognitionException {
        EObject r = null;

        EObject x1 = null;

        EObject x2 = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:233:4: (x1= abstractToken | x2= group )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ID && LA12_0<=STRING)||(LA12_0>=23 && LA12_0<=24)) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("232:1: element returns [EObject r] : (x1= abstractToken | x2= group );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:233:4: x1= abstractToken
                    {
                    pushFollow(FOLLOW_abstractToken_in_element766);
                    x1=abstractToken();
                    _fsp--;

                    r =x1;

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:234:4: x2= group
                    {
                    pushFollow(FOLLOW_group_in_element776);
                    x2=group();
                    _fsp--;

                    r =x2;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end element


    // $ANTLR start group
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:237:1: group returns [EObject r] : '(' x2= alternatives ')' ;
    public EObject group() throws RecognitionException {
        EObject r = null;

        EObject x2 = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:238:4: ( '(' x2= alternatives ')' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:238:4: '(' x2= alternatives ')'
            {
            r = f.create("Group"); 
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            match(input,21,FOLLOW_21_in_group803); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            pushFollow(FOLLOW_alternatives_in_group813);
            x2=alternatives();
            _fsp--;

            f.set(r,"firstElement",convert(x2));
            ptm.ruleFinished(x2,end());
            ptm.invokeRule(null,line(),start());
            match(input,22,FOLLOW_22_in_group823); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end group


    // $ANTLR start abstractToken
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:246:1: abstractToken returns [EObject r] : (x1= keyword | x2= ruleName | x3= reference | x4= fileReference );
    public EObject abstractToken() throws RecognitionException {
        EObject r = null;

        EObject x1 = null;

        EObject x2 = null;

        EObject x3 = null;

        EObject x4 = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:247:4: (x1= keyword | x2= ruleName | x3= reference | x4= fileReference )
            int alt13=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("246:1: abstractToken returns [EObject r] : (x1= keyword | x2= ruleName | x3= reference | x4= fileReference );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:247:4: x1= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_abstractToken846);
                    x1=keyword();
                    _fsp--;

                    r =x1;

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:248:4: x2= ruleName
                    {
                    pushFollow(FOLLOW_ruleName_in_abstractToken856);
                    x2=ruleName();
                    _fsp--;

                    r =x2;

                    }
                    break;
                case 3 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:249:4: x3= reference
                    {
                    pushFollow(FOLLOW_reference_in_abstractToken866);
                    x3=reference();
                    _fsp--;

                    r =x3;

                    }
                    break;
                case 4 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:250:4: x4= fileReference
                    {
                    pushFollow(FOLLOW_fileReference_in_abstractToken876);
                    x4=fileReference();
                    _fsp--;

                    r =x4;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end abstractToken


    // $ANTLR start fileReference
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:253:1: fileReference returns [EObject r] : 'URI' ;
    public EObject fileReference() throws RecognitionException {
        EObject r = null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:254:2: ( 'URI' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:254:2: 'URI'
            {
            r =f.create("FileRef");
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            match(input,23,FOLLOW_23_in_fileReference901); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end fileReference


    // $ANTLR start keyword
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:260:1: keyword returns [EObject r] : s= STRING ;
    public EObject keyword() throws RecognitionException {
        EObject r = null;

        Token s=null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:261:4: (s= STRING )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:261:4: s= STRING
            {
            r =f.create("Keyword");
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            s=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_keyword928); 
             f.set(r,"value",convert(s));
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end keyword


    // $ANTLR start ruleName
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:266:1: ruleName returns [EObject r] : id= ID ;
    public EObject ruleName() throws RecognitionException {
        EObject r = null;

        Token id=null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:267:4: (id= ID )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:267:4: id= ID
            {
            r =f.create("RuleName"); 
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_ruleName954); 
            f.set(r,"name",convert(id));
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end ruleName


    // $ANTLR start reference
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:272:1: reference returns [EObject r] : '[' type= ID ( '|' temp_ruleName= ruleName )? ']' ;
    public EObject reference() throws RecognitionException {
        EObject r = null;

        Token type=null;
        EObject temp_ruleName = null;


        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:273:4: ( '[' type= ID ( '|' temp_ruleName= ruleName )? ']' )
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:273:4: '[' type= ID ( '|' temp_ruleName= ruleName )? ']'
            {
            r =f.create("CrossReference"); 
                   ptm.setModelElement(r);
                 
            ptm.invokeRule(null,line(),start());
            match(input,24,FOLLOW_24_in_reference978); 
            ptm.ruleFinished(getLastToken(),end());
            ptm.invokeRule(null,line(),start());
            type=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_reference989); 
            f.set(r,"type",convert(type));
            ptm.ruleFinished(getLastToken(),end());
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:278:4: ( '|' temp_ruleName= ruleName )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:279:4: '|' temp_ruleName= ruleName
                    {
                    ptm.invokeRule(null,line(),start());
                    match(input,19,FOLLOW_19_in_reference1003); 
                    ptm.ruleFinished(getLastToken(),end());
                    ptm.invokeRule(null,line(),start());
                    pushFollow(FOLLOW_ruleName_in_reference1014);
                    temp_ruleName=ruleName();
                    _fsp--;

                    f.set(r,"ruleName",convert(temp_ruleName));
                    ptm.ruleFinished(getLastToken(),end());

                    }
                    break;

            }

            ptm.invokeRule(null,line(),start());
            match(input,25,FOLLOW_25_in_reference1029); 
            ptm.ruleFinished(getLastToken(),end());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end reference


    // $ANTLR start assignOperator
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:285:1: assignOperator returns [Object e] : ( '=' | '?=' | '+=' );
    public Object assignOperator() throws RecognitionException {
        Object e = null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:286:6: ( '=' | '?=' | '+=' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("285:1: assignOperator returns [Object e] : ( '=' | '?=' | '+=' );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:286:6: '='
                    {
                    match(input,20,FOLLOW_20_in_assignOperator1052); 
                    e=f.enumLit("AssignOperator","ASSIGN");

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:287:6: '?='
                    {
                    match(input,26,FOLLOW_26_in_assignOperator1061); 
                    e=f.enumLit("AssignOperator","BOOLASSIGN");

                    }
                    break;
                case 3 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:288:6: '+='
                    {
                    match(input,27,FOLLOW_27_in_assignOperator1070); 
                    e=f.enumLit("AssignOperator","ADD");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end assignOperator


    // $ANTLR start cardinalityType
    // L:\\jax-ws\\xtext.core\\bin\\XText.g:291:1: cardinalityType returns [Object e] : ( '?' | '*' | '+' );
    public Object cardinalityType() throws RecognitionException {
        Object e = null;

        try {
            // L:\\jax-ws\\xtext.core\\bin\\XText.g:292:6: ( '?' | '*' | '+' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("291:1: cardinalityType returns [Object e] : ( '?' | '*' | '+' );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:292:6: '?'
                    {
                    match(input,28,FOLLOW_28_in_cardinalityType1090); 
                    e=f.enumLit("CardinalityType","OPTIONAL");

                    }
                    break;
                case 2 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:293:6: '*'
                    {
                    match(input,29,FOLLOW_29_in_cardinalityType1099); 
                    e=f.enumLit("CardinalityType","ANY");

                    }
                    break;
                case 3 :
                    // L:\\jax-ws\\xtext.core\\bin\\XText.g:294:6: '+'
                    {
                    match(input,30,FOLLOW_30_in_cardinalityType1108); 
                    e=f.enumLit("CardinalityType","ONEORMORE");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end cardinalityType


 

    public static final BitSet FOLLOW_xtextFile_in_parse54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_xtextFile87 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_xtextFile92 = new BitSet(new long[]{0x0000000000067812L});
    public static final BitSet FOLLOW_11_in_xtextFile105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_xtextFile111 = new BitSet(new long[]{0x0000000000067012L});
    public static final BitSet FOLLOW_12_in_xtextFile126 = new BitSet(new long[]{0x0000000000066012L});
    public static final BitSet FOLLOW_importGrammar_in_xtextFile141 = new BitSet(new long[]{0x0000000000066012L});
    public static final BitSet FOLLOW_rule_in_xtextFile156 = new BitSet(new long[]{0x0000000000064012L});
    public static final BitSet FOLLOW_13_in_importGrammar190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_importGrammar202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeRule_in_rule226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringRule_in_rule238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lexerRule_in_rule250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumRule_in_rule262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_lexerRule287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_lexerRule296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_lexerRule304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_lexerRule313 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_lexerRule322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeRule354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_typeRule364 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_alternatives_in_typeRule375 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_typeRule387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_stringRule414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_stringRule425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stringRule436 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_alternatives_in_stringRule447 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_stringRule457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_enumRule484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_enumRule495 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_enumRule506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumLiteral_in_enumRule517 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_enumRule528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumLiteral_in_enumRule540 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_enumRule552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_enumLiteral580 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_enumLiteral590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_enumLiteral601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_alternatives628 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_alternatives639 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_assignment_in_alternatives651 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_assignment681 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_assignOperator_in_assignment693 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_abstractToken_in_assignment705 = new BitSet(new long[]{0x0000000071A00032L});
    public static final BitSet FOLLOW_element_in_assignment717 = new BitSet(new long[]{0x0000000071A00032L});
    public static final BitSet FOLLOW_cardinalityType_in_assignment729 = new BitSet(new long[]{0x0000000001A00032L});
    public static final BitSet FOLLOW_assignment_in_assignment743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstractToken_in_element766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_element776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_group803 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_alternatives_in_group813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_group823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_abstractToken846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_abstractToken856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_abstractToken866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fileReference_in_abstractToken876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_fileReference901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_keyword928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ruleName954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_reference978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_reference989 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_19_in_reference1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_reference1014 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_reference1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_assignOperator1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_assignOperator1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_assignOperator1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_cardinalityType1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_cardinalityType1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_cardinalityType1108 = new BitSet(new long[]{0x0000000000000002L});

}