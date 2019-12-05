package ExceptionHandlingProgram;

public class InvalidAgeException extends Throwable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		System.out.println("Age cannot be greater then 18");
	}
}
