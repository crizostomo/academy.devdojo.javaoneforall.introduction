package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

//191 - Inner classes pt 03 - Anonymous classes

class Animal {
    public void walk(){
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog Walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Smt is walking");
            }
        };
        animal.walk();
    }
}
