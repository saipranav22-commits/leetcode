class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Integer>st=new Stack<>();
        int max=0;
        for(int i=0;i<=height.length;i++){
            int current=0;
            if(i!=height.length){
                current=height[i];
            }
            while(!st.isEmpty() && current<height[st.peek()]){
               int ind=st.pop();
               int heights=height[ind];
               int width=0;
               if(st.isEmpty()){
                width=i;
               }else{
                width=i-st.peek()-1;
               }
               int area=heights*width;
               max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}