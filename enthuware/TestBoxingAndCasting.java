public class TestBoxingAndCasting {

    public static void main(String[] args) {
        short s = Short.MAX_VALUE;

        // won't compile, explicit cast required
        // char c = s;

        char c = (char) s;
        // prints true (char > short )
        // short = 8 bits, char = 16 bits
        // short "fits" into char
        System.out.println(c == Short.MAX_VALUE);

        new TestBoxingAndCasting().testSwitch();
    }

    final static int i_s = 123;
    final static boolean bool_s = false;
    final static byte b_s = 0x10;
    final static char c_s = 'x';
    final static float f_s = 999f;

    void testSwitch() {
        int i = 1_000_000;
        char c = 'b';
        // int switch, char case - OK
        // 
        switch(i) {
            case 'a':
            break;
            case c_s:
            break;
        }

        switch(c_s) {
            case 'a':
            break;
            case 10:
            break;
            case i_s:
            break;
            case 'x':
            System.out.println("working");
            break;
        }

        float f = 999_999_999F;
        // float switch, int case - compiler error, 
        // possible lossy conversion from float (32 bits) to int (also 32 bits)
        // switch(f) {
        //     case f_s:
        //     break;
            // case 1:
            // break;
            // case i_s:
            // break;
        // }

        byte b = 0x10;
        // byte switch, float case - compiler error, 
        // possible lossy conversion from float (32 bits) to byte (8 bits)
        switch(b) {
            // case f_s:
            // break;
            // case 1.05f:
            // break;
        }
        // switch to char, case byte - OK (both integers, char > byte)
        switch(c) {
            case b_s:
            break;
        }

        // switch to byte, case char - also ok, both integers
        switch(b) {
            case c_s:
            break;
        }

        boolean bool = true;
        // won't compile, switch statements
        // only work with string or integer literals
        // switch (bool) {
        //     case false:
        //     break;
        //     case bool_s:
        //     break;
        // }

        // won't compile. 
        // although long is an integer type, 
        // it's way bigger than int
        // long l = 99;
        // switch(l) {

        // }
        switch(i_s) {

        }
        System.out.println("done!");

        // compiles fine, long = 64 bits, char = 16
        long l2 = 'a'; // long to char: implicit.
        
        // won't compile, char is smaller than long, 
        //so it requires an explicit cast
        // char c2 = 99L; // char to long: implicit

        // explicit type cast. Compiles (and runs) fine
        char c3 = (char) l2;
        System.out.println(c3);
        l2 = c3;

        short s2 = 99;
        byte b2 = (byte) s2;

        s2 = 'x';
        // requires casting
        // char c4 = s2;
        
        double xpto = 0xFF;

        Object ob = new Object();
        String castObj = (String) ob;
    }
}