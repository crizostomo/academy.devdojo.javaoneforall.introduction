package academy.devdojo.javaoneforall.javacore.ZZKjunit.domain;

//284 - Pattern Matching for instanceof

public class Developer extends Employee{
    private String mainLnaguage;

    public Developer(String id, String mainLnaguage) {
        super(id);
        this.mainLnaguage = mainLnaguage;
    }

    public String getMainLnaguage() {
        return mainLnaguage;
    }
}
