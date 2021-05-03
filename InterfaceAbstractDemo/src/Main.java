import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapte;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Dilara");
		customer.setLastName("Danýþman");
		customer.setDateTime((1993));
		customer.setNationalId("1234567890");
		
		BaseCustomerManager customerManager = new NeroCustomerManager();

		customerManager.save(customer);
		
		  Customer customer2 = new Customer(); customer2.setId(2);
		  customer2.setFirstName("Engin"); customer2.setLastName("Demir");
		  customer2.setDateTime(1993); customer2.setNationalId("1234567890");
		  
		  BaseCustomerManager customerManager2 = new StarbucksCustomerManager( new
		  MernisServiceAdapte());
		  
		  customerManager2.save(customer);
		 

	}

}