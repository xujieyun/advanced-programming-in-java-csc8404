package uk.ac.ncl.jesseJieXu.entity;

import java.util.Date;

/** 
 * Person - interface for person with read-only get methods.
 *
 */

public interface Person {    /**
     * Get the name.
    *
    * @return the name of the person
    */
	public Name getName();
   
   /**
    * Get the date of birth.
    *
    * @return the date of birth of the person
    */
   public Date getDateOfBirth();
}
