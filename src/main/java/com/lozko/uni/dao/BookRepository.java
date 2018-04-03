package com.lozko.uni.dao;

import com.lozko.uni.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
