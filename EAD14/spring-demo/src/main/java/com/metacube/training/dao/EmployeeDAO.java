package com.metacube.training.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.metacube.training.model.commands.EmployeeCommands;

public interface EmployeeDAO extends CrudRepository<EmployeeCommands, Integer> {

	public EmployeeCommands findByEmailAndPassword(String email, String password);
	
	public List<EmployeeCommands> findAllByOrganization(String organization);

	public Optional<EmployeeCommands> findByEmail(String email);

}
