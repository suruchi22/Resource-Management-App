package com.task.resoucemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.task.resoucemanagement.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

}
