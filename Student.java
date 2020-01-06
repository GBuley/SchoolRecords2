package people;

import java.util.List;
import java.util.UUID;

import hallway.Classes;


public class Student implements Idable{
	private String id;
	private String firstName;
	private String lastName;
	private List<Classes> classes;
	private List<Teachers> nameOfTeachers;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = createId();
	}
	
	public Student(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String createId() {
		if(this.id == null) {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		}
		return this.id;
	}

	public String getStudentID() {
		return id;
	}

	public void setStudentID() {
		this.id = createId();
	}

	public List<Teachers> getNameOfTeachers() {
		return nameOfTeachers;
	}

	public void setNameOfTeachers(List<Teachers> nameOfTeachers) {
		this.nameOfTeachers = nameOfTeachers;
	}

	public List<Classes> getStudentClasses() {
		return classes;
	}

	public void setStudentClasses(List<Classes> studentClasses) {
		this.classes = studentClasses;
	}

	public String getStudentLastName() {
		return lastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.lastName = studentLastName;
	}

	public String getStudentFirstName() {
		return firstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.firstName = studentFirstName;
	}

}
