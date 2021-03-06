package academy.devdojo.javaoneforall.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//284 - Pattern Matching for instanceof

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        if(employeeDeveloper instanceof  Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLnaguage());
        }
        if(employeeDeveloper instanceof Developer dev){
            Assertions.assertEquals("Java", dev.getMainLnaguage());
        }
    }
}