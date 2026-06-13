class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
       boolean a[]=new boolean[n];
       for(int i=2;i<n;i++){
        a[i]=true;
       } 
       for(int i=2;i*i<n;i++){
        if(a[i]){
            for(int j=i*i;j<n;j=j+i){
                a[j]=false;
            }
        }
       }
       int count=0;
       for(int i=2;i<n;i++){
        if(a[i]){
            count++;
        }
       }
       return count;
    }
}