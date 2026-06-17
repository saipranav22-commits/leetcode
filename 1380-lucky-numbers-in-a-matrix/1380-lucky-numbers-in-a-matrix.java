class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int c=0;

        List<Integer>res=new ArrayList<>();

        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    c=j;
                }
            }

            for(int j=0;j<n;j++){
                if(max<matrix[j][c]){
                    max=matrix[j][c];
                }
            }
            if(max==min){
                res.add(max);
            }
        }
        return res;
    }
}