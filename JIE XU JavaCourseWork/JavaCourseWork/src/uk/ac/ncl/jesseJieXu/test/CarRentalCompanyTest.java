package uk.ac.ncl.jesseJieXu.test;



import java.util.Calendar;
import java.util.GregorianCalendar;

import uk.ac.ncl.jesseJieXu.entity.Car;
import uk.ac.ncl.jesseJieXu.entity.CarRentalCompany;
import uk.ac.ncl.jesseJieXu.entity.CarType;
import uk.ac.ncl.jesseJieXu.entity.Customer;
import uk.ac.ncl.jesseJieXu.entity.DrivingLicence;
import uk.ac.ncl.jesseJieXu.entity.Name;


public class CarRentalCompanyTest {
	//-------------------TEST initCar 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();
	
		System.out.println(carRentalCompany.availableCars(CarType.SMALL_CAR));
		System.out.println(carRentalCompany.availableCars(CarType.LARGE_CAR));
	}
	//print: dt59aim ix61fim...
	//10
	//10
	
	
	//-------------------TEST availableCars null
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();
		carRentalCompany.availableCars(null);
	}*/
	//print: dt59aim ix61fim...
	//Exception in thread "main" java.lang.IllegalArgumentException: Type of car could not be null

	

	//-------------------TEST getCar
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();
	}*/
	//print: pb76jax pc59pnu...
	//		 LargeCar(Carnumber: ii31 ygn) [Fuel=60/60, renter=Customer: JIE XU DateOfBirth: 1993-10-25]
	
	
	
	//-------------------TEST issueCar
	/*public static void main(String[] args) {
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();
		final Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, -26);
		final Name name = new Name("JIE", "XU");
		Customer person = new Customer(name, date.getTime());
		DrivingLicence dl1 = DrivingLicence.getInstance(person, date.getTime(), true);
		carRentalCompany.issueCar(person, dl1, CarType.LARGE_CAR);
		Car rentedCar = carRentalCompany.getCar(person);
		System.out.println(rentedCar);
	}*/
	//print: pb76jax pc59pnu...
	//		 LargeCar(Carnumber: ii31 ygn) [Fuel=60/60, renter=Customer: JIE XU DateOfBirth: 1993-10-25]
	
	
	
	//-------------------TEST testIssueCarUnsatisfySmallCar
	/*public static void main(String[] args) {
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();

		Calendar date19Year = Calendar.getInstance();
		date19Year.add(Calendar.YEAR, -19);
		Calendar date21Year = Calendar.getInstance();
		date21Year.add(Calendar.YEAR, -21);

		// Calendar test = Calendar.getInstance();
		// test.set(Calendar.DATE, 1);
		// System.out.println(test.getTime());
		// test.add(Calendar.DATE, -2);
		// System.out.println(test.getTime());

		// Calendar.add() works perfectly with any parameter, even current date
		// is 1,
		// you can still execute .add(Calendar.DATE, -1).

		Calendar date0Year = Calendar.getInstance();
		date0Year.add(Calendar.DATE, -1);
		Calendar date2Year = Calendar.getInstance();
		date2Year.add(Calendar.YEAR, -2);
		final Name name = new Name("JIE", "XU");
		final Name name2 = new Name("JIE", "XU1");
		Customer person19 = new Customer(name, date19Year.getTime());
		Customer person21 = new Customer(name2, date21Year.getTime());

		DrivingLicence licence2year = DrivingLicence.getInstance(person19, date2Year.getTime(), true);
		DrivingLicence licence0year = DrivingLicence.getInstance(person21, date0Year.getTime(), true);
		System.out.println(licence2year);
		System.out.println(licence0year);
	}*/
	//print: kl41fgi sf11euy...
	//licenceNumber: JX-2017-94 issueDate: 2017-10-25 isFullLicence: true
	//licenceNumber: JX-2019-48 issueDate: 2019-10-24 isFullLicence: true
	
	
	//-------------------TEST testIssueCarUnsatisfySmallCar
	/*public static void main(String[] args) {
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();

		Calendar date24Year = Calendar.getInstance();
		date24Year.add(Calendar.YEAR, -24);
		Calendar date26Year = Calendar.getInstance();
		date26Year.add(Calendar.YEAR, -26);
		Calendar date4Year = Calendar.getInstance();
		date4Year.add(Calendar.YEAR, -4);
		Calendar date6Year = Calendar.getInstance();
		date4Year.add(Calendar.YEAR, -6);

		final Name name = new Name("JIE", "XU");
		final Name name2 = new Name("JIE", "XU1");
		Customer person24 = new Customer(name, date24Year.getTime());
		Customer person26 = new Customer(name2, date26Year.getTime());

		DrivingLicence licence2year = DrivingLicence.getInstance(person24, date4Year.getTime(), true);
		DrivingLicence licence0year = DrivingLicence.getInstance(person26, date6Year.getTime(), true);
		System.out.println(licence2year);
		System.out.println(licence0year);
	}*/
	//print: rc31tle ry10dkr...
	//licenceNumber: JX-2009-98 issueDate: 2009-10-25 isFullLicence: true
	//licenceNumber: JX-2019-82 issueDate: 2019-10-25 isFullLicence: true

	
	
	//-------------------TEST  testIssueCarIllegal
		/*public static void main(String[] args) {
			CarRentalCompany carRentalCompany = new CarRentalCompany();
			carRentalCompany.initCarFleet();
			final Calendar date = Calendar.getInstance();
			date.add(Calendar.YEAR, -26);
			final Name name = new Name("JIE", "XU");
			DrivingLicence dl1 = DrivingLicence.getInstance("XJ-1994-03", date.getTime(), true);
			carRentalCompany.issueCar(null, dl1, CarType.LARGE_CAR);
			}*/
	
	//print: all like : kh56fzd pe92fyk mz46zjk....person can not be null
	
	
	//-------------------TEST  TerminateRental
		/*public static void main(String[] args) {
			CarRentalCompany carRentalCompany = new CarRentalCompany();
			carRentalCompany.initCarFleet();
			final Calendar date = Calendar.getInstance();
			date.add(Calendar.YEAR, -26);
			final Calendar date2 = Calendar.getInstance();
			date2.add(Calendar.YEAR, -3);
			final Name name = new Name("JIE", "XU");
			Customer person25 = new Customer(name, date.getTime());
			DrivingLicence licence5year = DrivingLicence.getInstance(person25, date2.getTime(), true);

			carRentalCompany.issueCar(person25, licence5year, CarType.LARGE_CAR);
			Car rentedCar = carRentalCompany.getCar(person25);
			rentedCar.drive(200);
			rentedCar.addFuelToTank(2);
			System.out.println(rentedCar);
			}	*/	
	//print: all like : kh56fzd pe92fyk mz46zjk....
	
	
	
	//-------------------TEST  TerminateRental
	/*public static void main(String[] args) {
		CarRentalCompany carRentalCompany = new CarRentalCompany();
		carRentalCompany.initCarFleet();
		final Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR, -10);
		final Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.YEAR, -5);
		final Name name = new Name("JIE", "XU");
		Customer person25 = new Customer(name, date.getTime());
		DrivingLicence licence5year = DrivingLicence.getInstance(person25, date2.getTime(), true);

		carRentalCompany.issueCar(person25, licence5year, CarType.LARGE_CAR);
		Car rentedCar = carRentalCompany.getCar(person25);
		rentedCar.drive(200);
		rentedCar.addFuelToTank(2);
		carRentalCompany.terminateRental(null);
		}*/
	//print: all like : kh56fzd pe92fyk mz46zjk....
}
