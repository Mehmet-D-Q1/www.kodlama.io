
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Kamil", " Keleş ", 335789, 32, 5, 4500);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.saveUser(instructor);
		instructorManager.saveInfos(instructor);
		
		
		System.out.println("===============================");
		
		Student student = new Student("Selim", " Demir ", 425988, 19, 12, 3.50);
		StudentManager studentManager = new StudentManager();
		studentManager.saveUser(student);
		studentManager.saveInfos(student);
		
		System.out.println("===============================");
		
		User user = new User("Ayşe", " Arslan ", 986532, 23);
		UserManager userManager = new UserManager();
		userManager.deleteUser(user);
		
		
		
		

	}

}
