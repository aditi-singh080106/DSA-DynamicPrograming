class Solution {
  public int minCostClimbingStairs(int[] cost ){
    int n = cost.length ;
    // if(n <= 1) return Math.min(cost[)
    int[] dp = new int[n] ;
    for(int i = 0 ; i < n ; i++ ){
      dp[i] = cost[i] + Math.min(cost[i-1] , cost[i-2]);
    }
    return Math.min(dp[n-1] , dp[n-2]);
  }
}
