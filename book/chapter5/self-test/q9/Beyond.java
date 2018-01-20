// Chapter 5, Self-test Question 8
// My answer: A / B / D / F. Compilation fails / ClassCastEx / NullPointer / non completion.
// Actual answer: D - NullPointer. Partially correct, mostly wrong, though.
class Infinity {

}

public class Beyond extends Infinity {
    static Integer i;

    public static void main (String[] args) {
        int sw = (int) (Math.random() * 3);
        System.out.println(sw);
        switch(sw) {
            case 0: {
                for ( int x = 10; x > 5; x++ )
                    if ( x > 1000000) // Endless loop, not Stack overflow
                        x = 10;
                        break;
                        // unreachable code. 
                        //The break will break outside the loop 
                        // as well as the case statement.
                        //System.out.println("is this even reachable?");
                
                //System.out.println("broke");
            }
            case 1: {
                int y = 7 * i; break; // Null Pointer
            }
            // not quite sure whether this case 2
            // will compile and run fine or not.
            case 2: {
                Infinity inf = new Beyond();
                Beyond bey = (Beyond) inf;
                System.out.println("inf: " + inf);
                System.out.println("bey: " + bey);
            }
        }
        System.out.println("acabou");
    }
}