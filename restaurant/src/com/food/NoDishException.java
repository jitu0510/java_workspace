package com.food;
/*
 * Author@ JITU KUMAR MANDAL
 * */

//exception class implementation
public class NoDishException extends RuntimeException{
	
	public NoDishException(String str) {
		super(str);
	}
}
