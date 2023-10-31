public class Start {
    public static void main(String[] args) {
        try { 
            //System.out.println(1/0); // throw bad math
            IntVector test = new IntVector();
    
            System.out.println("Size: " + test.size()); // Size: 0
    
            for(int i = 0; i < 20; i++) {
                test.add(i*2);
            }

            System.out.println(test); // [0,19]

            //set first value to 50, shift everything right
            test.add(0,50);
            System.out.println(test); // [50, 0, 1, 2, ...19]
            
            //remove the first zero value found at index 1
            test.remove(0); // [50, 1, 2, ... 19]

        } catch(IllegalArgumentException ex) {
            System.out.println("That's illegal!");
        } catch(ArithmeticException ex) {
            System.out.println("Bad Math");
        } catch(Exception ex) {
            System.out.println("Generic Exception");
        }
    }
}