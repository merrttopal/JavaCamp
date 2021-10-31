import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.sql.Time;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setDateofyear(2001);
        customer.setFirstName("Mert");
        customer.setLastName("Topal");
        customer.setNationalityId("10146016414");
        customer.setId(1);
        customerManager.save(customer);
        System.out.println();
    }
}
