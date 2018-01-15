// Chapter 5, Self-test Question 1
// My answer: c) "-rg"
// Actual answer: c) "-rg"
public class Flipper {

    public static void main (String[] args) {

        String o = "-";

        switch ("RED".toLowerCase()) {
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
        }
        // will print "-rg"
        System.out.println(o);
    }

 }
