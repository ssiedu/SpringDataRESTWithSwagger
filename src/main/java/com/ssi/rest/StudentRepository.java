package com.ssi.rest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	public List<Student> findByBranch(@Param("branch") String branch);
	public List<Student> findByBranchAndSem(@Param("branch") String branch, @Param("sem") Integer sem);
}
