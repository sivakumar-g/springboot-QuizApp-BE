package com.example.springQuiz.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springQuiz.model.exam.Category;
import com.example.springQuiz.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	public List<Quiz> findBycategory(Category category);

	public List<Quiz> findByActive(boolean b);

	public List<Quiz> findByCategoryAndActive(Category category, boolean b);
	
	

}
