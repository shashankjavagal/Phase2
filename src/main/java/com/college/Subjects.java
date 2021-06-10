package com.college;

public class Subjects {
	private long SUBJECTID;
	private String name;

	public Subjects() {

	}

	public Subjects(String name) {
		super();
		this.name = name;
	}

	public long getSUBJECTID() {
		return SUBJECTID;
	}

	public void setSUBJECTID(long sUBJECTID) {
		SUBJECTID = sUBJECTID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
