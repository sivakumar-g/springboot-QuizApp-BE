package com.example.springQuiz.service;

import java.util.Set;

import com.example.springQuiz.model.exam.Category;
import com.example.springQuiz.model.exam.Question;
import com.example.springQuiz.model.exam.Quiz;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public Set<Question> getQuestions();

	public Question getQuestion(Long questionId);

    public void deleteQuestion(Long quesId);

	public Set<Question> getQuestionsOfQuiz(Quiz quiz);

	public Question get(Long questionId);
}
