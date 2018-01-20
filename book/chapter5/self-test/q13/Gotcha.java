// Chapter 5, Self-test Question 13
// My answer: B / E /
// Actual answer: B / E
public class Gotcha {

    public static void main (String [] args) {
        // I:
        // new Gotcha().go(); // stack overflow

        // II - stack overflow
        // try {
         //   new Gotcha().go();
        //} catch (Error e) {
         //   System.out.println("ouch");
        //}

        // III - stack overflow
        try {
            new Gotcha().go();
        } catch (Exception e) {
            System.out.println("exception");
        }
    }

    void go() {
        go();
    }

}
