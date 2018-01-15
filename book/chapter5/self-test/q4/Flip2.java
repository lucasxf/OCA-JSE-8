// Input: RED Green YeLLow
// Chapter 5, Self-test Question 4
// My answer: e) An exception is thrown at runtime.
// (sa.len > args.len, n will eventually throw a NullPointerException)
// Actual answer: e) An exception is thrown at runtime.
public class Flip2 {

    public static void main (String[] args) {
        
        String o = "-";

        String[] sa = new String[4];

        for ( int i = 0; i < args.length; i++ ) {
            sa[i] = args[i];
        }

        for ( String n : sa ) {
            switch( n.toLowerCase() ) {
                case "yellow": o += "y";
                case "red": o += "r";
                case "green" : o += "g";
            }
        }
        System.out.println(o);

    }

}
