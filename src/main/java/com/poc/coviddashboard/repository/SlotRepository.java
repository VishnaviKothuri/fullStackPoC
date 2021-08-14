package com.poc.coviddashboard.repository;

import com.poc.coviddashboard.model.SlotInfoTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends CrudRepository<SlotInfoTable,Integer> {
}
