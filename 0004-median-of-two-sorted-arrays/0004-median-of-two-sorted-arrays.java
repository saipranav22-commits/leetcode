class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int n=nums1.length;
        int m=nums2.length;
        int low=0;
        int high=n;
        while(low<=high){
         int part1=(low+high)/2;
         int part2=(n+m+1)/2-part1;
         int maxleft1=Integer.MIN_VALUE;
         int minright1=Integer.MAX_VALUE;
         int maxleft2=Integer.MIN_VALUE;
         int minright2=Integer.MAX_VALUE;
         if(part1!=0){
            maxleft1=nums1[part1-1];
         }
         if(part1!=n){
            minright1=nums1[part1];
         }
         if(part2!=0){
           maxleft2=nums2[part2-1];
         }
         if(part2!=m){
           minright2=nums2[part2];
         }
         if (maxleft1 <= minright2 && maxleft2 <= minright1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxleft1, maxleft2) + Math.min(minright1, minright2)) / 2.0;
                } else {
                    return (double) Math.max(maxleft1, maxleft2);
                }
            } else if (maxleft1 > minright2) {
                high = part1 - 1;
            } else {
                low = part1 + 1;
            }
        }
        return 0.0;    
    }
}