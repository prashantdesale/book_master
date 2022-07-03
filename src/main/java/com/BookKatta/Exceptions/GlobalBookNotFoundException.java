package com.BookKatta.Exceptions;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalBookNotFoundException 
{
	@ExceptionHandler(BookNotfound.class)
	public ResponseEntity<BookErrorObjects> BookNotFoundHandler(BookNotfound bkd,HttpServletRequest request)
	{		
		BookErrorObjects error=new BookErrorObjects(HttpStatus.NOT_FOUND.value(),bkd.getMessage(),new Date(),request.getRequestURI());
		
		return new ResponseEntity<BookErrorObjects>(error,HttpStatus.NOT_FOUND);
	
	}

}
