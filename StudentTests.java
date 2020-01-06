package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hallway.Classes;
import people.Student;

class StudentTests {
	private static Student grant;
	private static ArrayList<Classes> classList;
	
	@BeforeAll
	public static void setup() {
		grant = new Student("Grant", "Buley");
		Classes math = new Classes("Math1301", 1234, "24B");
		Classes science = new Classes("Astronomy1301", 5092, "29A");
		classList = new ArrayList<Classes>();
		classList.add(math);
		classList.add(science);
		
		grant.setStudentClasses(classList);
	}

	@Test
	public void shouldNotCreateNewId() {
		String studentId = grant.getStudentID();
		assertTrue(studentId.contentEquals(grant.createId()));
		Student coolGuy = new Student("Cool","Guy");
		assertFalse(studentId.contentEquals(coolGuy.getStudentID()));
	}
	
	@Test
	public void shouldGetClasses(){
		assertEquals(2, grant.getStudentClasses().size());
		Classes history = new Classes("History1301", 1024, "34C");
		classList.add(history);
		assertEquals(3, grant.getStudentClasses().size());
		assertTrue(grant.getStudentClasses().contains(history));
	}
	
	@Test
	public void shouldGetStudentName() {
		assertEquals("Grant", grant.getStudentFirstName());
		assertEquals("Buley", grant.getStudentLastName());
	}
	
	@Test
	public void shouldInsertandDeleteStudentFromDB() {
		DbTest.insertStudent(grant.getStudentFirstName(), grant.getStudentLastName(), grant.getStudentID());
		DbTest.deleteStudent(grant.getStudentID());
				
	}
	

}
