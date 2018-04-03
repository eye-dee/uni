package com.lozko.uni.dao;

import com.lozko.uni.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
