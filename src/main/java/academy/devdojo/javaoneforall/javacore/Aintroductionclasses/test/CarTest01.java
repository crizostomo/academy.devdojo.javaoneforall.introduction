package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.Model = "Tesla";
        car1.Name = "Model 3";
        car1.Year = 2017;
        car1.TopSpeedKPH = 261;
        car1.PriceIn$ = "45,190.00";

        car2.Model = "NIO";
        car2.Name = "NIO ES8";
        car2.Year = 2018;
        car2.TopSpeedKPH = 200;
        car2.PriceIn$ = "67,783.00";

        System.out.println("Model: " + car1.Model + ", Name: " + car1.Name + ", Year Released: " + car1.Year + ", Top Speed in KPH: " + car1.TopSpeedKPH +
                ", Starting Price: " + car1.PriceIn$);
        System.out.println("\n--------------------------\n");
        System.out.println("Model: " + car2.Model + ", Name: " + car2.Name + ", Year Released: " + car2.Year + ", Top Speed in KPH: " + car2.TopSpeedKPH +
                ", Starting Price: " + car2.PriceIn$);

    }
}
