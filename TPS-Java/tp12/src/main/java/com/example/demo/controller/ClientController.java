package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.model.Client;
import com.example.demo.service.IClientService;

@Controller
public class ClientController {
	
	@Autowired
	IClientService Service;
	
	public void save(Client c) {
		Service.save(c);
	}

	public void update(Client c) {
		Service.update(c);
	}

	public void delete(long id) {
		Service.delete(id);
	}

	public Optional<Client> getone(long id) {
		return Service.getone(id);
	}

	public List<Client> getall() {
		return Service.getall();
	}
}
