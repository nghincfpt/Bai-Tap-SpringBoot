package net.nghi.exception;

public class UserNotfoundException extends RuntimeException{
	public UserNotfoundException(String id) {
		super("Could not found the user with id" +id);
	}

}
