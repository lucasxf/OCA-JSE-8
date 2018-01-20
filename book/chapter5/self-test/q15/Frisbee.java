// Chapter 5, Self-test Question 15
// My answer: D - some will compile and run and throw and exception
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at Frisbee.main(Frisbee.java:12)
// Actual answer: D - none will complete

public class Frisbee {

    //public static void main (String [] args ) {
    //public static void main (String [] args ) throws Exception {
    //public static void main (String [] args )  throws IOException { // won't compile unless IO exception is imported
    public static void main (String [] args ) throws RuntimeException {
        int x = 0;
        System.out.println(7/x);
    }

}
