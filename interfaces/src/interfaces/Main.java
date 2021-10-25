package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = { new SmsLogger(),new EmailLogger(),new FileLogger(), new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer inan = new Customer(1,"inan","batuk");
				customerManager.add(inan);
	}

}
