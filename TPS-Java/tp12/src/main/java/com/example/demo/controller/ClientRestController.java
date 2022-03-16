package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.IClientService;

@RestController
@RequestMapping("/clients")
public class ClientRestController {
	
	
	@Autowired
	IClientService Service;
	
	@PostMapping("/add")
	public void save(@RequestBody Client c) {
		Service.save(c);
	}

	
	@PutMapping("/update")
	public void update(@RequestBody Client c) {
		Service.update(c);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable  long id) {
		Service.delete(id);
	}

	@GetMapping("/{id}")
	public Optional<Client> getone(@PathVariable long id) {
		return Service.getone(id);
	}

	@GetMapping("/all")
	public List<Client> getall() {
		return Service.getall();
	}
}
