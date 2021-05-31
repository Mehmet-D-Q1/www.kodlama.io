package com.company;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {



        BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());

        baseCustomerManager1.save(new Customer(1, "Mehmet", "DERİN" , 1992,"125986322"));



    }
}
