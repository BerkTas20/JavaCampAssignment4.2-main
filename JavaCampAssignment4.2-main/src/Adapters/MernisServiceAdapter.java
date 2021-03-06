package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {
	
	@Override
	public boolean checkEntryPerson(Customer customer) {
		KPSPublicSoap soapClient  = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result =  soapClient.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityID()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateofBirth().getYear()
					);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}