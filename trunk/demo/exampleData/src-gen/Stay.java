
import java.util.List;
import java.util.ArrayList;
import dataimport.platform.DataBase;

public class Stay extends dataimport.platform.DataBase {
	

	
		private String beginDate;
	
		private String endDate;
	

	
		
			private List<Station> stationsList = new ArrayList<Station>();
		
	

	
		public void setBeginDate( String value ) {
			
	
		int strlen = value.length();


			beginDate = value;
		}

		public String getBeginDate() {
			return beginDate;
		}
	
		public void setEndDate( String value ) {
			
	
		int strlen = value.length();


			endDate = value;
		}

		public String getEndDate() {
			return endDate;
		}
	
	
	
		
			public void addStations( Station value ) {
				stationsList.add( value );
			}
	
			public List<Station> getStations() {
				return stationsList;
			}
		
	


	
	public void printTree( String indent ) {
		System.out.println( indent+"Stay {" );
		
			System.out.println( indent+"  beginDate="+getBeginDate() );
		
			System.out.println( indent+"  endDate="+getEndDate() );
		
		
			System.out.println( indent+"  stations=" );
			
				for (DataBase d : getStations()) d.printTree(indent+"    ");
			
		
		System.out.println( indent+"}" );
		
	}

}
