package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

//162 - Collection pt 02 - equals pt 01
//162 - Collection pt 02 - equals pt 02
//164 - Collection pt 04 - hashCode pt 02


public class Smartphone {
    private String serialNumber;
    private String name;

    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    // if x.equals(y) == true y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode, doesn't mean that y.equals(x) == true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) should be false

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode(); // '?' = return and ':' = otherwise
    }

    @Override
    public boolean equals(Object obj){
       if(obj == null) return false;
       if(this == obj) return true;
       if(this.getClass() != obj.getClass()) return false;
        Smartphone otherSmartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(otherSmartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
