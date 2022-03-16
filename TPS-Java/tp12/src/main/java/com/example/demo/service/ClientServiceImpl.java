package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.reposetory.IClientDao;


@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientDao Dao;
	
	@Override
	public void save(Client c) {
		Dao.save(c);
	}

	@Override
	public void update(Client c) {
		Dao.save(c);
	}

	@Override
	public void delete(long id) {
		Dao.deleteById(id);
	}

	@Override
	public Optional<Client> getone(long id) {
		return Dao.findById(id);
	}

	@Override
	public List<Client> getall() {
		return Dao.findAll();
	}

}
