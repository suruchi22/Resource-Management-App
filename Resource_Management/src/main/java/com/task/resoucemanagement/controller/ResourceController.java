package com.task.resoucemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.resoucemanagement.model.Resource;
import com.task.resoucemanagement.service.ResourceService;

@RestController
public class ResourceController {

	@Autowired
	private ResourceService service;

	@PostMapping("/addresource")
	public Resource addResource(@RequestBody Resource resource) {
		return service.saveResource(resource);
	}

	@GetMapping("/getresources")
	public List<Resource> getResource() {
		return service.getAll();
	}
}
