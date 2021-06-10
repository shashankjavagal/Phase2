package com.college;

public class Teachers {
	private long TEACHERID;
	private String name;

	public Teachers() {

	}

	public Teachers(String name) {
		super();
		this.name = name;
	}

	public long getTEACHERID() {
		return TEACHERID;
	}

	public void setTEACHERID(long tEACHERID) {
		TEACHERID = tEACHERID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
