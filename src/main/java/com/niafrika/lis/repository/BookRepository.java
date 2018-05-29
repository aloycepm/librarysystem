package com.niafrika.lis.repository;

import com.niafrika.lis.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
