class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int fre[]=new int[A.length+1];
        int res[]=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            fre[A[i]]++;
            if(fre[A[i]]==2){
                 count++;
             }
            fre[B[i]]++;
             if(fre[B[i]]==2){
                 count++;
             }
             res[i]=count;
        }
        return res;
    }
}