package uk.ac.ncl.jesseJieXu.entity;

/**
 * 
 * @author xujie
 *
 */
public class LargeCar extends CarFactory {
	private final int LARGE_CAR_FUEL_RATE1 = 10;
	private final int LARGE_CAR_FUEL_RATE2 = 15;
	private final int LARGE_CAR_FUEL_RATE1_HOLD = 50;
	LargeCar(CarRegistrationNumber crn) {
		super(crn);
		this.CapacityOfFuelTank = 60;
		this.CurrentlyFuelTank = 60;
	}

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
		int useFuel;
		if(distanceKms <= LARGE_CAR_FUEL_RATE1_HOLD)
			useFuel=(int) Math.ceil((double) distanceKms / (double) LARGE_CAR_FUEL_RATE1);
		else
			useFuel = (int) Math.ceil((double) LARGE_CAR_FUEL_RATE1_HOLD / (double) LARGE_CAR_FUEL_RATE1
					+ (double) (distanceKms - LARGE_CAR_FUEL_RATE1_HOLD) / (double) LARGE_CAR_FUEL_RATE2);
		this.CurrentlyFuelTank -= useFuel;
		return useFuel;
	}
	@Override
	public String toString() {
		return "LargeCar" + super.toString();
	}


	

}
