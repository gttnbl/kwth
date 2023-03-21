package com.bezkoder.spring.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.bezkoder.spring.login.models.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
