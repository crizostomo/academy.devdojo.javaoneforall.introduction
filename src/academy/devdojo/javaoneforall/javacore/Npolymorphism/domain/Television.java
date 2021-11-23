package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

//92 - Object Orientation - Polymorphism pt 03 - Polymorphic prameters

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Tax Value For Television");
        return this.price * TAX_PERCENTAGE;
    }

}
