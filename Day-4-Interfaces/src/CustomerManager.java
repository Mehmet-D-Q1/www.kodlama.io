
public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly - tightly coupled : gevşek ve sıkı bağlılık 
	public void add(Customer customer)
	{
		System.out.println("Müşteri eklendi..." + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//Utils utils = new Utils();
		//utils.runLoggers(loggers, customer.getFirstName());
		
		
		/*
		for(Logger logger: loggers)
		{
			logger.log(customer.getFirstName());
		}
		*/
		
		/* Angarya işe götürür.
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veritabanı loglandı.");
		*/
	}
	
	public void delete(Customer customer)
	{
		System.out.println("Müşteri silindi..." + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//Utils utils = new Utils();
		//utils.runLoggers(loggers, customer.getFirstName());
		
		/*
		for(Logger logger: loggers)
		{
			logger.log(customer.getFirstName());
		}
		*/
		
		/* Angarya işe götürür.
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veritabanı loglandı.");
		*/
	}

}
