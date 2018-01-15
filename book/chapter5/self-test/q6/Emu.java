// Chapter 5, Self-test Question 6
// My answer: E) "-ic mc mf of"
// Actual answer: E) "-ic mc mf of".
class Emu {

    static String s = "-";
    
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch ( Exception e) {
            try {
                try {
                    throw new Exception();    
                } catch (Exception ex) {
                    s += "ic ";
                }
                throw new Exception();
            } catch (Exception x) {
                s += "mc ";
            } finally {
                s += "mf ";
            }
        } finally {
            s += "of ";
        }
        System.out.println(s);
    }
    
}
