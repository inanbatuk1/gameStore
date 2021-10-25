package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.sql.Date;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        KPSPublicSoapProxy kpspublic = new KPSPublicSoapProxy();
        return kpspublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
        		customer.getLastName(), customer.getDateOfBirth());
    }
}
