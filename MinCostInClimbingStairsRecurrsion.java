class Solution {
    public int tcost(int[] cost , int i){
        if(i <= 1) return cost[i] ;
        return cost[i] + Math.min(tcost(cost , i-1) , tcost(cost ,i-2)) ; 
    }
        public int minCostClimbingStairs(int[] cost) {
          int n = cost.length ;
          return Math.min(tcost(cost , n-1) ,tcost(cost , n-2) );
        }
}
