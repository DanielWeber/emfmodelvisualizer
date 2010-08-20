import java.io.IOException;

import junit.framework.TestCase;


public class ExTest extends TestCase {

	public void testExampleFile() throws IOException {
		ExpImporter p = new ExpImporter();
		p.importFile( "src/data.exp" );
	}
	
}
