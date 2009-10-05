import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Model;
import org.junit.*;

public class Windows2000ArchitectureTest {

	@Test 
	public void testWorkflow () {
		EObject model = null;
		String workflowFileName = "src/Windows2000Architecture.mwe";
		Map<String, String> properties = new HashMap<String, String>();
		Map<?, ?> slotContents = new HashMap<String, Object>();
		org.eclipse.emf.mwe.core.WorkflowRunner runner = new org.eclipse.emf.mwe.core.WorkflowRunner();
		final boolean configOK = runner.prepare(workflowFileName, new NullProgressMonitor(), properties);
		if (configOK) {
			final Issues issues = new IssuesImpl();
			runner.executeWorkflow(slotContents, issues);
			model = (EObject) runner.getContext().get("blockdiagram");
			assertEquals(0, issues.getErrors().length);
		}
		assertNotNull(model);
		assertTrue(model instanceof Model);
	}
}
