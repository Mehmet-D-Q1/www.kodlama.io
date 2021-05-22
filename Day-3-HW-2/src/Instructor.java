
public class Instructor extends User{

	private int yearsofExperience ;
	private double salary;


	
	
	public Instructor(String firstName, String lastName, int idNumber, int age, int yearsofExperience, double salary) {
		
		super(firstName, lastName, idNumber, age);
		this.yearsofExperience = yearsofExperience;
		this.salary = salary;
	}
	

	public int getYearsofExperience() {
		return yearsofExperience;
	}

	public void setYearsofExperience(int yearsofExperience) {
		this.yearsofExperience = yearsofExperience;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

	
}
