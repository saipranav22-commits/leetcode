class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            int area=right-left;
            res=Math.max(area*min,res);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return res;
    }
}