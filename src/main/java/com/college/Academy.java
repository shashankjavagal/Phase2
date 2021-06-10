package com.college;

import java.util.List;
import java.util.Set;

public class Academy {
	private int ID;
	private String name;
	private Set<Students> Students;
	private List<Teachers> Teachers;
	private List<Classs> Classs;
	private List<Subjects> Subjects;
	
	public Academy() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Students> getStudents() {
		return Students;
	}

	public void setStudents(Set<Students> students) {
		Students = students;
	}

	public List<Teachers> getTeachers() {
		return Teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		Teachers = teachers;
	}

	public List<Classs> getClasss() {
		return Classs;
	}

	public void setClass(List<Classs> class1) {
		Classs = class1;
	}

	public List<Subjects> getSubjects() {
		return Subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		Subjects = subjects;
	}
}
