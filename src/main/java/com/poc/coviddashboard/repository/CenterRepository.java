package com.poc.coviddashboard.repository;

import com.poc.coviddashboard.model.CenterInfoTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends CrudRepository<CenterInfoTable, Integer> {
}
