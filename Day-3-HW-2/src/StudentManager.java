
public class StudentManager extends UserManager{
	
	public void saveInfos(Student student)
	{
		
		System.out.println("<--Yeni öğrencinin bilgileri-->" + "\nAdı: " + student.getFirstName() + 
				"\nSoyadı: " + student.getLastName() + 
				"\nKayıt Numarası: " + student.getIdNumber() + 
				"\nYaşı: " +student.getAge() + 
				"\nSınıf Seviyesi: " + student.getGradeLevel() + ". Sınıf" + 
				"\nNot Ortalaması: " + student.getGpa());
		
	}
	
	
	
	public void deleteInfos(Student student)
	{
		System.out.println("Yeni eğitmen silindi...");
	}


}
