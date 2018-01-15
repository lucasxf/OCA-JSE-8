// Chapter 5, Self-test Question 5
// My answer: A / E / F
// Actual answer: A / D / F - Partially correct.
class Loopy {

    public static void main ( String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        
        // C (won't compile)
        // int a = 0;
        // for (a : x) {
           // System.out.println(a);
        // }

        // D (my answer: won't compile):
        // Actual answer: compiles and runs just fine.
        for ( int y = 0, z = 0; z < x.length; z++) {

        }

        // E (my answer: compiles and runs)
        // Actual anser: won't compile 
        // (cannot explicitly state more than one variable type at the init block)
        //for ( int y = 0, int z = 0; z < x.length; z++) {

        // }

        // F (my answer: compiles and runs fine)
        // Actual answer: the same
        int y = 0; for ( int z = 0; z < x.length; z++ ) { }
    }

}
