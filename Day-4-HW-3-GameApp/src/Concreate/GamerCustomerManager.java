package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager{

    ICustomerCheckService customerCheckService;

    public  GamerCustomerManager(ICustomerCheckService customerCheckService)
    {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.add(customer);
        }
        else{
            System.out.println("Not a valid person!!");
        }
    }

    @Override
    public void update(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.update(customer);
        }
        else{
            System.out.println("Not a valid person!!");
        }
    }

    @Override
    public void delete(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.delete(customer);
        }
        else{
            System.out.println("Not a valid person!!");
        }

    }
}
