/**
 * 
 */
package hello.livre.exceptions;

/**
 * @author Dell
 *
 */
public class BirthDateException extends Exception {
	
	public String getMessage () {
		return " La date de naissance ne peut pas etre superieure � la date du jour";
	}
	

	/**
	 * 
	 */
	public BirthDateException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public BirthDateException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public BirthDateException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public BirthDateException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public BirthDateException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}