package User;


public class InputNotValidException extends RuntimeException { 
	public InputNotValidException(String message) {
		super(message);
	}
}