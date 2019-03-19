package com.lanou.exception;

public class UserNotExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public UserNotExistException() {
		super("用户不存在");
	}

}
