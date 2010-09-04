package org.openarchitectureware.vis.graphviz.xtext;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.Naming;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * A Xtext generator fragment to transform the grammar into a
 * graphviz dot file and generate pictures by executing graphviz.
 * 
 * @author Christoph Kulla
 */
public class VisualizeGrammarFragment extends DefaultGeneratorFragment {

	Naming naming = new Naming();	

	private String outputFormat;
	
	private boolean sortRulesByName = false;
	
	private boolean showUsedGrammars = false;
	
	public void generate(Grammar grammar, XpandExecutionContext ctx) {

		super.generate (grammar, ctx);
				
		String targetDir = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath()+"/"+naming.asPath(GrammarUtil.getNamespace(grammar));
		
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("targetDir", targetDir);
		parameters.put ("showUsedGrammars", String.valueOf(showUsedGrammars));
		parameters.put ("sortRulesByName", String.valueOf (sortRulesByName));
		parameters.put("inputSlot", "model");
		if (outputFormat!=null)
			parameters.put ("outputFormat", outputFormat);
		mweRunner.getWorkflowContext().put("model", grammar);
		mweRunner.run("org.openarchitectureware.vis.graphviz.xtext.VisualizeGrammar", parameters);
	}


	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	
	public void setShowUsedGrammars(boolean showUsedGrammars) {
		this.showUsedGrammars = showUsedGrammars;
	}

	public boolean isShowUsedGrammars() {
		return showUsedGrammars;
	}

	public void setSortRulesByName(boolean sortRulesByName) {
		this.sortRulesByName = sortRulesByName;
	}

	public boolean isSortRulesByName() {
		return sortRulesByName;
	}

}