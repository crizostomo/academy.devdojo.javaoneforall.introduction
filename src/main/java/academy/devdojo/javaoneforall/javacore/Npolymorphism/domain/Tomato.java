package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

//90 - Object Orientation - Polymorphism pt 01 - Setting up
//91 - Object Orientation - Polymorphism pt 02 - How it works

public class Tomato extends Product{
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumedBefore;
    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Tax Value For Tomato");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
