package uk.ac.ncl.jesseJieXu.entity;

import java.text.DateFormat;
import java.util.Date;

/** 
 * Customer - version of Person that does not 
 * perform defensive copying of internal fields.
 *
 */
public class Customer implements Person {
	private final Name name;
    private final Date dateOfBirth;
    public Customer(Name name,Date dateOfBirth){
    	if (name == null)
            throw new IllegalArgumentException(
                "null name not permitted");
        
        if (dateOfBirth == null)
            throw new IllegalArgumentException(
                "null date not permitted");
        
        this.name = name;
        
        this.dateOfBirth = dateOfBirth;
    }
	@Override
	public Name getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Date getDateOfBirth() {
		// TODO Auto-generated method stub
		return this.dateOfBirth;
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (!(obj instanceof Customer))
            return false;
        
        final Customer person = (Customer) obj;
        
        return name.equals(person.name) 
                && dateOfBirth.equals(person.dateOfBirth);
    }
	/**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hc = 17;
        
        hc = 37 * hc + name.hashCode();
        
        return 37 * hc + dateOfBirth.hashCode();
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Customer: "+name + " DateOfBirth: " + DateFormat.getDateInstance().format(dateOfBirth) ;
    }
}
