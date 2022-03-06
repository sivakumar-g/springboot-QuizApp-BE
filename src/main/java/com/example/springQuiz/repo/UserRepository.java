package com.example.springQuiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springQuiz.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
}
