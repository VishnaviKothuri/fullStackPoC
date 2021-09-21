package com.poc.coviddashboard.repository;

import com.poc.coviddashboard.model.UserInfoTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfoTable,Long> {
}
