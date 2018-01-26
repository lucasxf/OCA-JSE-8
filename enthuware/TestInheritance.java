import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestInheritance {

    public static void main(String[] args) {
        
    }

}
class MyClass1 {

    public MyClass1() {

    }

    void doSomething() throws MyException {

    }
}
class MyException extends Exception {

}
class AnotherException extends Exception {

}
class MySubException extends MyException {

}

class MyClass2 extends MyClass1 {

    @Override
    // won't compile, Exception is broader than MyException
    // public void doSomething() throws Exception {
    
    // won't compile, AnotherException doesn't belong
    // in MyException inheritance tree
    // public void doSomething() throws AnotherException {
    
    // compiles because MySubException IS-A MyException
     public void doSomething() throws MySubException {
        try {

        } catch(RuntimeException e) {
            LocalDate ld;
            LocalDateTime ldt;
            LocalTime lt;
        }
    }
}

abstract class Abstract1 {
    
}

abstract class Abstract2 extends Abstract1 {

}

abstract class Abstract3 extends TestInheritance {

}

interface Interface1 {
 void asdf();
}

interface Interface2 extends Interface1 {

}

abstract class Abstract4 implements Interface1 {
    void doStuff(){} ;
}