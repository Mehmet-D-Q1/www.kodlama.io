
public class User {

	private String firstName;
	private String lastName;
	private int idNumber;
	private int age;
	
	public User(String firstName, String lastName, int idNumber, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.age = age;
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
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
