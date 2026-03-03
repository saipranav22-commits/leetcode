class Solution {
    static  List<String>res;
    static void com(HashMap<Character,String>map,String dig,int st,StringBuilder path){
     if(st==dig.length()){
        res.add(path.toString());
        return;
     }
     String x=map.get(dig.charAt(st));
     for(char c:x.toCharArray()){
        path.append(c);
    com(map,dig,st+1,path);
     path.deleteCharAt(path.length()-1);
     }
    }
    public List<String> letterCombinations(String digits) {
       res=new ArrayList<>();
        HashMap<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        com(map,digits,0,new StringBuilder());
        return res;
    }
}