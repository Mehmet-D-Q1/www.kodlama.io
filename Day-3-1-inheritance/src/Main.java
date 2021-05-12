
public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.firstName = "Engin";
		engin.customerNumber = "123456";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "789101";
		
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "198763";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		/*//Tek tek yazmaktansa array kullanabiliriz.
		customerManager.add(engin);
		customerManager.add(hepsiBurada);
		customerManager.add(abc);
		*/
		
		
		// Bir array içerisinede yaabiliriz.
		Customer[] customers = {engin, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
		
	}

}
