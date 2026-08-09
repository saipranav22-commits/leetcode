class Solution {
    static boolean vis[];
    static int count;
    public static boolean back(int nums[],int k,int d,int n,int sum,int st){
       
       if(count==k-1)return true;
       if(sum==d){
        count++;
        if(back(nums,k,d,n,0,0)){
        return true;
        }
        count--;
        return false;
       }

    for(int i=st;i<n;i++){
    if(sum+nums[i]>d)continue;
    if(vis[i])continue;


        if(i>0 && nums[i]==nums[i-1] && !vis[i-1])continue;

        vis[i]=true;

        if(back(nums,k,d,n,sum+nums[i],i+1))return true;

        vis[i]=false;
    }
    
    return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        vis=new boolean[n];

        if(sum%k!=0)return false;
        Arrays.sort(nums);
        int d=sum/k;

        return back(nums,k,d,n,0,0);
    }
}