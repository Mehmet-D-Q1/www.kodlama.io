
public class Main {

	public static void main(String[] args) {
		/*

		EmailLogger emailLogger = new EmailLogger();
		
		emailLogger.log("Log mesajı...");
		
		 */
		
		/*
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for(BaseLogger logger : loggers)
		{
			logger.log("Log mesajı gönderildi...");
		}
		*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		CustomerManager customerManager2 = new CustomerManager(new FileLogger());
		customerManager.add();
		customerManager2.add();
		

	}
}