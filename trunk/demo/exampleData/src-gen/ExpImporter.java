
import java.util.List;
import dataimport.platform.ImportError;


public class ExpImporter extends dataimport.platform.DataImporterBase {

	protected void handleRoot( String current, List<String> rest) {
		String currentHeader = extractHeader( current ).trim();
		
			if ( currentHeader.equals("P001") ) handle_P001( current, rest );
		 
	}
 
	
	private void handle_P001( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("P001") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001");
		}
		
		data_P001( current );	
		
							
			while ( !rest.isEmpty() ) {
				String nextLine = rest.get(0);		
				String nextHeader = extractHeader( nextLine ).trim();
				
					if ( ( nextHeader.equals("A001") )||( nextHeader.equals("V001") )||( nextHeader.equals("T001") )||( nextHeader.equals("S001") ) ) {
						// consume this line, because we know we can process it
						rest.remove(0);
						// we need a new environment for this call
						cloneAndPushEnv();
						
							if ( nextHeader.equals("A001") ) handle_P001_A001( nextLine, rest );
						
							if ( nextHeader.equals("V001") ) handle_P001_V001( nextLine, rest );
						
							if ( nextHeader.equals("T001") ) handle_P001_T001( nextLine, rest );
						
							if ( nextHeader.equals("S001") ) handle_P001_S001( nextLine, rest );
						
						// go back to old environment
						popEnv();
					} else {
							
		return;
	

					}
				
			} 
		
	}

	
	private void data_P001( String current ) {
		
			// create new instance p:Patient
			env().add( "p",  new Patient() );
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for p:Patient
				Patient p = 
					((Patient)env().lookup("p"));
					p.setName( contents.get(0) );
					p.setFirstName( contents.get(1) );
					p.setBirthDate( contents.get(2) );
				
			
		
		
		
	}


	
	private void handle_P001_A001( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("A001") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_A001");
		}
		
		data_P001_A001( current );	
		
		
			// no further parsing alternatives; returning
			return;
		
	}

	
	private void data_P001_A001( String current ) {
		
			// create new instance a:Adress
			env().add( "a",  new Adress() );
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for a:Adress
				Adress a = 
					((Adress)env().lookup("a"));
					a.setStreet( contents.get(0) );
					a.setZip( contents.get(1) );
					a.setCity( contents.get(2) );
				
			
		
		
		
			// building graph: p.adr <- a
			((Patient)env().lookup("p")).
				setAdr( (Adress)env().lookup("a") );
		
	}


	

	private void handle_P001_V001( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("V001") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_V001");
		}
		
		data_P001_V001( current );	
		
		
			// no further parsing alternatives; returning
			return;
		
	}

	
	private void data_P001_V001( String current ) {
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for p:Patient
				Patient p = 
					((Patient)env().lookup("p"));
					p.setInsuranceName( contents.get(0) );
					p.setInsuranceNumber( contents.get(1) );
				
			
		
		
		
	}


	

	private void handle_P001_T001( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("T001") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_T001");
		}
		
		data_P001_T001( current );	
		
		
			// no further parsing alternatives; returning
			return;
		
	}

	
	private void data_P001_T001( String current ) {
		
			// create new instance tel:Telephone
			env().add( "tel",  new Telephone() );
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for tel:Telephone
				Telephone tel = 
					((Telephone)env().lookup("tel"));
					tel.setCountryCode( contents.get(0) );
					tel.setCityCode( contents.get(1) );
					tel.setLocalNumber( contents.get(2) );
				
			
		
		
		
			// building graph: p.tel <- tel
			((Patient)env().lookup("p")).
				addTel( (Telephone)env().lookup("tel") );
		
	}


	

	private void handle_P001_S001( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("S001") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_S001");
		}
		
		data_P001_S001( current );	
		
							
			while ( !rest.isEmpty() ) {
				String nextLine = rest.get(0);		
				String nextHeader = extractHeader( nextLine ).trim();
				
					if ( ( nextHeader.equals("S003") )||( nextHeader.equals("S002") ) ) {
						// consume this line, because we know we can process it
						rest.remove(0);
						// we need a new environment for this call
						cloneAndPushEnv();
						
							if ( nextHeader.equals("S003") ) handle_P001_S001_S003( nextLine, rest );
						
							if ( nextHeader.equals("S002") ) handle_P001_S001_S002( nextLine, rest );
						
						// go back to old environment
						popEnv();
					} else {
							
		return;
	

					}
				
			} 
		
	}

	
	private void data_P001_S001( String current ) {
		
			// create new instance stay:Stay
			env().add( "stay",  new Stay() );
		
			// create new instance station:Station
			env().add( "station",  new Station() );
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for stay:Stay
				Stay stay = 
					((Stay)env().lookup("stay"));
					stay.setBeginDate( contents.get(0) );
				
			
				// set attributes for station:Station
				Station station = 
					((Station)env().lookup("station"));
					station.setStationName( contents.get(1) );
					station.setDate( contents.get(0) );
				
			
		
		
		
			// building graph: stay.stations <- station
			((Stay)env().lookup("stay")).
				addStations( (Station)env().lookup("station") );
		
			// building graph: p.stays <- stay
			((Patient)env().lookup("p")).
				addStays( (Stay)env().lookup("stay") );
		
	}


	
	private void handle_P001_S001_S003( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("S003") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_S001_S003");
		}
		
		data_P001_S001_S003( current );	
		
		
			// no further parsing alternatives; returning
			return;
		
	}

	
	private void data_P001_S001_S003( String current ) {
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for stay:Stay
				Stay stay = 
					((Stay)env().lookup("stay"));
					stay.setEndDate( contents.get(0) );
				
			
		
		
		
	}


	

	private void handle_P001_S001_S002( String current, List<String> rest) {
		// cross check that we can actually handle this line
		String currentHeader = extractHeader( current ).trim();
		if ( !currentHeader.equals("S002") ) {
			throw new ImportError("don't know how to handle "+currentHeader+" in P001_S001_S002");
		}
		
		data_P001_S001_S002( current );	
		
		
			// no further parsing alternatives; returning
			return;
		
	}

	
	private void data_P001_S001_S002( String current ) {
		
			// create new instance st:Station
			env().add( "st",  new Station() );
		
		
		
			List<String> contents = extractFields(current);
			
				// set attributes for st:Station
				Station st = 
					((Station)env().lookup("st"));
					st.setDate( contents.get(0) );
					st.setStationName( contents.get(1) );
				
			
		
		
		
			// building graph: stay.stations <- st
			((Stay)env().lookup("stay")).
				addStations( (Station)env().lookup("st") );
		
	}


	



}
