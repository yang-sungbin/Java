package kr.ac.mjc.java.jdbc.dao;

import kr.ac.mjc.java.jdbc.Student;

public class JdbcGetExUsingDao {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudent("4");
		System.out.println(student);
	}

}
