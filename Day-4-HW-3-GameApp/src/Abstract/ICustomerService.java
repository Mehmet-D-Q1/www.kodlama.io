package Abstract;

import Entities.Customer;

public interface ICustomerService {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);

}
