package com.example.springQuiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springQuiz.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
