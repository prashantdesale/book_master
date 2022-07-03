package com.BookKatta.Exceptions;
 
public class BookNotfound extends RuntimeException
{
	public BookNotfound(String message)
	{
		super(message);
	}
}
