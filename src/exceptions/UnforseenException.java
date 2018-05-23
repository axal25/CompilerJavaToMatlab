package exceptions;

public class UnforseenException extends Exception {
	
	public UnforseenException(String message) {
		super( "Something went REALLY wrong!" + message );
	}

}
