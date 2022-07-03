package com.BookKatta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookKatta.Model.Book;
import com.BookKatta.Repository.RepositoryBook;

@Service
public class ServicebookImpl implements Servicebook
{
	@Autowired
	RepositoryBook repositorybook;
//--------------------------------------------------------------------------------------
	@Override
	public List<Book> getallBook() {
	List<Book>list=(List<Book>) repositorybook.findAll();
		return list;
	}
//--------------------------------------------------------------------------------------

	@Override
	public Book savebookData(Book book)
	{
	   
		return  repositorybook.save(book);
	}
//--------------------------------------------------------------------------------------

	@Override
	public Book getbyId(int id) {
		
	Book bd=repositorybook.findById(id);
		
	return bd ;
		
	}

//-------------------------------------------------------------------
}
