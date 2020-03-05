package uk.ac.ncl.jesseJieXu.test;

import org.junit.Before;

import uk.ac.ncl.jesseJieXu.entity.CarRegistrationNumber;

public class CarRegistrationNumberTest {
	@Before
	public void setUp() throws Exception {
	}
	
	//-------------------TEST check method
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			CarRegistrationNumber cr = CarRegistrationNumber.getInstance("XJ03 QWE");
				System.out.println(cr);

		}
	//print:Carnumber: XJ03 QWE
	
	
	//-------------------TEST wrong format
		/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			CarRegistrationNumber cr = CarRegistrationNumber.getInstance("XJ033 QWE");
			System.out.println(cr);
		}*/
	//print:Carnumber: carRegistrationNumber : argument format not validated
	
	
	//-------------------TEST CarRegistrationNumber existing.
		/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ03 QWE");
			CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ03 QWE");
		}*/
	//print:Carnumber: have this name, please scan again.
	
	
	//-------------------TEST null
		/*public static void main(String[] args) {
		// TODO Auto-generated method stub
			CarRegistrationNumber cr = CarRegistrationNumber.getInstance(null);
			}*/
	//print:carRegistrationNumber is null
	

}
