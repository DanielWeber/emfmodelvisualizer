
import java.util.List;
import java.util.ArrayList;
import dataimport.platform.DataBase;

public class Station extends dataimport.platform.DataBase {
	

	
		private String date;
	
		private String stationName;
	

	

	
		public void setDate( String value ) {
			
	
		int strlen = value.length();


			date = value;
		}

		public String getDate() {
			return date;
		}
	
		public void setStationName( String value ) {
			
	
		int strlen = value.length();


			stationName = value;
		}

		public String getStationName() {
			return stationName;
		}
	
	
	


	
	public void printTree( String indent ) {
		System.out.println( indent+"Station {" );
		
			System.out.println( indent+"  date="+getDate() );
		
			System.out.println( indent+"  stationName="+getStationName() );
		
		
		System.out.println( indent+"}" );
		
	}

}
