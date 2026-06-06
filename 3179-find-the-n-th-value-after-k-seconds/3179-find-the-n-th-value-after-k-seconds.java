class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int pre[]=new int[n];
        Arrays.fill(pre,1);

        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){
                pre[j]=(pre[j]+pre[j-1])%1000000007;
            }
        }

        
        return pre[n-1];
    }
}