// Chapter 5, Self-test Question 7
// My answer: C / D / E - Compilation fails.
// Actual answer: C - Compilation fails. Partially correct.
class SubException extends Exception { }
class SubSubException extends SubException { }

public class CC {
    void doStuff() throws SubSubException {

    }
}

class CC2 extends CC {
    void doStuff() throws SubSubException {

    }
}

class CC3 extends CC {
    // Broader exception than exception thrown at superclass
    // won't compile
    //void doStuff() throws Exception {
        
    //}
}

class CC4 extends CC {
    // Broader exception in overloaded method. 
    // Compiles just fine.
    void doStuff(int x) throws Exception {

    }
}

class CC5 extends CC {
    // Inherits exception from superclass.
    // compiles fine.
    void doStuff() {

    }
}
