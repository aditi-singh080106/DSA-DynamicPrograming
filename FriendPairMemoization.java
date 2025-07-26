import java.util.Scanner ;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends : ");
        int frnd = sc.nextInt();
        int[] dp = new int[frnd+1];
        Arrays.fill(dp,-1);
        System.out.println("Total number of ways : "+pair(frnd,dp));
    }
    private static int  pair(int n , int[] dp){
        if(n <= 2) return n ;
        if(dp[n] != -1) return dp[n];
        return dp[n] = pair(n-1,dp) + (n-1)*pair(n-2,dp);
        
    } 
}
