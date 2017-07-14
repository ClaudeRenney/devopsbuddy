package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Claude on 7/14/17.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
