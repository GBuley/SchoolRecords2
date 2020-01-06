package test;

import java.util.ArrayList;

import hallway.Classes;
import people.Student;
import people.Teachers;

public class TestArea {
	
	public static void main(String args[]) {
		Student coolguy = new Student ("cool", "guy");
		Classes studentScienceClass = new Classes("Foundations of Science", 1234, "24A");
		Classes studentMathClass = new Classes("Foundations of Math", 123, "24B");
		Teachers teacher1 = new Teachers("Fallon", "Jordan", studentMathClass);
		ArrayList<Classes> studentClasses = new ArrayList<Classes>();
		studentClasses.add(studentMathClass);
		studentClasses.add(studentScienceClass);
		coolguy.setStudentClasses(studentClasses);
		teacher1.setTypeOfTeacher("Math Teacher");
		
		for(Classes classes : coolguy.getStudentClasses()){
			System.out.println(classes.getClassNumber());
			System.out.println(classes.getNameOfClass());
			System.out.println(classes.getNameofTeacher());
			System.out.println(classes.getRoomNumber());
		}
		System.out.println(teacher1.getFirstName());
		System.out.println(teacher1.getId());
		System.out.println(teacher1.getLastName());
		System.out.println(teacher1.getTypeOfTeacher());
		System.out.println(teacher1.getId());
		coolguy.setStudentID();
		System.out.println(coolguy.getStudentID());
		System.out.println(coolguy.getStudentFirstName());
		System.out.println(coolguy.getStudentLastName());
		coolguy.setStudentID();
		System.out.println(coolguy.getStudentID());
	}
}
