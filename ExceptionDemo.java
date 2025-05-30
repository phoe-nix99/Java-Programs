public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            
            // Code that might throw an exception

            
            int result = 10 / 0;                            // This will cause an ArithmeticException
                                    
            System.out.println("Result: " + result);         // This line won't be reached
        } 
        
        catch (ArithmeticException e) {

            // Code to handle the specific exception

            System.err.println("Error: Cannot divide by zero!");

            System.err.println("Exception details: " + e.getMessage());

        } finally {

            // Code that will always execute, regardless of exception

            System.out.println("Finally block executed. Cleanup operations here.");
        }
        
        System.out.println("Program continues after exception handling.");
    }
}

