package org.openarchitectureware.vis.graphviz.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.openarchitectureware.vis.graphviz.services.DotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOT_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graphs'", "'{'", "'}'", "'graph'", "'strict'", "';'", "'='", "'['", "']'", "','", "'subgraph'", "'->'", "'--'", "'digraph'", "'node'", "'edge'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=7;
    public static final int RULE_DOT_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalDotParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[60+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private DotGrammarAccess grammarAccess;
     	
        public InternalDotParser(TokenStream input, IAstFactory factory, DotGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "graphvizmodel";	
       	}
       	
       	@Override
       	protected DotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulegraphvizmodel
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:84:1: entryRulegraphvizmodel returns [EObject current=null] : iv_rulegraphvizmodel= rulegraphvizmodel EOF ;
    public final EObject entryRulegraphvizmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegraphvizmodel = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:85:2: (iv_rulegraphvizmodel= rulegraphvizmodel EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:86:2: iv_rulegraphvizmodel= rulegraphvizmodel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphvizmodelRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulegraphvizmodel_in_entryRulegraphvizmodel81);
            iv_rulegraphvizmodel=rulegraphvizmodel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulegraphvizmodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegraphvizmodel91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulegraphvizmodel


    // $ANTLR start rulegraphvizmodel
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:93:1: rulegraphvizmodel returns [EObject current=null] : ( 'graphs' '{' ( (lv_graphs_2_0= rulegraph ) )* '}' ) ;
    public final EObject rulegraphvizmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:98:6: ( ( 'graphs' '{' ( (lv_graphs_2_0= rulegraph ) )* '}' ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:99:1: ( 'graphs' '{' ( (lv_graphs_2_0= rulegraph ) )* '}' )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:99:1: ( 'graphs' '{' ( (lv_graphs_2_0= rulegraph ) )* '}' )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:99:3: 'graphs' '{' ( (lv_graphs_2_0= rulegraph ) )* '}'
            {
            match(input,12,FOLLOW_12_in_rulegraphvizmodel126); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphvizmodelAccess().getGraphsKeyword_0(), null); 
                  
            }
            match(input,13,FOLLOW_13_in_rulegraphvizmodel136); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphvizmodelAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:107:1: ( (lv_graphs_2_0= rulegraph ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:108:1: (lv_graphs_2_0= rulegraph )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:108:1: (lv_graphs_2_0= rulegraph )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:109:3: lv_graphs_2_0= rulegraph
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getGraphvizmodelAccess().getGraphsGraphParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulegraph_in_rulegraphvizmodel157);
            	    lv_graphs_2_0=rulegraph();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getGraphvizmodelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"graphs",
            	      	        		lv_graphs_2_0, 
            	      	        		"graph", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_rulegraphvizmodel168); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphvizmodelAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulegraphvizmodel


    // $ANTLR start entryRulegraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:143:1: entryRulegraph returns [EObject current=null] : iv_rulegraph= rulegraph EOF ;
    public final EObject entryRulegraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegraph = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:144:2: (iv_rulegraph= rulegraph EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:145:2: iv_rulegraph= rulegraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulegraph_in_entryRulegraph204);
            iv_rulegraph=rulegraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulegraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegraph214); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulegraph


    // $ANTLR start rulegraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:152:1: rulegraph returns [EObject current=null] : ( 'graph' ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= rulegraphtype ) ) ( (lv_name_3_0= RULE_DOT_ID ) )? '{' ( (lv_stmts_5_0= rulestmt ) )* '}' ) ;
    public final EObject rulegraph() throws RecognitionException {
        EObject current = null;

        Token lv_strict_1_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_stmts_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:157:6: ( ( 'graph' ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= rulegraphtype ) ) ( (lv_name_3_0= RULE_DOT_ID ) )? '{' ( (lv_stmts_5_0= rulestmt ) )* '}' ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:158:1: ( 'graph' ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= rulegraphtype ) ) ( (lv_name_3_0= RULE_DOT_ID ) )? '{' ( (lv_stmts_5_0= rulestmt ) )* '}' )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:158:1: ( 'graph' ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= rulegraphtype ) ) ( (lv_name_3_0= RULE_DOT_ID ) )? '{' ( (lv_stmts_5_0= rulestmt ) )* '}' )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:158:3: 'graph' ( (lv_strict_1_0= 'strict' ) )? ( (lv_type_2_0= rulegraphtype ) ) ( (lv_name_3_0= RULE_DOT_ID ) )? '{' ( (lv_stmts_5_0= rulestmt ) )* '}'
            {
            match(input,15,FOLLOW_15_in_rulegraph249); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphAccess().getGraphKeyword_0(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:162:1: ( (lv_strict_1_0= 'strict' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:163:1: (lv_strict_1_0= 'strict' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:163:1: (lv_strict_1_0= 'strict' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:164:3: lv_strict_1_0= 'strict'
                    {
                    lv_strict_1_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_rulegraph267); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getGraphAccess().getStrictStrictKeyword_1_0(), "strict"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getGraphRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "strict", true, "strict", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:183:3: ( (lv_type_2_0= rulegraphtype ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:184:1: (lv_type_2_0= rulegraphtype )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:184:1: (lv_type_2_0= rulegraphtype )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:185:3: lv_type_2_0= rulegraphtype
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getGraphAccess().getTypeGraphtypeEnumRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulegraphtype_in_rulegraph302);
            lv_type_2_0=rulegraphtype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getGraphRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_2_0, 
              	        		"graphtype", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:207:2: ( (lv_name_3_0= RULE_DOT_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOT_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:208:1: (lv_name_3_0= RULE_DOT_ID )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:208:1: (lv_name_3_0= RULE_DOT_ID )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:209:3: lv_name_3_0= RULE_DOT_ID
                    {
                    lv_name_3_0=(Token)input.LT(1);
                    match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulegraph319); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getGraphAccess().getNameDOT_IDTerminalRuleCall_3_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getGraphRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_3_0, 
                      	        		"DOT_ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulegraph335); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:235:1: ( (lv_stmts_5_0= rulestmt ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOT_ID||LA4_0==13||LA4_0==15||LA4_0==22||(LA4_0>=26 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:236:1: (lv_stmts_5_0= rulestmt )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:236:1: (lv_stmts_5_0= rulestmt )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:237:3: lv_stmts_5_0= rulestmt
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getGraphAccess().getStmtsStmtParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestmt_in_rulegraph356);
            	    lv_stmts_5_0=rulestmt();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getGraphRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"stmts",
            	      	        		lv_stmts_5_0, 
            	      	        		"stmt", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_rulegraph367); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulegraph


    // $ANTLR start entryRulestmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:271:1: entryRulestmt returns [EObject current=null] : iv_rulestmt= rulestmt EOF ;
    public final EObject entryRulestmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestmt = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:272:2: (iv_rulestmt= rulestmt EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:273:2: iv_rulestmt= rulestmt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStmtRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulestmt_in_entryRulestmt403);
            iv_rulestmt=rulestmt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestmt413); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulestmt


    // $ANTLR start rulestmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:280:1: rulestmt returns [EObject current=null] : ( (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph ) ( ';' )? ) ;
    public final EObject rulestmt() throws RecognitionException {
        EObject current = null;

        EObject this_edge_stmt_node_0 = null;

        EObject this_edge_stmt_subgraph_1 = null;

        EObject this_node_stmt_2 = null;

        EObject this_attribute_3 = null;

        EObject this_attr_stmt_4 = null;

        EObject this_subgraph_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:285:6: ( ( (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph ) ( ';' )? ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:286:1: ( (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph ) ( ';' )? )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:286:1: ( (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph ) ( ';' )? )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph ) ( ';' )?
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_DOT_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt5=1;
                }
                else if ( (synpred7()) ) {
                    alt5=3;
                }
                else if ( (synpred8()) ) {
                    alt5=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph )", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred6()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph )", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred6()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph )", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 26:
            case 27:
                {
                alt5=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("286:2: (this_edge_stmt_node_0= ruleedge_stmt_node | this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph | this_node_stmt_2= rulenode_stmt | this_attribute_3= ruleattribute | this_attr_stmt_4= ruleattr_stmt | this_subgraph_5= rulesubgraph )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:287:2: this_edge_stmt_node_0= ruleedge_stmt_node
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getEdge_stmt_nodeParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleedge_stmt_node_in_rulestmt464);
                    this_edge_stmt_node_0=ruleedge_stmt_node();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_edge_stmt_node_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:300:2: this_edge_stmt_subgraph_1= ruleedge_stmt_subgraph
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getEdge_stmt_subgraphParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_rulestmt494);
                    this_edge_stmt_subgraph_1=ruleedge_stmt_subgraph();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_edge_stmt_subgraph_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:313:2: this_node_stmt_2= rulenode_stmt
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getNode_stmtParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulenode_stmt_in_rulestmt524);
                    this_node_stmt_2=rulenode_stmt();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_node_stmt_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:326:2: this_attribute_3= ruleattribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleattribute_in_rulestmt554);
                    this_attribute_3=ruleattribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_attribute_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:339:2: this_attr_stmt_4= ruleattr_stmt
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getAttr_stmtParserRuleCall_0_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleattr_stmt_in_rulestmt584);
                    this_attr_stmt_4=ruleattr_stmt();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_attr_stmt_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:352:2: this_subgraph_5= rulesubgraph
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStmtAccess().getSubgraphParserRuleCall_0_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulesubgraph_in_rulestmt614);
                    this_subgraph_5=rulesubgraph();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_subgraph_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:363:2: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:363:4: ';'
                    {
                    match(input,17,FOLLOW_17_in_rulestmt625); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStmtAccess().getSemicolonKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulestmt


    // $ANTLR start entryRuleedge_stmt_node
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:375:1: entryRuleedge_stmt_node returns [EObject current=null] : iv_ruleedge_stmt_node= ruleedge_stmt_node EOF ;
    public final EObject entryRuleedge_stmt_node() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleedge_stmt_node = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:376:2: (iv_ruleedge_stmt_node= ruleedge_stmt_node EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:377:2: iv_ruleedge_stmt_node= ruleedge_stmt_node EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEdge_stmt_nodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleedge_stmt_node_in_entryRuleedge_stmt_node663);
            iv_ruleedge_stmt_node=ruleedge_stmt_node();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleedge_stmt_node; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedge_stmt_node673); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleedge_stmt_node


    // $ANTLR start ruleedge_stmt_node
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:384:1: ruleedge_stmt_node returns [EObject current=null] : ( ( (lv_node_id_0_0= rulenode_id ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* ) ;
    public final EObject ruleedge_stmt_node() throws RecognitionException {
        EObject current = null;

        EObject lv_node_id_0_0 = null;

        EObject lv_edgeRHS_1_0 = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:389:6: ( ( ( (lv_node_id_0_0= rulenode_id ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:390:1: ( ( (lv_node_id_0_0= rulenode_id ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:390:1: ( ( (lv_node_id_0_0= rulenode_id ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:390:2: ( (lv_node_id_0_0= rulenode_id ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )*
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:390:2: ( (lv_node_id_0_0= rulenode_id ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:391:1: (lv_node_id_0_0= rulenode_id )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:391:1: (lv_node_id_0_0= rulenode_id )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:392:3: lv_node_id_0_0= rulenode_id
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_nodeAccess().getNode_idNode_idParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulenode_id_in_ruleedge_stmt_node719);
            lv_node_id_0_0=rulenode_id();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdge_stmt_nodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"node_id",
              	        		lv_node_id_0_0, 
              	        		"node_id", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:414:2: ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:415:1: (lv_edgeRHS_1_0= ruleedgeRHS )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:415:1: (lv_edgeRHS_1_0= ruleedgeRHS )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:416:3: lv_edgeRHS_1_0= ruleedgeRHS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleedgeRHS_in_ruleedge_stmt_node740);
            	    lv_edgeRHS_1_0=ruleedgeRHS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEdge_stmt_nodeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"edgeRHS",
            	      	        		lv_edgeRHS_1_0, 
            	      	        		"edgeRHS", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:438:3: ( (lv_attributes_2_0= ruleattr_list ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:439:1: (lv_attributes_2_0= ruleattr_list )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:439:1: (lv_attributes_2_0= ruleattr_list )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:440:3: lv_attributes_2_0= ruleattr_list
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_nodeAccess().getAttributesAttr_listParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleattr_list_in_ruleedge_stmt_node762);
            	    lv_attributes_2_0=ruleattr_list();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEdge_stmt_nodeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_2_0, 
            	      	        		"attr_list", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedge_stmt_node


    // $ANTLR start entryRuleedge_stmt_subgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:470:1: entryRuleedge_stmt_subgraph returns [EObject current=null] : iv_ruleedge_stmt_subgraph= ruleedge_stmt_subgraph EOF ;
    public final EObject entryRuleedge_stmt_subgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleedge_stmt_subgraph = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:471:2: (iv_ruleedge_stmt_subgraph= ruleedge_stmt_subgraph EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:472:2: iv_ruleedge_stmt_subgraph= ruleedge_stmt_subgraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEdge_stmt_subgraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_entryRuleedge_stmt_subgraph799);
            iv_ruleedge_stmt_subgraph=ruleedge_stmt_subgraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleedge_stmt_subgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedge_stmt_subgraph809); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleedge_stmt_subgraph


    // $ANTLR start ruleedge_stmt_subgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:479:1: ruleedge_stmt_subgraph returns [EObject current=null] : ( ( (lv_subgraph_0_0= rulesubgraph ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* ) ;
    public final EObject ruleedge_stmt_subgraph() throws RecognitionException {
        EObject current = null;

        EObject lv_subgraph_0_0 = null;

        EObject lv_edgeRHS_1_0 = null;

        EObject lv_attributes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:484:6: ( ( ( (lv_subgraph_0_0= rulesubgraph ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:485:1: ( ( (lv_subgraph_0_0= rulesubgraph ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:485:1: ( ( (lv_subgraph_0_0= rulesubgraph ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )* )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:485:2: ( (lv_subgraph_0_0= rulesubgraph ) ) ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+ ( (lv_attributes_2_0= ruleattr_list ) )*
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:485:2: ( (lv_subgraph_0_0= rulesubgraph ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:486:1: (lv_subgraph_0_0= rulesubgraph )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:486:1: (lv_subgraph_0_0= rulesubgraph )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:487:3: lv_subgraph_0_0= rulesubgraph
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_subgraphAccess().getSubgraphSubgraphParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulesubgraph_in_ruleedge_stmt_subgraph855);
            lv_subgraph_0_0=rulesubgraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdge_stmt_subgraphRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"subgraph",
              	        		lv_subgraph_0_0, 
              	        		"subgraph", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:509:2: ( (lv_edgeRHS_1_0= ruleedgeRHS ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:510:1: (lv_edgeRHS_1_0= ruleedgeRHS )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:510:1: (lv_edgeRHS_1_0= ruleedgeRHS )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:511:3: lv_edgeRHS_1_0= ruleedgeRHS
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleedgeRHS_in_ruleedge_stmt_subgraph876);
            	    lv_edgeRHS_1_0=ruleedgeRHS();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEdge_stmt_subgraphRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"edgeRHS",
            	      	        		lv_edgeRHS_1_0, 
            	      	        		"edgeRHS", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:533:3: ( (lv_attributes_2_0= ruleattr_list ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:534:1: (lv_attributes_2_0= ruleattr_list )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:534:1: (lv_attributes_2_0= ruleattr_list )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:535:3: lv_attributes_2_0= ruleattr_list
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEdge_stmt_subgraphAccess().getAttributesAttr_listParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleattr_list_in_ruleedge_stmt_subgraph898);
            	    lv_attributes_2_0=ruleattr_list();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEdge_stmt_subgraphRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_2_0, 
            	      	        		"attr_list", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedge_stmt_subgraph


    // $ANTLR start entryRulenode_stmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:565:1: entryRulenode_stmt returns [EObject current=null] : iv_rulenode_stmt= rulenode_stmt EOF ;
    public final EObject entryRulenode_stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenode_stmt = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:566:2: (iv_rulenode_stmt= rulenode_stmt EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:567:2: iv_rulenode_stmt= rulenode_stmt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNode_stmtRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulenode_stmt_in_entryRulenode_stmt935);
            iv_rulenode_stmt=rulenode_stmt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulenode_stmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenode_stmt945); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulenode_stmt


    // $ANTLR start rulenode_stmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:574:1: rulenode_stmt returns [EObject current=null] : ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( (lv_attributes_1_0= ruleattr_list ) )* ) ;
    public final EObject rulenode_stmt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_attributes_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:579:6: ( ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( (lv_attributes_1_0= ruleattr_list ) )* ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:580:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( (lv_attributes_1_0= ruleattr_list ) )* )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:580:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( (lv_attributes_1_0= ruleattr_list ) )* )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:580:2: ( (lv_name_0_0= RULE_DOT_ID ) ) ( (lv_attributes_1_0= ruleattr_list ) )*
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:580:2: ( (lv_name_0_0= RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:581:1: (lv_name_0_0= RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:581:1: (lv_name_0_0= RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:582:3: lv_name_0_0= RULE_DOT_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulenode_stmt987); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNode_stmtAccess().getNameDOT_IDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNode_stmtRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"DOT_ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:604:2: ( (lv_attributes_1_0= ruleattr_list ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:605:1: (lv_attributes_1_0= ruleattr_list )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:605:1: (lv_attributes_1_0= ruleattr_list )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:606:3: lv_attributes_1_0= ruleattr_list
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getNode_stmtAccess().getAttributesAttr_listParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleattr_list_in_rulenode_stmt1013);
            	    lv_attributes_1_0=ruleattr_list();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getNode_stmtRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_1_0, 
            	      	        		"attr_list", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulenode_stmt


    // $ANTLR start entryRuleattribute
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:636:1: entryRuleattribute returns [EObject current=null] : iv_ruleattribute= ruleattribute EOF ;
    public final EObject entryRuleattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattribute = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:637:2: (iv_ruleattribute= ruleattribute EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:638:2: iv_ruleattribute= ruleattribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleattribute_in_entryRuleattribute1050);
            iv_ruleattribute=ruleattribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattribute1060); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleattribute


    // $ANTLR start ruleattribute
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:645:1: ruleattribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_DOT_ID ) ) '=' ( (lv_value_2_0= RULE_DOT_ID ) ) ) ;
    public final EObject ruleattribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:650:6: ( ( ( (lv_name_0_0= RULE_DOT_ID ) ) '=' ( (lv_value_2_0= RULE_DOT_ID ) ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:651:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:651:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:651:2: ( (lv_name_0_0= RULE_DOT_ID ) ) '=' ( (lv_value_2_0= RULE_DOT_ID ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:651:2: ( (lv_name_0_0= RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:652:1: (lv_name_0_0= RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:652:1: (lv_name_0_0= RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:653:3: lv_name_0_0= RULE_DOT_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_ruleattribute1102); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAttributeAccess().getNameDOT_IDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"DOT_ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,18,FOLLOW_18_in_ruleattribute1117); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:679:1: ( (lv_value_2_0= RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:680:1: (lv_value_2_0= RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:680:1: (lv_value_2_0= RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:681:3: lv_value_2_0= RULE_DOT_ID
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_ruleattribute1134); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAttributeAccess().getValueDOT_IDTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"DOT_ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleattribute


    // $ANTLR start entryRuleattr_stmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:711:1: entryRuleattr_stmt returns [EObject current=null] : iv_ruleattr_stmt= ruleattr_stmt EOF ;
    public final EObject entryRuleattr_stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_stmt = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:712:2: (iv_ruleattr_stmt= ruleattr_stmt EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:713:2: iv_ruleattr_stmt= ruleattr_stmt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_stmtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleattr_stmt_in_entryRuleattr_stmt1175);
            iv_ruleattr_stmt=ruleattr_stmt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_stmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattr_stmt1185); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleattr_stmt


    // $ANTLR start ruleattr_stmt
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:720:1: ruleattr_stmt returns [EObject current=null] : ( ( (lv_type_0_0= ruleattributetype ) ) ( (lv_attributes_1_0= ruleattr_list ) )+ ) ;
    public final EObject ruleattr_stmt() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_attributes_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:725:6: ( ( ( (lv_type_0_0= ruleattributetype ) ) ( (lv_attributes_1_0= ruleattr_list ) )+ ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:726:1: ( ( (lv_type_0_0= ruleattributetype ) ) ( (lv_attributes_1_0= ruleattr_list ) )+ )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:726:1: ( ( (lv_type_0_0= ruleattributetype ) ) ( (lv_attributes_1_0= ruleattr_list ) )+ )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:726:2: ( (lv_type_0_0= ruleattributetype ) ) ( (lv_attributes_1_0= ruleattr_list ) )+
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:726:2: ( (lv_type_0_0= ruleattributetype ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:727:1: (lv_type_0_0= ruleattributetype )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:727:1: (lv_type_0_0= ruleattributetype )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:728:3: lv_type_0_0= ruleattributetype
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAttr_stmtAccess().getTypeAttributetypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleattributetype_in_ruleattr_stmt1231);
            lv_type_0_0=ruleattributetype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttr_stmtRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"attributetype", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:750:2: ( (lv_attributes_1_0= ruleattr_list ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:751:1: (lv_attributes_1_0= ruleattr_list )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:751:1: (lv_attributes_1_0= ruleattr_list )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:752:3: lv_attributes_1_0= ruleattr_list
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAttr_stmtAccess().getAttributesAttr_listParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleattr_list_in_ruleattr_stmt1252);
            	    lv_attributes_1_0=ruleattr_list();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAttr_stmtRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"attributes",
            	      	        		lv_attributes_1_0, 
            	      	        		"attr_list", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleattr_stmt


    // $ANTLR start entryRuleattr_list
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:782:1: entryRuleattr_list returns [EObject current=null] : iv_ruleattr_list= ruleattr_list EOF ;
    public final EObject entryRuleattr_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_list = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:783:2: (iv_ruleattr_list= ruleattr_list EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:784:2: iv_ruleattr_list= ruleattr_list EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_listRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_entryRuleattr_list1289);
            iv_ruleattr_list=ruleattr_list();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattr_list1299); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleattr_list


    // $ANTLR start ruleattr_list
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:791:1: ruleattr_list returns [EObject current=null] : ( '[' ( (lv_a_list_1_0= rulea_list ) )* ']' ) ;
    public final EObject ruleattr_list() throws RecognitionException {
        EObject current = null;

        EObject lv_a_list_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:796:6: ( ( '[' ( (lv_a_list_1_0= rulea_list ) )* ']' ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:797:1: ( '[' ( (lv_a_list_1_0= rulea_list ) )* ']' )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:797:1: ( '[' ( (lv_a_list_1_0= rulea_list ) )* ']' )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:797:3: '[' ( (lv_a_list_1_0= rulea_list ) )* ']'
            {
            match(input,19,FOLLOW_19_in_ruleattr_list1334); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttr_listAccess().getLeftSquareBracketKeyword_0(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:801:1: ( (lv_a_list_1_0= rulea_list ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DOT_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:802:1: (lv_a_list_1_0= rulea_list )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:802:1: (lv_a_list_1_0= rulea_list )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:803:3: lv_a_list_1_0= rulea_list
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAttr_listAccess().getA_listA_listParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulea_list_in_ruleattr_list1355);
            	    lv_a_list_1_0=rulea_list();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAttr_listRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"a_list",
            	      	        		lv_a_list_1_0, 
            	      	        		"a_list", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleattr_list1366); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttr_listAccess().getRightSquareBracketKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleattr_list


    // $ANTLR start entryRulea_list
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:837:1: entryRulea_list returns [EObject current=null] : iv_rulea_list= rulea_list EOF ;
    public final EObject entryRulea_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulea_list = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:838:2: (iv_rulea_list= rulea_list EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:839:2: iv_rulea_list= rulea_list EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getA_listRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulea_list_in_entryRulea_list1402);
            iv_rulea_list=rulea_list();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulea_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulea_list1412); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulea_list


    // $ANTLR start rulea_list
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:846:1: rulea_list returns [EObject current=null] : ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )? ( ',' )? ) ;
    public final EObject rulea_list() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:851:6: ( ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )? ( ',' )? ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:852:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )? ( ',' )? )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:852:1: ( ( (lv_name_0_0= RULE_DOT_ID ) ) ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )? ( ',' )? )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:852:2: ( (lv_name_0_0= RULE_DOT_ID ) ) ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )? ( ',' )?
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:852:2: ( (lv_name_0_0= RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:853:1: (lv_name_0_0= RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:853:1: (lv_name_0_0= RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:854:3: lv_name_0_0= RULE_DOT_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulea_list1454); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getA_listAccess().getNameDOT_IDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getA_listRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"DOT_ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:876:2: ( '=' ( (lv_value_2_0= RULE_DOT_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:876:4: '=' ( (lv_value_2_0= RULE_DOT_ID ) )
                    {
                    match(input,18,FOLLOW_18_in_rulea_list1470); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getA_listAccess().getEqualsSignKeyword_1_0(), null); 
                          
                    }
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:880:1: ( (lv_value_2_0= RULE_DOT_ID ) )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:881:1: (lv_value_2_0= RULE_DOT_ID )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:881:1: (lv_value_2_0= RULE_DOT_ID )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:882:3: lv_value_2_0= RULE_DOT_ID
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulea_list1487); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getA_listAccess().getValueDOT_IDTerminalRuleCall_1_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getA_listRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_2_0, 
                      	        		"DOT_ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:904:4: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:904:6: ','
                    {
                    match(input,21,FOLLOW_21_in_rulea_list1505); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getA_listAccess().getCommaKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulea_list


    // $ANTLR start entryRulesubgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:916:1: entryRulesubgraph returns [EObject current=null] : iv_rulesubgraph= rulesubgraph EOF ;
    public final EObject entryRulesubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubgraph = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:917:2: (iv_rulesubgraph= rulesubgraph EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:918:2: iv_rulesubgraph= rulesubgraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubgraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulesubgraph_in_entryRulesubgraph1543);
            iv_rulesubgraph=rulesubgraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesubgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesubgraph1553); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulesubgraph


    // $ANTLR start rulesubgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:925:1: rulesubgraph returns [EObject current=null] : ( ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )? '{' ( (lv_stmts_3_0= rulestmt ) )* '}' ) ;
    public final EObject rulesubgraph() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_stmts_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:930:6: ( ( ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )? '{' ( (lv_stmts_3_0= rulestmt ) )* '}' ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:931:1: ( ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )? '{' ( (lv_stmts_3_0= rulestmt ) )* '}' )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:931:1: ( ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )? '{' ( (lv_stmts_3_0= rulestmt ) )* '}' )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:931:2: ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )? '{' ( (lv_stmts_3_0= rulestmt ) )* '}'
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:931:2: ( 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:931:4: 'subgraph' ( (lv_name_1_0= RULE_DOT_ID ) )?
                    {
                    match(input,22,FOLLOW_22_in_rulesubgraph1589); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSubgraphAccess().getSubgraphKeyword_0_0(), null); 
                          
                    }
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:935:1: ( (lv_name_1_0= RULE_DOT_ID ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_DOT_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:936:1: (lv_name_1_0= RULE_DOT_ID )
                            {
                            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:936:1: (lv_name_1_0= RULE_DOT_ID )
                            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:937:3: lv_name_1_0= RULE_DOT_ID
                            {
                            lv_name_1_0=(Token)input.LT(1);
                            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulesubgraph1606); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSubgraphAccess().getNameDOT_IDTerminalRuleCall_0_1_0(), "name"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSubgraphRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"name",
                              	        		lv_name_1_0, 
                              	        		"DOT_ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulesubgraph1624); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_1(), null); 
                  
            }
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:963:1: ( (lv_stmts_3_0= rulestmt ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOT_ID||LA18_0==13||LA18_0==15||LA18_0==22||(LA18_0>=26 && LA18_0<=27)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:964:1: (lv_stmts_3_0= rulestmt )
            	    {
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:964:1: (lv_stmts_3_0= rulestmt )
            	    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:965:3: lv_stmts_3_0= rulestmt
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestmt_in_rulesubgraph1645);
            	    lv_stmts_3_0=rulestmt();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubgraphRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"stmts",
            	      	        		lv_stmts_3_0, 
            	      	        		"stmt", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_rulesubgraph1656); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulesubgraph


    // $ANTLR start entryRuleedgeRHS
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:999:1: entryRuleedgeRHS returns [EObject current=null] : iv_ruleedgeRHS= ruleedgeRHS EOF ;
    public final EObject entryRuleedgeRHS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleedgeRHS = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1000:2: (iv_ruleedgeRHS= ruleedgeRHS EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1001:2: iv_ruleedgeRHS= ruleedgeRHS EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEdgeRHSRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_in_entryRuleedgeRHS1692);
            iv_ruleedgeRHS=ruleedgeRHS();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleedgeRHS; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS1702); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleedgeRHS


    // $ANTLR start ruleedgeRHS
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1008:1: ruleedgeRHS returns [EObject current=null] : (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph ) ;
    public final EObject ruleedgeRHS() throws RecognitionException {
        EObject current = null;

        EObject this_edgeRHS_node_0 = null;

        EObject this_edgeRHS_subgraph_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1013:6: ( (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1014:1: (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1014:1: (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==13||LA19_1==22) ) {
                    alt19=2;
                }
                else if ( (LA19_1==RULE_DOT_ID) ) {
                    alt19=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1014:1: (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph )", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==24) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_DOT_ID) ) {
                    alt19=1;
                }
                else if ( (LA19_2==13||LA19_2==22) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1014:1: (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph )", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1014:1: (this_edgeRHS_node_0= ruleedgeRHS_node | this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1015:2: this_edgeRHS_node_0= ruleedgeRHS_node
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEdgeRHSAccess().getEdgeRHS_nodeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleedgeRHS_node_in_ruleedgeRHS1752);
                    this_edgeRHS_node_0=ruleedgeRHS_node();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_edgeRHS_node_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1028:2: this_edgeRHS_subgraph_1= ruleedgeRHS_subgraph
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEdgeRHSAccess().getEdgeRHS_subgraphParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleedgeRHS_subgraph_in_ruleedgeRHS1782);
                    this_edgeRHS_subgraph_1=ruleedgeRHS_subgraph();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_edgeRHS_subgraph_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedgeRHS


    // $ANTLR start entryRuleedgeRHS_node
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1047:1: entryRuleedgeRHS_node returns [EObject current=null] : iv_ruleedgeRHS_node= ruleedgeRHS_node EOF ;
    public final EObject entryRuleedgeRHS_node() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleedgeRHS_node = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1048:2: (iv_ruleedgeRHS_node= ruleedgeRHS_node EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1049:2: iv_ruleedgeRHS_node= ruleedgeRHS_node EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEdgeRHS_nodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_node_in_entryRuleedgeRHS_node1817);
            iv_ruleedgeRHS_node=ruleedgeRHS_node();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleedgeRHS_node; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS_node1827); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleedgeRHS_node


    // $ANTLR start ruleedgeRHS_node
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1056:1: ruleedgeRHS_node returns [EObject current=null] : ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_node_1_0= rulenode_id ) ) ) ;
    public final EObject ruleedgeRHS_node() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_node_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1061:6: ( ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_node_1_0= rulenode_id ) ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1062:1: ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_node_1_0= rulenode_id ) ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1062:1: ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_node_1_0= rulenode_id ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1062:2: ( (lv_op_0_0= ruleedgeop ) ) ( (lv_node_1_0= rulenode_id ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1062:2: ( (lv_op_0_0= ruleedgeop ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1063:1: (lv_op_0_0= ruleedgeop )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1063:1: (lv_op_0_0= ruleedgeop )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1064:3: lv_op_0_0= ruleedgeop
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdgeRHS_nodeAccess().getOpEdgeopEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleedgeop_in_ruleedgeRHS_node1873);
            lv_op_0_0=ruleedgeop();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdgeRHS_nodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"op",
              	        		lv_op_0_0, 
              	        		"edgeop", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1086:2: ( (lv_node_1_0= rulenode_id ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1087:1: (lv_node_1_0= rulenode_id )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1087:1: (lv_node_1_0= rulenode_id )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1088:3: lv_node_1_0= rulenode_id
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdgeRHS_nodeAccess().getNodeNode_idParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulenode_id_in_ruleedgeRHS_node1894);
            lv_node_1_0=rulenode_id();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdgeRHS_nodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"node",
              	        		lv_node_1_0, 
              	        		"node_id", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedgeRHS_node


    // $ANTLR start entryRuleedgeRHS_subgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1118:1: entryRuleedgeRHS_subgraph returns [EObject current=null] : iv_ruleedgeRHS_subgraph= ruleedgeRHS_subgraph EOF ;
    public final EObject entryRuleedgeRHS_subgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleedgeRHS_subgraph = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1119:2: (iv_ruleedgeRHS_subgraph= ruleedgeRHS_subgraph EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1120:2: iv_ruleedgeRHS_subgraph= ruleedgeRHS_subgraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEdgeRHS_subgraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_subgraph_in_entryRuleedgeRHS_subgraph1930);
            iv_ruleedgeRHS_subgraph=ruleedgeRHS_subgraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleedgeRHS_subgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS_subgraph1940); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleedgeRHS_subgraph


    // $ANTLR start ruleedgeRHS_subgraph
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1127:1: ruleedgeRHS_subgraph returns [EObject current=null] : ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_subgraph_1_0= rulesubgraph ) ) ) ;
    public final EObject ruleedgeRHS_subgraph() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_subgraph_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1132:6: ( ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_subgraph_1_0= rulesubgraph ) ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1133:1: ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_subgraph_1_0= rulesubgraph ) ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1133:1: ( ( (lv_op_0_0= ruleedgeop ) ) ( (lv_subgraph_1_0= rulesubgraph ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1133:2: ( (lv_op_0_0= ruleedgeop ) ) ( (lv_subgraph_1_0= rulesubgraph ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1133:2: ( (lv_op_0_0= ruleedgeop ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1134:1: (lv_op_0_0= ruleedgeop )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1134:1: (lv_op_0_0= ruleedgeop )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1135:3: lv_op_0_0= ruleedgeop
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdgeRHS_subgraphAccess().getOpEdgeopEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleedgeop_in_ruleedgeRHS_subgraph1986);
            lv_op_0_0=ruleedgeop();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdgeRHS_subgraphRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"op",
              	        		lv_op_0_0, 
              	        		"edgeop", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1157:2: ( (lv_subgraph_1_0= rulesubgraph ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1158:1: (lv_subgraph_1_0= rulesubgraph )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1158:1: (lv_subgraph_1_0= rulesubgraph )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1159:3: lv_subgraph_1_0= rulesubgraph
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEdgeRHS_subgraphAccess().getSubgraphSubgraphParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulesubgraph_in_ruleedgeRHS_subgraph2007);
            lv_subgraph_1_0=rulesubgraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEdgeRHS_subgraphRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"subgraph",
              	        		lv_subgraph_1_0, 
              	        		"subgraph", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedgeRHS_subgraph


    // $ANTLR start entryRulenode_id
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1189:1: entryRulenode_id returns [EObject current=null] : iv_rulenode_id= rulenode_id EOF ;
    public final EObject entryRulenode_id() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenode_id = null;


        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1190:2: (iv_rulenode_id= rulenode_id EOF )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1191:2: iv_rulenode_id= rulenode_id EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNode_idRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulenode_id_in_entryRulenode_id2043);
            iv_rulenode_id=rulenode_id();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulenode_id; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenode_id2053); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulenode_id


    // $ANTLR start rulenode_id
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1198:1: rulenode_id returns [EObject current=null] : ( (lv_name_0_0= RULE_DOT_ID ) ) ;
    public final EObject rulenode_id() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1203:6: ( ( (lv_name_0_0= RULE_DOT_ID ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1204:1: ( (lv_name_0_0= RULE_DOT_ID ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1204:1: ( (lv_name_0_0= RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1205:1: (lv_name_0_0= RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1205:1: (lv_name_0_0= RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1206:3: lv_name_0_0= RULE_DOT_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rulenode_id2094); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNode_idAccess().getNameDOT_IDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNode_idRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"DOT_ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulenode_id


    // $ANTLR start ruleedgeop
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1236:1: ruleedgeop returns [Enumerator current=null] : ( ( '->' ) | ( '--' ) ) ;
    public final Enumerator ruleedgeop() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1240:6: ( ( ( '->' ) | ( '--' ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1241:1: ( ( '->' ) | ( '--' ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1241:1: ( ( '->' ) | ( '--' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==24) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1241:1: ( ( '->' ) | ( '--' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1241:2: ( '->' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1241:2: ( '->' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1241:4: '->'
                    {
                    match(input,23,FOLLOW_23_in_ruleedgeop2146); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getEdgeopAccess().getDirectedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getEdgeopAccess().getDirectedEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1247:6: ( '--' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1247:6: ( '--' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1247:8: '--'
                    {
                    match(input,24,FOLLOW_24_in_ruleedgeop2161); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getEdgeopAccess().getUndirectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getEdgeopAccess().getUndirectedEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleedgeop


    // $ANTLR start rulegraphtype
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1257:1: rulegraphtype returns [Enumerator current=null] : ( ( 'graph' ) | ( 'digraph' ) ) ;
    public final Enumerator rulegraphtype() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1261:6: ( ( ( 'graph' ) | ( 'digraph' ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1262:1: ( ( 'graph' ) | ( 'digraph' ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1262:1: ( ( 'graph' ) | ( 'digraph' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1262:1: ( ( 'graph' ) | ( 'digraph' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1262:2: ( 'graph' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1262:2: ( 'graph' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1262:4: 'graph'
                    {
                    match(input,15,FOLLOW_15_in_rulegraphtype2204); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getGraphtypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getGraphtypeAccess().getGraphEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1268:6: ( 'digraph' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1268:6: ( 'digraph' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1268:8: 'digraph'
                    {
                    match(input,25,FOLLOW_25_in_rulegraphtype2219); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getGraphtypeAccess().getDigraphEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getGraphtypeAccess().getDigraphEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulegraphtype


    // $ANTLR start ruleattributetype
    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1278:1: ruleattributetype returns [Enumerator current=null] : ( ( 'graph' ) | ( 'node' ) | ( 'edge' ) ) ;
    public final Enumerator ruleattributetype() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1282:6: ( ( ( 'graph' ) | ( 'node' ) | ( 'edge' ) ) )
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1283:1: ( ( 'graph' ) | ( 'node' ) | ( 'edge' ) )
            {
            // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1283:1: ( ( 'graph' ) | ( 'node' ) | ( 'edge' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt22=1;
                }
                break;
            case 26:
                {
                alt22=2;
                }
                break;
            case 27:
                {
                alt22=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1283:1: ( ( 'graph' ) | ( 'node' ) | ( 'edge' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1283:2: ( 'graph' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1283:2: ( 'graph' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1283:4: 'graph'
                    {
                    match(input,15,FOLLOW_15_in_ruleattributetype2262); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributetypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributetypeAccess().getGraphEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1289:6: ( 'node' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1289:6: ( 'node' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1289:8: 'node'
                    {
                    match(input,26,FOLLOW_26_in_ruleattributetype2277); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributetypeAccess().getNodeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributetypeAccess().getNodeEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1295:6: ( 'edge' )
                    {
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1295:6: ( 'edge' )
                    // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:1295:8: 'edge'
                    {
                    match(input,27,FOLLOW_27_in_ruleattributetype2292); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getAttributetypeAccess().getEdgeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getAttributetypeAccess().getEdgeEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleattributetype

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:287:2: ( ruleedge_stmt_node )
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:287:2: ruleedge_stmt_node
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleedge_stmt_node_in_synpred5464);
        ruleedge_stmt_node();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:300:2: ( ruleedge_stmt_subgraph )
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:300:2: ruleedge_stmt_subgraph
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_synpred6494);
        ruleedge_stmt_subgraph();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:313:2: ( rulenode_stmt )
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:313:2: rulenode_stmt
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulenode_stmt_in_synpred7524);
        rulenode_stmt();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:326:2: ( ruleattribute )
        // ../org.openarchitectureware.vis.graphviz/src-gen/org/openarchitectureware/vis/graphviz/parser/antlr/internal/InternalDot.g:326:2: ruleattribute
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleattribute_in_synpred8554);
        ruleattribute();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_rulegraphvizmodel_in_entryRulegraphvizmodel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegraphvizmodel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulegraphvizmodel126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulegraphvizmodel136 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rulegraph_in_rulegraphvizmodel157 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulegraphvizmodel168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegraph_in_entryRulegraph204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegraph214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulegraph249 = new BitSet(new long[]{0x0000000002018000L});
    public static final BitSet FOLLOW_16_in_rulegraph267 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_rulegraphtype_in_rulegraph302 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulegraph319 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulegraph335 = new BitSet(new long[]{0x000000000C40E010L});
    public static final BitSet FOLLOW_rulestmt_in_rulegraph356 = new BitSet(new long[]{0x000000000C40E010L});
    public static final BitSet FOLLOW_14_in_rulegraph367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestmt_in_entryRulestmt403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestmt413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_rulestmt464 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_rulestmt494 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_rulestmt524 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleattribute_in_rulestmt554 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleattr_stmt_in_rulestmt584 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulesubgraph_in_rulestmt614 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulestmt625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_entryRuleedge_stmt_node663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedge_stmt_node673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_id_in_ruleedge_stmt_node719 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_ruleedge_stmt_node740 = new BitSet(new long[]{0x0000000001880002L});
    public static final BitSet FOLLOW_ruleattr_list_in_ruleedge_stmt_node762 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_entryRuleedge_stmt_subgraph799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedge_stmt_subgraph809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_ruleedge_stmt_subgraph855 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_ruleedge_stmt_subgraph876 = new BitSet(new long[]{0x0000000001880002L});
    public static final BitSet FOLLOW_ruleattr_list_in_ruleedge_stmt_subgraph898 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_entryRulenode_stmt935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenode_stmt945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulenode_stmt987 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleattr_list_in_rulenode_stmt1013 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleattribute_in_entryRuleattribute1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattribute1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_ruleattribute1102 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleattribute1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_ruleattribute1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_stmt_in_entryRuleattr_stmt1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattr_stmt1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributetype_in_ruleattr_stmt1231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleattr_list_in_ruleattr_stmt1252 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleattr_list_in_entryRuleattr_list1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattr_list1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleattr_list1334 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulea_list_in_ruleattr_list1355 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleattr_list1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulea_list_in_entryRulea_list1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulea_list1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulea_list1454 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_rulea_list1470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulea_list1487 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulea_list1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_entryRulesubgraph1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubgraph1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulesubgraph1589 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulesubgraph1606 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulesubgraph1624 = new BitSet(new long[]{0x000000000C40E010L});
    public static final BitSet FOLLOW_rulestmt_in_rulesubgraph1645 = new BitSet(new long[]{0x000000000C40E010L});
    public static final BitSet FOLLOW_14_in_rulesubgraph1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_entryRuleedgeRHS1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_node_in_ruleedgeRHS1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_subgraph_in_ruleedgeRHS1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_node_in_entryRuleedgeRHS_node1817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS_node1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeop_in_ruleedgeRHS_node1873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulenode_id_in_ruleedgeRHS_node1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_subgraph_in_entryRuleedgeRHS_subgraph1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS_subgraph1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeop_in_ruleedgeRHS_subgraph1986 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rulesubgraph_in_ruleedgeRHS_subgraph2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_id_in_entryRulenode_id2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenode_id2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rulenode_id2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleedgeop2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleedgeop2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulegraphtype2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulegraphtype2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleattributetype2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleattributetype2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleattributetype2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_synpred5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_synpred6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_synpred7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattribute_in_synpred8554 = new BitSet(new long[]{0x0000000000000002L});

}