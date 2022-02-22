package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

//247 - Design Patterns pt 02 - Factory

public interface Currency {
    String getSymbol();
}

class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
