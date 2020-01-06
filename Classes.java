package hallway;

public class Classes {
	private double grade;
	private String name;
	private String nameofTeacher;
	private int number;
	private String typeOf;
	private String roomNumber;
	
	
	public Classes(String name, int number, String roomNumber) {
		this.name = name;
		this.number = number;
		this.roomNumber = roomNumber;
		
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String getNameOfClass() {
		return name;
	}
	
	public void setNameOfClass(String nameOfClass) {
		this.name = nameOfClass;
	}
	
	public String getNameofTeacher() {
		return nameofTeacher;
	}
	
	public void setNameofTeacher(String nameofTeacher) {
		this.nameofTeacher = nameofTeacher;
	}

	public int getClassNumber() {
		return number;
	}

	public void setClassNumber(int number) {
		this.number = number;
	}

	public String getTypeOfClass() {
		return typeOf;
	}

	public void setTypeOfClass(String typeOf) {
		this.typeOf = typeOf;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
}
