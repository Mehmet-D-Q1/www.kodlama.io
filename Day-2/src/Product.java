
public class Product // Product adında bir class oluşturduk.
{ 
	
	public Product() // Constructor bloğudur ve geri dönüş tipi yoktur.Parametre alabilirler. Her Product() fonk. çağrıldığında bu constructor da çalıştırılacaktır.
	{
		System.out.println("Ben çalıştım...");
	}
	
	public Product(int id, String name, double unitPrice, String detail) //aynı Product metodunu parametreli kullandık. Parametresiz kullansaydık aynı metod olduğu için hata verecekti.
	{
		//this bu class'taki demektir.Yani public class Product clasındaki demektir. This anahtar kelimesiyle "public class Product clasındaki" id, name, unitPrice, detail değerlerini
		//public Product(int id, String name, double unitPrice, String detail) consructorındaki parametrelere atamaızı sağlayacak.
		
		this();//
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail ;
	
}
