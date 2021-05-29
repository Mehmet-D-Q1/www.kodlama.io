
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};

		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(3,"Engin","Demir");
		customerManager.add(engin);
		
	}

}
