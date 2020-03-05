package uk.ac.ncl.jesseJieXu.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @author xujie
 *
 */
public class CarRentalCompany {
	private List<Car> allCars;
	public CarRentalCompany(){
		super();
		this.allCars = new ArrayList<>();
	}
	/**
	 * 此方法返回可出租的指定类型汽车的数量。
	 * This method returns the number of cars of the specified type that are available to rent. 
	 * @param type
	 * @return
	 */
	public long availableCars(CarType type) {
		if (type == null) {
			throw new IllegalArgumentException("Type of car could not be null");
		}else if (type == CarType.LARGE_CAR) {
			return allCars.stream().filter(car -> car instanceof LargeCar && car.getRenter() == null).count();
		}else if (type == CarType.SMALL_CAR) {
			return allCars.stream().filter(car -> car instanceof LargeCar && car.getRenter() == null).count();
		}else {
			throw new IllegalArgumentException("Type of car is false");
		}
	}
	/**
	 * 此方法返回当前出租的所有汽车的集合(如果有的话)。
	 * This method returns a collection of all the cars current
	 * @return
	 */
	public List<Car> getRentedCars() {
		return allCars.stream().filter(car -> car.getRenter() != null).collect(Collectors.toList());
	}
	/**
	 * This method returns a collection of all the cars current
	 * Given a person, this method returns the car they are currently renting (if any).
	 * @param person
	 * @return
	 */
	public Car getCar(Customer customer) {
		if (customer == null)
			throw new IllegalArgumentException("customer should not be null.");
		return allCars.stream().filter(car -> car.getRenter() != null && car.getRenter().equals(customer)).findFirst().orElse(null);
	}
	
	/**
	 * 
	 * @param person
	 * @param drivingLicence
	 * @param typeOfCar
	 * @return
	 */
	public boolean issueCar(Customer person,DrivingLicence drivingLicence,CarType typeOfCar) {
		if (person == null)
			throw new IllegalArgumentException("person can not be null");
		if (drivingLicence == null)
			throw new IllegalArgumentException("drivingLicence can not be null");
		if (typeOfCar == null)
			throw new IllegalArgumentException("typeOfCar can not be null");
		if((typeOfCar.equals(typeOfCar.SMALL_CAR)&&validDate(person.getDateOfBirth(),20)
				&&validDate(drivingLicence.getIssueDate(),1))
				||(typeOfCar.equals(typeOfCar.LARGE_CAR)&&validDate(person.getDateOfBirth(),20)
						&&validDate(drivingLicence.getIssueDate(),5))){
			Car car = getOneCar(typeOfCar);
			if(car !=null){
				car.setRenter(person);
				return true;
			}else
				return false;
		}
		return false;
		
	}
	
	/**
	 * 
	 * @param person
	 * @return
	 */
	public int terminateRental(Customer person) {
		Car currentCar = this.getCar(person);
		if (currentCar == null)
			return 0;
		currentCar.setRenter(null);
		int fuelToAdd = currentCar.getCapacityOfFuelTank() - currentCar.getCurrentlyFuelTank();
		currentCar.addFuelToTank(fuelToAdd);
		return fuelToAdd;
	}
	
	/**
	 * 
	 * @param typeOfCar
	 * @return
	 */
	private Car getOneCar(CarType typeOfCar) {
		if (typeOfCar == null) {
			throw new IllegalArgumentException("Type of car could not be null");
		}else if (typeOfCar == CarType.LARGE_CAR) {
			return allCars.stream().filter(car -> car instanceof LargeCar && car.getRenter() == null).findFirst()
					.orElse(null);
		}else if (typeOfCar == CarType.SMALL_CAR) {
			return allCars.stream().filter(car -> car instanceof SmallCar && car.getRenter() == null).findFirst()
					.orElse(null);
		}else {
			throw new IllegalArgumentException("Type of car is false");
		}
	}
	public void initCarFleet() {
		addCars(CarType.SMALL_CAR, 20);
		addCars(CarType.LARGE_CAR, 10);
	}
	
	/**
	 * 
	 * @param type
	 * @param amount
	 */
	private void addCars(CarType type, int amount) {
		try {
		// TODO Auto-generated method stub
		for (int i = 0; i < amount; i++) {
			Random random = new Random();
			int ends = random.nextInt(99);
			String str1 = "";
			String str2 = "";
			// 循环得到10个字母
	        for (int j = 0; j < 2; j++) {
	             
	            // 得到随机字母
	            char c = (char) ((Math.random() * 26) + 97);
	            // 拼接成字符串
	            str1 += (c + "");
	        }
	        for (int j = 0; j < 3; j++) {
	             
	            // 得到随机字母
	            char c = (char) ((Math.random() * 26) + 97);
	            // 拼接成字符串
	            str2 += (c + "");
	        }
			String ramdonNumber=String.format("%02d",ends);
			String crn=str1+ramdonNumber+str2;
			System.out.println(crn);
			this.allCars.add(CarFactory.getInstance(type, CarRegistrationNumber.getInstance(crn)));
		}} catch (IllegalStateException e) {
				addCars(type, 1);
			}

		}

	/**
	 * 
	 * @param dateOfBirth
	 * @param i
	 * @return
	 */
	private boolean validDate(Date dateOfBirth, int i) {
		Calendar today = Calendar.getInstance();
		Calendar targetDate = Calendar.getInstance();
		targetDate.setTime(dateOfBirth);
		targetDate.add(Calendar.YEAR, i);
		if (targetDate.getTime().getTime() > today.getTime().getTime())
			return false;
		else
			return true;

	}
	public String toString() {
		return "allCars: "+allCars;
	}
}
