class Solution {
    public int minimumCost(int[] cost) {
     Arrays.sort(cost);
     int sum=0;
     int c=0;
     for(int i=cost.length-1;i>=0;i--){
       sum+=cost[i];
       c++;
       if(c==3 && sum>=cost[i]){
        System.out.println(cost[i]+" ");
        sum-=cost[i];
        c=0;
       }
     }
     return sum;   
    }
}