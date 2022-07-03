package com.BookKatta.Exceptions;

import java.util.Date;

public class BookErrorObjects
{
	private int errorcode;
	private String errormessage;
	private Date date;
	private String path;
	
	

	public BookErrorObjects()
	{
		
	}
	
	public BookErrorObjects(int errorcode,String errormessage,Date date,String path) 
	{
		this.errorcode=errorcode;
		this.errormessage=errormessage;
		this.date=date;
		this.path=path;
	}
	
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
