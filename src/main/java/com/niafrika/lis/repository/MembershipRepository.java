package com.niafrika.lis.repository;

import com.niafrika.lis.domain.Membership;
import org.springframework.data.repository.CrudRepository;

public interface MembershipRepository extends CrudRepository<Membership, Long> {
}
