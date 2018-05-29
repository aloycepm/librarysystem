package com.niafrika.lis.repository;

import com.niafrika.lis.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
