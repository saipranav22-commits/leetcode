class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0;
        int n=c.length;
        for(int i=0;i<k;i++){
            sum+=c[i];
        }
        int max=sum;
        for(int i=1;i<=k;i++){
            sum+=c[n-i]-c[k-i];
            max=Math.max(max,sum);
        }
    return max;
    }
}