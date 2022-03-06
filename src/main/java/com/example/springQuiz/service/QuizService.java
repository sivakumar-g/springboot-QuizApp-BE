package com.example.springQuiz.service;

import java.util.List;
import java.util.Set;

import com.example.springQuiz.model.exam.Category;
import com.example.springQuiz.model.exam.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public void deleteQuiz(Long quizId);
	
	public Quiz getQuiz(Long quizId);
	
	public Set<Quiz> getQuizzes();
	
	public List<Quiz> getQuizzesOfCategory(Category category);
	
	public List<Quiz> getActiveQuizzes();
	
	public List<Quiz> getActiveQuizzesOfCategory(Category category);
	
}
