package com.task.resoucemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.resoucemanagement.model.Resource;
import com.task.resoucemanagement.repository.ResourceRepository;

@Service
public class ResourceService {

	@Autowired
	private ResourceRepository repository;

	public Resource saveResource(Resource resource) {
		return repository.save(resource);
	}

	public List<Resource> getAll() {
		return repository.findAll();
	}

}
