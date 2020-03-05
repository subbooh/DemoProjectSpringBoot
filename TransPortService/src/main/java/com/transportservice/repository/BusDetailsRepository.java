package com.transportservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.transportservice.entity.BusDetails;

public interface BusDetailsRepository extends JpaRepository<BusDetails, String>{
  public List<BusDetails> findBusById(String id);
}
