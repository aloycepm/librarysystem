package com.niafrika.lis.repository;

import com.niafrika.lis.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
