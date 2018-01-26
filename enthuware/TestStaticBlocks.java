public class TestStaticBlocks {

    public static void main(String[] args) {
        new TestStaticBlocks().doStuff();
    }
    int a;
    int b;
    void doStuff() {
        System.out.println(a);
    }
    static int x = 10;

    static {
        // 11
        System.out.println(++x);
        // 11
        System.out.println(x++);
        // 13
        System.out.println(++x);
        // 13
        System.out.println(x);

        // if ( x > 0)
        // throw new RuntimeException();
    }

}