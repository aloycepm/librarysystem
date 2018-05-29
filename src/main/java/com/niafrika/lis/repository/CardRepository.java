package com.niafrika.lis.repository;

import com.niafrika.lis.domain.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
