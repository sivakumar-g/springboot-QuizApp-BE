package com.example.springQuiz.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springQuiz.model.exam.Category;
import com.example.springQuiz.model.exam.Question;
import com.example.springQuiz.model.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	public Set<Question> findByQuiz(Quiz quiz);

}
