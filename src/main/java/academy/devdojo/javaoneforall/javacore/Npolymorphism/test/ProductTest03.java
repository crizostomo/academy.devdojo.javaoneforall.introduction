package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

//93 - Object Orientation - Polymorphism pt 04 - Cast and instanceof

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.ProductTaxReport;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Dutch", 6);
        tomato.setBestConsumedBefore("11/21/2021");

        ProductTaxReport.generateTaxReport(tomato);

        System.out.println("----------------");

        ProductTaxReport.generateTaxReport(product);

    }
}
