
// Bir sınıf sadece yapabileceklerini kullanmalıdır.

public class IndividualCustomer extends Customer { //IndividualCustomer sınıfı Customer sınıfındaki fieldlara ulaşması için extends anahtar kelimesiyle genişlettik./
												   //Bu sayede IndividualCustomer sınıfından türetilen örneklerle Customer sınıfındaki field lara erişebileceğiz.

	String firstName;
	String lastName;
	String nationalIdentity;
	
}
