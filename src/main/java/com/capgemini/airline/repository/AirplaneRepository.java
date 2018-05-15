package com.capgemini.airline.repository;

import com.capgemini.airline.model.Airplane;
import org.springframework.data.repository.CrudRepository;

public interface AirplaneRepository extends CrudRepository <Airplane,Integer> {
}
