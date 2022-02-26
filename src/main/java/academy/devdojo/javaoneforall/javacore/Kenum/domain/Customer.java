package academy.devdojo.javaoneforall.javacore.Kenum.domain;

//80 - Object Orientation - Enumeration pt 01 - Introduction
//81 - Object Orientation - Enumeration pt 02 - Attributes and Constructors
//82 - Object Orientation - Enumeration pt 03 - Overriding methods

public class Customer {

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType" + customerType.getReportValue() +
                ", customerTypeDatanaseValue=" + customerType.getDbValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    //    private String type;
//    public static final String INDIVIDUAL = "INDIVIDUAL";
//    public static final String COMPANY = "COMPANY";
//
//
//    public Customer(String name, String type) {
//        if (!type.equals(INDIVIDUAL) && !type.equals(COMPANY)){
//            return;
//        }
//        this.name = name;
//        this.type = type;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }
}
