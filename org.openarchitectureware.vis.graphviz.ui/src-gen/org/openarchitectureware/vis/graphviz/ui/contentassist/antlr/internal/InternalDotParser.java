package org.openarchitectureware.vis.graphviz.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.openarchitectureware.vis.graphviz.services.DotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOT_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'--'", "'graph'", "'digraph'", "'node'", "'edge'", "'graphs'", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'subgraph'", "'strict'"
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
            ruleMemo = new HashMap[180+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g"; }


     
     	private DotGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DotGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRulegraphvizmodel
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:62:1: entryRulegraphvizmodel : rulegraphvizmodel EOF ;
    public final void entryRulegraphvizmodel() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:63:1: ( rulegraphvizmodel EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:64:1: rulegraphvizmodel EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelRule()); 
            }
            pushFollow(FOLLOW_rulegraphvizmodel_in_entryRulegraphvizmodel67);
            rulegraphvizmodel();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegraphvizmodel74); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulegraphvizmodel


    // $ANTLR start rulegraphvizmodel
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:71:1: rulegraphvizmodel : ( ( rule__Graphvizmodel__Group__0 ) ) ;
    public final void rulegraphvizmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:75:2: ( ( ( rule__Graphvizmodel__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:76:1: ( ( rule__Graphvizmodel__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:76:1: ( ( rule__Graphvizmodel__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:77:1: ( rule__Graphvizmodel__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:78:1: ( rule__Graphvizmodel__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:78:2: rule__Graphvizmodel__Group__0
            {
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__0_in_rulegraphvizmodel100);
            rule__Graphvizmodel__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulegraphvizmodel


    // $ANTLR start entryRulegraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:90:1: entryRulegraph : rulegraph EOF ;
    public final void entryRulegraph() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:91:1: ( rulegraph EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:92:1: rulegraph EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphRule()); 
            }
            pushFollow(FOLLOW_rulegraph_in_entryRulegraph127);
            rulegraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegraph134); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulegraph


    // $ANTLR start rulegraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:99:1: rulegraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void rulegraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:103:2: ( ( ( rule__Graph__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:104:1: ( ( rule__Graph__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:104:1: ( ( rule__Graph__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:105:1: ( rule__Graph__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:106:1: ( rule__Graph__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:106:2: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_rule__Graph__Group__0_in_rulegraph160);
            rule__Graph__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulegraph


    // $ANTLR start entryRulestmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:118:1: entryRulestmt : rulestmt EOF ;
    public final void entryRulestmt() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:119:1: ( rulestmt EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:120:1: rulestmt EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_rulestmt_in_entryRulestmt187);
            rulestmt();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestmt194); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulestmt


    // $ANTLR start rulestmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:127:1: rulestmt : ( ( rule__Stmt__Group__0 ) ) ;
    public final void rulestmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:131:2: ( ( ( rule__Stmt__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:132:1: ( ( rule__Stmt__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:132:1: ( ( rule__Stmt__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:133:1: ( rule__Stmt__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:134:1: ( rule__Stmt__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:134:2: rule__Stmt__Group__0
            {
            pushFollow(FOLLOW_rule__Stmt__Group__0_in_rulestmt220);
            rule__Stmt__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulestmt


    // $ANTLR start entryRuleedge_stmt_node
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:146:1: entryRuleedge_stmt_node : ruleedge_stmt_node EOF ;
    public final void entryRuleedge_stmt_node() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:147:1: ( ruleedge_stmt_node EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:148:1: ruleedge_stmt_node EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeRule()); 
            }
            pushFollow(FOLLOW_ruleedge_stmt_node_in_entryRuleedge_stmt_node247);
            ruleedge_stmt_node();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedge_stmt_node254); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleedge_stmt_node


    // $ANTLR start ruleedge_stmt_node
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:155:1: ruleedge_stmt_node : ( ( rule__Edge_stmt_node__Group__0 ) ) ;
    public final void ruleedge_stmt_node() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:159:2: ( ( ( rule__Edge_stmt_node__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:160:1: ( ( rule__Edge_stmt_node__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:160:1: ( ( rule__Edge_stmt_node__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:161:1: ( rule__Edge_stmt_node__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:162:1: ( rule__Edge_stmt_node__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:162:2: rule__Edge_stmt_node__Group__0
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__0_in_ruleedge_stmt_node280);
            rule__Edge_stmt_node__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedge_stmt_node


    // $ANTLR start entryRuleedge_stmt_subgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:174:1: entryRuleedge_stmt_subgraph : ruleedge_stmt_subgraph EOF ;
    public final void entryRuleedge_stmt_subgraph() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:175:1: ( ruleedge_stmt_subgraph EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:176:1: ruleedge_stmt_subgraph EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphRule()); 
            }
            pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_entryRuleedge_stmt_subgraph307);
            ruleedge_stmt_subgraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedge_stmt_subgraph314); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleedge_stmt_subgraph


    // $ANTLR start ruleedge_stmt_subgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:183:1: ruleedge_stmt_subgraph : ( ( rule__Edge_stmt_subgraph__Group__0 ) ) ;
    public final void ruleedge_stmt_subgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:187:2: ( ( ( rule__Edge_stmt_subgraph__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:188:1: ( ( rule__Edge_stmt_subgraph__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:188:1: ( ( rule__Edge_stmt_subgraph__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:189:1: ( rule__Edge_stmt_subgraph__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:190:1: ( rule__Edge_stmt_subgraph__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:190:2: rule__Edge_stmt_subgraph__Group__0
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__0_in_ruleedge_stmt_subgraph340);
            rule__Edge_stmt_subgraph__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedge_stmt_subgraph


    // $ANTLR start entryRulenode_stmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:202:1: entryRulenode_stmt : rulenode_stmt EOF ;
    public final void entryRulenode_stmt() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:203:1: ( rulenode_stmt EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:204:1: rulenode_stmt EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtRule()); 
            }
            pushFollow(FOLLOW_rulenode_stmt_in_entryRulenode_stmt367);
            rulenode_stmt();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenode_stmt374); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulenode_stmt


    // $ANTLR start rulenode_stmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:211:1: rulenode_stmt : ( ( rule__Node_stmt__Group__0 ) ) ;
    public final void rulenode_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:215:2: ( ( ( rule__Node_stmt__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:216:1: ( ( rule__Node_stmt__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:216:1: ( ( rule__Node_stmt__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:217:1: ( rule__Node_stmt__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:218:1: ( rule__Node_stmt__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:218:2: rule__Node_stmt__Group__0
            {
            pushFollow(FOLLOW_rule__Node_stmt__Group__0_in_rulenode_stmt400);
            rule__Node_stmt__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulenode_stmt


    // $ANTLR start entryRuleattribute
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:230:1: entryRuleattribute : ruleattribute EOF ;
    public final void entryRuleattribute() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:231:1: ( ruleattribute EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:232:1: ruleattribute EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleattribute_in_entryRuleattribute427);
            ruleattribute();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattribute434); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleattribute


    // $ANTLR start ruleattribute
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:239:1: ruleattribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleattribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:243:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:244:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:244:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:245:1: ( rule__Attribute__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:246:1: ( rule__Attribute__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:246:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleattribute460);
            rule__Attribute__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleattribute


    // $ANTLR start entryRuleattr_stmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:258:1: entryRuleattr_stmt : ruleattr_stmt EOF ;
    public final void entryRuleattr_stmt() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:259:1: ( ruleattr_stmt EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:260:1: ruleattr_stmt EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtRule()); 
            }
            pushFollow(FOLLOW_ruleattr_stmt_in_entryRuleattr_stmt487);
            ruleattr_stmt();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattr_stmt494); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleattr_stmt


    // $ANTLR start ruleattr_stmt
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:267:1: ruleattr_stmt : ( ( rule__Attr_stmt__Group__0 ) ) ;
    public final void ruleattr_stmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:271:2: ( ( ( rule__Attr_stmt__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:272:1: ( ( rule__Attr_stmt__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:272:1: ( ( rule__Attr_stmt__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:273:1: ( rule__Attr_stmt__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:274:1: ( rule__Attr_stmt__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:274:2: rule__Attr_stmt__Group__0
            {
            pushFollow(FOLLOW_rule__Attr_stmt__Group__0_in_ruleattr_stmt520);
            rule__Attr_stmt__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleattr_stmt


    // $ANTLR start entryRuleattr_list
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:286:1: entryRuleattr_list : ruleattr_list EOF ;
    public final void entryRuleattr_list() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:287:1: ( ruleattr_list EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:288:1: ruleattr_list EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listRule()); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_entryRuleattr_list547);
            ruleattr_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleattr_list554); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleattr_list


    // $ANTLR start ruleattr_list
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:295:1: ruleattr_list : ( ( rule__Attr_list__Group__0 ) ) ;
    public final void ruleattr_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:299:2: ( ( ( rule__Attr_list__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:300:1: ( ( rule__Attr_list__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:300:1: ( ( rule__Attr_list__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:301:1: ( rule__Attr_list__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:302:1: ( rule__Attr_list__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:302:2: rule__Attr_list__Group__0
            {
            pushFollow(FOLLOW_rule__Attr_list__Group__0_in_ruleattr_list580);
            rule__Attr_list__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleattr_list


    // $ANTLR start entryRulea_list
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:314:1: entryRulea_list : rulea_list EOF ;
    public final void entryRulea_list() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:315:1: ( rulea_list EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:316:1: rulea_list EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listRule()); 
            }
            pushFollow(FOLLOW_rulea_list_in_entryRulea_list607);
            rulea_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getA_listRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulea_list614); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulea_list


    // $ANTLR start rulea_list
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:323:1: rulea_list : ( ( rule__A_list__Group__0 ) ) ;
    public final void rulea_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:327:2: ( ( ( rule__A_list__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:328:1: ( ( rule__A_list__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:328:1: ( ( rule__A_list__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:329:1: ( rule__A_list__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:330:1: ( rule__A_list__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:330:2: rule__A_list__Group__0
            {
            pushFollow(FOLLOW_rule__A_list__Group__0_in_rulea_list640);
            rule__A_list__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulea_list


    // $ANTLR start entryRulesubgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:342:1: entryRulesubgraph : rulesubgraph EOF ;
    public final void entryRulesubgraph() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:343:1: ( rulesubgraph EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:344:1: rulesubgraph EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphRule()); 
            }
            pushFollow(FOLLOW_rulesubgraph_in_entryRulesubgraph667);
            rulesubgraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesubgraph674); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulesubgraph


    // $ANTLR start rulesubgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:351:1: rulesubgraph : ( ( rule__Subgraph__Group__0 ) ) ;
    public final void rulesubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:355:2: ( ( ( rule__Subgraph__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:356:1: ( ( rule__Subgraph__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:356:1: ( ( rule__Subgraph__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:357:1: ( rule__Subgraph__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:358:1: ( rule__Subgraph__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:358:2: rule__Subgraph__Group__0
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__0_in_rulesubgraph700);
            rule__Subgraph__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulesubgraph


    // $ANTLR start entryRuleedgeRHS
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:370:1: entryRuleedgeRHS : ruleedgeRHS EOF ;
    public final void entryRuleedgeRHS() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:371:1: ( ruleedgeRHS EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:372:1: ruleedgeRHS EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHSRule()); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_in_entryRuleedgeRHS727);
            ruleedgeRHS();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHSRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS734); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleedgeRHS


    // $ANTLR start ruleedgeRHS
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:379:1: ruleedgeRHS : ( ( rule__EdgeRHS__Alternatives ) ) ;
    public final void ruleedgeRHS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:383:2: ( ( ( rule__EdgeRHS__Alternatives ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:384:1: ( ( rule__EdgeRHS__Alternatives ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:384:1: ( ( rule__EdgeRHS__Alternatives ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:385:1: ( rule__EdgeRHS__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHSAccess().getAlternatives()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:386:1: ( rule__EdgeRHS__Alternatives )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:386:2: rule__EdgeRHS__Alternatives
            {
            pushFollow(FOLLOW_rule__EdgeRHS__Alternatives_in_ruleedgeRHS760);
            rule__EdgeRHS__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedgeRHS


    // $ANTLR start entryRuleedgeRHS_node
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:398:1: entryRuleedgeRHS_node : ruleedgeRHS_node EOF ;
    public final void entryRuleedgeRHS_node() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:399:1: ( ruleedgeRHS_node EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:400:1: ruleedgeRHS_node EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeRule()); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_node_in_entryRuleedgeRHS_node787);
            ruleedgeRHS_node();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS_node794); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleedgeRHS_node


    // $ANTLR start ruleedgeRHS_node
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:407:1: ruleedgeRHS_node : ( ( rule__EdgeRHS_node__Group__0 ) ) ;
    public final void ruleedgeRHS_node() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:411:2: ( ( ( rule__EdgeRHS_node__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:412:1: ( ( rule__EdgeRHS_node__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:412:1: ( ( rule__EdgeRHS_node__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:413:1: ( rule__EdgeRHS_node__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:414:1: ( rule__EdgeRHS_node__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:414:2: rule__EdgeRHS_node__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeRHS_node__Group__0_in_ruleedgeRHS_node820);
            rule__EdgeRHS_node__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedgeRHS_node


    // $ANTLR start entryRuleedgeRHS_subgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:426:1: entryRuleedgeRHS_subgraph : ruleedgeRHS_subgraph EOF ;
    public final void entryRuleedgeRHS_subgraph() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:427:1: ( ruleedgeRHS_subgraph EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:428:1: ruleedgeRHS_subgraph EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphRule()); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_subgraph_in_entryRuleedgeRHS_subgraph847);
            ruleedgeRHS_subgraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleedgeRHS_subgraph854); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleedgeRHS_subgraph


    // $ANTLR start ruleedgeRHS_subgraph
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:435:1: ruleedgeRHS_subgraph : ( ( rule__EdgeRHS_subgraph__Group__0 ) ) ;
    public final void ruleedgeRHS_subgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:439:2: ( ( ( rule__EdgeRHS_subgraph__Group__0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:440:1: ( ( rule__EdgeRHS_subgraph__Group__0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:440:1: ( ( rule__EdgeRHS_subgraph__Group__0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:441:1: ( rule__EdgeRHS_subgraph__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphAccess().getGroup()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:442:1: ( rule__EdgeRHS_subgraph__Group__0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:442:2: rule__EdgeRHS_subgraph__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__Group__0_in_ruleedgeRHS_subgraph880);
            rule__EdgeRHS_subgraph__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedgeRHS_subgraph


    // $ANTLR start entryRulenode_id
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:454:1: entryRulenode_id : rulenode_id EOF ;
    public final void entryRulenode_id() throws RecognitionException {
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:455:1: ( rulenode_id EOF )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:456:1: rulenode_id EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_idRule()); 
            }
            pushFollow(FOLLOW_rulenode_id_in_entryRulenode_id907);
            rulenode_id();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNode_idRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenode_id914); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulenode_id


    // $ANTLR start rulenode_id
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:463:1: rulenode_id : ( ( rule__Node_id__NameAssignment ) ) ;
    public final void rulenode_id() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:467:2: ( ( ( rule__Node_id__NameAssignment ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:468:1: ( ( rule__Node_id__NameAssignment ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:468:1: ( ( rule__Node_id__NameAssignment ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:469:1: ( rule__Node_id__NameAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_idAccess().getNameAssignment()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:470:1: ( rule__Node_id__NameAssignment )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:470:2: rule__Node_id__NameAssignment
            {
            pushFollow(FOLLOW_rule__Node_id__NameAssignment_in_rulenode_id940);
            rule__Node_id__NameAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNode_idAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulenode_id


    // $ANTLR start ruleedgeop
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:483:1: ruleedgeop : ( ( rule__Edgeop__Alternatives ) ) ;
    public final void ruleedgeop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:487:1: ( ( ( rule__Edgeop__Alternatives ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:488:1: ( ( rule__Edgeop__Alternatives ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:488:1: ( ( rule__Edgeop__Alternatives ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:489:1: ( rule__Edgeop__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeopAccess().getAlternatives()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:490:1: ( rule__Edgeop__Alternatives )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:490:2: rule__Edgeop__Alternatives
            {
            pushFollow(FOLLOW_rule__Edgeop__Alternatives_in_ruleedgeop977);
            rule__Edgeop__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeopAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleedgeop


    // $ANTLR start rulegraphtype
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:502:1: rulegraphtype : ( ( rule__Graphtype__Alternatives ) ) ;
    public final void rulegraphtype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:506:1: ( ( ( rule__Graphtype__Alternatives ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:507:1: ( ( rule__Graphtype__Alternatives ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:507:1: ( ( rule__Graphtype__Alternatives ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:508:1: ( rule__Graphtype__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphtypeAccess().getAlternatives()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:509:1: ( rule__Graphtype__Alternatives )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:509:2: rule__Graphtype__Alternatives
            {
            pushFollow(FOLLOW_rule__Graphtype__Alternatives_in_rulegraphtype1013);
            rule__Graphtype__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphtypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulegraphtype


    // $ANTLR start ruleattributetype
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:521:1: ruleattributetype : ( ( rule__Attributetype__Alternatives ) ) ;
    public final void ruleattributetype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:525:1: ( ( ( rule__Attributetype__Alternatives ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:526:1: ( ( rule__Attributetype__Alternatives ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:526:1: ( ( rule__Attributetype__Alternatives ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:527:1: ( rule__Attributetype__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributetypeAccess().getAlternatives()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:528:1: ( rule__Attributetype__Alternatives )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:528:2: rule__Attributetype__Alternatives
            {
            pushFollow(FOLLOW_rule__Attributetype__Alternatives_in_ruleattributetype1049);
            rule__Attributetype__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttributetypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleattributetype


    // $ANTLR start rule__Stmt__Alternatives_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:539:1: rule__Stmt__Alternatives_0 : ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) );
    public final void rule__Stmt__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:543:1: ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_DOT_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1()) ) {
                    alt1=1;
                }
                else if ( (synpred3()) ) {
                    alt1=3;
                }
                else if ( (synpred4()) ) {
                    alt1=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("539:1: rule__Stmt__Alternatives_0 : ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt1=2;
                }
                else if ( (true) ) {
                    alt1=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("539:1: rule__Stmt__Alternatives_0 : ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) );", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred2()) ) {
                    alt1=2;
                }
                else if ( (true) ) {
                    alt1=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("539:1: rule__Stmt__Alternatives_0 : ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) );", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 16:
            case 17:
                {
                alt1=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("539:1: rule__Stmt__Alternatives_0 : ( ( ruleedge_stmt_node ) | ( ruleedge_stmt_subgraph ) | ( rulenode_stmt ) | ( ruleattribute ) | ( ruleattr_stmt ) | ( rulesubgraph ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:544:1: ( ruleedge_stmt_node )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:544:1: ( ruleedge_stmt_node )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:545:1: ruleedge_stmt_node
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getEdge_stmt_nodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleedge_stmt_node_in_rule__Stmt__Alternatives_01084);
                    ruleedge_stmt_node();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getEdge_stmt_nodeParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:550:6: ( ruleedge_stmt_subgraph )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:550:6: ( ruleedge_stmt_subgraph )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:551:1: ruleedge_stmt_subgraph
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getEdge_stmt_subgraphParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_rule__Stmt__Alternatives_01101);
                    ruleedge_stmt_subgraph();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getEdge_stmt_subgraphParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:556:6: ( rulenode_stmt )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:556:6: ( rulenode_stmt )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:557:1: rulenode_stmt
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getNode_stmtParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_rulenode_stmt_in_rule__Stmt__Alternatives_01118);
                    rulenode_stmt();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getNode_stmtParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:562:6: ( ruleattribute )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:562:6: ( ruleattribute )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:563:1: ruleattribute
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_ruleattribute_in_rule__Stmt__Alternatives_01135);
                    ruleattribute();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:568:6: ( ruleattr_stmt )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:568:6: ( ruleattr_stmt )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:569:1: ruleattr_stmt
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttr_stmtParserRuleCall_0_4()); 
                    }
                    pushFollow(FOLLOW_ruleattr_stmt_in_rule__Stmt__Alternatives_01152);
                    ruleattr_stmt();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttr_stmtParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:574:6: ( rulesubgraph )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:574:6: ( rulesubgraph )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:575:1: rulesubgraph
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getSubgraphParserRuleCall_0_5()); 
                    }
                    pushFollow(FOLLOW_rulesubgraph_in_rule__Stmt__Alternatives_01169);
                    rulesubgraph();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getSubgraphParserRuleCall_0_5()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stmt__Alternatives_0


    // $ANTLR start rule__EdgeRHS__Alternatives
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:585:1: rule__EdgeRHS__Alternatives : ( ( ruleedgeRHS_node ) | ( ruleedgeRHS_subgraph ) );
    public final void rule__EdgeRHS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:589:1: ( ( ruleedgeRHS_node ) | ( ruleedgeRHS_subgraph ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_DOT_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==19||LA2_1==26) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("585:1: rule__EdgeRHS__Alternatives : ( ( ruleedgeRHS_node ) | ( ruleedgeRHS_subgraph ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==13) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==19||LA2_2==26) ) {
                    alt2=2;
                }
                else if ( (LA2_2==RULE_DOT_ID) ) {
                    alt2=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("585:1: rule__EdgeRHS__Alternatives : ( ( ruleedgeRHS_node ) | ( ruleedgeRHS_subgraph ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("585:1: rule__EdgeRHS__Alternatives : ( ( ruleedgeRHS_node ) | ( ruleedgeRHS_subgraph ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:590:1: ( ruleedgeRHS_node )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:590:1: ( ruleedgeRHS_node )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:591:1: ruleedgeRHS_node
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEdgeRHSAccess().getEdgeRHS_nodeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleedgeRHS_node_in_rule__EdgeRHS__Alternatives1201);
                    ruleedgeRHS_node();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEdgeRHSAccess().getEdgeRHS_nodeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:596:6: ( ruleedgeRHS_subgraph )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:596:6: ( ruleedgeRHS_subgraph )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:597:1: ruleedgeRHS_subgraph
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEdgeRHSAccess().getEdgeRHS_subgraphParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleedgeRHS_subgraph_in_rule__EdgeRHS__Alternatives1218);
                    ruleedgeRHS_subgraph();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEdgeRHSAccess().getEdgeRHS_subgraphParserRuleCall_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS__Alternatives


    // $ANTLR start rule__Edgeop__Alternatives
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:607:1: rule__Edgeop__Alternatives : ( ( ( '->' ) ) | ( ( '--' ) ) );
    public final void rule__Edgeop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:611:1: ( ( ( '->' ) ) | ( ( '--' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("607:1: rule__Edgeop__Alternatives : ( ( ( '->' ) ) | ( ( '--' ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:612:1: ( ( '->' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:612:1: ( ( '->' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:613:1: ( '->' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEdgeopAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:614:1: ( '->' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:614:3: '->'
                    {
                    match(input,12,FOLLOW_12_in_rule__Edgeop__Alternatives1251); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getEdgeopAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:619:6: ( ( '--' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:619:6: ( ( '--' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:620:1: ( '--' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEdgeopAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:621:1: ( '--' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:621:3: '--'
                    {
                    match(input,13,FOLLOW_13_in_rule__Edgeop__Alternatives1272); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getEdgeopAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edgeop__Alternatives


    // $ANTLR start rule__Graphtype__Alternatives
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:631:1: rule__Graphtype__Alternatives : ( ( ( 'graph' ) ) | ( ( 'digraph' ) ) );
    public final void rule__Graphtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:635:1: ( ( ( 'graph' ) ) | ( ( 'digraph' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("631:1: rule__Graphtype__Alternatives : ( ( ( 'graph' ) ) | ( ( 'digraph' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:636:1: ( ( 'graph' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:636:1: ( ( 'graph' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:637:1: ( 'graph' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getGraphtypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:638:1: ( 'graph' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:638:3: 'graph'
                    {
                    match(input,14,FOLLOW_14_in_rule__Graphtype__Alternatives1308); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getGraphtypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:643:6: ( ( 'digraph' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:643:6: ( ( 'digraph' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:644:1: ( 'digraph' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getGraphtypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:645:1: ( 'digraph' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:645:3: 'digraph'
                    {
                    match(input,15,FOLLOW_15_in_rule__Graphtype__Alternatives1329); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getGraphtypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphtype__Alternatives


    // $ANTLR start rule__Attributetype__Alternatives
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:655:1: rule__Attributetype__Alternatives : ( ( ( 'graph' ) ) | ( ( 'node' ) ) | ( ( 'edge' ) ) );
    public final void rule__Attributetype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:659:1: ( ( ( 'graph' ) ) | ( ( 'node' ) ) | ( ( 'edge' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("655:1: rule__Attributetype__Alternatives : ( ( ( 'graph' ) ) | ( ( 'node' ) ) | ( ( 'edge' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:660:1: ( ( 'graph' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:660:1: ( ( 'graph' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:661:1: ( 'graph' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAttributetypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:662:1: ( 'graph' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:662:3: 'graph'
                    {
                    match(input,14,FOLLOW_14_in_rule__Attributetype__Alternatives1365); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAttributetypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:667:6: ( ( 'node' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:667:6: ( ( 'node' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:668:1: ( 'node' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAttributetypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:669:1: ( 'node' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:669:3: 'node'
                    {
                    match(input,16,FOLLOW_16_in_rule__Attributetype__Alternatives1386); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAttributetypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:674:6: ( ( 'edge' ) )
                    {
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:674:6: ( ( 'edge' ) )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:675:1: ( 'edge' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAttributetypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:676:1: ( 'edge' )
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:676:3: 'edge'
                    {
                    match(input,17,FOLLOW_17_in_rule__Attributetype__Alternatives1407); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAttributetypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attributetype__Alternatives


    // $ANTLR start rule__Graphvizmodel__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:688:1: rule__Graphvizmodel__Group__0 : rule__Graphvizmodel__Group__0__Impl rule__Graphvizmodel__Group__1 ;
    public final void rule__Graphvizmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:692:1: ( rule__Graphvizmodel__Group__0__Impl rule__Graphvizmodel__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:693:2: rule__Graphvizmodel__Group__0__Impl rule__Graphvizmodel__Group__1
            {
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__0__Impl_in_rule__Graphvizmodel__Group__01440);
            rule__Graphvizmodel__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__1_in_rule__Graphvizmodel__Group__01443);
            rule__Graphvizmodel__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__0


    // $ANTLR start rule__Graphvizmodel__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:700:1: rule__Graphvizmodel__Group__0__Impl : ( 'graphs' ) ;
    public final void rule__Graphvizmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:704:1: ( ( 'graphs' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:705:1: ( 'graphs' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:705:1: ( 'graphs' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:706:1: 'graphs'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getGraphsKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Graphvizmodel__Group__0__Impl1471); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getGraphsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__0__Impl


    // $ANTLR start rule__Graphvizmodel__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:719:1: rule__Graphvizmodel__Group__1 : rule__Graphvizmodel__Group__1__Impl rule__Graphvizmodel__Group__2 ;
    public final void rule__Graphvizmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:723:1: ( rule__Graphvizmodel__Group__1__Impl rule__Graphvizmodel__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:724:2: rule__Graphvizmodel__Group__1__Impl rule__Graphvizmodel__Group__2
            {
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__1__Impl_in_rule__Graphvizmodel__Group__11502);
            rule__Graphvizmodel__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__2_in_rule__Graphvizmodel__Group__11505);
            rule__Graphvizmodel__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__1


    // $ANTLR start rule__Graphvizmodel__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:731:1: rule__Graphvizmodel__Group__1__Impl : ( '{' ) ;
    public final void rule__Graphvizmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:735:1: ( ( '{' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:736:1: ( '{' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:736:1: ( '{' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:737:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Graphvizmodel__Group__1__Impl1533); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__1__Impl


    // $ANTLR start rule__Graphvizmodel__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:750:1: rule__Graphvizmodel__Group__2 : rule__Graphvizmodel__Group__2__Impl rule__Graphvizmodel__Group__3 ;
    public final void rule__Graphvizmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:754:1: ( rule__Graphvizmodel__Group__2__Impl rule__Graphvizmodel__Group__3 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:755:2: rule__Graphvizmodel__Group__2__Impl rule__Graphvizmodel__Group__3
            {
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__2__Impl_in_rule__Graphvizmodel__Group__21564);
            rule__Graphvizmodel__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__3_in_rule__Graphvizmodel__Group__21567);
            rule__Graphvizmodel__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__2


    // $ANTLR start rule__Graphvizmodel__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:762:1: rule__Graphvizmodel__Group__2__Impl : ( ( rule__Graphvizmodel__GraphsAssignment_2 )* ) ;
    public final void rule__Graphvizmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:766:1: ( ( ( rule__Graphvizmodel__GraphsAssignment_2 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:767:1: ( ( rule__Graphvizmodel__GraphsAssignment_2 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:767:1: ( ( rule__Graphvizmodel__GraphsAssignment_2 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:768:1: ( rule__Graphvizmodel__GraphsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getGraphsAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:769:1: ( rule__Graphvizmodel__GraphsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:769:2: rule__Graphvizmodel__GraphsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Graphvizmodel__GraphsAssignment_2_in_rule__Graphvizmodel__Group__2__Impl1594);
            	    rule__Graphvizmodel__GraphsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getGraphsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__2__Impl


    // $ANTLR start rule__Graphvizmodel__Group__3
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:779:1: rule__Graphvizmodel__Group__3 : rule__Graphvizmodel__Group__3__Impl ;
    public final void rule__Graphvizmodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:783:1: ( rule__Graphvizmodel__Group__3__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:784:2: rule__Graphvizmodel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Graphvizmodel__Group__3__Impl_in_rule__Graphvizmodel__Group__31625);
            rule__Graphvizmodel__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__3


    // $ANTLR start rule__Graphvizmodel__Group__3__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:790:1: rule__Graphvizmodel__Group__3__Impl : ( '}' ) ;
    public final void rule__Graphvizmodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:794:1: ( ( '}' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:795:1: ( '}' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:795:1: ( '}' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:796:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__Graphvizmodel__Group__3__Impl1653); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__Group__3__Impl


    // $ANTLR start rule__Graph__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:817:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:821:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:822:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_rule__Graph__Group__0__Impl_in_rule__Graph__Group__01692);
            rule__Graph__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__1_in_rule__Graph__Group__01695);
            rule__Graph__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__0


    // $ANTLR start rule__Graph__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:829:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:833:1: ( ( 'graph' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:834:1: ( 'graph' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:834:1: ( 'graph' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:835:1: 'graph'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Graph__Group__0__Impl1723); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__0__Impl


    // $ANTLR start rule__Graph__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:848:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:852:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:853:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_rule__Graph__Group__1__Impl_in_rule__Graph__Group__11754);
            rule__Graph__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__2_in_rule__Graph__Group__11757);
            rule__Graph__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__1


    // $ANTLR start rule__Graph__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:860:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__StrictAssignment_1 )? ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:864:1: ( ( ( rule__Graph__StrictAssignment_1 )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:865:1: ( ( rule__Graph__StrictAssignment_1 )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:865:1: ( ( rule__Graph__StrictAssignment_1 )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:866:1: ( rule__Graph__StrictAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getStrictAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:867:1: ( rule__Graph__StrictAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:867:2: rule__Graph__StrictAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Graph__StrictAssignment_1_in_rule__Graph__Group__1__Impl1784);
                    rule__Graph__StrictAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getStrictAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__1__Impl


    // $ANTLR start rule__Graph__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:877:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:881:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:882:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_rule__Graph__Group__2__Impl_in_rule__Graph__Group__21815);
            rule__Graph__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__3_in_rule__Graph__Group__21818);
            rule__Graph__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__2


    // $ANTLR start rule__Graph__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:889:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__TypeAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:893:1: ( ( ( rule__Graph__TypeAssignment_2 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:894:1: ( ( rule__Graph__TypeAssignment_2 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:894:1: ( ( rule__Graph__TypeAssignment_2 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:895:1: ( rule__Graph__TypeAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getTypeAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:896:1: ( rule__Graph__TypeAssignment_2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:896:2: rule__Graph__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Graph__TypeAssignment_2_in_rule__Graph__Group__2__Impl1845);
            rule__Graph__TypeAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__2__Impl


    // $ANTLR start rule__Graph__Group__3
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:906:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:910:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:911:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_rule__Graph__Group__3__Impl_in_rule__Graph__Group__31875);
            rule__Graph__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__4_in_rule__Graph__Group__31878);
            rule__Graph__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__3


    // $ANTLR start rule__Graph__Group__3__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:918:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__NameAssignment_3 )? ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:922:1: ( ( ( rule__Graph__NameAssignment_3 )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:923:1: ( ( rule__Graph__NameAssignment_3 )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:923:1: ( ( rule__Graph__NameAssignment_3 )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:924:1: ( rule__Graph__NameAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getNameAssignment_3()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:925:1: ( rule__Graph__NameAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOT_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:925:2: rule__Graph__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Graph__NameAssignment_3_in_rule__Graph__Group__3__Impl1905);
                    rule__Graph__NameAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__3__Impl


    // $ANTLR start rule__Graph__Group__4
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:935:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl rule__Graph__Group__5 ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:939:1: ( rule__Graph__Group__4__Impl rule__Graph__Group__5 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:940:2: rule__Graph__Group__4__Impl rule__Graph__Group__5
            {
            pushFollow(FOLLOW_rule__Graph__Group__4__Impl_in_rule__Graph__Group__41936);
            rule__Graph__Group__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__5_in_rule__Graph__Group__41939);
            rule__Graph__Group__5();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__4


    // $ANTLR start rule__Graph__Group__4__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:947:1: rule__Graph__Group__4__Impl : ( '{' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:951:1: ( ( '{' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:952:1: ( '{' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:952:1: ( '{' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:953:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__Graph__Group__4__Impl1967); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__4__Impl


    // $ANTLR start rule__Graph__Group__5
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:966:1: rule__Graph__Group__5 : rule__Graph__Group__5__Impl rule__Graph__Group__6 ;
    public final void rule__Graph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:970:1: ( rule__Graph__Group__5__Impl rule__Graph__Group__6 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:971:2: rule__Graph__Group__5__Impl rule__Graph__Group__6
            {
            pushFollow(FOLLOW_rule__Graph__Group__5__Impl_in_rule__Graph__Group__51998);
            rule__Graph__Group__5__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Graph__Group__6_in_rule__Graph__Group__52001);
            rule__Graph__Group__6();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__5


    // $ANTLR start rule__Graph__Group__5__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:978:1: rule__Graph__Group__5__Impl : ( ( rule__Graph__StmtsAssignment_5 )* ) ;
    public final void rule__Graph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:982:1: ( ( ( rule__Graph__StmtsAssignment_5 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:983:1: ( ( rule__Graph__StmtsAssignment_5 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:983:1: ( ( rule__Graph__StmtsAssignment_5 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:984:1: ( rule__Graph__StmtsAssignment_5 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getStmtsAssignment_5()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:985:1: ( rule__Graph__StmtsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOT_ID||LA9_0==14||(LA9_0>=16 && LA9_0<=17)||LA9_0==19||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:985:2: rule__Graph__StmtsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Graph__StmtsAssignment_5_in_rule__Graph__Group__5__Impl2028);
            	    rule__Graph__StmtsAssignment_5();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getStmtsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__5__Impl


    // $ANTLR start rule__Graph__Group__6
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:995:1: rule__Graph__Group__6 : rule__Graph__Group__6__Impl ;
    public final void rule__Graph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:999:1: ( rule__Graph__Group__6__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1000:2: rule__Graph__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Graph__Group__6__Impl_in_rule__Graph__Group__62059);
            rule__Graph__Group__6__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__6


    // $ANTLR start rule__Graph__Group__6__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1006:1: rule__Graph__Group__6__Impl : ( '}' ) ;
    public final void rule__Graph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1010:1: ( ( '}' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1011:1: ( '}' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1011:1: ( '}' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1012:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,20,FOLLOW_20_in_rule__Graph__Group__6__Impl2087); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__Group__6__Impl


    // $ANTLR start rule__Stmt__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1039:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1043:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1044:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_rule__Stmt__Group__0__Impl_in_rule__Stmt__Group__02132);
            rule__Stmt__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Stmt__Group__1_in_rule__Stmt__Group__02135);
            rule__Stmt__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stmt__Group__0


    // $ANTLR start rule__Stmt__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1051:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__Alternatives_0 ) ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1055:1: ( ( ( rule__Stmt__Alternatives_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1056:1: ( ( rule__Stmt__Alternatives_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1056:1: ( ( rule__Stmt__Alternatives_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1057:1: ( rule__Stmt__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1058:1: ( rule__Stmt__Alternatives_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1058:2: rule__Stmt__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Stmt__Alternatives_0_in_rule__Stmt__Group__0__Impl2162);
            rule__Stmt__Alternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stmt__Group__0__Impl


    // $ANTLR start rule__Stmt__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1068:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1072:1: ( rule__Stmt__Group__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1073:2: rule__Stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stmt__Group__1__Impl_in_rule__Stmt__Group__12192);
            rule__Stmt__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stmt__Group__1


    // $ANTLR start rule__Stmt__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1079:1: rule__Stmt__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1083:1: ( ( ( ';' )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1084:1: ( ( ';' )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1084:1: ( ( ';' )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1085:1: ( ';' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1086:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1087:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__Stmt__Group__1__Impl2221); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stmt__Group__1__Impl


    // $ANTLR start rule__Edge_stmt_node__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1102:1: rule__Edge_stmt_node__Group__0 : rule__Edge_stmt_node__Group__0__Impl rule__Edge_stmt_node__Group__1 ;
    public final void rule__Edge_stmt_node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1106:1: ( rule__Edge_stmt_node__Group__0__Impl rule__Edge_stmt_node__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1107:2: rule__Edge_stmt_node__Group__0__Impl rule__Edge_stmt_node__Group__1
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__0__Impl_in_rule__Edge_stmt_node__Group__02258);
            rule__Edge_stmt_node__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__1_in_rule__Edge_stmt_node__Group__02261);
            rule__Edge_stmt_node__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__0


    // $ANTLR start rule__Edge_stmt_node__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1114:1: rule__Edge_stmt_node__Group__0__Impl : ( ( rule__Edge_stmt_node__Node_idAssignment_0 ) ) ;
    public final void rule__Edge_stmt_node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1118:1: ( ( ( rule__Edge_stmt_node__Node_idAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1119:1: ( ( rule__Edge_stmt_node__Node_idAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1119:1: ( ( rule__Edge_stmt_node__Node_idAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1120:1: ( rule__Edge_stmt_node__Node_idAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getNode_idAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1121:1: ( rule__Edge_stmt_node__Node_idAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1121:2: rule__Edge_stmt_node__Node_idAssignment_0
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__Node_idAssignment_0_in_rule__Edge_stmt_node__Group__0__Impl2288);
            rule__Edge_stmt_node__Node_idAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getNode_idAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__0__Impl


    // $ANTLR start rule__Edge_stmt_node__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1131:1: rule__Edge_stmt_node__Group__1 : rule__Edge_stmt_node__Group__1__Impl rule__Edge_stmt_node__Group__2 ;
    public final void rule__Edge_stmt_node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1135:1: ( rule__Edge_stmt_node__Group__1__Impl rule__Edge_stmt_node__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1136:2: rule__Edge_stmt_node__Group__1__Impl rule__Edge_stmt_node__Group__2
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__1__Impl_in_rule__Edge_stmt_node__Group__12318);
            rule__Edge_stmt_node__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__2_in_rule__Edge_stmt_node__Group__12321);
            rule__Edge_stmt_node__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__1


    // $ANTLR start rule__Edge_stmt_node__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1143:1: rule__Edge_stmt_node__Group__1__Impl : ( ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* ) ) ;
    public final void rule__Edge_stmt_node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1147:1: ( ( ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1148:1: ( ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1148:1: ( ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1149:1: ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1149:1: ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1150:1: ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1151:1: ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1151:2: rule__Edge_stmt_node__EdgeRHSAssignment_1
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__EdgeRHSAssignment_1_in_rule__Edge_stmt_node__Group__1__Impl2350);
            rule__Edge_stmt_node__EdgeRHSAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSAssignment_1()); 
            }

            }

            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1154:1: ( ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1155:1: ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1156:1: ( rule__Edge_stmt_node__EdgeRHSAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1156:2: rule__Edge_stmt_node__EdgeRHSAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Edge_stmt_node__EdgeRHSAssignment_1_in_rule__Edge_stmt_node__Group__1__Impl2362);
            	    rule__Edge_stmt_node__EdgeRHSAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__1__Impl


    // $ANTLR start rule__Edge_stmt_node__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1167:1: rule__Edge_stmt_node__Group__2 : rule__Edge_stmt_node__Group__2__Impl ;
    public final void rule__Edge_stmt_node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1171:1: ( rule__Edge_stmt_node__Group__2__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1172:2: rule__Edge_stmt_node__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Edge_stmt_node__Group__2__Impl_in_rule__Edge_stmt_node__Group__22395);
            rule__Edge_stmt_node__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__2


    // $ANTLR start rule__Edge_stmt_node__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1178:1: rule__Edge_stmt_node__Group__2__Impl : ( ( rule__Edge_stmt_node__AttributesAssignment_2 )* ) ;
    public final void rule__Edge_stmt_node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1182:1: ( ( ( rule__Edge_stmt_node__AttributesAssignment_2 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1183:1: ( ( rule__Edge_stmt_node__AttributesAssignment_2 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1183:1: ( ( rule__Edge_stmt_node__AttributesAssignment_2 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1184:1: ( rule__Edge_stmt_node__AttributesAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getAttributesAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1185:1: ( rule__Edge_stmt_node__AttributesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1185:2: rule__Edge_stmt_node__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Edge_stmt_node__AttributesAssignment_2_in_rule__Edge_stmt_node__Group__2__Impl2422);
            	    rule__Edge_stmt_node__AttributesAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getAttributesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Group__2__Impl


    // $ANTLR start rule__Edge_stmt_subgraph__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1201:1: rule__Edge_stmt_subgraph__Group__0 : rule__Edge_stmt_subgraph__Group__0__Impl rule__Edge_stmt_subgraph__Group__1 ;
    public final void rule__Edge_stmt_subgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1205:1: ( rule__Edge_stmt_subgraph__Group__0__Impl rule__Edge_stmt_subgraph__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1206:2: rule__Edge_stmt_subgraph__Group__0__Impl rule__Edge_stmt_subgraph__Group__1
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__0__Impl_in_rule__Edge_stmt_subgraph__Group__02459);
            rule__Edge_stmt_subgraph__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__1_in_rule__Edge_stmt_subgraph__Group__02462);
            rule__Edge_stmt_subgraph__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__0


    // $ANTLR start rule__Edge_stmt_subgraph__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1213:1: rule__Edge_stmt_subgraph__Group__0__Impl : ( ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 ) ) ;
    public final void rule__Edge_stmt_subgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1217:1: ( ( ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1218:1: ( ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1218:1: ( ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1219:1: ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getSubgraphAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1220:1: ( rule__Edge_stmt_subgraph__SubgraphAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1220:2: rule__Edge_stmt_subgraph__SubgraphAssignment_0
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__SubgraphAssignment_0_in_rule__Edge_stmt_subgraph__Group__0__Impl2489);
            rule__Edge_stmt_subgraph__SubgraphAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getSubgraphAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__0__Impl


    // $ANTLR start rule__Edge_stmt_subgraph__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1230:1: rule__Edge_stmt_subgraph__Group__1 : rule__Edge_stmt_subgraph__Group__1__Impl rule__Edge_stmt_subgraph__Group__2 ;
    public final void rule__Edge_stmt_subgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1234:1: ( rule__Edge_stmt_subgraph__Group__1__Impl rule__Edge_stmt_subgraph__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1235:2: rule__Edge_stmt_subgraph__Group__1__Impl rule__Edge_stmt_subgraph__Group__2
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__1__Impl_in_rule__Edge_stmt_subgraph__Group__12519);
            rule__Edge_stmt_subgraph__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__2_in_rule__Edge_stmt_subgraph__Group__12522);
            rule__Edge_stmt_subgraph__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__1


    // $ANTLR start rule__Edge_stmt_subgraph__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1242:1: rule__Edge_stmt_subgraph__Group__1__Impl : ( ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* ) ) ;
    public final void rule__Edge_stmt_subgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1246:1: ( ( ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1247:1: ( ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1247:1: ( ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1248:1: ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) ) ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1248:1: ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1249:1: ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1250:1: ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1250:2: rule__Edge_stmt_subgraph__EdgeRHSAssignment_1
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__EdgeRHSAssignment_1_in_rule__Edge_stmt_subgraph__Group__1__Impl2551);
            rule__Edge_stmt_subgraph__EdgeRHSAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSAssignment_1()); 
            }

            }

            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1253:1: ( ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1254:1: ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1255:1: ( rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1255:2: rule__Edge_stmt_subgraph__EdgeRHSAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Edge_stmt_subgraph__EdgeRHSAssignment_1_in_rule__Edge_stmt_subgraph__Group__1__Impl2563);
            	    rule__Edge_stmt_subgraph__EdgeRHSAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__1__Impl


    // $ANTLR start rule__Edge_stmt_subgraph__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1266:1: rule__Edge_stmt_subgraph__Group__2 : rule__Edge_stmt_subgraph__Group__2__Impl ;
    public final void rule__Edge_stmt_subgraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1270:1: ( rule__Edge_stmt_subgraph__Group__2__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1271:2: rule__Edge_stmt_subgraph__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Edge_stmt_subgraph__Group__2__Impl_in_rule__Edge_stmt_subgraph__Group__22596);
            rule__Edge_stmt_subgraph__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__2


    // $ANTLR start rule__Edge_stmt_subgraph__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1277:1: rule__Edge_stmt_subgraph__Group__2__Impl : ( ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )* ) ;
    public final void rule__Edge_stmt_subgraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1281:1: ( ( ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1282:1: ( ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1282:1: ( ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1283:1: ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getAttributesAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1284:1: ( rule__Edge_stmt_subgraph__AttributesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1284:2: rule__Edge_stmt_subgraph__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Edge_stmt_subgraph__AttributesAssignment_2_in_rule__Edge_stmt_subgraph__Group__2__Impl2623);
            	    rule__Edge_stmt_subgraph__AttributesAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getAttributesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__Group__2__Impl


    // $ANTLR start rule__Node_stmt__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1300:1: rule__Node_stmt__Group__0 : rule__Node_stmt__Group__0__Impl rule__Node_stmt__Group__1 ;
    public final void rule__Node_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1304:1: ( rule__Node_stmt__Group__0__Impl rule__Node_stmt__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1305:2: rule__Node_stmt__Group__0__Impl rule__Node_stmt__Group__1
            {
            pushFollow(FOLLOW_rule__Node_stmt__Group__0__Impl_in_rule__Node_stmt__Group__02660);
            rule__Node_stmt__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Node_stmt__Group__1_in_rule__Node_stmt__Group__02663);
            rule__Node_stmt__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__Group__0


    // $ANTLR start rule__Node_stmt__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1312:1: rule__Node_stmt__Group__0__Impl : ( ( rule__Node_stmt__NameAssignment_0 ) ) ;
    public final void rule__Node_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1316:1: ( ( ( rule__Node_stmt__NameAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1317:1: ( ( rule__Node_stmt__NameAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1317:1: ( ( rule__Node_stmt__NameAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1318:1: ( rule__Node_stmt__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtAccess().getNameAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1319:1: ( rule__Node_stmt__NameAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1319:2: rule__Node_stmt__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node_stmt__NameAssignment_0_in_rule__Node_stmt__Group__0__Impl2690);
            rule__Node_stmt__NameAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__Group__0__Impl


    // $ANTLR start rule__Node_stmt__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1329:1: rule__Node_stmt__Group__1 : rule__Node_stmt__Group__1__Impl ;
    public final void rule__Node_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1333:1: ( rule__Node_stmt__Group__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1334:2: rule__Node_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node_stmt__Group__1__Impl_in_rule__Node_stmt__Group__12720);
            rule__Node_stmt__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__Group__1


    // $ANTLR start rule__Node_stmt__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1340:1: rule__Node_stmt__Group__1__Impl : ( ( rule__Node_stmt__AttributesAssignment_1 )* ) ;
    public final void rule__Node_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1344:1: ( ( ( rule__Node_stmt__AttributesAssignment_1 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1345:1: ( ( rule__Node_stmt__AttributesAssignment_1 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1345:1: ( ( rule__Node_stmt__AttributesAssignment_1 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1346:1: ( rule__Node_stmt__AttributesAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtAccess().getAttributesAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1347:1: ( rule__Node_stmt__AttributesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1347:2: rule__Node_stmt__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Node_stmt__AttributesAssignment_1_in_rule__Node_stmt__Group__1__Impl2747);
            	    rule__Node_stmt__AttributesAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtAccess().getAttributesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__Group__1__Impl


    // $ANTLR start rule__Attribute__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1361:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1365:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1366:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02782);
            rule__Attribute__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02785);
            rule__Attribute__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1373:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1377:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1378:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1378:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1379:1: ( rule__Attribute__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1380:1: ( rule__Attribute__NameAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1380:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2812);
            rule__Attribute__NameAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__0__Impl


    // $ANTLR start rule__Attribute__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1390:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1394:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1395:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12842);
            rule__Attribute__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12845);
            rule__Attribute__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1402:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1406:1: ( ( '=' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1407:1: ( '=' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1407:1: ( '=' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1408:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Attribute__Group__1__Impl2873); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__1__Impl


    // $ANTLR start rule__Attribute__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1421:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1425:1: ( rule__Attribute__Group__2__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1426:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22904);
            rule__Attribute__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Attribute__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1432:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1436:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1437:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1437:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1438:1: ( rule__Attribute__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1439:1: ( rule__Attribute__ValueAssignment_2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1439:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl2931);
            rule__Attribute__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__2__Impl


    // $ANTLR start rule__Attr_stmt__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1455:1: rule__Attr_stmt__Group__0 : rule__Attr_stmt__Group__0__Impl rule__Attr_stmt__Group__1 ;
    public final void rule__Attr_stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1459:1: ( rule__Attr_stmt__Group__0__Impl rule__Attr_stmt__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1460:2: rule__Attr_stmt__Group__0__Impl rule__Attr_stmt__Group__1
            {
            pushFollow(FOLLOW_rule__Attr_stmt__Group__0__Impl_in_rule__Attr_stmt__Group__02967);
            rule__Attr_stmt__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Attr_stmt__Group__1_in_rule__Attr_stmt__Group__02970);
            rule__Attr_stmt__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__Group__0


    // $ANTLR start rule__Attr_stmt__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1467:1: rule__Attr_stmt__Group__0__Impl : ( ( rule__Attr_stmt__TypeAssignment_0 ) ) ;
    public final void rule__Attr_stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1471:1: ( ( ( rule__Attr_stmt__TypeAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1472:1: ( ( rule__Attr_stmt__TypeAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1472:1: ( ( rule__Attr_stmt__TypeAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1473:1: ( rule__Attr_stmt__TypeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getTypeAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1474:1: ( rule__Attr_stmt__TypeAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1474:2: rule__Attr_stmt__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attr_stmt__TypeAssignment_0_in_rule__Attr_stmt__Group__0__Impl2997);
            rule__Attr_stmt__TypeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__Group__0__Impl


    // $ANTLR start rule__Attr_stmt__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1484:1: rule__Attr_stmt__Group__1 : rule__Attr_stmt__Group__1__Impl ;
    public final void rule__Attr_stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1488:1: ( rule__Attr_stmt__Group__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1489:2: rule__Attr_stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attr_stmt__Group__1__Impl_in_rule__Attr_stmt__Group__13027);
            rule__Attr_stmt__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__Group__1


    // $ANTLR start rule__Attr_stmt__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1495:1: rule__Attr_stmt__Group__1__Impl : ( ( ( rule__Attr_stmt__AttributesAssignment_1 ) ) ( ( rule__Attr_stmt__AttributesAssignment_1 )* ) ) ;
    public final void rule__Attr_stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1499:1: ( ( ( ( rule__Attr_stmt__AttributesAssignment_1 ) ) ( ( rule__Attr_stmt__AttributesAssignment_1 )* ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1500:1: ( ( ( rule__Attr_stmt__AttributesAssignment_1 ) ) ( ( rule__Attr_stmt__AttributesAssignment_1 )* ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1500:1: ( ( ( rule__Attr_stmt__AttributesAssignment_1 ) ) ( ( rule__Attr_stmt__AttributesAssignment_1 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1501:1: ( ( rule__Attr_stmt__AttributesAssignment_1 ) ) ( ( rule__Attr_stmt__AttributesAssignment_1 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1501:1: ( ( rule__Attr_stmt__AttributesAssignment_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1502:1: ( rule__Attr_stmt__AttributesAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getAttributesAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1503:1: ( rule__Attr_stmt__AttributesAssignment_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1503:2: rule__Attr_stmt__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__Attr_stmt__AttributesAssignment_1_in_rule__Attr_stmt__Group__1__Impl3056);
            rule__Attr_stmt__AttributesAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getAttributesAssignment_1()); 
            }

            }

            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1506:1: ( ( rule__Attr_stmt__AttributesAssignment_1 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1507:1: ( rule__Attr_stmt__AttributesAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getAttributesAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1508:1: ( rule__Attr_stmt__AttributesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1508:2: rule__Attr_stmt__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Attr_stmt__AttributesAssignment_1_in_rule__Attr_stmt__Group__1__Impl3068);
            	    rule__Attr_stmt__AttributesAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getAttributesAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__Group__1__Impl


    // $ANTLR start rule__Attr_list__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1523:1: rule__Attr_list__Group__0 : rule__Attr_list__Group__0__Impl rule__Attr_list__Group__1 ;
    public final void rule__Attr_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1527:1: ( rule__Attr_list__Group__0__Impl rule__Attr_list__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1528:2: rule__Attr_list__Group__0__Impl rule__Attr_list__Group__1
            {
            pushFollow(FOLLOW_rule__Attr_list__Group__0__Impl_in_rule__Attr_list__Group__03105);
            rule__Attr_list__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Attr_list__Group__1_in_rule__Attr_list__Group__03108);
            rule__Attr_list__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__0


    // $ANTLR start rule__Attr_list__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1535:1: rule__Attr_list__Group__0__Impl : ( '[' ) ;
    public final void rule__Attr_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1539:1: ( ( '[' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1540:1: ( '[' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1540:1: ( '[' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1541:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Attr_list__Group__0__Impl3136); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__0__Impl


    // $ANTLR start rule__Attr_list__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1554:1: rule__Attr_list__Group__1 : rule__Attr_list__Group__1__Impl rule__Attr_list__Group__2 ;
    public final void rule__Attr_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1558:1: ( rule__Attr_list__Group__1__Impl rule__Attr_list__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1559:2: rule__Attr_list__Group__1__Impl rule__Attr_list__Group__2
            {
            pushFollow(FOLLOW_rule__Attr_list__Group__1__Impl_in_rule__Attr_list__Group__13167);
            rule__Attr_list__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Attr_list__Group__2_in_rule__Attr_list__Group__13170);
            rule__Attr_list__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__1


    // $ANTLR start rule__Attr_list__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1566:1: rule__Attr_list__Group__1__Impl : ( ( rule__Attr_list__A_listAssignment_1 )* ) ;
    public final void rule__Attr_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1570:1: ( ( ( rule__Attr_list__A_listAssignment_1 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1571:1: ( ( rule__Attr_list__A_listAssignment_1 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1571:1: ( ( rule__Attr_list__A_listAssignment_1 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1572:1: ( rule__Attr_list__A_listAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listAccess().getA_listAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1573:1: ( rule__Attr_list__A_listAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOT_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1573:2: rule__Attr_list__A_listAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Attr_list__A_listAssignment_1_in_rule__Attr_list__Group__1__Impl3197);
            	    rule__Attr_list__A_listAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listAccess().getA_listAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__1__Impl


    // $ANTLR start rule__Attr_list__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1583:1: rule__Attr_list__Group__2 : rule__Attr_list__Group__2__Impl ;
    public final void rule__Attr_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1587:1: ( rule__Attr_list__Group__2__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1588:2: rule__Attr_list__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attr_list__Group__2__Impl_in_rule__Attr_list__Group__23228);
            rule__Attr_list__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__2


    // $ANTLR start rule__Attr_list__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1594:1: rule__Attr_list__Group__2__Impl : ( ']' ) ;
    public final void rule__Attr_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1598:1: ( ( ']' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1599:1: ( ']' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1599:1: ( ']' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1600:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__Attr_list__Group__2__Impl3256); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__Group__2__Impl


    // $ANTLR start rule__A_list__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1619:1: rule__A_list__Group__0 : rule__A_list__Group__0__Impl rule__A_list__Group__1 ;
    public final void rule__A_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1623:1: ( rule__A_list__Group__0__Impl rule__A_list__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1624:2: rule__A_list__Group__0__Impl rule__A_list__Group__1
            {
            pushFollow(FOLLOW_rule__A_list__Group__0__Impl_in_rule__A_list__Group__03293);
            rule__A_list__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__A_list__Group__1_in_rule__A_list__Group__03296);
            rule__A_list__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__0


    // $ANTLR start rule__A_list__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1631:1: rule__A_list__Group__0__Impl : ( ( rule__A_list__NameAssignment_0 ) ) ;
    public final void rule__A_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1635:1: ( ( ( rule__A_list__NameAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1636:1: ( ( rule__A_list__NameAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1636:1: ( ( rule__A_list__NameAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1637:1: ( rule__A_list__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getNameAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1638:1: ( rule__A_list__NameAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1638:2: rule__A_list__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__A_list__NameAssignment_0_in_rule__A_list__Group__0__Impl3323);
            rule__A_list__NameAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__0__Impl


    // $ANTLR start rule__A_list__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1648:1: rule__A_list__Group__1 : rule__A_list__Group__1__Impl rule__A_list__Group__2 ;
    public final void rule__A_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1652:1: ( rule__A_list__Group__1__Impl rule__A_list__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1653:2: rule__A_list__Group__1__Impl rule__A_list__Group__2
            {
            pushFollow(FOLLOW_rule__A_list__Group__1__Impl_in_rule__A_list__Group__13353);
            rule__A_list__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__A_list__Group__2_in_rule__A_list__Group__13356);
            rule__A_list__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__1


    // $ANTLR start rule__A_list__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1660:1: rule__A_list__Group__1__Impl : ( ( rule__A_list__Group_1__0 )? ) ;
    public final void rule__A_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1664:1: ( ( ( rule__A_list__Group_1__0 )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1665:1: ( ( rule__A_list__Group_1__0 )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1665:1: ( ( rule__A_list__Group_1__0 )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1666:1: ( rule__A_list__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getGroup_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1667:1: ( rule__A_list__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1667:2: rule__A_list__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__A_list__Group_1__0_in_rule__A_list__Group__1__Impl3383);
                    rule__A_list__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__1__Impl


    // $ANTLR start rule__A_list__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1677:1: rule__A_list__Group__2 : rule__A_list__Group__2__Impl ;
    public final void rule__A_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1681:1: ( rule__A_list__Group__2__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1682:2: rule__A_list__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__A_list__Group__2__Impl_in_rule__A_list__Group__23414);
            rule__A_list__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__2


    // $ANTLR start rule__A_list__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1688:1: rule__A_list__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__A_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1692:1: ( ( ( ',' )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1693:1: ( ( ',' )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1693:1: ( ( ',' )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1694:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getCommaKeyword_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1695:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1696:2: ','
                    {
                    match(input,25,FOLLOW_25_in_rule__A_list__Group__2__Impl3443); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group__2__Impl


    // $ANTLR start rule__A_list__Group_1__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1713:1: rule__A_list__Group_1__0 : rule__A_list__Group_1__0__Impl rule__A_list__Group_1__1 ;
    public final void rule__A_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1717:1: ( rule__A_list__Group_1__0__Impl rule__A_list__Group_1__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1718:2: rule__A_list__Group_1__0__Impl rule__A_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__A_list__Group_1__0__Impl_in_rule__A_list__Group_1__03482);
            rule__A_list__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__A_list__Group_1__1_in_rule__A_list__Group_1__03485);
            rule__A_list__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group_1__0


    // $ANTLR start rule__A_list__Group_1__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1725:1: rule__A_list__Group_1__0__Impl : ( '=' ) ;
    public final void rule__A_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1729:1: ( ( '=' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1730:1: ( '=' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1730:1: ( '=' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1731:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getEqualsSignKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__A_list__Group_1__0__Impl3513); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group_1__0__Impl


    // $ANTLR start rule__A_list__Group_1__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1744:1: rule__A_list__Group_1__1 : rule__A_list__Group_1__1__Impl ;
    public final void rule__A_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1748:1: ( rule__A_list__Group_1__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1749:2: rule__A_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__A_list__Group_1__1__Impl_in_rule__A_list__Group_1__13544);
            rule__A_list__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group_1__1


    // $ANTLR start rule__A_list__Group_1__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1755:1: rule__A_list__Group_1__1__Impl : ( ( rule__A_list__ValueAssignment_1_1 ) ) ;
    public final void rule__A_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1759:1: ( ( ( rule__A_list__ValueAssignment_1_1 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1760:1: ( ( rule__A_list__ValueAssignment_1_1 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1760:1: ( ( rule__A_list__ValueAssignment_1_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1761:1: ( rule__A_list__ValueAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getValueAssignment_1_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1762:1: ( rule__A_list__ValueAssignment_1_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1762:2: rule__A_list__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__A_list__ValueAssignment_1_1_in_rule__A_list__Group_1__1__Impl3571);
            rule__A_list__ValueAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__Group_1__1__Impl


    // $ANTLR start rule__Subgraph__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1776:1: rule__Subgraph__Group__0 : rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 ;
    public final void rule__Subgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1780:1: ( rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1781:2: rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__0__Impl_in_rule__Subgraph__Group__03605);
            rule__Subgraph__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__1_in_rule__Subgraph__Group__03608);
            rule__Subgraph__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__0


    // $ANTLR start rule__Subgraph__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1788:1: rule__Subgraph__Group__0__Impl : ( ( rule__Subgraph__Group_0__0 )? ) ;
    public final void rule__Subgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1792:1: ( ( ( rule__Subgraph__Group_0__0 )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1793:1: ( ( rule__Subgraph__Group_0__0 )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1793:1: ( ( rule__Subgraph__Group_0__0 )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1794:1: ( rule__Subgraph__Group_0__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1795:1: ( rule__Subgraph__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1795:2: rule__Subgraph__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Subgraph__Group_0__0_in_rule__Subgraph__Group__0__Impl3635);
                    rule__Subgraph__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__0__Impl


    // $ANTLR start rule__Subgraph__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1805:1: rule__Subgraph__Group__1 : rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 ;
    public final void rule__Subgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1809:1: ( rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1810:2: rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__1__Impl_in_rule__Subgraph__Group__13666);
            rule__Subgraph__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__2_in_rule__Subgraph__Group__13669);
            rule__Subgraph__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__1


    // $ANTLR start rule__Subgraph__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1817:1: rule__Subgraph__Group__1__Impl : ( '{' ) ;
    public final void rule__Subgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1821:1: ( ( '{' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1822:1: ( '{' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1822:1: ( '{' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1823:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Subgraph__Group__1__Impl3697); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__1__Impl


    // $ANTLR start rule__Subgraph__Group__2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1836:1: rule__Subgraph__Group__2 : rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 ;
    public final void rule__Subgraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1840:1: ( rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1841:2: rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__2__Impl_in_rule__Subgraph__Group__23728);
            rule__Subgraph__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__3_in_rule__Subgraph__Group__23731);
            rule__Subgraph__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__2


    // $ANTLR start rule__Subgraph__Group__2__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1848:1: rule__Subgraph__Group__2__Impl : ( ( rule__Subgraph__StmtsAssignment_2 )* ) ;
    public final void rule__Subgraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1852:1: ( ( ( rule__Subgraph__StmtsAssignment_2 )* ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1853:1: ( ( rule__Subgraph__StmtsAssignment_2 )* )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1853:1: ( ( rule__Subgraph__StmtsAssignment_2 )* )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1854:1: ( rule__Subgraph__StmtsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsAssignment_2()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1855:1: ( rule__Subgraph__StmtsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_DOT_ID||LA21_0==14||(LA21_0>=16 && LA21_0<=17)||LA21_0==19||LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1855:2: rule__Subgraph__StmtsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Subgraph__StmtsAssignment_2_in_rule__Subgraph__Group__2__Impl3758);
            	    rule__Subgraph__StmtsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__2__Impl


    // $ANTLR start rule__Subgraph__Group__3
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1865:1: rule__Subgraph__Group__3 : rule__Subgraph__Group__3__Impl ;
    public final void rule__Subgraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1869:1: ( rule__Subgraph__Group__3__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1870:2: rule__Subgraph__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__3__Impl_in_rule__Subgraph__Group__33789);
            rule__Subgraph__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__3


    // $ANTLR start rule__Subgraph__Group__3__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1876:1: rule__Subgraph__Group__3__Impl : ( '}' ) ;
    public final void rule__Subgraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1880:1: ( ( '}' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1881:1: ( '}' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1881:1: ( '}' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1882:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__Subgraph__Group__3__Impl3817); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group__3__Impl


    // $ANTLR start rule__Subgraph__Group_0__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1903:1: rule__Subgraph__Group_0__0 : rule__Subgraph__Group_0__0__Impl rule__Subgraph__Group_0__1 ;
    public final void rule__Subgraph__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1907:1: ( rule__Subgraph__Group_0__0__Impl rule__Subgraph__Group_0__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1908:2: rule__Subgraph__Group_0__0__Impl rule__Subgraph__Group_0__1
            {
            pushFollow(FOLLOW_rule__Subgraph__Group_0__0__Impl_in_rule__Subgraph__Group_0__03856);
            rule__Subgraph__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group_0__1_in_rule__Subgraph__Group_0__03859);
            rule__Subgraph__Group_0__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group_0__0


    // $ANTLR start rule__Subgraph__Group_0__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1915:1: rule__Subgraph__Group_0__0__Impl : ( 'subgraph' ) ;
    public final void rule__Subgraph__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1919:1: ( ( 'subgraph' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1920:1: ( 'subgraph' )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1920:1: ( 'subgraph' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1921:1: 'subgraph'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getSubgraphKeyword_0_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Subgraph__Group_0__0__Impl3887); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getSubgraphKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group_0__0__Impl


    // $ANTLR start rule__Subgraph__Group_0__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1934:1: rule__Subgraph__Group_0__1 : rule__Subgraph__Group_0__1__Impl ;
    public final void rule__Subgraph__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1938:1: ( rule__Subgraph__Group_0__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1939:2: rule__Subgraph__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Subgraph__Group_0__1__Impl_in_rule__Subgraph__Group_0__13918);
            rule__Subgraph__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group_0__1


    // $ANTLR start rule__Subgraph__Group_0__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1945:1: rule__Subgraph__Group_0__1__Impl : ( ( rule__Subgraph__NameAssignment_0_1 )? ) ;
    public final void rule__Subgraph__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1949:1: ( ( ( rule__Subgraph__NameAssignment_0_1 )? ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1950:1: ( ( rule__Subgraph__NameAssignment_0_1 )? )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1950:1: ( ( rule__Subgraph__NameAssignment_0_1 )? )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1951:1: ( rule__Subgraph__NameAssignment_0_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameAssignment_0_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1952:1: ( rule__Subgraph__NameAssignment_0_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOT_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1952:2: rule__Subgraph__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Subgraph__NameAssignment_0_1_in_rule__Subgraph__Group_0__1__Impl3945);
                    rule__Subgraph__NameAssignment_0_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__Group_0__1__Impl


    // $ANTLR start rule__EdgeRHS_node__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1966:1: rule__EdgeRHS_node__Group__0 : rule__EdgeRHS_node__Group__0__Impl rule__EdgeRHS_node__Group__1 ;
    public final void rule__EdgeRHS_node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1970:1: ( rule__EdgeRHS_node__Group__0__Impl rule__EdgeRHS_node__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1971:2: rule__EdgeRHS_node__Group__0__Impl rule__EdgeRHS_node__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeRHS_node__Group__0__Impl_in_rule__EdgeRHS_node__Group__03980);
            rule__EdgeRHS_node__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EdgeRHS_node__Group__1_in_rule__EdgeRHS_node__Group__03983);
            rule__EdgeRHS_node__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__Group__0


    // $ANTLR start rule__EdgeRHS_node__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1978:1: rule__EdgeRHS_node__Group__0__Impl : ( ( rule__EdgeRHS_node__OpAssignment_0 ) ) ;
    public final void rule__EdgeRHS_node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1982:1: ( ( ( rule__EdgeRHS_node__OpAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1983:1: ( ( rule__EdgeRHS_node__OpAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1983:1: ( ( rule__EdgeRHS_node__OpAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1984:1: ( rule__EdgeRHS_node__OpAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeAccess().getOpAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1985:1: ( rule__EdgeRHS_node__OpAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1985:2: rule__EdgeRHS_node__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeRHS_node__OpAssignment_0_in_rule__EdgeRHS_node__Group__0__Impl4010);
            rule__EdgeRHS_node__OpAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__Group__0__Impl


    // $ANTLR start rule__EdgeRHS_node__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1995:1: rule__EdgeRHS_node__Group__1 : rule__EdgeRHS_node__Group__1__Impl ;
    public final void rule__EdgeRHS_node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:1999:1: ( rule__EdgeRHS_node__Group__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2000:2: rule__EdgeRHS_node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EdgeRHS_node__Group__1__Impl_in_rule__EdgeRHS_node__Group__14040);
            rule__EdgeRHS_node__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__Group__1


    // $ANTLR start rule__EdgeRHS_node__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2006:1: rule__EdgeRHS_node__Group__1__Impl : ( ( rule__EdgeRHS_node__NodeAssignment_1 ) ) ;
    public final void rule__EdgeRHS_node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2010:1: ( ( ( rule__EdgeRHS_node__NodeAssignment_1 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2011:1: ( ( rule__EdgeRHS_node__NodeAssignment_1 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2011:1: ( ( rule__EdgeRHS_node__NodeAssignment_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2012:1: ( rule__EdgeRHS_node__NodeAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeAccess().getNodeAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2013:1: ( rule__EdgeRHS_node__NodeAssignment_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2013:2: rule__EdgeRHS_node__NodeAssignment_1
            {
            pushFollow(FOLLOW_rule__EdgeRHS_node__NodeAssignment_1_in_rule__EdgeRHS_node__Group__1__Impl4067);
            rule__EdgeRHS_node__NodeAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__Group__1__Impl


    // $ANTLR start rule__EdgeRHS_subgraph__Group__0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2027:1: rule__EdgeRHS_subgraph__Group__0 : rule__EdgeRHS_subgraph__Group__0__Impl rule__EdgeRHS_subgraph__Group__1 ;
    public final void rule__EdgeRHS_subgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2031:1: ( rule__EdgeRHS_subgraph__Group__0__Impl rule__EdgeRHS_subgraph__Group__1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2032:2: rule__EdgeRHS_subgraph__Group__0__Impl rule__EdgeRHS_subgraph__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__Group__0__Impl_in_rule__EdgeRHS_subgraph__Group__04101);
            rule__EdgeRHS_subgraph__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__Group__1_in_rule__EdgeRHS_subgraph__Group__04104);
            rule__EdgeRHS_subgraph__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__Group__0


    // $ANTLR start rule__EdgeRHS_subgraph__Group__0__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2039:1: rule__EdgeRHS_subgraph__Group__0__Impl : ( ( rule__EdgeRHS_subgraph__OpAssignment_0 ) ) ;
    public final void rule__EdgeRHS_subgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2043:1: ( ( ( rule__EdgeRHS_subgraph__OpAssignment_0 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2044:1: ( ( rule__EdgeRHS_subgraph__OpAssignment_0 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2044:1: ( ( rule__EdgeRHS_subgraph__OpAssignment_0 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2045:1: ( rule__EdgeRHS_subgraph__OpAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphAccess().getOpAssignment_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2046:1: ( rule__EdgeRHS_subgraph__OpAssignment_0 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2046:2: rule__EdgeRHS_subgraph__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__OpAssignment_0_in_rule__EdgeRHS_subgraph__Group__0__Impl4131);
            rule__EdgeRHS_subgraph__OpAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__Group__0__Impl


    // $ANTLR start rule__EdgeRHS_subgraph__Group__1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2056:1: rule__EdgeRHS_subgraph__Group__1 : rule__EdgeRHS_subgraph__Group__1__Impl ;
    public final void rule__EdgeRHS_subgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2060:1: ( rule__EdgeRHS_subgraph__Group__1__Impl )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2061:2: rule__EdgeRHS_subgraph__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__Group__1__Impl_in_rule__EdgeRHS_subgraph__Group__14161);
            rule__EdgeRHS_subgraph__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__Group__1


    // $ANTLR start rule__EdgeRHS_subgraph__Group__1__Impl
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2067:1: rule__EdgeRHS_subgraph__Group__1__Impl : ( ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 ) ) ;
    public final void rule__EdgeRHS_subgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2071:1: ( ( ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2072:1: ( ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2072:1: ( ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2073:1: ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphAccess().getSubgraphAssignment_1()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2074:1: ( rule__EdgeRHS_subgraph__SubgraphAssignment_1 )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2074:2: rule__EdgeRHS_subgraph__SubgraphAssignment_1
            {
            pushFollow(FOLLOW_rule__EdgeRHS_subgraph__SubgraphAssignment_1_in_rule__EdgeRHS_subgraph__Group__1__Impl4188);
            rule__EdgeRHS_subgraph__SubgraphAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphAccess().getSubgraphAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__Group__1__Impl


    // $ANTLR start rule__Graphvizmodel__GraphsAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2089:1: rule__Graphvizmodel__GraphsAssignment_2 : ( rulegraph ) ;
    public final void rule__Graphvizmodel__GraphsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2093:1: ( ( rulegraph ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2094:1: ( rulegraph )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2094:1: ( rulegraph )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2095:1: rulegraph
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphvizmodelAccess().getGraphsGraphParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulegraph_in_rule__Graphvizmodel__GraphsAssignment_24227);
            rulegraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphvizmodelAccess().getGraphsGraphParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graphvizmodel__GraphsAssignment_2


    // $ANTLR start rule__Graph__StrictAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2104:1: rule__Graph__StrictAssignment_1 : ( ( 'strict' ) ) ;
    public final void rule__Graph__StrictAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2108:1: ( ( ( 'strict' ) ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2109:1: ( ( 'strict' ) )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2109:1: ( ( 'strict' ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2110:1: ( 'strict' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getStrictStrictKeyword_1_0()); 
            }
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2111:1: ( 'strict' )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2112:1: 'strict'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getStrictStrictKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Graph__StrictAssignment_14263); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getStrictStrictKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getStrictStrictKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__StrictAssignment_1


    // $ANTLR start rule__Graph__TypeAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2127:1: rule__Graph__TypeAssignment_2 : ( rulegraphtype ) ;
    public final void rule__Graph__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2131:1: ( ( rulegraphtype ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2132:1: ( rulegraphtype )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2132:1: ( rulegraphtype )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2133:1: rulegraphtype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getTypeGraphtypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulegraphtype_in_rule__Graph__TypeAssignment_24302);
            rulegraphtype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getTypeGraphtypeEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__TypeAssignment_2


    // $ANTLR start rule__Graph__NameAssignment_3
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2142:1: rule__Graph__NameAssignment_3 : ( RULE_DOT_ID ) ;
    public final void rule__Graph__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2146:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2147:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2147:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2148:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getNameDOT_IDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Graph__NameAssignment_34333); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getNameDOT_IDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__NameAssignment_3


    // $ANTLR start rule__Graph__StmtsAssignment_5
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2157:1: rule__Graph__StmtsAssignment_5 : ( rulestmt ) ;
    public final void rule__Graph__StmtsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2161:1: ( ( rulestmt ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2162:1: ( rulestmt )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2162:1: ( rulestmt )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2163:1: rulestmt
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getStmtsStmtParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_rulestmt_in_rule__Graph__StmtsAssignment_54364);
            rulestmt();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getStmtsStmtParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Graph__StmtsAssignment_5


    // $ANTLR start rule__Edge_stmt_node__Node_idAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2172:1: rule__Edge_stmt_node__Node_idAssignment_0 : ( rulenode_id ) ;
    public final void rule__Edge_stmt_node__Node_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2176:1: ( ( rulenode_id ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2177:1: ( rulenode_id )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2177:1: ( rulenode_id )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2178:1: rulenode_id
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getNode_idNode_idParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulenode_id_in_rule__Edge_stmt_node__Node_idAssignment_04395);
            rulenode_id();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getNode_idNode_idParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__Node_idAssignment_0


    // $ANTLR start rule__Edge_stmt_node__EdgeRHSAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2187:1: rule__Edge_stmt_node__EdgeRHSAssignment_1 : ( ruleedgeRHS ) ;
    public final void rule__Edge_stmt_node__EdgeRHSAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2191:1: ( ( ruleedgeRHS ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2192:1: ( ruleedgeRHS )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2192:1: ( ruleedgeRHS )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2193:1: ruleedgeRHS
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_in_rule__Edge_stmt_node__EdgeRHSAssignment_14426);
            ruleedgeRHS();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__EdgeRHSAssignment_1


    // $ANTLR start rule__Edge_stmt_node__AttributesAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2202:1: rule__Edge_stmt_node__AttributesAssignment_2 : ( ruleattr_list ) ;
    public final void rule__Edge_stmt_node__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2206:1: ( ( ruleattr_list ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2207:1: ( ruleattr_list )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2207:1: ( ruleattr_list )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2208:1: ruleattr_list
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_nodeAccess().getAttributesAttr_listParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_rule__Edge_stmt_node__AttributesAssignment_24457);
            ruleattr_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_nodeAccess().getAttributesAttr_listParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_node__AttributesAssignment_2


    // $ANTLR start rule__Edge_stmt_subgraph__SubgraphAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2217:1: rule__Edge_stmt_subgraph__SubgraphAssignment_0 : ( rulesubgraph ) ;
    public final void rule__Edge_stmt_subgraph__SubgraphAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2221:1: ( ( rulesubgraph ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2222:1: ( rulesubgraph )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2222:1: ( rulesubgraph )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2223:1: rulesubgraph
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getSubgraphSubgraphParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulesubgraph_in_rule__Edge_stmt_subgraph__SubgraphAssignment_04488);
            rulesubgraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getSubgraphSubgraphParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__SubgraphAssignment_0


    // $ANTLR start rule__Edge_stmt_subgraph__EdgeRHSAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2232:1: rule__Edge_stmt_subgraph__EdgeRHSAssignment_1 : ( ruleedgeRHS ) ;
    public final void rule__Edge_stmt_subgraph__EdgeRHSAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2236:1: ( ( ruleedgeRHS ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2237:1: ( ruleedgeRHS )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2237:1: ( ruleedgeRHS )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2238:1: ruleedgeRHS
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleedgeRHS_in_rule__Edge_stmt_subgraph__EdgeRHSAssignment_14519);
            ruleedgeRHS();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getEdgeRHSEdgeRHSParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__EdgeRHSAssignment_1


    // $ANTLR start rule__Edge_stmt_subgraph__AttributesAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2247:1: rule__Edge_stmt_subgraph__AttributesAssignment_2 : ( ruleattr_list ) ;
    public final void rule__Edge_stmt_subgraph__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2251:1: ( ( ruleattr_list ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2252:1: ( ruleattr_list )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2252:1: ( ruleattr_list )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2253:1: ruleattr_list
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdge_stmt_subgraphAccess().getAttributesAttr_listParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_rule__Edge_stmt_subgraph__AttributesAssignment_24550);
            ruleattr_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdge_stmt_subgraphAccess().getAttributesAttr_listParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Edge_stmt_subgraph__AttributesAssignment_2


    // $ANTLR start rule__Node_stmt__NameAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2262:1: rule__Node_stmt__NameAssignment_0 : ( RULE_DOT_ID ) ;
    public final void rule__Node_stmt__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2266:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2267:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2267:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2268:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Node_stmt__NameAssignment_04581); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__NameAssignment_0


    // $ANTLR start rule__Node_stmt__AttributesAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2277:1: rule__Node_stmt__AttributesAssignment_1 : ( ruleattr_list ) ;
    public final void rule__Node_stmt__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2281:1: ( ( ruleattr_list ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2282:1: ( ruleattr_list )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2282:1: ( ruleattr_list )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2283:1: ruleattr_list
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_stmtAccess().getAttributesAttr_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_rule__Node_stmt__AttributesAssignment_14612);
            ruleattr_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNode_stmtAccess().getAttributesAttr_listParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_stmt__AttributesAssignment_1


    // $ANTLR start rule__Attribute__NameAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2292:1: rule__Attribute__NameAssignment_0 : ( RULE_DOT_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2296:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2297:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2297:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2298:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Attribute__NameAssignment_04643); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__NameAssignment_0


    // $ANTLR start rule__Attribute__ValueAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2307:1: rule__Attribute__ValueAssignment_2 : ( RULE_DOT_ID ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2311:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2312:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2312:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2313:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueDOT_IDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Attribute__ValueAssignment_24674); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueDOT_IDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ValueAssignment_2


    // $ANTLR start rule__Attr_stmt__TypeAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2322:1: rule__Attr_stmt__TypeAssignment_0 : ( ruleattributetype ) ;
    public final void rule__Attr_stmt__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2326:1: ( ( ruleattributetype ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2327:1: ( ruleattributetype )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2327:1: ( ruleattributetype )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2328:1: ruleattributetype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getTypeAttributetypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleattributetype_in_rule__Attr_stmt__TypeAssignment_04705);
            ruleattributetype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getTypeAttributetypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__TypeAssignment_0


    // $ANTLR start rule__Attr_stmt__AttributesAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2337:1: rule__Attr_stmt__AttributesAssignment_1 : ( ruleattr_list ) ;
    public final void rule__Attr_stmt__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2341:1: ( ( ruleattr_list ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2342:1: ( ruleattr_list )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2342:1: ( ruleattr_list )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2343:1: ruleattr_list
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_stmtAccess().getAttributesAttr_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleattr_list_in_rule__Attr_stmt__AttributesAssignment_14736);
            ruleattr_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_stmtAccess().getAttributesAttr_listParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_stmt__AttributesAssignment_1


    // $ANTLR start rule__Attr_list__A_listAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2352:1: rule__Attr_list__A_listAssignment_1 : ( rulea_list ) ;
    public final void rule__Attr_list__A_listAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2356:1: ( ( rulea_list ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2357:1: ( rulea_list )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2357:1: ( rulea_list )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2358:1: rulea_list
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAttr_listAccess().getA_listA_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulea_list_in_rule__Attr_list__A_listAssignment_14767);
            rulea_list();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAttr_listAccess().getA_listA_listParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attr_list__A_listAssignment_1


    // $ANTLR start rule__A_list__NameAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2367:1: rule__A_list__NameAssignment_0 : ( RULE_DOT_ID ) ;
    public final void rule__A_list__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2371:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2372:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2372:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2373:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__A_list__NameAssignment_04798); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getNameDOT_IDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__NameAssignment_0


    // $ANTLR start rule__A_list__ValueAssignment_1_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2382:1: rule__A_list__ValueAssignment_1_1 : ( RULE_DOT_ID ) ;
    public final void rule__A_list__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2386:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2387:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2387:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2388:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getA_listAccess().getValueDOT_IDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__A_list__ValueAssignment_1_14829); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getA_listAccess().getValueDOT_IDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__A_list__ValueAssignment_1_1


    // $ANTLR start rule__Subgraph__NameAssignment_0_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2397:1: rule__Subgraph__NameAssignment_0_1 : ( RULE_DOT_ID ) ;
    public final void rule__Subgraph__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2401:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2402:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2402:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2403:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameDOT_IDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Subgraph__NameAssignment_0_14860); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameDOT_IDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__NameAssignment_0_1


    // $ANTLR start rule__Subgraph__StmtsAssignment_2
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2412:1: rule__Subgraph__StmtsAssignment_2 : ( rulestmt ) ;
    public final void rule__Subgraph__StmtsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2416:1: ( ( rulestmt ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2417:1: ( rulestmt )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2417:1: ( rulestmt )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2418:1: rulestmt
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulestmt_in_rule__Subgraph__StmtsAssignment_24891);
            rulestmt();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Subgraph__StmtsAssignment_2


    // $ANTLR start rule__EdgeRHS_node__OpAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2427:1: rule__EdgeRHS_node__OpAssignment_0 : ( ruleedgeop ) ;
    public final void rule__EdgeRHS_node__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2431:1: ( ( ruleedgeop ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2432:1: ( ruleedgeop )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2432:1: ( ruleedgeop )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2433:1: ruleedgeop
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeAccess().getOpEdgeopEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleedgeop_in_rule__EdgeRHS_node__OpAssignment_04922);
            ruleedgeop();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeAccess().getOpEdgeopEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__OpAssignment_0


    // $ANTLR start rule__EdgeRHS_node__NodeAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2442:1: rule__EdgeRHS_node__NodeAssignment_1 : ( rulenode_id ) ;
    public final void rule__EdgeRHS_node__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2446:1: ( ( rulenode_id ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2447:1: ( rulenode_id )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2447:1: ( rulenode_id )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2448:1: rulenode_id
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_nodeAccess().getNodeNode_idParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulenode_id_in_rule__EdgeRHS_node__NodeAssignment_14953);
            rulenode_id();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_nodeAccess().getNodeNode_idParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_node__NodeAssignment_1


    // $ANTLR start rule__EdgeRHS_subgraph__OpAssignment_0
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2457:1: rule__EdgeRHS_subgraph__OpAssignment_0 : ( ruleedgeop ) ;
    public final void rule__EdgeRHS_subgraph__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2461:1: ( ( ruleedgeop ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2462:1: ( ruleedgeop )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2462:1: ( ruleedgeop )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2463:1: ruleedgeop
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphAccess().getOpEdgeopEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleedgeop_in_rule__EdgeRHS_subgraph__OpAssignment_04984);
            ruleedgeop();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphAccess().getOpEdgeopEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__OpAssignment_0


    // $ANTLR start rule__EdgeRHS_subgraph__SubgraphAssignment_1
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2472:1: rule__EdgeRHS_subgraph__SubgraphAssignment_1 : ( rulesubgraph ) ;
    public final void rule__EdgeRHS_subgraph__SubgraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2476:1: ( ( rulesubgraph ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2477:1: ( rulesubgraph )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2477:1: ( rulesubgraph )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2478:1: rulesubgraph
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEdgeRHS_subgraphAccess().getSubgraphSubgraphParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulesubgraph_in_rule__EdgeRHS_subgraph__SubgraphAssignment_15015);
            rulesubgraph();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEdgeRHS_subgraphAccess().getSubgraphSubgraphParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EdgeRHS_subgraph__SubgraphAssignment_1


    // $ANTLR start rule__Node_id__NameAssignment
    // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2487:1: rule__Node_id__NameAssignment : ( RULE_DOT_ID ) ;
    public final void rule__Node_id__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2491:1: ( ( RULE_DOT_ID ) )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2492:1: ( RULE_DOT_ID )
            {
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2492:1: ( RULE_DOT_ID )
            // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:2493:1: RULE_DOT_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNode_idAccess().getNameDOT_IDTerminalRuleCall_0()); 
            }
            match(input,RULE_DOT_ID,FOLLOW_RULE_DOT_ID_in_rule__Node_id__NameAssignment5046); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNode_idAccess().getNameDOT_IDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node_id__NameAssignment

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:544:1: ( ( ruleedge_stmt_node ) )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:544:1: ( ruleedge_stmt_node )
        {
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:544:1: ( ruleedge_stmt_node )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:545:1: ruleedge_stmt_node
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStmtAccess().getEdge_stmt_nodeParserRuleCall_0_0()); 
        }
        pushFollow(FOLLOW_ruleedge_stmt_node_in_synpred11084);
        ruleedge_stmt_node();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:550:6: ( ( ruleedge_stmt_subgraph ) )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:550:6: ( ruleedge_stmt_subgraph )
        {
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:550:6: ( ruleedge_stmt_subgraph )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:551:1: ruleedge_stmt_subgraph
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStmtAccess().getEdge_stmt_subgraphParserRuleCall_0_1()); 
        }
        pushFollow(FOLLOW_ruleedge_stmt_subgraph_in_synpred21101);
        ruleedge_stmt_subgraph();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:556:6: ( ( rulenode_stmt ) )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:556:6: ( rulenode_stmt )
        {
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:556:6: ( rulenode_stmt )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:557:1: rulenode_stmt
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStmtAccess().getNode_stmtParserRuleCall_0_2()); 
        }
        pushFollow(FOLLOW_rulenode_stmt_in_synpred31118);
        rulenode_stmt();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:562:6: ( ( ruleattribute ) )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:562:6: ( ruleattribute )
        {
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:562:6: ( ruleattribute )
        // ../org.openarchitectureware.vis.graphviz.ui/src-gen/org/openarchitectureware/vis/graphviz/ui/contentassist/antlr/internal/InternalDot.g:563:1: ruleattribute
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
        }
        pushFollow(FOLLOW_ruleattribute_in_synpred41135);
        ruleattribute();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred4

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_rulegraphvizmodel_in_entryRulegraphvizmodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegraphvizmodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__0_in_rulegraphvizmodel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegraph_in_entryRulegraph127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegraph134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__0_in_rulegraph160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestmt_in_entryRulestmt187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestmt194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__0_in_rulestmt220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_entryRuleedge_stmt_node247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedge_stmt_node254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__0_in_ruleedge_stmt_node280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_entryRuleedge_stmt_subgraph307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedge_stmt_subgraph314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__0_in_ruleedge_stmt_subgraph340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_entryRulenode_stmt367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenode_stmt374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node_stmt__Group__0_in_rulenode_stmt400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattribute_in_entryRuleattribute427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattribute434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleattribute460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_stmt_in_entryRuleattr_stmt487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattr_stmt494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__Group__0_in_ruleattr_stmt520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_list_in_entryRuleattr_list547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattr_list554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__0_in_ruleattr_list580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulea_list_in_entryRulea_list607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulea_list614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group__0_in_rulea_list640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_entryRulesubgraph667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubgraph674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__0_in_rulesubgraph700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_entryRuleedgeRHS727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS__Alternatives_in_ruleedgeRHS760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_node_in_entryRuleedgeRHS_node787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS_node794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__Group__0_in_ruleedgeRHS_node820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_subgraph_in_entryRuleedgeRHS_subgraph847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleedgeRHS_subgraph854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__Group__0_in_ruleedgeRHS_subgraph880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_id_in_entryRulenode_id907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenode_id914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node_id__NameAssignment_in_rulenode_id940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edgeop__Alternatives_in_ruleedgeop977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphtype__Alternatives_in_rulegraphtype1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributetype__Alternatives_in_ruleattributetype1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_rule__Stmt__Alternatives_01084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_rule__Stmt__Alternatives_01101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_rule__Stmt__Alternatives_01118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattribute_in_rule__Stmt__Alternatives_01135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_stmt_in_rule__Stmt__Alternatives_01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_rule__Stmt__Alternatives_01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_node_in_rule__EdgeRHS__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_subgraph_in_rule__EdgeRHS__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Edgeop__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Edgeop__Alternatives1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Graphtype__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Graphtype__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attributetype__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attributetype__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attributetype__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__0__Impl_in_rule__Graphvizmodel__Group__01440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__1_in_rule__Graphvizmodel__Group__01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Graphvizmodel__Group__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__1__Impl_in_rule__Graphvizmodel__Group__11502 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__2_in_rule__Graphvizmodel__Group__11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Graphvizmodel__Group__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__2__Impl_in_rule__Graphvizmodel__Group__21564 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__3_in_rule__Graphvizmodel__Group__21567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__GraphsAssignment_2_in_rule__Graphvizmodel__Group__2__Impl1594 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Graphvizmodel__Group__3__Impl_in_rule__Graphvizmodel__Group__31625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Graphvizmodel__Group__3__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__0__Impl_in_rule__Graph__Group__01692 = new BitSet(new long[]{0x000000000800C000L});
    public static final BitSet FOLLOW_rule__Graph__Group__1_in_rule__Graph__Group__01695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Graph__Group__0__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__1__Impl_in_rule__Graph__Group__11754 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Graph__Group__2_in_rule__Graph__Group__11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__StrictAssignment_1_in_rule__Graph__Group__1__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__2__Impl_in_rule__Graph__Group__21815 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Graph__Group__3_in_rule__Graph__Group__21818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__TypeAssignment_2_in_rule__Graph__Group__2__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__3__Impl_in_rule__Graph__Group__31875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Graph__Group__4_in_rule__Graph__Group__31878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__NameAssignment_3_in_rule__Graph__Group__3__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__4__Impl_in_rule__Graph__Group__41936 = new BitSet(new long[]{0x00000000041B4010L});
    public static final BitSet FOLLOW_rule__Graph__Group__5_in_rule__Graph__Group__41939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Graph__Group__4__Impl1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Group__5__Impl_in_rule__Graph__Group__51998 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Graph__Group__6_in_rule__Graph__Group__52001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__StmtsAssignment_5_in_rule__Graph__Group__5__Impl2028 = new BitSet(new long[]{0x00000000040B4012L});
    public static final BitSet FOLLOW_rule__Graph__Group__6__Impl_in_rule__Graph__Group__62059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Graph__Group__6__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__0__Impl_in_rule__Stmt__Group__02132 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__1_in_rule__Stmt__Group__02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Alternatives_0_in_rule__Stmt__Group__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__1__Impl_in_rule__Stmt__Group__12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Stmt__Group__1__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__0__Impl_in_rule__Edge_stmt_node__Group__02258 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__1_in_rule__Edge_stmt_node__Group__02261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Node_idAssignment_0_in_rule__Edge_stmt_node__Group__0__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__1__Impl_in_rule__Edge_stmt_node__Group__12318 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__2_in_rule__Edge_stmt_node__Group__12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__EdgeRHSAssignment_1_in_rule__Edge_stmt_node__Group__1__Impl2350 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__EdgeRHSAssignment_1_in_rule__Edge_stmt_node__Group__1__Impl2362 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__Group__2__Impl_in_rule__Edge_stmt_node__Group__22395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_node__AttributesAssignment_2_in_rule__Edge_stmt_node__Group__2__Impl2422 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__0__Impl_in_rule__Edge_stmt_subgraph__Group__02459 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__1_in_rule__Edge_stmt_subgraph__Group__02462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__SubgraphAssignment_0_in_rule__Edge_stmt_subgraph__Group__0__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__1__Impl_in_rule__Edge_stmt_subgraph__Group__12519 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__2_in_rule__Edge_stmt_subgraph__Group__12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__EdgeRHSAssignment_1_in_rule__Edge_stmt_subgraph__Group__1__Impl2551 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__EdgeRHSAssignment_1_in_rule__Edge_stmt_subgraph__Group__1__Impl2563 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__Group__2__Impl_in_rule__Edge_stmt_subgraph__Group__22596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edge_stmt_subgraph__AttributesAssignment_2_in_rule__Edge_stmt_subgraph__Group__2__Impl2623 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Node_stmt__Group__0__Impl_in_rule__Node_stmt__Group__02660 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Node_stmt__Group__1_in_rule__Node_stmt__Group__02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node_stmt__NameAssignment_0_in_rule__Node_stmt__Group__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node_stmt__Group__1__Impl_in_rule__Node_stmt__Group__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node_stmt__AttributesAssignment_1_in_rule__Node_stmt__Group__1__Impl2747 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02782 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attribute__Group__1__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__Group__0__Impl_in_rule__Attr_stmt__Group__02967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Attr_stmt__Group__1_in_rule__Attr_stmt__Group__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__TypeAssignment_0_in_rule__Attr_stmt__Group__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__Group__1__Impl_in_rule__Attr_stmt__Group__13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__AttributesAssignment_1_in_rule__Attr_stmt__Group__1__Impl3056 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Attr_stmt__AttributesAssignment_1_in_rule__Attr_stmt__Group__1__Impl3068 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__0__Impl_in_rule__Attr_list__Group__03105 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__1_in_rule__Attr_list__Group__03108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attr_list__Group__0__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__1__Impl_in_rule__Attr_list__Group__13167 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__2_in_rule__Attr_list__Group__13170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attr_list__A_listAssignment_1_in_rule__Attr_list__Group__1__Impl3197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attr_list__Group__2__Impl_in_rule__Attr_list__Group__23228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attr_list__Group__2__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group__0__Impl_in_rule__A_list__Group__03293 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_rule__A_list__Group__1_in_rule__A_list__Group__03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__NameAssignment_0_in_rule__A_list__Group__0__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group__1__Impl_in_rule__A_list__Group__13353 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__A_list__Group__2_in_rule__A_list__Group__13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group_1__0_in_rule__A_list__Group__1__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group__2__Impl_in_rule__A_list__Group__23414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__A_list__Group__2__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group_1__0__Impl_in_rule__A_list__Group_1__03482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__A_list__Group_1__1_in_rule__A_list__Group_1__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__A_list__Group_1__0__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__Group_1__1__Impl_in_rule__A_list__Group_1__13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__A_list__ValueAssignment_1_1_in_rule__A_list__Group_1__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__0__Impl_in_rule__Subgraph__Group__03605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__1_in_rule__Subgraph__Group__03608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_0__0_in_rule__Subgraph__Group__0__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__1__Impl_in_rule__Subgraph__Group__13666 = new BitSet(new long[]{0x00000000041B4010L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__2_in_rule__Subgraph__Group__13669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subgraph__Group__1__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__2__Impl_in_rule__Subgraph__Group__23728 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__3_in_rule__Subgraph__Group__23731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__StmtsAssignment_2_in_rule__Subgraph__Group__2__Impl3758 = new BitSet(new long[]{0x00000000040B4012L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__3__Impl_in_rule__Subgraph__Group__33789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Subgraph__Group__3__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_0__0__Impl_in_rule__Subgraph__Group_0__03856 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_0__1_in_rule__Subgraph__Group_0__03859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Subgraph__Group_0__0__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_0__1__Impl_in_rule__Subgraph__Group_0__13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__NameAssignment_0_1_in_rule__Subgraph__Group_0__1__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__Group__0__Impl_in_rule__EdgeRHS_node__Group__03980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__Group__1_in_rule__EdgeRHS_node__Group__03983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__OpAssignment_0_in_rule__EdgeRHS_node__Group__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__Group__1__Impl_in_rule__EdgeRHS_node__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_node__NodeAssignment_1_in_rule__EdgeRHS_node__Group__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__Group__0__Impl_in_rule__EdgeRHS_subgraph__Group__04101 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__Group__1_in_rule__EdgeRHS_subgraph__Group__04104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__OpAssignment_0_in_rule__EdgeRHS_subgraph__Group__0__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__Group__1__Impl_in_rule__EdgeRHS_subgraph__Group__14161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRHS_subgraph__SubgraphAssignment_1_in_rule__EdgeRHS_subgraph__Group__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegraph_in_rule__Graphvizmodel__GraphsAssignment_24227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Graph__StrictAssignment_14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegraphtype_in_rule__Graph__TypeAssignment_24302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Graph__NameAssignment_34333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestmt_in_rule__Graph__StmtsAssignment_54364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_id_in_rule__Edge_stmt_node__Node_idAssignment_04395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_rule__Edge_stmt_node__EdgeRHSAssignment_14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_list_in_rule__Edge_stmt_node__AttributesAssignment_24457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_rule__Edge_stmt_subgraph__SubgraphAssignment_04488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeRHS_in_rule__Edge_stmt_subgraph__EdgeRHSAssignment_14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_list_in_rule__Edge_stmt_subgraph__AttributesAssignment_24550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Node_stmt__NameAssignment_04581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_list_in_rule__Node_stmt__AttributesAssignment_14612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Attribute__NameAssignment_04643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Attribute__ValueAssignment_24674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributetype_in_rule__Attr_stmt__TypeAssignment_04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattr_list_in_rule__Attr_stmt__AttributesAssignment_14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulea_list_in_rule__Attr_list__A_listAssignment_14767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__A_list__NameAssignment_04798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__A_list__ValueAssignment_1_14829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Subgraph__NameAssignment_0_14860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestmt_in_rule__Subgraph__StmtsAssignment_24891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeop_in_rule__EdgeRHS_node__OpAssignment_04922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_id_in_rule__EdgeRHS_node__NodeAssignment_14953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedgeop_in_rule__EdgeRHS_subgraph__OpAssignment_04984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubgraph_in_rule__EdgeRHS_subgraph__SubgraphAssignment_15015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_ID_in_rule__Node_id__NameAssignment5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_node_in_synpred11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleedge_stmt_subgraph_in_synpred21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenode_stmt_in_synpred31118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattribute_in_synpred41135 = new BitSet(new long[]{0x0000000000000002L});

}