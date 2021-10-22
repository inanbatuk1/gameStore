package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bireyselMüþteri = new IndividualCustomer();
		bireyselMüþteri.customerNumber="11111111";
		
		CorporateCustomer kurumsalMüþteri = new CorporateCustomer();
		kurumsalMüþteri.customerNumber="22222222";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "33333333";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(kurumsalMüþteri);
		//customerManager.add(bireyselMüþteri);
		//customerManager.add(sendikaCustomer);
		Customer[] customers = {bireyselMüþteri,kurumsalMüþteri,sendikaCustomer};
		
		customerManager.addMultiple(customers);
	}

}
