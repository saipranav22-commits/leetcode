class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count=0;

        int n=patterns.length;

       for(int i=0;i<n;i++){
        String str=patterns[i];
        if(word.contains(str)){
            count++;
        }
       } 
       return count;
    }
}