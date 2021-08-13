package com.techment.day6.exception;


class AgeException extends RuntimeException
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}

class TdNotFoundException extends Exception
{
	String msg;

	public TdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
}
public class CustomException {

	public static void main(String[] args) throws IdNotFoundException{
		
		//throw new AgeException("Not a valid age");
		throw new IdNotFoundException("Not a valid age");

	}

}
