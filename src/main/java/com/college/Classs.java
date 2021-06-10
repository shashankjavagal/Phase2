package com.college;

public class Classs {
	private long CLASSID;
	private int grade;

	public Classs() {

	}

	public Classs(int grade) {
		super();
		this.grade = grade;
	}

	public long getCLASSID() {
		return CLASSID;
	}

	public void setCLASSID(long cLASSID) {
		CLASSID = cLASSID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
