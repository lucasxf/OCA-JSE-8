// Chapter 5, Self-test Question 8
// My answer 1: G) Compilation fails.
// My answer 2: D) "9 10 10 d 13" (static block runs before main method)
// Actual answer: D) Partially correct.
public class Ebb {

    static int x = 7;
    static int y = 0;
    public static void main (String[] args) {
        System.out.println("Main method");
        System.out.println("y: " + y);
        String s = "";
        new Ebb();
        for ( int y = 0; y < 3; y++ ) {
            x++;
            switch(x) {
                case 8: s += "8 ";
                case 9: s += "9 ";
                case 10: {
                    s += "10 ";
                    break;
                }
                default: s += "d ";
                case 13: s += "13 ";
            }
        }
        System.out.println(s);
    }
    
    static {
        System.out.println("static block");
        x++;
        {
            System.out.println("inner block within static block");
        }
    }

    {
        // only runs when Ebb instance is created.
        System.out.println("regular block");
        y ++;

        // static within another block won't ever run.
        //static {

        //}
    }

}
