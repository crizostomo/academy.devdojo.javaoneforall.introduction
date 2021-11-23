package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

//90 - Object Orientation - Polymorphism pt 01 - Setting up
//91 - Object Orientation - Polymorphism pt 02 - How it works

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Tax Value For Computer");
        return this.price * TAX_PERCENTAGE;
    }
}
