package com.collie.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collie.api.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
