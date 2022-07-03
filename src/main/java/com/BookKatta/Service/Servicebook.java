package com.BookKatta.Service;

import java.util.List;

import com.BookKatta.Model.Book;

public interface Servicebook {

	List<Book> getallBook();
	
	Book savebookData(Book book);

	Book getbyId(int id);


}
