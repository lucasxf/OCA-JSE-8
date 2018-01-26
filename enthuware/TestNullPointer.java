public class TestNullPointer {

    // missing public static void main()
    static {
        // won't compile, initializer must be able to complete normally
        throw new NullPointerException();
    }
}