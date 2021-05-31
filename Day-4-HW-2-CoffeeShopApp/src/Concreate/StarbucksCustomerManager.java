package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

    private ICustomerCheckService cusCustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
    {
        super();
        this.cusCustomerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer)
    {
        if(this.cusCustomerCheckService.CheckIfRealPerson(customer))
        {
            super.save(customer);
        }

        else
        {
            System.out.println("Not a valid person...");
        }


    }


}
