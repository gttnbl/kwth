package com.bezkoder.spring.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.bezkoder.spring.login.models.Facture;

public interface FactureRepository extends CrudRepository<Facture, Integer> {

}
