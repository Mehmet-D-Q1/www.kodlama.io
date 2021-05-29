
public class ProductValidator {

	static
	{
		System.out.println("Static Yapıcı blok çalıştı...");
	}
	
	public ProductValidator()
	{
		System.out.println("Yapıcı blok çalıştı...");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void biSey()
	{
		
	}
	
	//inner class
	public static class BaskabirClass
	{
		public static void sil()
		{
			
		}
	}
}
