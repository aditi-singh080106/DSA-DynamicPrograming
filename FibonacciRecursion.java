public class FibonacciRecurrsion {
    public static void main(String[] args){
        int n = 10; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
    private static int fibonacci(int n){
        if(n==1||n==0) return n ;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
