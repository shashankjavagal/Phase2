package com.college;

public class Students {

	private long STUDENTID;
	private String name;

	public Students() {
	}

	public Students(String name) {
		super();
		this.name = name;
	}

	public long getSTUDENTID() {
		return STUDENTID;
	}

	public void setSTUDENTID(long sTUDENTID) {
		STUDENTID = sTUDENTID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
