package homerWork3Week;

public class Instructor extends User {
	private String instructorNumber ;
	private String branch;
	
	
	public Instructor() {
	
	}


	public Instructor(String instructorNumber, String branch) {
		this();
		this.instructorNumber = instructorNumber;
		this.branch = branch;
	}


	public String getInstructorNumber() {
		return instructorNumber;
	}


	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
