
public class Main {

	public static void main(String[] args) {
		
		Product product0 = new Product(0,"Lenovo v13",14000,"8 GB Ram",10); 
		

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo 15");
		product1.setDetail("16GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Category category1 = new Category(); //Category() sınıfından category1 adında Category tipinde bir örnek oluşturduk. Kolayca verilerine erişebilmek için.
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2 = new Category(); //Category() sınıfından category2 adında Category tipinde bir örnek oluşturduk. Kolayca verilerine erişebilmek için.
		category2.setId(2);
		category2.setName("Yiyecek");
		
		
		System.out.println(category1.getName()); //name değişkeni private tanımlandığı için başka sınıflardan erişemiyoruz. Erişebilmek için getter ve setter lardan faydalanıyoruz.
		System.out.println(category2.getName()); //name değişkeni private tanımlandığı için başka sınıflardan erişemiyoruz. Erişebilmek için getter ve setter lardan faydalanıyoruz.
		System.out.println(category1.kod); //kod değişkeni public tanımlandığı için başka sınıflardan erişebiliyoruz.
		
		
		

		
	}

}
