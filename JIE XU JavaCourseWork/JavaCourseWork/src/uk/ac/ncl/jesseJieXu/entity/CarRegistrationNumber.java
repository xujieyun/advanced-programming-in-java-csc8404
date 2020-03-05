package uk.ac.ncl.jesseJieXu.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/**
 * 
 * @author xujie
 *
 */
public final class CarRegistrationNumber {
	private final String CarfirstName, CarlastName;
	
	private static Map<String, CarRegistrationNumber> AllCarNames = new HashMap<String, CarRegistrationNumber>();
	
	/**
	 * 
	 * @param CarfirstName
	 * @param CarlastName
	 */
	public CarRegistrationNumber(String CarfirstName, String CarlastName) {
	// check CarfirstName and CarlastName are valid
	this.CarfirstName = CarfirstName;this.CarlastName = CarlastName;
}
	/**
	 * 
	 * @param CarfirstName
	 * @param CarlastName
	 * @return
	 */
	public static CarRegistrationNumber getInstance(String CarfirstName, String CarlastName) {
		final String k = CarfirstName + CarlastName;
		if (!AllCarNames.containsKey(k)){
			AllCarNames.put(k, new CarRegistrationNumber(CarfirstName, CarlastName));
//			System.out.println(AllCarNames.size());
		}
		return AllCarNames.get(k);
	}
	//CarRegistrationNumbers
	/**
	 * 
	 * @param carRegistrationNumber
	 * @return
	 */
	public static CarRegistrationNumber getInstance(String carRegistrationNumber) {
		if (carRegistrationNumber == null) 
            throw new IllegalArgumentException("carRegistrationNumber is null");
		String carRegistrationNumbertrim = carRegistrationNumber.trim();
		if (!validateCarRegNumber(carRegistrationNumbertrim))
			throw new IllegalArgumentException("carRegistrationNumber : argument format not validated");
		if (AllCarNames == null)
			AllCarNames = new HashMap<String, CarRegistrationNumber>();
		String CarfirstName = carRegistrationNumbertrim.substring(0, 4);
		String CarlastName = carRegistrationNumbertrim.substring(carRegistrationNumbertrim.length() - 3);
		String k = CarfirstName + CarlastName;
		if (!AllCarNames.containsKey(k)){
			AllCarNames.put(k, new CarRegistrationNumber(CarfirstName, CarlastName));
//			System.out.println(AllCarNames.size());
		}else{
			throw new IllegalStateException("have this name, please scan again.");
		}
		return AllCarNames.get(k);
	}
	/**
	 * 
	 * @param carRegistrationNumbertrim
	 * @return
	 */
	private static boolean validateCarRegNumber(String carRegistrationNumbertrim) {
	Pattern p = Pattern.compile("[A-Za-z]{2}\\d{2}\\s*[A-Za-z]{3}");
	return p.matcher(carRegistrationNumbertrim).matches();
}
	public String getCarfirstName() { return CarfirstName; }
	public String getCarlastName() { return CarlastName; }
	@Override
	public String toString() {
		return "Carnumber: "+CarfirstName + " " + CarlastName;
	}
	public static Map<String, CarRegistrationNumber> getAllCarNames() {
		return AllCarNames;
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (!(obj instanceof CarRegistrationNumber))
            return false;
        
        final CarRegistrationNumber other = (CarRegistrationNumber) obj;
        
        return CarfirstName.equals(other.CarfirstName) 
                && CarlastName.equals(other.CarlastName);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hc = 17;
        
        hc = 37 * hc + CarfirstName.hashCode();
        
        return 37 * hc + CarlastName.hashCode();
    }
	
	
}
