// Chapter 5, Self-test Question 14
// My answer: E - line 5 won't compile (not a final type or literal)
// Actual answer: E
public class Q14 {

    public static final String asdf = "";
    
    public static void main (String [] args ) {
        String s = "bob";
        final String xpto = "asd";

        switch ("abc") {
            case xpto:
            break;
            
            case "a"  + "b":
            break;
            
            case asdf:
            break;

            case s: // compilation error. Not a constant
            break;
        }
    }
}