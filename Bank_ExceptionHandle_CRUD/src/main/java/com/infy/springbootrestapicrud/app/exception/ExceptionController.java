package com.infy.springbootrestapicrud.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus
public class ExceptionController {
	
   @ExceptionHandler(value = AccountNotFoundException.class)
   public ResponseEntity<Object> exception(AccountNotFoundException exception)
   {
      return new ResponseEntity<Object>("Account not found", HttpStatus.NOT_FOUND);
   }
}