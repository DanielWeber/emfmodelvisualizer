
import java.util.List;
import java.util.ArrayList;
import dataimport.platform.DataBase;

public class Patient extends dataimport.platform.DataBase {
	

	
		private String name;
	
		private int age;
	
		private String firstName;
	
		private String birthDate;
	
		private String insuranceName;
	
		private String insuranceNumber;
	

	
		
			private Adress adr;
		
	
		
			private List<Telephone> telList = new ArrayList<Telephone>();
		
	
		
			private List<Stay> staysList = new ArrayList<Stay>();
		
	

	
		public void setName( String value ) {
			
	
		int strlen = value.length();


			name = value;
		}

		public String getName() {
			return name;
		}
	
		public void setAge( int value ) {
			
	
		if ( value < 0 || value > 120 ) {
			throw new RuntimeException();
		}		
	

			age = value;
		}

		public int getAge() {
			return age;
		}
	
		public void setFirstName( String value ) {
			
	
		int strlen = value.length();


			firstName = value;
		}

		public String getFirstName() {
			return firstName;
		}
	
		public void setBirthDate( String value ) {
			
	
		int strlen = value.length();


			birthDate = value;
		}

		public String getBirthDate() {
			return birthDate;
		}
	
		public void setInsuranceName( String value ) {
			
	
		int strlen = value.length();


			insuranceName = value;
		}

		public String getInsuranceName() {
			return insuranceName;
		}
	
		public void setInsuranceNumber( String value ) {
			
	
		int strlen = value.length();


			insuranceNumber = value;
		}

		public String getInsuranceNumber() {
			return insuranceNumber;
		}
	
	
	
		
			public void setAdr( Adress value ) {
				adr = value;
			}
	
			public Adress getAdr() {
				return adr;
			}
		
	
		
			public void addTel( Telephone value ) {
				telList.add( value );
			}
	
			public List<Telephone> getTel() {
				return telList;
			}
		
	
		
			public void addStays( Stay value ) {
				staysList.add( value );
			}
	
			public List<Stay> getStays() {
				return staysList;
			}
		
	


	
	public void printTree( String indent ) {
		System.out.println( indent+"Patient {" );
		
			System.out.println( indent+"  name="+getName() );
		
			System.out.println( indent+"  age="+getAge() );
		
			System.out.println( indent+"  firstName="+getFirstName() );
		
			System.out.println( indent+"  birthDate="+getBirthDate() );
		
			System.out.println( indent+"  insuranceName="+getInsuranceName() );
		
			System.out.println( indent+"  insuranceNumber="+getInsuranceNumber() );
		
		
			System.out.println( indent+"  adr=" );
			
				getAdr().printTree(indent+"    " );
			
		
			System.out.println( indent+"  tel=" );
			
				for (DataBase d : getTel()) d.printTree(indent+"    ");
			
		
			System.out.println( indent+"  stays=" );
			
				for (DataBase d : getStays()) d.printTree(indent+"    ");
			
		
		System.out.println( indent+"}" );
		
	}

}
