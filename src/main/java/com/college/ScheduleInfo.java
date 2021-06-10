package com.college;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/ScheduleInfo")
public class ScheduleInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ScheduleInfo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			@SuppressWarnings("unchecked")
			List<Academy> list = session.createQuery("select from Academy").list();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Academic Schedule<\b><br>");

			for (Academy a : list) {
				out.println("ID" + String.valueOf(a.getID()));

				Set<Students> student = a.getStudents();
				out.println("Student name: ");
				for (Students s : student) {
					out.print(s.getName() + "&nbsp;");
				}

				List<Classs> classs = a.getClasss();
				out.println(", Class: ");
				for (Classs c : classs) {
					out.print(c.getGrade() + "&nbsp;");
				}

				List<Teachers> teacher = a.getTeachers();
				out.println(", Teacher: ");
				for (Teachers t : teacher) {
					out.print(t.getName() + "&nbsp;");
				}

				List<Subjects> subject = a.getSubjects();
				out.println(", Subject: ");
				for (Subjects j : subject) {
					out.print(j.getName() + "&nbsp;");
				}
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
