package org.openarchitectureware.vis.graphviz.xtext;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowFacade;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.Naming;

import com.google.inject.Inject;

/**
 * A Xtext generator fragment to transform the grammar into a
 * graphviz dot file and generate pictures by executing graphviz.
 * 
 * @author Christoph Kulla
 */
public class VisualizeGrammarFragment extends DefaultGeneratorFragment {

	@Inject
	Naming naming;
	
	public void generate(Grammar grammar, XpandExecutionContext ctx) {

		super.generate (grammar, ctx);
				
		String targetDir = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath()+"/"+naming.asPath(GrammarUtil.getNamespace(grammar));
		
		String wfFile = "org/openarchitectureware/vis/graphviz/xtext/visualizeGrammar.mwe";
		Map properties = new HashMap();
		properties.put ("targetDir", targetDir);
		properties.put("showUsedGrammars", showUsedGrammars);
		properties.put ("createBatchFile", "false");
		properties.put ("executeGraphviz", "true");
		properties.put("inputSlot", "model");
		if (outputFormat!=null)
			properties.put ("outputFormat", outputFormat);
		Map slotContents = new HashMap();
		slotContents.put("model", grammar);
		WorkflowFacade wf = new WorkflowFacade (wfFile, properties);
		wf.run(slotContents);
	}
	
	private String outputFormat;

	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	
	public void setShowUsedGrammars(String showUsedGrammars) {
		this.showUsedGrammars = showUsedGrammars;
	}

	public String isShowUsedGrammars() {
		return showUsedGrammars;
	}

	private String showUsedGrammars = "false";
	
	
}