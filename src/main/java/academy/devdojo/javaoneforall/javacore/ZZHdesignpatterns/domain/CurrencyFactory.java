package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

//247 - Design Patterns pt 02 - Factory

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No Currency for the given country");
        }
    }
}
