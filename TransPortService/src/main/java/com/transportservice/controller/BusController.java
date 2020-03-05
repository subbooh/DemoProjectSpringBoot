package com.transportservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.transportservice.entity.BusDetails;
import com.transportservice.services.BusService;

@Controller
public class BusController {
  @Autowired
  BusService busService;

  @GetMapping
  public List<BusDetails> list() {
    return busService.getBus();
  }

  @PostMapping
  public BusDetails create(@RequestBody final BusDetails bus) {
    return busService.addBus(bus);
  }

  @GetMapping(value = "/{id}")
  public Optional<BusDetails> get(@PathVariable("id") final String id) {
    return busService.getBusById(id);
  }

  @PutMapping(value = "/{id}")
  public BusDetails update(@PathVariable final String id, @RequestBody final BusDetails bus) {
    return busService.updateBus(id, bus);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable final String id) {
    busService.deleteBus(id);
  }

}
