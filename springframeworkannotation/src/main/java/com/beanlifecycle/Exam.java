package com.beanlifecycle;

public class Exam {
	private String subjectName;
	private double subjectDuration;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getSubjectDuration() {
		return subjectDuration;
	}

	public void setSubjectDuration(double subjectDuration) {
		this.subjectDuration = subjectDuration;
	}

	public void init() {
		System.out.println("exam started");
	}

	public void destory() {
		System.out.println("exam ended");
	}
}
