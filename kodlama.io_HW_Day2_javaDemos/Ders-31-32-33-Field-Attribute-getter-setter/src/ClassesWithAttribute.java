
public class ClassesWithAttribute {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "Laptop";
		System.out.println(product.name);
		
		product.setId(1);
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		//sonradan özellik ekledik
		product.renk = "";
		product.setKod("Ll");
		
		System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		//Add2 metodunu farklı ekranlarda kullanmak istediğimizde tek tek yazmak mantıklı değildir.
		//Add2 metoduna yeni bir özellik eklemek istediğimizde tek tek değiştirmek  anlamsız olurdu.
		productManager.Add2(1,"","", 2, 200);
		productManager.Add2(1,"","", 2, 200);
		productManager.Add2(1,"","", 2, 200);
		productManager.Add2(1,"","", 2, 200);
		productManager.Add2(1,"","", 2, 200);

		
		System.out.println(product.getId());
		
	}

}
