package Exceptiondemo;

public class InvalidBalance extends Throwable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidBalance() {
	System.out.println("Sorry!You cannot withdraw. Minimum Balance to be maintained is Rs.10,000");
}
}
