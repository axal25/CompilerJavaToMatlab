package exceptions;

public class NoSuchFileException extends Exception {
	
	public NoSuchFileException(String path) {
		super("No such file as \"" + path + "\"!");
	}

}
