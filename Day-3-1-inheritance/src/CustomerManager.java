
public class CustomerManager {
	public void add(Customer customer) 
	{
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	
	//bulk insert: toplu müşteri ekleme işlemi
	public void addMultiple(Customer[] customers)
	{
		for(Customer customer : customers) 
		{
			add(customer);
		}
	}
	
}
