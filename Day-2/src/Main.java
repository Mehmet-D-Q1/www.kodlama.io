
public class Main {

	public static void main(String[] args) {
		
		Product product0 = new Product(0,"Lenovo v13",14000,"8 GB Ram"); // Örnek/Referans/İnstance oluşturma işlemi. Aslında Parametreleri girilmiş Product clasından product0 adında yeni bir obje yarattık.
		  								  								 // Bu sayede Product clasının elemanlarına product0 objesiyle erişebileceğiz.
		// Product clasından örnek oluşturmayı yukarıdaki gibi de gerçekleştirebiliriz daha çok kullanılan yoldur.
		
		
		/*
		// Product1'in özelliklerini tanımladık.
		product0.id =0;
		product0.name = "Lenovo v13";
		product0.unitPrice = 14000;
		product0.detail = "8 GB Ram";
		*/
		

		Product product1 = new Product(); // Örnek/Referans/İnstance oluşturma işlemi. Aslında Product clasından product1 adında yeni bir obje yarattık.
										  // Bu sayede Product clasının elemanlarına product1 objesiyle erişebileceğiz.
		
		// Product1'in özelliklerini tanımladık.
		product1.id =1;
		product1.name = "Lenovo v14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		
		Product product2 = new Product(); // Örnek/Referans/İnstance oluşturma işlemi. Aslında Product clasından product2 adında yeni bir obje yarattık.
		  								  // Bu sayede Product clasının elemanlarına product2 objesiyle erişebileceğiz.

		// Product2'nin özelliklerini tanımladık.
		product2.id =2;
		product2.name = "Lenovo v15";
		product2.unitPrice = 16000;
		product2.detail = "24 GB Ram";
		
		
		Product product3 = new Product(); // Örnek/Referans/İnstance oluşturma işlemi. Aslında Product clasından product3 adında yeni bir obje yarattık.
										  // Bu sayede Product clasının elemanlarına product3 objesiyle erişebileceğiz.
		
		// Product3'ün özelliklerini tanımladık.
		product3.id =3;
		product3.name = "Lenovo v16";
		product3.unitPrice = 17000;
		product3.detail = "32 GB Ram";
		
		Product[] products = {product0,product1, product2, product3}; // Product clasından products adında bir array tanımladık. 
		System.out.println(products.length);
		
		for(Product product : products) //Products dizisinin elemanlarını tek tek gezerek Product clasından olan product adında takma isme atayacaktır.(Foreach döngüsüyle)
		{
			System.out.println(product.name); //herbir dizi elemanının atandığı product adındaki değişkenle elemanların ismine eriştik.
		}
		
		
		Category category1 = new Category();
		category1.id = 2;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 3;
		category2.name = "Ev/Bahçe";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product0);
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
	}

}
