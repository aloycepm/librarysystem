package com.niafrika.lis.repository;

import com.niafrika.lis.domain.BookCategory;
import org.springframework.data.repository.CrudRepository;

public interface BookCategoryRepository extends CrudRepository<BookCategory, Long> {
}
