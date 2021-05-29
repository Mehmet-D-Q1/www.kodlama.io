
public class CustomerManager {
	
	//1.yöntem:
	//ICustomerDal customerDal;
	
	//2.yöntem:
	private	ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) 
	{
		this.customerDal = customerDal;
	}
	
	public void add()
	{
		// iş kodları yazılır.
		
		customerDal.add();
	}

}
