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

/**
 * A Xtext generator fragment to show the grammar structure by 
 * visualizing the grammar model (on eobject level). It creates a
 * graphviz dot file and generates pictures by executing graphviz.
 * 
 * @author Christoph Kulla
 */
public class VisualizeGrammarAsEObjectFragment extends DefaultGeneratorFragment {
	
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		super.generate (grammar, ctx);
				
		String targetDir = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath()+"/"+Naming.asPath(GrammarUtil.getNamespace(grammar));
		
		String wfFile = "org/openarchitectureware/vis/graphviz/xtext/visualizeGrammarAsEObject.mwe";
		Map properties = new HashMap();
		properties.put ("targetDir", targetDir);
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
	
}