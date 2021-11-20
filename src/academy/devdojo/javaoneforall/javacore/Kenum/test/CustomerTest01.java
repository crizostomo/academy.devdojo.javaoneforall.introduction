package academy.devdojo.javaoneforall.javacore.Kenum.test;

//80 - Object Orientation - Enumeration pt 01 - Introduction
//81 - Object Orientation - Enumeration pt 02 - Attributes and Constructors
//82 - Object Orientation - Enumeration pt 03 - Overriding methods
//83 - Object Orientation - Enumeration pt 04 - Getting enumeration by attribute

import academy.devdojo.javaoneforall.javacore.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Akira", CustomerType.COMPANY, PaymentType.CREDIT);


//        Customer customer1 = new Customer("Tsubasa", "individual");
//        Customer customer2 = new Customer("Tsubasa", "Company");
//        Customer customer3 = new Customer("Tsubasa", "company"); //Duplicated entry
//        Customer customer4 = new Customer("Tsubasa", "INDIVIDUAL"); //Duplicated entry
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType.getReportValue());
    }
}
