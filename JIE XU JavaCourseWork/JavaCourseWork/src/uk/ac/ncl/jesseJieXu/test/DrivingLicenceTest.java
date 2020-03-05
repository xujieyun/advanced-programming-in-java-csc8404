package uk.ac.ncl.jesseJieXu.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import uk.ac.ncl.jesseJieXu.entity.Customer;
import uk.ac.ncl.jesseJieXu.entity.DrivingLicence;
import uk.ac.ncl.jesseJieXu.entity.Name;

public class DrivingLicenceTest {
//-------------------TEST check method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Calendar date = new GregorianCalendar(2029, 10 , 25);
			DrivingLicence d = DrivingLicence.getInstance("XJ-1994-03", date.getTime(), true);
			System.out.println(d);

	}
//print:licenceNumber: XJ-1994-03 issueDate: 2029-11-25 isFullLicence: true
	
	
	
//-------------------TEST insert method
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar date = new GregorianCalendar(1994, 3, 18);
		final Name name = new Name("JIE", "XU");
		Customer person = new Customer(name, date.getTime());

		DrivingLicence d = DrivingLicence.getInstance(person, date.getTime(), false);
		System.out.println(d);
	}*/
//print:licenceNumber: JX-1994-29 issueDate: 1994-4-18 isFullLicence: false	
	
	
	
//-------------------TEST this Licence Number existing.
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = new GregorianCalendar(1994, 3, 18);
		DrivingLicence dl1 = DrivingLicence.getInstance("XJ-1994-21", date.getTime(), true);
		DrivingLicence dl2 = DrivingLicence.getInstance("XJ-1994-21", date.getTime(), true);
	}*/
//print:this Licence Number existing.
	
	
	
//-------------------TEST DrivingLicence illigal
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrivingLicence d = DrivingLicence.getInstance("", null, true);
	}*/
//print:null or no licenceNumber not permitted
	
}
	
