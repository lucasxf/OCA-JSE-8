class Infinity {

}

public class Beyond extends Infinity {
    static Integer i;

    public static void main (String[] args) {
        int sw = (int) (Math.random() * 3);
        switch(sw) {
            case 0: {
                for ( int x = 10; x > 5; x++ ) {
                    if ( x > 1000000) // Stack overflow
                        x = 10;
                        break;
                }
            }
            case 1: {
                int y = 7 * i; break; // Null Pointer
            }
            // not quite sure whether this case 2
            // will compile and run fine or not.
            case 2: {
                Infinity inf = new Beyond();
                Beyond bey = (Beyond) inf;
            }

        }
    }
}