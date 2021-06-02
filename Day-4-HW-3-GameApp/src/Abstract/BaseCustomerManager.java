package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager  implements ICustomerService{
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName()+ customer.getLastName() + " tebrikler kaydınız tamamlanmıştır.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + customer.getLastName() + " bigileriniz başarılı bir şekilde güncellenmiştir.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + customer.getLastName() + " bilgileriniz başarılı bir şekilde silinmiştir.");
    }
}
