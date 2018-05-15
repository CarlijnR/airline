package com.capgemini.airline.repository;

import com.capgemini.airline.model.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository <Airport,Integer> {
}
