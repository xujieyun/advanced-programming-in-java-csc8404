package uk.ac.ncl.jesseJieXu.entity;

/**
 * 
 * @author xujie
 *
 */
public  interface Car {
	   /**
	    * Get the CarRegistrationNumber.
	    *
	    * @return CarRegistrationNumber
	    */
	   CarRegistrationNumber getCarRegistrationNumber();
	   /**
	    * Get the CapacityOfFuelTank
	    *
	    * @return CapacityOfFuelTank
	    */
	   int  getCapacityOfFuelTank();
	   /**
	    * Get the getCurrentlyFuelTank.
	    *
	    * @return getCurrentlyFuelTank
	    */
	   int getCurrentlyFuelTank();
	   /**
	    * boolean the Is Full FuelTank.
	    *
	    * @return boolean the Is Full FuelTank
	    */
	   boolean IsFullFuelTank();
	   /**
	    * 
	    * @param fuelToAdd
	    * @return fuelToAdd
	    */
	   int addFuelToTank(int fuelToAdd);
	   /**
	    * a method to "drive" the car for a given number of whole Kilometres that returns the number of whole Litres of fuel consumed during the journey 
	    * @param distanceInKms
	    * @return the number of whole Litres of fuel consumed during the journey
	    */
	   int drive(int distanceKms);
	   
	   /**
	    * 
	    * Given a person, this method returns the car they are currently renting (if any).
	    * @return
	    */
	   public Customer getRenter();
	   
	   /**
	    * Given a person, this method returns the car they are currently renting (if any).
	    * @param customer
	    */
	   public void setRenter(Customer customer);
	
}
