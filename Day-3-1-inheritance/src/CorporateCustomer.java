
// Bir sınıf sadece yapabileceklerini kullanmalıdır.

public class CorporateCustomer extends Customer{ //CorporateCustomer sınıfı Customer sınıfındaki fieldlara ulaşması için extends anahtar kelimesiyle genişlettik./
	   											 //Bu sayede CorporateCustomer sınıfından türetilen örneklerle Customer sınıfındaki field lara erişebileceğiz.
	
	String companyName;
	String taxNumber;
	
}
