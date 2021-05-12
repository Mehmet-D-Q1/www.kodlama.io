
public class Product {
	
	// Product clasında ürüne ait özellikler tutuldu.(SOLID Prensibi gereği)
	//Attribute/Fields
	
	//Java'da Ürünler erişim denetleyici belirtilmemişse varsayılan olarak public kabul edilir
	//Public veiler diğer sınıflardada kullanılabilir.
	
	private int _id;
	String name;
	String description;
	double price;
	int stockAmount;
	
	//Ekleme yaptık:
	String renk;
	
	//Private olsaydı sadece tanımlandığı block larda geçerli olacaktır.
	private String _kod;
	
	//getter ve setter  --> Encapsulation
	//clasınızda private olan değişkenlere başka sınıflarda kullanmak için kullanılır. 
	
	public int getId() {
		return _id; // _id olan field alandan gelendir.
	}
	
	
	public void setId(int id){
		_id = id; // id ler karışabilir bu yüzden this anahtar kelimesini kullanabiliriz. yada tanımlanan değişkene karakter eklenebilir.
				  // _id olan field alandan gelendir.
	}
	
	
	public String getKod() {
		return _kod; // _id olan field alandan gelendir.
	}
	
	
	public void setKod(String kod){
		_kod = kod; // id ler karışabilir bu yüzden this anahtar kelimesini kullanabiliriz. yada tanımlanan değişkene karakter eklenebilir.
				  // _id olan field alandan gelendir.
	}
}
