package User;

import javax.swing.JOptionPane;

public class InputNotValidException extends RuntimeException { 
	public InputNotValidException(String message) {
		
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.ERROR_MESSAGE);
		//super(message);
	}
}