package people;

import java.util.UUID;

import hallway.Classes;

public class Teachers implements Idable{
	private String firstName;
	private String lastName;
	private String id;
	private Classes tClass;
	private String typeOf;
	
	public Teachers(String firstName, String lastName, Classes className) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.tClass = className;
		this.id = createId();
	}
	
	public String createId() {
		if(this.id == null) {
			UUID uuid = UUID.randomUUID();
			return uuid.toString();
		}
		return this.id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = createId();
	}
	
	public Classes gettClass() {
		return tClass;
	}
	
	public void settClass(Classes tClass) {
		this.tClass = tClass;
	}
	
	public String getTypeOfTeacher() {
		return typeOf;
	}
	
	public void setTypeOfTeacher(String typeOfTeacher) {
		this.typeOf = typeOfTeacher;
	}
	
}
