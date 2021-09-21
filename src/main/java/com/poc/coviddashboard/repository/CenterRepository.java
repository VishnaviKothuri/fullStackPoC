package com.poc.coviddashboard.repository;

import com.poc.coviddashboard.model.CenterInfoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CenterRepository extends JpaRepository<CenterInfoTable, Integer> {

    CenterInfoTable findByPinCode(Integer integer);

    List<CenterInfoTable> findAllByPinCode(Integer integer);

    Optional<CenterInfoTable> getByPinCode(Integer integer);
}
