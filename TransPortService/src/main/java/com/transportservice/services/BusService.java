package com.transportservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.transportservice.entity.BusDetails;
import com.transportservice.repository.BusDetailsRepository;

@Service
public class BusService {
  @Autowired
  BusDetailsRepository busRepository;
  
  public List<BusDetails> getBus() {
    return busRepository.findAll();
  }

  public Optional<BusDetails> getBusById(String id) {
    return busRepository.findById(id);
  }

  public BusDetails addBus(BusDetails bus) {
    BusDetails buss = busRepository.save(bus);
    return buss;
  }
  public void deleteBus(String id) {
    busRepository.deleteById(id);
  }
  public BusDetails updateBus(String id, BusDetails bus) {
    return bus;

  }

}
