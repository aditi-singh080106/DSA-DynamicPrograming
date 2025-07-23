class Solution{
  public int mincost(int[] cost , int idx , int[] dp){
    if(idx<=1) return cost[idx] ;
    if(dp[idx] != -1) return dp[idx];
    return dp[idx] = cost[idx] + Math.min(mincost(cost , idx-1 , dp) , mincost(cost , idx-2 , dp));
  }
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length ;
    int[] dp = new int [n];
    Arrays.fill(dp,-1);
    return Math.min(mincost(cost, n-1 , dp) , mincost(cost , n-2 , dp)) ;
  }
}
