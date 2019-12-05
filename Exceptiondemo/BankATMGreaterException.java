package Exceptiondemo;

public class BankATMGreaterException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2008368268634416362L;

	/**
	 * 
	 */

	public BankATMGreaterException() {
		System.out.println("Sorry!You cannot withdraw more than available balance");
	}

}
