// Chapter 5, Self-test Question 2
// My answer: h) Compilation fails. (void s2 without try/throw)
// Actual answer: h) Compilation fails.
class Plane {

    static String s = "-";

    public static void main (String[] args) {
        new Plane().s1();
        System.out.println(s);
    }

    void s1() {
        try { s2(); }
        catch( Exception e) { s += "c"; }
    }

    void s2() {
        s3(); s += "2";
        s3(); s += "2b";
    }

    void s3() throws Exception {
        throw new Exception();
    }

}