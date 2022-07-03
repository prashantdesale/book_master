package com.BookKatta.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BookKatta.Model.Book;

@Repository
public interface RepositoryBook extends CrudRepository<Book, Integer> {

public Book findById(int id);

}
