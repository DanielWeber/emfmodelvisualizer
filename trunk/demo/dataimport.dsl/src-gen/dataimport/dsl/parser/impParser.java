// $ANTLR 3.0 ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g 2009-01-21 10:07:21

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class impParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'import'", "'ext'", "'='", "'{'", "'}'", "'ref'", "'data'", "'persistent'", "'->'", "':'", "'*'", "'int'", "'range'", "'..'", "'boolean'", "'String'", "'['", "']'", "'regex'", "'records'", "'record'", "'next'", "'.'", "'+='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public impParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[38+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g"; }



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



    // $ANTLR start parse
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:101:1: parse returns [Node r] : result= ruleImportSpec EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:102:3: (result= ruleImportSpec EOF )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:102:3: result= ruleImportSpec EOF
            {
            pushFollow(FOLLOW_ruleImportSpec_in_parse67);
            result=ruleImportSpec();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {

              if (result != null)
                ptm.setModelElement(result);
              r = ptm.getCurrent();
              ptm.ruleFinished(result);
            }
            match(input,EOF,FOLLOW_EOF_in_parse78); if (failed) return r;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleImportSpec
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:112:1: ruleImportSpec returns [EObject result] : ( ( 'import' ) ( 'ext' ) ( '=' ) ( RULE_STRING ) ( '{' ) (temp_OtherFile= ruleOtherFile )* (temp_DataSection= ruleDataSection )? (temp_RecordSection= ruleRecordSection )? ( '}' ) ) ;
    public EObject ruleImportSpec() throws RecognitionException {
        EObject result = null;
        int ruleImportSpec_StartIndex = input.index();
        EObject temp_OtherFile = null;

        EObject temp_DataSection = null;

        EObject temp_RecordSection = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:115:4: ( ( ( 'import' ) ( 'ext' ) ( '=' ) ( RULE_STRING ) ( '{' ) (temp_OtherFile= ruleOtherFile )* (temp_DataSection= ruleDataSection )? (temp_RecordSection= ruleRecordSection )? ( '}' ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:115:4: ( ( 'import' ) ( 'ext' ) ( '=' ) ( RULE_STRING ) ( '{' ) (temp_OtherFile= ruleOtherFile )* (temp_DataSection= ruleDataSection )? (temp_RecordSection= ruleRecordSection )? ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ImportSpec");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:118:1: ( ( 'import' ) ( 'ext' ) ( '=' ) ( RULE_STRING ) ( '{' ) (temp_OtherFile= ruleOtherFile )* (temp_DataSection= ruleDataSection )? (temp_RecordSection= ruleRecordSection )? ( '}' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:118:2: ( 'import' ) ( 'ext' ) ( '=' ) ( RULE_STRING ) ( '{' ) (temp_OtherFile= ruleOtherFile )* (temp_DataSection= ruleDataSection )? (temp_RecordSection= ruleRecordSection )? ( '}' )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:118:2: ( 'import' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:118:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,10,FOLLOW_10_in_ruleImportSpec104); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:124:1: ( 'ext' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:124:2: 'ext'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleImportSpec111); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:130:1: ( '=' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:130:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleImportSpec118); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:136:1: ( RULE_STRING )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:136:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportSpec126); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"fileExt",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:146:1: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:146:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleImportSpec134); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:152:1: (temp_OtherFile= ruleOtherFile )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:152:2: temp_OtherFile= ruleOtherFile
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(5)));
            	    }
            	    pushFollow(FOLLOW_ruleOtherFile_in_ruleImportSpec144);
            	    temp_OtherFile=ruleOtherFile();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_OtherFile != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_OtherFile);
            	        factory.add(result,"refs",convert(temp_OtherFile),false);
            	        ptm.ruleFinished(temp_OtherFile);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:164:1: (temp_DataSection= ruleDataSection )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:164:2: temp_DataSection= ruleDataSection
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(6)));
                    }
                    pushFollow(FOLLOW_ruleDataSection_in_ruleImportSpec156);
                    temp_DataSection=ruleDataSection();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_DataSection != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_DataSection);
                        factory.set(result,"dataSection",convert(temp_DataSection),false);
                        ptm.ruleFinished(temp_DataSection);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:176:1: (temp_RecordSection= ruleRecordSection )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:176:2: temp_RecordSection= ruleRecordSection
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(7)));
                    }
                    pushFollow(FOLLOW_ruleRecordSection_in_ruleImportSpec168);
                    temp_RecordSection=ruleRecordSection();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_RecordSection != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_RecordSection);
                        factory.set(result,"recordSection",convert(temp_RecordSection),false);
                        ptm.ruleFinished(temp_RecordSection);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:188:1: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:188:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleImportSpec177); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(8)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleImportSpec_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleImportSpec


    // $ANTLR start ruleOtherFile
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:201:1: ruleOtherFile returns [EObject result] : ( ( 'ref' ) ( RULE_STRING ) ) ;
    public EObject ruleOtherFile() throws RecognitionException {
        EObject result = null;
        int ruleOtherFile_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:204:4: ( ( ( 'ref' ) ( RULE_STRING ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:204:4: ( ( 'ref' ) ( RULE_STRING ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "OtherFile");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:207:1: ( ( 'ref' ) ( RULE_STRING ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:207:2: ( 'ref' ) ( RULE_STRING )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:207:2: ( 'ref' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:207:3: 'ref'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleOtherFile215); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:213:1: ( RULE_STRING )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:213:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOtherFile224); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"file",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleOtherFile_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleOtherFile


    // $ANTLR start ruleDataStructure
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:231:1: ruleDataStructure returns [EObject result] : ( ( 'data' ) ( RULE_ID ) ( 'persistent' )? ( '{' ) ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )* ( '}' ) ) ;
    public EObject ruleDataStructure() throws RecognitionException {
        EObject result = null;
        int ruleDataStructure_StartIndex = input.index();
        EObject temp_Attribute = null;

        EObject temp_Reference = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:234:4: ( ( ( 'data' ) ( RULE_ID ) ( 'persistent' )? ( '{' ) ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )* ( '}' ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:234:4: ( ( 'data' ) ( RULE_ID ) ( 'persistent' )? ( '{' ) ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DataStructure");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:237:1: ( ( 'data' ) ( RULE_ID ) ( 'persistent' )? ( '{' ) ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )* ( '}' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:237:2: ( 'data' ) ( RULE_ID ) ( 'persistent' )? ( '{' ) ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )* ( '}' )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:237:2: ( 'data' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:237:3: 'data'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleDataStructure264); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:243:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:243:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataStructure272); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:253:1: ( 'persistent' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:253:2: 'persistent'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleDataStructure281); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
                        factory.set(result,"isPersistent",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:263:1: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:263:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleDataStructure290); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:269:1: ( (temp_Attribute= ruleAttribute ) | (temp_Reference= ruleReference ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }
                else if ( (LA5_0==18) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:269:2: (temp_Attribute= ruleAttribute )
            	    {
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:269:2: (temp_Attribute= ruleAttribute )
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:269:3: temp_Attribute= ruleAttribute
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleDataStructure301);
            	    temp_Attribute=ruleAttribute();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Attribute != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Attribute);
            	        factory.add(result,"attributes",convert(temp_Attribute),false);
            	        ptm.ruleFinished(temp_Attribute);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:281:1: (temp_Reference= ruleReference )
            	    {
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:281:1: (temp_Reference= ruleReference )
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:281:2: temp_Reference= ruleReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleReference_in_ruleDataStructure314);
            	    temp_Reference=ruleReference();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Reference != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Reference);
            	        factory.add(result,"references",convert(temp_Reference),false);
            	        ptm.ruleFinished(temp_Reference);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:294:1: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:294:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleDataStructure325); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleDataStructure_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDataStructure


    // $ANTLR start ruleReference
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:307:1: ruleReference returns [EObject result] : ( ( '->' ) ( RULE_ID ) ( ':' ) ( RULE_ID ) ( '*' )? ) ;
    public EObject ruleReference() throws RecognitionException {
        EObject result = null;
        int ruleReference_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:310:4: ( ( ( '->' ) ( RULE_ID ) ( ':' ) ( RULE_ID ) ( '*' )? ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:310:4: ( ( '->' ) ( RULE_ID ) ( ':' ) ( RULE_ID ) ( '*' )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Reference");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:313:1: ( ( '->' ) ( RULE_ID ) ( ':' ) ( RULE_ID ) ( '*' )? )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:313:2: ( '->' ) ( RULE_ID ) ( ':' ) ( RULE_ID ) ( '*' )?
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:313:2: ( '->' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:313:3: '->'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleReference363); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:319:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:319:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference371); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:329:1: ( ':' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:329:2: ':'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleReference379); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:335:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:335:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference387); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"type",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:346:1: ( '*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:346:2: '*'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleReference397); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
                        factory.set(result,"ismulti",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleReference


    // $ANTLR start ruleAttribute
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:363:1: ruleAttribute returns [EObject result] : ( ( RULE_ID ) ( ':' ) (temp_AttributeType= ruleAttributeType ) ) ;
    public EObject ruleAttribute() throws RecognitionException {
        EObject result = null;
        int ruleAttribute_StartIndex = input.index();
        EObject temp_AttributeType = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:366:4: ( ( ( RULE_ID ) ( ':' ) (temp_AttributeType= ruleAttributeType ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:366:4: ( ( RULE_ID ) ( ':' ) (temp_AttributeType= ruleAttributeType ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Attribute");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:369:1: ( ( RULE_ID ) ( ':' ) (temp_AttributeType= ruleAttributeType ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:369:2: ( RULE_ID ) ( ':' ) (temp_AttributeType= ruleAttributeType )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:369:2: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:369:3: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute438); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:379:1: ( ':' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:379:2: ':'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleAttribute446); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:385:1: (temp_AttributeType= ruleAttributeType )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:385:2: temp_AttributeType= ruleAttributeType
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute456);
            temp_AttributeType=ruleAttributeType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_AttributeType != null) {
                hasContent = true;
                ptm.setModelElement(temp_AttributeType);
                factory.set(result,"type",convert(temp_AttributeType),false);
                ptm.ruleFinished(temp_AttributeType);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, ruleAttribute_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start ruleAttributeType
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:404:1: ruleAttributeType returns [EObject result] : (temp_inttype= ruleIntType | temp_booleantype= ruleBooleanType | temp_stringtype= ruleStringType );
    public EObject ruleAttributeType() throws RecognitionException {
        EObject result = null;
        int ruleAttributeType_StartIndex = input.index();
        EObject temp_inttype = null;

        EObject temp_booleantype = null;

        EObject temp_stringtype = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:406:9: (temp_inttype= ruleIntType | temp_booleantype= ruleBooleanType | temp_stringtype= ruleStringType )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("404:1: ruleAttributeType returns [EObject result] : (temp_inttype= ruleIntType | temp_booleantype= ruleBooleanType | temp_stringtype= ruleStringType );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:406:9: temp_inttype= ruleIntType
                    {
                    pushFollow(FOLLOW_ruleIntType_in_ruleAttributeType492);
                    temp_inttype=ruleIntType();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_inttype;
                    }

                    }
                    break;
                case 2 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:406:67: temp_booleantype= ruleBooleanType
                    {
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleAttributeType507);
                    temp_booleantype=ruleBooleanType();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_booleantype;
                    }

                    }
                    break;
                case 3 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:406:137: temp_stringtype= ruleStringType
                    {
                    pushFollow(FOLLOW_ruleStringType_in_ruleAttributeType522);
                    temp_stringtype=ruleStringType();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_stringtype;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleAttributeType_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAttributeType


    // $ANTLR start ruleIntType
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:408:1: ruleIntType returns [EObject result] : ( ( 'int' ) (temp_Range= ruleRange )? ) ;
    public EObject ruleIntType() throws RecognitionException {
        EObject result = null;
        int ruleIntType_StartIndex = input.index();
        EObject temp_Range = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:411:4: ( ( ( 'int' ) (temp_Range= ruleRange )? ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:411:4: ( ( 'int' ) (temp_Range= ruleRange )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "IntType");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:414:1: ( ( 'int' ) (temp_Range= ruleRange )? )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:414:2: ( 'int' ) (temp_Range= ruleRange )?
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:414:2: ( 'int' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:414:3: 'int'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleIntType550); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:420:1: (temp_Range= ruleRange )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:420:2: temp_Range= ruleRange
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleIntType560);
                    temp_Range=ruleRange();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Range != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Range);
                        factory.set(result,"range",convert(temp_Range),false);
                        ptm.ruleFinished(temp_Range);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleIntType_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start ruleRange
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:439:1: ruleRange returns [EObject result] : ( ( 'range' ) ( RULE_INT ) ( '..' ) ( RULE_INT ) ) ;
    public EObject ruleRange() throws RecognitionException {
        EObject result = null;
        int ruleRange_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:442:4: ( ( ( 'range' ) ( RULE_INT ) ( '..' ) ( RULE_INT ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:442:4: ( ( 'range' ) ( RULE_INT ) ( '..' ) ( RULE_INT ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Range");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:445:1: ( ( 'range' ) ( RULE_INT ) ( '..' ) ( RULE_INT ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:445:2: ( 'range' ) ( RULE_INT ) ( '..' ) ( RULE_INT )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:445:2: ( 'range' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:445:3: 'range'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleRange600); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:451:1: ( RULE_INT )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:451:2: RULE_INT
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange608); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"min",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:461:1: ( '..' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:461:2: '..'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleRange616); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:467:1: ( RULE_INT )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:467:2: RULE_INT
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange624); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"max",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, ruleRange_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRange


    // $ANTLR start ruleBooleanType
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:484:1: ruleBooleanType returns [EObject result] : ( 'boolean' ) ;
    public EObject ruleBooleanType() throws RecognitionException {
        EObject result = null;
        int ruleBooleanType_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:487:4: ( ( 'boolean' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:487:4: ( 'boolean' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BooleanType");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:490:1: ( 'boolean' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:490:2: 'boolean'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,24,FOLLOW_24_in_ruleBooleanType662); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ruleBooleanType_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBooleanType


    // $ANTLR start ruleStringType
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:502:1: ruleStringType returns [EObject result] : ( ( 'String' ) ( ( '[' ) ( RULE_INT ) ( ']' ) )? ( ( 'regex' ) ( RULE_STRING ) )? ) ;
    public EObject ruleStringType() throws RecognitionException {
        EObject result = null;
        int ruleStringType_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:505:4: ( ( ( 'String' ) ( ( '[' ) ( RULE_INT ) ( ']' ) )? ( ( 'regex' ) ( RULE_STRING ) )? ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:505:4: ( ( 'String' ) ( ( '[' ) ( RULE_INT ) ( ']' ) )? ( ( 'regex' ) ( RULE_STRING ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StringType");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:508:1: ( ( 'String' ) ( ( '[' ) ( RULE_INT ) ( ']' ) )? ( ( 'regex' ) ( RULE_STRING ) )? )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:508:2: ( 'String' ) ( ( '[' ) ( RULE_INT ) ( ']' ) )? ( ( 'regex' ) ( RULE_STRING ) )?
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:508:2: ( 'String' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:508:3: 'String'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,25,FOLLOW_25_in_ruleStringType698); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:514:1: ( ( '[' ) ( RULE_INT ) ( ']' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:514:2: ( '[' ) ( RULE_INT ) ( ']' )
                    {
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:514:2: ( '[' )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:514:3: '['
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleStringType706); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:520:1: ( RULE_INT )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:520:2: RULE_INT
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringType714); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"len",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:530:1: ( ']' )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:530:2: ']'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,27,FOLLOW_27_in_ruleStringType722); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:537:1: ( ( 'regex' ) ( RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:537:2: ( 'regex' ) ( RULE_STRING )
                    {
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:537:2: ( 'regex' )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:537:3: 'regex'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,28,FOLLOW_28_in_ruleStringType733); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:543:1: ( RULE_STRING )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:543:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringType741); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"regex",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleStringType_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStringType


    // $ANTLR start ruleDataSection
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:561:1: ruleDataSection returns [EObject result] : ( ( 'data' ) ( '{' ) (temp_DataStructure= ruleDataStructure )* ( '}' ) ) ;
    public EObject ruleDataSection() throws RecognitionException {
        EObject result = null;
        int ruleDataSection_StartIndex = input.index();
        EObject temp_DataStructure = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:564:4: ( ( ( 'data' ) ( '{' ) (temp_DataStructure= ruleDataStructure )* ( '}' ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:564:4: ( ( 'data' ) ( '{' ) (temp_DataStructure= ruleDataStructure )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DataSection");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:567:1: ( ( 'data' ) ( '{' ) (temp_DataStructure= ruleDataStructure )* ( '}' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:567:2: ( 'data' ) ( '{' ) (temp_DataStructure= ruleDataStructure )* ( '}' )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:567:2: ( 'data' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:567:3: 'data'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleDataSection783); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:573:1: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:573:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleDataSection790); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:579:1: (temp_DataStructure= ruleDataStructure )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:579:2: temp_DataStructure= ruleDataStructure
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleDataStructure_in_ruleDataSection800);
            	    temp_DataStructure=ruleDataStructure();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_DataStructure != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_DataStructure);
            	        factory.add(result,"dataStructures",convert(temp_DataStructure),false);
            	        ptm.ruleFinished(temp_DataStructure);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:591:1: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:591:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleDataSection809); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleDataSection_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDataSection


    // $ANTLR start ruleRecordSection
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:604:1: ruleRecordSection returns [EObject result] : ( ( 'records' ) ( '{' ) (temp_RecordHandler= ruleRecordHandler )* ( '}' ) ) ;
    public EObject ruleRecordSection() throws RecognitionException {
        EObject result = null;
        int ruleRecordSection_StartIndex = input.index();
        EObject temp_RecordHandler = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:607:4: ( ( ( 'records' ) ( '{' ) (temp_RecordHandler= ruleRecordHandler )* ( '}' ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:607:4: ( ( 'records' ) ( '{' ) (temp_RecordHandler= ruleRecordHandler )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RecordSection");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:610:1: ( ( 'records' ) ( '{' ) (temp_RecordHandler= ruleRecordHandler )* ( '}' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:610:2: ( 'records' ) ( '{' ) (temp_RecordHandler= ruleRecordHandler )* ( '}' )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:610:2: ( 'records' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:610:3: 'records'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,29,FOLLOW_29_in_ruleRecordSection847); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:616:1: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:616:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleRecordSection854); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:622:1: (temp_RecordHandler= ruleRecordHandler )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:622:2: temp_RecordHandler= ruleRecordHandler
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleRecordHandler_in_ruleRecordSection864);
            	    temp_RecordHandler=ruleRecordHandler();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_RecordHandler != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_RecordHandler);
            	        factory.add(result,"recordHandlers",convert(temp_RecordHandler),false);
            	        ptm.ruleFinished(temp_RecordHandler);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:634:1: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:634:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleRecordSection873); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleRecordSection_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRecordSection


    // $ANTLR start ruleRecordHandler
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:647:1: ruleRecordHandler returns [EObject result] : ( ( 'record' ) ( RULE_ID ) ( '{' ) ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )* (temp_RecordHandler= ruleRecordHandler )* (temp_Jump= ruleJump )? ( '}' ) ) ;
    public EObject ruleRecordHandler() throws RecognitionException {
        EObject result = null;
        int ruleRecordHandler_StartIndex = input.index();
        EObject temp_Instance = null;

        EObject temp_FieldMapping = null;

        EObject temp_GraphBuild = null;

        EObject temp_RecordHandler = null;

        EObject temp_Jump = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:650:4: ( ( ( 'record' ) ( RULE_ID ) ( '{' ) ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )* (temp_RecordHandler= ruleRecordHandler )* (temp_Jump= ruleJump )? ( '}' ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:650:4: ( ( 'record' ) ( RULE_ID ) ( '{' ) ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )* (temp_RecordHandler= ruleRecordHandler )* (temp_Jump= ruleJump )? ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RecordHandler");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:653:1: ( ( 'record' ) ( RULE_ID ) ( '{' ) ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )* (temp_RecordHandler= ruleRecordHandler )* (temp_Jump= ruleJump )? ( '}' ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:653:2: ( 'record' ) ( RULE_ID ) ( '{' ) ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )* (temp_RecordHandler= ruleRecordHandler )* (temp_Jump= ruleJump )? ( '}' )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:653:2: ( 'record' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:653:3: 'record'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,30,FOLLOW_30_in_ruleRecordHandler911); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:659:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:659:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordHandler919); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:669:1: ( '{' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:669:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleRecordHandler927); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:675:1: ( (temp_Instance= ruleInstance ) | (temp_FieldMapping= ruleFieldMapping ) | (temp_GraphBuild= ruleGraphBuild ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==19) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==32) ) {
                        alt13=3;
                    }


                }
                else if ( (LA13_0==RULE_INT) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:675:2: (temp_Instance= ruleInstance )
            	    {
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:675:2: (temp_Instance= ruleInstance )
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:675:3: temp_Instance= ruleInstance
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
            	    }
            	    pushFollow(FOLLOW_ruleInstance_in_ruleRecordHandler938);
            	    temp_Instance=ruleInstance();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Instance != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Instance);
            	        factory.add(result,"instances",convert(temp_Instance),false);
            	        ptm.ruleFinished(temp_Instance);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:687:1: (temp_FieldMapping= ruleFieldMapping )
            	    {
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:687:1: (temp_FieldMapping= ruleFieldMapping )
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:687:2: temp_FieldMapping= ruleFieldMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleFieldMapping_in_ruleRecordHandler951);
            	    temp_FieldMapping=ruleFieldMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FieldMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FieldMapping);
            	        factory.add(result,"fieldMappings",convert(temp_FieldMapping),false);
            	        ptm.ruleFinished(temp_FieldMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:699:1: (temp_GraphBuild= ruleGraphBuild )
            	    {
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:699:1: (temp_GraphBuild= ruleGraphBuild )
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:699:2: temp_GraphBuild= ruleGraphBuild
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleGraphBuild_in_ruleRecordHandler964);
            	    temp_GraphBuild=ruleGraphBuild();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_GraphBuild != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_GraphBuild);
            	        factory.add(result,"graphBuilds",convert(temp_GraphBuild),false);
            	        ptm.ruleFinished(temp_GraphBuild);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:712:1: (temp_RecordHandler= ruleRecordHandler )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:712:2: temp_RecordHandler= ruleRecordHandler
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleRecordHandler_in_ruleRecordHandler978);
            	    temp_RecordHandler=ruleRecordHandler();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_RecordHandler != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_RecordHandler);
            	        factory.add(result,"nextSteps",convert(temp_RecordHandler),false);
            	        ptm.ruleFinished(temp_RecordHandler);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:724:1: (temp_Jump= ruleJump )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:724:2: temp_Jump= ruleJump
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(5)));
                    }
                    pushFollow(FOLLOW_ruleJump_in_ruleRecordHandler990);
                    temp_Jump=ruleJump();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Jump != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Jump);
                        factory.set(result,"jump",convert(temp_Jump),false);
                        ptm.ruleFinished(temp_Jump);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:736:1: ( '}' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:736:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleRecordHandler999); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, ruleRecordHandler_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRecordHandler


    // $ANTLR start ruleJump
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:749:1: ruleJump returns [EObject result] : ( ( 'next' ) ( RULE_ID ) ) ;
    public EObject ruleJump() throws RecognitionException {
        EObject result = null;
        int ruleJump_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:752:4: ( ( ( 'next' ) ( RULE_ID ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:752:4: ( ( 'next' ) ( RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Jump");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:755:1: ( ( 'next' ) ( RULE_ID ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:755:2: ( 'next' ) ( RULE_ID )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:755:2: ( 'next' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:755:3: 'next'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,31,FOLLOW_31_in_ruleJump1037); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:761:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:761:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJump1045); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"nextRecord",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, ruleJump_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleJump


    // $ANTLR start ruleGraphBuild
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:779:1: ruleGraphBuild returns [EObject result] : ( ( RULE_ID ) ( '.' ) ( RULE_ID ) ( ( '=' ) | ( '+=' ) ) ( RULE_ID ) ) ;
    public EObject ruleGraphBuild() throws RecognitionException {
        EObject result = null;
        int ruleGraphBuild_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:782:4: ( ( ( RULE_ID ) ( '.' ) ( RULE_ID ) ( ( '=' ) | ( '+=' ) ) ( RULE_ID ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:782:4: ( ( RULE_ID ) ( '.' ) ( RULE_ID ) ( ( '=' ) | ( '+=' ) ) ( RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GraphBuild");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:785:1: ( ( RULE_ID ) ( '.' ) ( RULE_ID ) ( ( '=' ) | ( '+=' ) ) ( RULE_ID ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:785:2: ( RULE_ID ) ( '.' ) ( RULE_ID ) ( ( '=' ) | ( '+=' ) ) ( RULE_ID )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:785:2: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:785:3: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraphBuild1086); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"ownerInstance",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:796:1: ( '.' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:796:2: '.'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,32,FOLLOW_32_in_ruleGraphBuild1095); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:802:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:802:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraphBuild1103); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"ownerRef",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:813:1: ( ( '=' ) | ( '+=' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("813:1: ( ( '=' ) | ( '+=' ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:813:2: ( '=' )
                    {
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:813:2: ( '=' )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:813:3: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,12,FOLLOW_12_in_ruleGraphBuild1114); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"one",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:823:1: ( '+=' )
                    {
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:823:1: ( '+=' )
                    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:823:2: '+='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,33,FOLLOW_33_in_ruleGraphBuild1125); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                        factory.set(result,"several",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:834:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:834:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGraphBuild1136); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"targetInstance",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, ruleGraphBuild_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGraphBuild


    // $ANTLR start ruleFieldMapping
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:852:1: ruleFieldMapping returns [EObject result] : ( ( RULE_INT ) ( '->' ) ( RULE_ID ) ( '.' ) ( RULE_ID ) ) ;
    public EObject ruleFieldMapping() throws RecognitionException {
        EObject result = null;
        int ruleFieldMapping_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:855:4: ( ( ( RULE_INT ) ( '->' ) ( RULE_ID ) ( '.' ) ( RULE_ID ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:855:4: ( ( RULE_INT ) ( '->' ) ( RULE_ID ) ( '.' ) ( RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FieldMapping");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:858:1: ( ( RULE_INT ) ( '->' ) ( RULE_ID ) ( '.' ) ( RULE_ID ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:858:2: ( RULE_INT ) ( '->' ) ( RULE_ID ) ( '.' ) ( RULE_ID )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:858:2: ( RULE_INT )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:858:3: RULE_INT
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldMapping1177); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"index",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:868:1: ( '->' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:868:2: '->'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFieldMapping1185); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:874:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:874:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldMapping1193); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"instance",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:885:1: ( '.' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:885:2: '.'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,32,FOLLOW_32_in_ruleFieldMapping1202); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:891:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:891:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldMapping1210); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"field",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, ruleFieldMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFieldMapping


    // $ANTLR start ruleInstance
    // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:909:1: ruleInstance returns [EObject result] : ( ( RULE_ID ) ( ':' ) ( RULE_ID ) ) ;
    public EObject ruleInstance() throws RecognitionException {
        EObject result = null;
        int ruleInstance_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:912:4: ( ( ( RULE_ID ) ( ':' ) ( RULE_ID ) ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:912:4: ( ( RULE_ID ) ( ':' ) ( RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Instance");
              			 
            }
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:915:1: ( ( RULE_ID ) ( ':' ) ( RULE_ID ) )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:915:2: ( RULE_ID ) ( ':' ) ( RULE_ID )
            {
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:915:2: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:915:3: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1251); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:925:1: ( ':' )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:925:2: ':'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleInstance1259); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:931:1: ( RULE_ID )
            // ..//dataimport.dsl/src-gen/dataimport/dsl/parser/imp.g:931:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstance1267); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"type",convert(temp),true);
                ptm.ruleFinished(temp);
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, ruleInstance_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleInstance


 

    public static final BitSet FOLLOW_ruleImportSpec_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleImportSpec104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImportSpec111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImportSpec118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportSpec126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportSpec134 = new BitSet(new long[]{0x000000002001C000L});
    public static final BitSet FOLLOW_ruleOtherFile_in_ruleImportSpec144 = new BitSet(new long[]{0x000000002001C000L});
    public static final BitSet FOLLOW_ruleDataSection_in_ruleImportSpec156 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ruleRecordSection_in_ruleImportSpec168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportSpec177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOtherFile215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOtherFile224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataStructure264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataStructure272 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleDataStructure281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataStructure290 = new BitSet(new long[]{0x0000000000044020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDataStructure301 = new BitSet(new long[]{0x0000000000044020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleDataStructure314 = new BitSet(new long[]{0x0000000000044020L});
    public static final BitSet FOLLOW_14_in_ruleDataStructure325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleReference363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference371 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReference379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference387 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleReference397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute438 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute446 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleAttributeType492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleAttributeType507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleAttributeType522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIntType550 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleIntType560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRange600 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange608 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRange616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanType662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStringType698 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_26_in_ruleStringType706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringType714 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStringType722 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleStringType733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringType741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataSection783 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDataSection790 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleDataStructure_in_ruleDataSection800 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleDataSection809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRecordSection847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordSection854 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_ruleRecordHandler_in_ruleRecordSection864 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordSection873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRecordHandler911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordHandler919 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecordHandler927 = new BitSet(new long[]{0x00000000C0004060L});
    public static final BitSet FOLLOW_ruleInstance_in_ruleRecordHandler938 = new BitSet(new long[]{0x00000000C0004060L});
    public static final BitSet FOLLOW_ruleFieldMapping_in_ruleRecordHandler951 = new BitSet(new long[]{0x00000000C0004060L});
    public static final BitSet FOLLOW_ruleGraphBuild_in_ruleRecordHandler964 = new BitSet(new long[]{0x00000000C0004060L});
    public static final BitSet FOLLOW_ruleRecordHandler_in_ruleRecordHandler978 = new BitSet(new long[]{0x00000000C0004000L});
    public static final BitSet FOLLOW_ruleJump_in_ruleRecordHandler990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecordHandler999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJump1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJump1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraphBuild1086 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleGraphBuild1095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraphBuild1103 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_12_in_ruleGraphBuild1114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33_in_ruleGraphBuild1125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGraphBuild1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldMapping1177 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFieldMapping1185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldMapping1193 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFieldMapping1202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldMapping1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInstance1259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstance1267 = new BitSet(new long[]{0x0000000000000002L});

}