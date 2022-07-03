package com.BookKatta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookKatta.Exceptions.BookNotfound;
import com.BookKatta.Model.Book;
import com.BookKatta.Service.Servicebook;

@RestController
public class ControlerBook 
{
	@Autowired
	
	Servicebook servicebook;
// #get all data ------------------------------------------------------------------------	
	@GetMapping("/getdata")
	public ResponseEntity<List<Book>> getData()
	{
		
		List<Book> list =servicebook.getallBook();
		if(list.size()==0)
		{
		return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
		} 
		
		return ResponseEntity.of(Optional.of(list));
	
	}
	
// #getbyId  data ------------------------------------------------------------------------

	
	@GetMapping("/getbyid/{bid}")
	public  ResponseEntity<Book> getsinglebook(@PathVariable("bid") int id)
	{
		
		Book bd=servicebook.getbyId(id);
		if(bd != null)
		{
			return new ResponseEntity<Book>(bd,HttpStatus.OK);
		}
		else
		{
	       throw new BookNotfound("plz put valid book id");
		}
		
		
	}	
	
// save data ------------------------------------------------------------------------
	@PostMapping("/savedata")
	public ResponseEntity<Book> saveData(@RequestBody Book book)
	{
		Book booked = null;
		
		if(booked==null)
		{
			
			return ResponseEntity.of(Optional.of(book));
		}
	
		return ResponseEntity.status(HttpStatus.OK ).build();
	}
}
