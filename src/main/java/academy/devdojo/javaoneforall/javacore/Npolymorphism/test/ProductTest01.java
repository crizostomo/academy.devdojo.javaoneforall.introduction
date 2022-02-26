package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

//90 - Object Orientation - Polymorphism pt 01 - Setting up
//92 - Object Orientation - Polymorphism pt 03 - Polymorphic prameters
//93 - Object Orientation - Polymorphism pt 04 - Cast and instanceof

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReport;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        Television television = new Television("Samsung 50\"", 2500);
        ProductTaxReport.generateTaxReport(computer);
        System.out.println("----------------------------");
        ProductTaxReport.generateTaxReport(tomato);
        System.out.println("----------------------------");
        ProductTaxReport.generateTaxReport(television);
    }
}
