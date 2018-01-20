// Chapter 5, Self-test Question 15
// My answer: D - some will compile and run and throw and exception
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at Frisbee.main(Frisbee.java:12)
// Actual answer: D
public class Frisbee {

    //public static void main (String [] args ) {
    //public static void main (String [] args ) throws Exception {

    // won't compile unless IO exception is imported
    // or declared with its fully qualified name
    //public static void main (String [] args )  throws IOException { 
    public static void main (String [] args ) throws RuntimeException {
        int x = 0;
        System.out.println(7/x);
    }

}
