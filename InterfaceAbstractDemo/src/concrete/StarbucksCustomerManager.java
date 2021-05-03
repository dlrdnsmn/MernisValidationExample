package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerService;
import abstracts.ValidationService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ValidationService validationService;
	public StarbucksCustomerManager(ValidationService validationService) {

		this.validationService = validationService;
	}
	

	public void save(Customer customer) {
		
		if(ValidationService.validate(customer)) {
		
			this.save(customer);
		}
		else {
			
			System.out.println("Not a valid person");
		}		

	
	

	}
	
}