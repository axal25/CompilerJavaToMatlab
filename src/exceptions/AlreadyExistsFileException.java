package exceptions;

public class AlreadyExistsFileException extends Exception {
	
	public AlreadyExistsFileException(String path) {
		super("There's already such a file as \"" + path + "\"!");
	}
	
}
