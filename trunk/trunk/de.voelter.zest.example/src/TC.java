import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.AbstractWorkflowComponent;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;


public class TC extends AbstractWorkflowComponent {
	
	@Override
	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		EObject object = (EObject)ctx.get("graphmodel");
		System.err.println( object.eClass().getName() );
		
	}

}
