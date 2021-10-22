package homerWork3Week;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("İnan");
		student.setLastName("BATUK");
		student.setStudentNumber("12345677923");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorNumber("987654321");
		
		User user =  new User();
		user.setFirstName("Misafir");
		user.setLastName("Kulanıcı");
		
		
		UserManager userManager =  new UserManager();
		userManager.addSystem(user);
		userManager.addSystem(instructor);
		userManager.addSystem(student);
		
		StudentManager studentManager =  new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager =  new InstructorManager();
		instructorManager.add(instructor);
		
		

	}

}
