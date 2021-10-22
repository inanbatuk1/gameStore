package homerWork3Week;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+" nolu "+instructor.getFirstName()+" "
				+instructor.getLastName()+" isimli eðitimci sisteme baþarýlý þekilde kayýtedildi.");
	}

}
