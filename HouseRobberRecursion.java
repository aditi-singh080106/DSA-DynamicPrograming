class Solution{
  public int amount(int[] house , int i ){
    if(i >= house.length) return 0 ;
    int take = house[i] + amount(house , i+2) ;
    int skip = amount(house ,i+1) ;
    return Math.max(take , skip) ;
  }
  public int houseRobber(int[] house ){
    return amount(house ,0) ;
  }
}
