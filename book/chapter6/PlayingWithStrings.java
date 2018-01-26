public class PlayingWithStrings {

    public static void main(String[] args) {
        String x = "a"; // created a new string object - 1
        x.concat("b"); // created another string object "ab" (x is still equals to "a") - 2
        x.replace('a', 'Z'); // another one "Z" - 3
        x.concat("x").concat("Y").replace('x', 'K'); // 3 new ones: "ax" | "axY" | "aKY" - 4,5, 6
        new String(); // another one "" - 7
        new String("a"); // 8 "a"
        x = new String(); // 9 ""
        x = x.concat("abc"); // 10 "abc"
        x.toUpperCase(); // 11 - "ABC" (x equals to "abc")
        x.toLowerCase(); // not quite sure whether it's another one or the same
        x.trim(); // another

        // another test
        String s1 = "spring "; // 1 object "spring ", 1 reference variable
        String s2 = s1 + "summer "; // 2 objects "spring " and "spring summer ", 2 references
        s1.concat("fall "); // 3 objects: "spring ", "spring summer ", "spring fall ", 2 references
        s2.concat(s1); // 4 objects: "spring ", "spring summer ", "spring fall " and "spring summer spring ", 2 references
        s1 += "winter "; // 5 objects: "spring ", "spring summer ", "spring fall ", "spring summer spring ", "spring winter ", 2 references

        // My answer: 5 objects and 2 references.
        // Actual answer: 8 objects and 2 references.
        // Solutions:
        
        // objects created: 8 - wrong!
        // objects:
        // line 1 (1): "spring ", 
        // line 2 (2): "summer " (lost), "spring summer ", 3
        // line 3 (2): "fall " (lost), "spring fall " (lost), 5
        // line 4 (1): "spring summer spring " (lost), 6
        // line 5 (2): "winter " (lost), "spring winter " (then "spring " becomes lost), 8
        
        // prints: "spring winter  spring summer " Correct!
        System.out.println(s1 + " " + s2); 
        
        String y = "asdf"; // creates a String object in the pool, than refers 'a' to it.
        String b = new String("qwert"); // creates a String object, refers 'b'to it, than sends it to the pool.
        
        String a1 = "a1";
        String a2 = new String("a1");

        // a1 == a2 prints false because '==' compares object reference
        // prints 'false'
        System.out.println("a1==a2: " + a1 == a2);
        
        // prints 'a1==a2: false'
        System.out.println("a1==a2: " + (a1 == a2));
        
        // a1.equals(a2) prints false because str.equals() compares object data
        // prints 'true'
        System.out.println("a1.equals(a2)?: " + a1.equals(a2));
        
        // prints 'a1.equals(a2)?: true'
        System.out.println("a1.equals(a2)?: " + (a1.equals(a2)));
        
        // prints true 
        System.out.println("a1: " + a1  + ", a2: " + a2 + ", a1 == a2?: " + (a1.equals(a2)));
        a1 = a1.toUpperCase();

        // prints false (a1 is now referring to another object)
        System.out.println(a1 == a2);
        
        StringBuilder strBuilder = new StringBuilder("qwert");
        StringBuilder strBuilder2 = strBuilder;

        // prints true
        System.out.println("str builders " + (strBuilder == strBuilder2));
        strBuilder.append(" - xpto");

        // still prints true (StringBuilder objects are mutable, 
        // so there's no new object creation on append())
        System.out.println(strBuilder == strBuilder2);

        System.out.println("a1 - " + a1);
        System.out.println("a1.toString() - " + a1.toString());

        System.out.println("a2 - " + a2);
        System.out.println("a2.toString() - " + a2.toString());
    }
}