package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Client;


public interface IClientService {

		void save(Client c);
		void update(Client c);
		void delete(long id);
		Optional<Client> getone(long id);
		List<Client> getall();
		
}
