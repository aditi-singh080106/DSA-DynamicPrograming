import java.util.Scanner ;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends : ");
        int frnd = sc.nextInt();
        int[] dp = new int[frnd+1];
        dp[1] = 1 ; dp[2] = 2 ;
        for(int i = 3 ; i <= frnd ; i++ ){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        System.out.println("Total number of ways : "+dp[frnd]);
    }
}
