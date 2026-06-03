class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int totalodd=0;
        int totaleven=0;

        int oddsum=0;
        int evensum=0;

        int c=0;

        for(int i=0;i<n;i++){
          if(i%2==0){
            totaleven+=nums[i];
          }else{
            totalodd+=nums[i];
          }
        }

        for(int i=0;i<n;i++){
            if(i%2==0){
                int odd=totaleven-(nums[i]+evensum);
                int even=totalodd-oddsum;
                if(even+evensum==odd+oddsum){
                    c++;
                }
                evensum+=nums[i];
            }else{
                int even=totalodd-(nums[i]+oddsum);
                int odd=totaleven-evensum;
                if(odd+oddsum==even+evensum){
                    c++;
                }
                oddsum+=nums[i];
            }
        }
        return c;
    }
}