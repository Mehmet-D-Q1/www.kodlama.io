package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.ONAKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {



    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        ONAKPSPublicSoap client = new ONAKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(new Locale("tr")),customer.getLastName().toUpperCase(new Locale("tr")),customer.getDateOfBirth());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
