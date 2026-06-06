class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int pre[]=new int[n];
        Arrays.fill(pre,1);
        int end=(int)Math.pow(10,9)+7;
        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){

                pre[j]=(pre[j]+pre[j-1])%end;
            }
        }

        
        return pre[n-1];
    }
}