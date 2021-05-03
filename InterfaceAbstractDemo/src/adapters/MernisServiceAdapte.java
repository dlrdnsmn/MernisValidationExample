package adapters;

import java.rmi.RemoteException;

import abstracts.ValidationService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapte implements ValidationService {

	public boolean validate(Customer customer) {
		
		  boolean result=false;
			
			
			
			KPSPublicSoap client = new KPSPublicSoapProxy();
			
					try {
						result =client.TCKimlikNoDogrula(
								Long.parseLong(customer.getNationalId()),
								customer.getFirstName().toUpperCase(),
								customer.getLastName().toUpperCase(),
								customer.getDateTime());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
					if(result) {
						System.out.println("Kimlik dogrulama basarili");
					}else {
						System.out.println("Kimlik doðrulama basarisiz.");
					}
					return result;

}
}
