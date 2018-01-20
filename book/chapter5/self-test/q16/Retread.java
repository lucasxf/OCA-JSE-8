// Chapter 5, Self-test Question 16
// My answer: B / D
// Actual answer: 
class MyException extends Exception {

}

class Tire {
    void doStuff() {

    }
}

public class Retread extends Tire {

    public static void main (String[] args) {
        new Retread().doStuff();
    }

    void doStuff() { // compiles (not and overload, but an overriding method)
    //void doStuff() throws MyException { // won't compile (broader exception)
    //void doStuff() throws RuntimeException { // compiles (Runtime exceptions may be thrown anyway)
    //void doStuff() throws ArithmeticException { // compiles (runtime exception child)

        System.out.println(7/0); // Arithmetic Exception
        
    }
    

}