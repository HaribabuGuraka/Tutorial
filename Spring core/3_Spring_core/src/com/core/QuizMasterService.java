package com.core;

public class QuizMasterService {

	//QuizMasterI quizMasterI  =  new QuizMasterImpl() ;
	
	QuizMasterI quiz;
	
	public void setQuiz(QuizMasterI quizMaster) {
		this.quiz = quizMaster;
	}

	public void askQuestion()
	{
		System.out.println(quiz.popQuestion());
	}
}
