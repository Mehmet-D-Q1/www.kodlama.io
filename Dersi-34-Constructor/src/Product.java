
public class Product {
	
	//Aynı isimli Constuctorları kullanmaya Overloading deniyor.
	
	public Product() { // Parametresiz Constructor oluşturduk
		
		System.out.println("Yapıcı Metod1 Oluşturuldu...");
		
		// Product() yapıcısı Parametre almadığı için özellikleri tanımlayamıyoruz.
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
		
		
	}
	
	public Product(int id, String name, String description, double price,int stockAmount, String renk, String kod) { // Parametreli Constructor oluşturduk.
		
		System.out.println("Yapıcı Metod2 Oluşturuldu...");
		
		// Product() yapıcısı Parametre aldığı için özellikleri tanımlayabiliyoruz.
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
		
	}
	
	//Attributes-Fields
	private int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;
}
	
