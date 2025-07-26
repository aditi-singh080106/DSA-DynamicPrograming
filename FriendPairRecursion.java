import java.util.Scanner ;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends : ");
        int frnd = sc.nextInt();
        System.out.println("Total number of ways : "+pair(frnd));
    }
    private static int  pair(int n){
        if(n <= 2) return n ;
        return pair(n-1) + (n-1)*pair(n-2);
    } 
}
