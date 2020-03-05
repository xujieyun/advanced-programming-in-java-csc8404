package uk.ac.ncl.jesseJieXu.entity;
/**
 * 
 * @author xujie
 *
 */
public class SmallCar extends CarFactory {
	SmallCar(CarRegistrationNumber crn) {
		super(crn);
		// TODO Auto-generated constructor stub
		this.CapacityOfFuelTank = 49;
		this.CurrentlyFuelTank = 49;
	}
	private final int LARGE_CAR_FUEL_RATE = 20;


	@Override
	public int drive(int distanceKms) {
		// TODO Auto-generated method stub
		if (this.getRenter() == null) {
			throw new java.lang.IllegalStateException(" Car not rented");
		}
		if (distanceKms <= 0)
			throw new java.lang.IllegalArgumentException("distanceKms is false");
		// A car cannot be driven if it has 0 or less Litres of fuel in its tank.
		if (this.CurrentlyFuelTank <= 0)
			throw new java.lang.IllegalStateException("No Fuel.");
		int consumedFuel = (int) Math.ceil((double) distanceKms / (double) LARGE_CAR_FUEL_RATE);
		this.CurrentlyFuelTank -= consumedFuel;
		return consumedFuel;
	}
	@Override
	public String toString() {
		return "SmallCar" + super.toString();
	}




	

}
