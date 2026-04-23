public class ScopeDemo {

    public static void main(String[] args) {

        
        int methodVar = 10;
        System.out.println("Method Variable: " + methodVar);

        
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 2;
            System.out.println("Loop Variable (i): " + i);
            System.out.println("Loop Variable (loopVar): " + loopVar);
        }

        //  ERROR: loop variables not accessible outside loop
        // System.out.println(i);        // ERROR
        // System.out.println(loopVar);  // ERROR


        
        {
            int blockVar = 50;
            System.out.println("Block Variable: " + blockVar);
        }

        // ERROR: blockVar not accessible outside block
        // System.out.println(blockVar); 


        System.out.println("Using methodVar again: " + methodVar);
    }
}