
public class Main {

	public static void main(String[] args) {

		//ICustomerDal  customerDal = new OracleCustomerDal();
		
		
		//1.yöntem:
		/*
		CustomerManager customerManager = new CustomerManager();
			
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		*/
		
		//2.yöntem:
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
					
		customerManager.add();
		
		

		
	}

}
