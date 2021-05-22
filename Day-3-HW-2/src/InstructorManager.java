
public class InstructorManager extends UserManager{
	
	public void saveInfos(Instructor instructor)
	{
		
		System.out.println("<--Yeni eğitmenin bilgileri-->" + "\nAdı: " + instructor.getFirstName() + 
				"\nSoyadı: " + instructor.getLastName() + 
				"\nKayıt Numarası: " + instructor.getIdNumber() + 
				"\nYaşı: " +instructor.getAge() + 
				"\nDeneyimi: " + instructor.getYearsofExperience() + " yıl" + 
				"\nMaaşı: " + instructor.getSalary() + " TL");
		
	}
	
	
	
	public void deleteInfos(Instructor instructor)
	{
		System.out.println("Yeni eğitmen silindi...");
	}

}
