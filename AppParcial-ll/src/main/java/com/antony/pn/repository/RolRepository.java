package com.antony.pn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antony.pn.entity.Role;

@Repository
public interface RolRepository extends CrudRepository<Role, Long> {
	public Role findByName(String role);
}
