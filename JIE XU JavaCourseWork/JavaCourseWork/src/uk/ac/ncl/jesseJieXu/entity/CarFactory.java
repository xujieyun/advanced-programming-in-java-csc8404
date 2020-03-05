package uk.ac.ncl.jesseJieXu.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author xujie
 *
 */
public abstract class CarFactory implements Car{
	private CarRegistrationNumber crn;
	private Customer renter;
	protected int CurrentlyFuelTank;
	protected int CapacityOfFuelTank;
	private static final Map<CarRegistrationNumber, Car> AllCars = new HashMap<>();

	/**
	 * 
	 * @param typeOfCar
	 * @param carRegistrationNumber
	 * @return
	 */
	public static Car getInstance(CarType typeOfCar, CarRegistrationNumber carRegistrationNumber){
		if(carRegistrationNumber==null)
			throw new IllegalArgumentException("carRegistrationNumber should not be null.");
		Car car = AllCars.get(carRegistrationNumber);
		if(car !=null)
			throw new IllegalStateException(
					"Duplicate car registration number in system : Car-" + carRegistrationNumber.toString());
		if(typeOfCar == CarType.LARGE_CAR)
			car = new LargeCar(carRegistrationNumber);
		else if (typeOfCar == CarType.SMALL_CAR)
			car = new SmallCar(carRegistrationNumber);
		else
		 throw new IllegalArgumentException("Wrong car type: " + typeOfCar);
		 AllCars.put(carRegistrationNumber, car);
		return car;
		
	}
	
	CarFactory(CarRegistrationNumber crn) {
		this.crn = crn;
	}
	
	/**
	 * 
	 * @return
	 */
	public CarRegistrationNumber getCrn() {
		return crn;
	}
	
	
	public Customer getRenter() {
		return renter;
	}
	public void setRenter(Customer renter) {
		this.renter = renter;
	}
	public int getCurrentlyFuelTank() {
		return CurrentlyFuelTank;
	}
	public int getCapacityOfFuelTank() {
		return CapacityOfFuelTank;
	}
	
	
	@Override
	public boolean IsFullFuelTank() {
		return CapacityOfFuelTank == CurrentlyFuelTank;
	}
	@Override
	public CarRegistrationNumber getCarRegistrationNumber() {
		return crn;
	}
	
	/**
	 *  @param fuelToAdd
	 *  @return fuelToAdd
	 */
	@Override
	public int addFuelToTank(int fuelToAdd){
		if(fuelToAdd <0)
			throw new IllegalArgumentException("the fuelToAdd is false.");
		int fuelNeeded = CapacityOfFuelTank - CurrentlyFuelTank;
		if (fuelToAdd > fuelNeeded) {
			CurrentlyFuelTank = CapacityOfFuelTank;
			return fuelNeeded;
		} else {
			CurrentlyFuelTank += fuelToAdd;
			return fuelToAdd;
		}
		
	}
	@Override
	public String toString() {
		return "(" + crn + ") [Fuel=" + CurrentlyFuelTank + "/" + CapacityOfFuelTank + ", renter=" + renter + "]";
	}
	
}
