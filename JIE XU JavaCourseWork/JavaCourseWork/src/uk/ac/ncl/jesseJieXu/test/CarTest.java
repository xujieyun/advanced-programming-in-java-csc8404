package uk.ac.ncl.jesseJieXu.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import uk.ac.ncl.jesseJieXu.entity.Car;
import uk.ac.ncl.jesseJieXu.entity.CarFactory;
import uk.ac.ncl.jesseJieXu.entity.CarRegistrationNumber;
import uk.ac.ncl.jesseJieXu.entity.CarType;
import uk.ac.ncl.jesseJieXu.entity.Customer;
import uk.ac.ncl.jesseJieXu.entity.Name;

public class CarTest {

	//-------------------TEST check method
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				CarRegistrationNumber cr = CarRegistrationNumber.getInstance("XJ03 QWE");
					System.out.println(cr);

			}
	//print:Carnumber: XJ03 QWE
	
	
	
	//-------------------TEST wrong 2 sameCar to illeagal
			/*public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				Car largeCar1 = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car largeCar2 = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
			}*/
	//print:Exception in thread "main" java.lang.IllegalStateException: Duplicate car registration number in system : Car-Carnumber: XJ01 QWE
	
	
		//-------------------TEST wrong format
			/*public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, null);
			}	*/
	//print:Exception in thread "main" java.lang.IllegalArgumentException: carRegistrationNumber should not be null.
			
			
			
		//-------------------TEST SmallCar LargeCar existing.
			/*public static void main(String[] args) {
				// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				System.out.println(largeCar);
			//LargeCar(Carnumber: XJ01 QWE) [Fuel=60/60, renter=null]
				System.out.println(smallCar);
			//SmallCar(Carnumber: XJ02 QWE) [Fuel=49/49, renter=null]
			}*/
		//print:LargeCar(Carnumber: XJ01 QWE) [Fuel=60/60, renter=null]
		//		SmallCar(Carnumber: XJ02 QWE) [Fuel=49/49, renter=null]
			
			
			
			
		//-------------------TEST null
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber cr = CarRegistrationNumber.getInstance(null);
				}*/
		//print:Exception in thread "main" java.lang.IllegalArgumentException: carRegistrationNumber is null
	
	
	
	//-------------------testGetFuelTankCapacity
		/*public static void main(String[] args) {
		// TODO Auto-generated method stub
			CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
			CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
			Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
			Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
			System.out.println(largeCar.getCapacityOfFuelTank());
			System.out.println(smallCar.getCapacityOfFuelTank());
	}	*/
		//print:60
		//		49
		
	//-------------------testGetCurrentFuelAmount
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				System.out.println(largeCar.getCurrentlyFuelTank());
				System.out.println(smallCar.getCurrentlyFuelTank());
		}	*/
		//print:60
		//		49
	
	
	
			//-------------------test drive and isFullFuelInTank
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				final Calendar date = Calendar.getInstance();
				date.add(Calendar.YEAR, -26);
				final Name name = new Name("JIE", "XU");
				final Customer c = new Customer(name,date.getTime());
				smallCar.setRenter(c);
				smallCar.drive(1);
				System.out.println(largeCar.IsFullFuelTank());
				System.out.println(smallCar.IsFullFuelTank());
		}	*/
			//print:true
			//		false	
			
			
			//-------------------test addFuelToTank
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				final Calendar date = Calendar.getInstance();
				date.add(Calendar.YEAR, -26);
				final Name name = new Name("JIE", "XU");
				final Customer c = new Customer(name,date.getTime());
				smallCar.setRenter(c);
				smallCar.drive(200);
				// add 2L fuel to tank
				System.out.println(largeCar.addFuelToTank(100));
				System.out.println(smallCar.getCurrentlyFuelTank());
		}*/	
			//print:0
			//		39	
			
	
			//-------------------test drive
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				final Calendar date = Calendar.getInstance();
				date.add(Calendar.YEAR, -26);
				final Name name = new Name("JIE", "XU");
				final Customer c = new Customer(name,date.getTime());
				smallCar.setRenter(c);
				largeCar.setRenter(c);
				smallCar.drive(500);
				largeCar.drive(100);
				// add 2L fuel to tank
				System.out.println(largeCar.getCurrentlyFuelTank());
				System.out.println(smallCar.getCurrentlyFuelTank());		
		}	*/
			//print:51
			//		24	
			
			
			
			//-------------------test drive distanceKms is false
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				CarRegistrationNumber dl2 = CarRegistrationNumber.getInstance("XJ02 QWE");
				Car largeCar = CarFactory.getInstance(CarType.LARGE_CAR, dl1);
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl2);
				final Calendar date = Calendar.getInstance();
				date.add(Calendar.YEAR, -26);
				final Name name = new Name("JIE", "XU");
				final Customer c = new Customer(name,date.getTime());
				smallCar.setRenter(c);
				smallCar.drive(-2);
	
		}	*/
			//print:Exception in thread "main" java.lang.IllegalArgumentException: distanceKms is false
			
			
			
			//-------------------test drive Not Rented
			/*public static void main(String[] args) {
			// TODO Auto-generated method stub
				CarRegistrationNumber crnS = CarRegistrationNumber.getInstance("XJ01 QWE");
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, crnS);

				smallCar.drive(10);
	
		}	*/
			//print:Exception in thread "main" java.lang.IllegalStateException:  Car not rented
			
	
	
			//-------------------test negative amounts of fuel
			/*public static void main(String[] args) {
		// TODO Auto-generated method stub
				CarRegistrationNumber dl1 = CarRegistrationNumber.getInstance("XJ01 QWE");
				Car smallCar = CarFactory.getInstance(CarType.SMALL_CAR, dl1);
				final Calendar date = Calendar.getInstance();
				date.add(Calendar.YEAR, -26);
				final Name name = new Name("JIE", "XU");
				final Customer c = new Customer(name,date.getTime());
				smallCar.setRenter(c);
				smallCar.drive(20022222);
				// add 2L fuel to tank
				System.out.println(smallCar.getCurrentlyFuelTank());

	}	*/
			//print:-1001063
			
			


}
