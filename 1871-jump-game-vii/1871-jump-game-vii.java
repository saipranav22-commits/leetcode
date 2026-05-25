class Solution {
    public boolean canReach(String str, int minJump, int maxJump) {
        if(str.charAt(str.length()-1)=='1') return false;
        List<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='0'){
                int start=i-maxJump,end=i-minJump;
                int s=0,e=list.size()-1;
                boolean found=false;
                while(s<=e){
                    int m=(s+e)/2;
                    if(start<=list.get(m) && list.get(m)<=end){
                        found =true;
                        break;
                    }
                    else if(list.get(m)<start){
                        s=m+1;
                    }
                    else{
                        e=m-1;
                    }
                }
                if(found){
                    list.add(i);
                }
            }
        }
        return list.get(list.size()-1)==str.length()-1?true:false;
    }
}