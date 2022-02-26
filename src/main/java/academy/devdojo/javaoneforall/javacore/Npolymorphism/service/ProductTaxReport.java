package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

//90 - Object Orientation - Polymorphism pt 01 - Setting up
//92 - Object Orientation - Polymorphism pt 03 - Polymorphic prameters
//93 - Object Orientation - Polymorphism pt 04 - Cast and instanceof

//import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;
//import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReport {
//    public static void generateComputerTaxReport(Computer computer) {
//        System.out.println("Starting the report for Computer");
//        double taxValue = computer.calculateTaxValue();
//        System.out.println("Computer " + computer.getName());
//        System.out.println("Price " + computer.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }
//
//    public static void generateTomatoTaxReport(Tomato tomato) {
//        System.out.println("Starting the report for Tomato");
//        double taxValue = tomato.calculateTaxValue();
//        System.out.println("Tomato " + tomato.getName());
//        System.out.println("Price " + tomato.getPrice());
//        System.out.println("Tax Value " + taxValue);
//    }

    public static void generateTaxReport(Product product){
        System.out.println("Starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: "+product.getName());
        System.out.println("Price: "+product.getPrice());
        System.out.println("Tax Value: "+taxValue);

//      We need to enforce the command, because computer and television can also
//      be a product, therefore we need to use "Tomato" in ()

        if(product instanceof Tomato) {
//            Tomato tomato = ((Tomato) product);
            System.out.println(((Tomato) product).getBestConsumedBefore());
        }
    }
}
