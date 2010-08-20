
import java.util.List;
import java.util.ArrayList;
import dataimport.platform.DataBase;

public class Adress extends dataimport.platform.DataBase {
	

	
		private String street;
	
		private String zip;
	
		private String city;
	

	

	
		public void setStreet( String value ) {
			
	
		int strlen = value.length();


			street = value;
		}

		public String getStreet() {
			return street;
		}
	
		public void setZip( String value ) {
			
	
		int strlen = value.length();


			zip = value;
		}

		public String getZip() {
			return zip;
		}
	
		public void setCity( String value ) {
			
	
		int strlen = value.length();


			city = value;
		}

		public String getCity() {
			return city;
		}
	
	
	


	
	public void printTree( String indent ) {
		System.out.println( indent+"Adress {" );
		
			System.out.println( indent+"  street="+getStreet() );
		
			System.out.println( indent+"  zip="+getZip() );
		
			System.out.println( indent+"  city="+getCity() );
		
		
		System.out.println( indent+"}" );
		
	}

}
