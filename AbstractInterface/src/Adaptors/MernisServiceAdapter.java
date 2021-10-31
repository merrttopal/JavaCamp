package Adaptors;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.KJGKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        KJGKPSPublicSoap client = new KJGKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateofyear());
    }
}
