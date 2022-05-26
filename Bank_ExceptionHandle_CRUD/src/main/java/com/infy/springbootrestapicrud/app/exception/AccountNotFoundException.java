package com.infy.springbootrestapicrud.app.exception;


public class AccountNotFoundException extends RuntimeException{
	
    public AccountNotFoundException(String msg)
    {
        super(msg);
  
    }

}
