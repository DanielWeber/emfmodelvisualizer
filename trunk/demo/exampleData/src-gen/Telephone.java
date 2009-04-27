
import java.util.List;
import java.util.ArrayList;
import dataimport.platform.DataBase;

public class Telephone extends dataimport.platform.DataBase {
	

	
		private String countryCode;
	
		private String cityCode;
	
		private String localNumber;
	

	

	
		public void setCountryCode( String value ) {
			
	
		int strlen = value.length();


			countryCode = value;
		}

		public String getCountryCode() {
			return countryCode;
		}
	
		public void setCityCode( String value ) {
			
	
		int strlen = value.length();


			cityCode = value;
		}

		public String getCityCode() {
			return cityCode;
		}
	
		public void setLocalNumber( String value ) {
			
	
		int strlen = value.length();


			localNumber = value;
		}

		public String getLocalNumber() {
			return localNumber;
		}
	
	
	


	
	public void printTree( String indent ) {
		System.out.println( indent+"Telephone {" );
		
			System.out.println( indent+"  countryCode="+getCountryCode() );
		
			System.out.println( indent+"  cityCode="+getCityCode() );
		
			System.out.println( indent+"  localNumber="+getLocalNumber() );
		
		
		System.out.println( indent+"}" );
		
	}

}
