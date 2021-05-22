
public class Student extends User{
	
	private int gradeLevel ;
	private double gpa;
	
	
	
	public Student(String firstName, String lastName, int idNumber, int age, int gradeLevel, double gpa) {
		super(firstName, lastName, idNumber, age);
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}
	
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
