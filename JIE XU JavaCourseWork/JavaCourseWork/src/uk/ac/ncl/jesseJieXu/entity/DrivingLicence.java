package uk.ac.ncl.jesseJieXu.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;


/**
 * 
 * @author xujie
 *
 */
public class DrivingLicence {
	private String licenceNumber;
	private Date issueDate;
	private boolean isFullLicence;
	private static Map<String, DrivingLicence> drivingLicencesMap;
//	public DrivingLicense 
	private DrivingLicence(String licenceNumber, Date issueDate, boolean isFullLicence) {
		super();
		this.licenceNumber = licenceNumber;
		this.issueDate = new Date(issueDate.getTime());
		this.isFullLicence = isFullLicence;
	}

	/**
	 * 
	 * @param licenceNumber
	 * @param issueDate
	 * @param isFullLicence
	 * @return
	 */
	public static DrivingLicence getInstance(String licenceNumber, Date issueDate, boolean isFullLicence) {
		if (licenceNumber == null||licenceNumber.length()==0)
            throw new IllegalArgumentException(
                "null or no licenceNumber not permitted");
        
        if (issueDate == null||licenceNumber.length()==0)
            throw new IllegalArgumentException(
                "null or no issueDate not permitted");
        String licenceNumberTrim = licenceNumber.trim();
		if (!DrivingLicenceNumberTrimTrue(licenceNumberTrim)) {
			throw new IllegalArgumentException("Driving Licence Number is Wrong,Check it is 2 letter +the year of issue+serial number,like MS-1990-10");
		}
		if (drivingLicencesMap == null) {
			drivingLicencesMap = new HashMap<String, DrivingLicence>();
		}
		DrivingLicence d = drivingLicencesMap.get(licenceNumberTrim);
		if (d != null) {
			throw new IllegalStateException("this Licence Number existing.");
		} else {
			d = new DrivingLicence(licenceNumberTrim, issueDate, isFullLicence);
			drivingLicencesMap.put(licenceNumberTrim, d);
		}
		return d;
	}
	 public String toString() {
	        return "licenceNumber: "+licenceNumber + " issueDate: " + DateFormat.getDateInstance().format(issueDate)+" isFullLicence: " +isFullLicence;
	    }
	 /**
	  * 
	  * @param driver
	  * @param issueDate
	  * @param isFullLicence
	  * @return
	  * @throws IllegalStateException
	  * @throws IllegalArgumentException
	  */
	 public static DrivingLicence getInstance(Customer driver, Date issueDate, boolean isFullLicence)
				throws IllegalStateException, IllegalArgumentException {
		 	if (driver == null)
	            throw new IllegalArgumentException(
	                "null or no driver not permitted");
	        
	        if (issueDate == null)
	            throw new IllegalArgumentException(
	                "null or no issueDate not permitted");
			if (driver == null || issueDate == null)
				throw new IllegalArgumentException("Null Argument for driver or issueDate.");
			if (drivingLicencesMap == null) {
				drivingLicencesMap = new HashMap<String, DrivingLicence>();
			}

			String initial = driver.getName().getFirstName().substring(0, 1) + driver.getName().getLastName().substring(0,1);

			SimpleDateFormat df = new SimpleDateFormat("yyyy");
			int issueYear = Integer.parseInt(df.format(issueDate));

			String licenceNumber;
			Random random = new Random();
			int ends = random.nextInt(99);
			String ramdonNumber=String.format("%02d",ends);

			// guarantees the uniqueness of the licence number as a whole.
			do {
				licenceNumber = initial + "-" + issueYear + "-" + ramdonNumber;
			} while (drivingLicencesMap.get(licenceNumber) != null);

			DrivingLicence dl = new DrivingLicence(licenceNumber, issueDate, isFullLicence);
			drivingLicencesMap.put(licenceNumber, dl);
			return dl;
		}
	 /**
	  * 
	  * @param licenceNumberTrim
	  * @return
	  */
	 	private static boolean DrivingLicenceNumberTrimTrue(String licenceNumberTrim) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[A-Za-z]{2}-\\d{4}-\\d{2}");
		return p.matcher(licenceNumberTrim).matches();
		
	}
		public String getLicenceNumber() {
			return licenceNumber;
		}
		public Date getIssueDate() {
			return issueDate;
		}
		public boolean isFullLicence() {
			return isFullLicence;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == this)
				return true;
			else if (obj instanceof DrivingLicence) {
				DrivingLicence dl = (DrivingLicence) obj;
				return (this.licenceNumber == dl.licenceNumber);
			}
			return super.equals(obj);
		}
		@Override
		public int hashCode() {
			int hc = 17;
			int multiplier = 37;
			return multiplier * hc + licenceNumber.hashCode();
		}

}
