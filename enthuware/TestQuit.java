public class TestQuit {

    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.println("já quitou?");
        }
    }
}