package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Claude on 7/14/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
