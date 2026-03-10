class Solution {
    static void reverse(int[]a){
        int l=0;
        int h=a.length-1;
        while(l<h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }
    static boolean dfs(int mat[],int sum[],int ind,int target){
        if(ind==mat.length){
                if(sum[0]==target && sum[1]==target && sum[2]==target){
                   return true;
                }
            return false;
        }
        
        for(int i=0;i<4;i++){
            if(sum[i]+mat[ind]>target)
            continue;
            sum[i]+=mat[ind];
           if( dfs(mat,sum,ind+1,target))return true;
            sum[i]-=mat[ind];
        }
        return false;
    }
    public boolean makesquare(int[] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i];
        }
        if(sum%4!=0)return false;
        Arrays.sort(mat);
        reverse(mat);
        return dfs(mat,new int[4],0,sum/4);
    }
}