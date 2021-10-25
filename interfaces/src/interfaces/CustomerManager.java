package interfaces;

public class CustomerManager {

	// loosly -tightly coupled

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
		
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi :  " + customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getFirstName());

		
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi :  " + customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getLastName());

	}

}
