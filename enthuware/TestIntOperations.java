public class TestIntOperations {
    
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        System.out.println(a);
        int b = -a;
        System.out.println(b);
        int c = +a;
        System.out.println(c);
        int d = -c;
        System.out.println(d);

        int e = 1234567890;
        float f = e;
        System.out.println(f);
        System.out.println(e - (int) f);
    }

}