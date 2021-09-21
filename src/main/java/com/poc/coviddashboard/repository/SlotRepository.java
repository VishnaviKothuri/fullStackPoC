package com.poc.coviddashboard.repository;

import com.poc.coviddashboard.model.SlotInfoTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SlotRepository extends JpaRepository<SlotInfoTable,Integer> {
    Page<SlotInfoTable> findByCenterId(Integer centerId, Pageable pageable);

    SlotInfoTable findBySlotIdAndCenterId(Integer slot_id,Integer centerId);
}
