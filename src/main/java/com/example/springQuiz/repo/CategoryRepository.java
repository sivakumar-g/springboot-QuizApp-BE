package com.example.springQuiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springQuiz.model.Role;
import com.example.springQuiz.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
