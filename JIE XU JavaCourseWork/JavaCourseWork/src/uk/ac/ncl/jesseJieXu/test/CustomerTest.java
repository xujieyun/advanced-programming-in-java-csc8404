package uk.ac.ncl.jesseJieXu.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import uk.ac.ncl.jesseJieXu.entity.Customer;
import uk.ac.ncl.jesseJieXu.entity.Name;
import uk.ac.ncl.jesseJieXu.entity.Person;



public class CustomerTest {
//-------------------Test creat Customer
	public static void main(String[] args) {
		
		final Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, -26);
        final Name name = new Name("JIE", "XU");
        final Customer c = new Customer(name,date.getTime());
        System.out.println(c);
	}
	//print:Customer: JIE XU DateOfBirth: 1993-10-25
	
	
//------------------- Test creat Customer illegal
		/*public static void main(String[] args) {
			
			final Calendar date = Calendar.getInstance();
			date.add(Calendar.YEAR, -26);
	        final Name name = new Name("", "XU");
	        final Customer c = new Customer(name,date.getTime());
	        System.out.println(c);
		}*/
	//print:Empty first name
		
//-------------------Test creat Customer illegal
	/*public static void main(String[] args) {	
		Calendar date = new GregorianCalendar(1994, 3, 18);
		Customer c = new Customer(null, date.getTime());
		System.out.println(c);
	}*/
	//null name not permitted

}
