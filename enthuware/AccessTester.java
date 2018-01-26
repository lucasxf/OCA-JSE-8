package b;

import a.TestAccess;

// remeber to add '-d' option in javac
// javac -d . AccessTester.java
public class AccessTester {

    public static void main(String[] args) {
        System.out.println("running");
        TestAccess testAccess = new TestAccess();
        System.out.println("b: " + testAccess.b);
        // error: protected access (package & inheritance only) in class TestAccess
        // System.out.println(testAccess.d());
    }
}