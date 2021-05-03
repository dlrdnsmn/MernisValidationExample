package entities;

import abstracts.ValidationService;

public class ValidationManager implements ValidationService{
   
    public Boolean validate (Customer customer) {
    	
        if(customer.getNationalId().length()==11 
        		&& customer.getDateTime()<2004){
            return true;
        }
        return  false;


    }

}
