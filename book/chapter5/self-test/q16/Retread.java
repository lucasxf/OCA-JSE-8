// Chapter 5, Self-test Question 15
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

    void doStuff() {
    //void doStuff() throws MyException {
    //void doStuff() throws RuntimeException {
    //void doStuff() throws ArithmeticException {
        System.out.println(7/0); // Arithmetic Exception
        
    }
    

}