
public class ders34 {

	public static void main(String[] args) {
		
		Product product  = new Product(); //Aslında Burada yeni bir nesne oluşturulurken, Yapıcı metodta oluşturulur. Parametresiz.
		Product product2  = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah","A1L1"); //Aslında Burada yeni bir nesne oluşturulurken, Yapıcı metodta oluşturulur. Parametreli.
		System.out.println(product.name); // name parametresi Product() yapıcısına girilmediği için null dönderecektir.
		System.out.println(product2.name); // name parametresi Product() yapıcısına girildiği için tanımlandığı değeri dönderecektir.
		

		
	}

}
