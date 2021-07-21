package com.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.model.Role;

public interface RoleRepo extends JpaRepository<Role,Integer>{

}
