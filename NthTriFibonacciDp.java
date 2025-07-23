class Solution{
  public int nfibo(int n , int[] dp){
    if(n<=2) return n ;
    if(dp[n] != 0 ) return dp[n];
    return dp[n] = nfibo(n-1) + nfibo(n-2) + nfibo(n-3) ;
  }
  public int ntrifibonacci(int n){
    int[] dp = new int[n+1] ;
    dp[0] = 0 , dp[1] = 1 , dp[2] = 1 ;
    return nfibo(n,dp);
  }
}
