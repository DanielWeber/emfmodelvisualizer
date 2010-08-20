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
 * A Xtext generator fragment to transform the generated ecore model into a
 * graphviz dot file and generate pictures by executing graphviz.
 * 
 * @author Christoph Kulla
 */
public class VisualizeMetamodelFragment extends DefaultGeneratorFragment {
	
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		super.generate (grammar, ctx);
		
		String modelFileName = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath() + "/" + 
		Naming.asPath(GrammarUtil.getNamespace(grammar)) + "/" + GrammarUtil.getName(grammar)+".ecore";		
		
		String targetDir = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath()+"/"+Naming.asPath(GrammarUtil.getNamespace(grammar));
		
		String wfFile = "org/openarchitectureware/vis/graphviz/xtext/callVisualizeMetamodel.mwe";
		Map properties = new HashMap();
		properties.put ("modelFile", modelFileName);
		properties.put ("targetDir", targetDir);
		properties.put ("createBatchFile", "false");
		properties.put ("executeGraphviz", "true");
		if (outputFormat!=null)
			properties.put ("outputFormat", outputFormat);
		Map slotContents = new HashMap();
		
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
