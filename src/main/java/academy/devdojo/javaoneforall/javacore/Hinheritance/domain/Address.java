package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

//71 - Object Orientation - Inheritance pt 01
//73 - Object Orientation - Inheritance pt 03 - protected
public class Address {
    private String street;
    private String zipcode;
    public void print(){
        Employee e = new Employee("Sasa");
        e.name = "Sasa";
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
