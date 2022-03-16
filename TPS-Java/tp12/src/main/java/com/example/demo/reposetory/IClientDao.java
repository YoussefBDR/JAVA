package com.example.demo.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Long> {
	
}
