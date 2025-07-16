public class test {
    
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");
        System.out.println("This is a test build.");
        
        int result = addNumbers(5, 7);
        System.out.println("5 + 7 = " + result);
        
        if (result == 12) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
