package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
//    private static double speedLimit = 250;
    private static double speedLimit = 250;


    //"static" says that the speedlimit belongs to carclass and not to the object

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("----------------");
        System.out.println("Name " + this.name);
        System.out.println("Max Speed " + this.maxSpeed);
//        System.out.println("Speed Limit " + this.speedLimit);
//        By doing "Car.speedLimit" you are acessing something that belongs to
//        the class and not the instance
        System.out.println("Speed Limit " + Car.speedLimit);
    }

    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }
    public static double getSpeedLimit(){
        return Car.speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

//    public double getSpeedLimit() {
//        return speedLimit;
//    }
//
//    public void setSpeedLimit(double speedLimit) {
//        this.speedLimit = speedLimit;
//    }
}
