package com.antony.pn.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antony.pn.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public Optional<User> findByUsername(String username);
	public Optional<User> findByDui(String dui);
}
