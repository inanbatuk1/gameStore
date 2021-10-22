package homerWork3Week;

public class Student extends User{
	private String studentNumber;
	private String classOfTheStudent;
	
	
	public Student() {
		
	}


	public Student(String studentNumber, String classOfTheStudent) {
		this();
		this.studentNumber = studentNumber;
		this.classOfTheStudent = classOfTheStudent;
	}


	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getClassOfTheStudent() {
		return classOfTheStudent;
	}


	public void setClassOfTheStudent(String classOfTheStudent) {
		this.classOfTheStudent = classOfTheStudent;
	}
	

}
