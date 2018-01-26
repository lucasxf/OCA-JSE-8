public class TestOperators {

    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        b1.append(b2.substring(2, 5).toUpperCase());
        System.out.println("b1: " + b1 + ", b2: " + b2);

        b1 = new StringBuilder("snorkler");
        b2 = new StringBuilder("yoodler");

        b2.insert(3, b1.append("a"));
        System.out.println("b1: " + b1 + ", b2: " + b2);

        b1 = new StringBuilder("snorkler");
        b2 = new StringBuilder("yoodler");

        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        System.out.println("b1: " + b1 + ", b2: " + b2);

        String s = b1.substring(0, 2);
        System.out.println("s "+ s);
        
        float f = 10.5f;
        double d = 10.5d;

        if ( d % f == 0 ) {
            System.out.println("modulus working");
        } else {
            System.out.println("modulus working 2");
        }

        if ( 1.5d % 1.2f == 0) {

        }

        // won't compile, not booleans
        // if ( 1 & 2) {

        // }

        boolean b11 = true;
        boolean b21 = false;

        testPercentOperator();

    }

    static void testPercentOperator() {
        int n = 100;
        int x = 0;
        for ( int i = 51; i < n; i++) {
            x = n % (i);
            n %= i;
            // both will print 49
            System.out.println("x: " + x+ ", " + n);
        }
    }

}