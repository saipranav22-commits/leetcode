class Solution {
    static HashMap<Character,String>map;
    static List<String>res;
    static void bt(String dig,StringBuilder path,int st){
        int n=dig.length();
        if(st==n){
          res.add(path.toString());
          return;
        }
        String s=map.get(dig.charAt(st));
          for(char c:s.toCharArray()){  
            path.append(c);
            bt(dig,path,st+1);
          path.deleteCharAt(path.length()-1);
          }
    }
    public List<String> letterCombinations(String digits) {
        map=new HashMap<>();
        res=new ArrayList<>();
     map.put('2',"abc");
     map.put('3',"def");
     map.put('4',"ghi");
     map.put('5',"jkl");
     map.put('6',"mno");
     map.put('7',"pqrs");
     map.put('8',"tuv");
     map.put('9',"wxyz");
     bt(digits,new StringBuilder(),0);
    return res;
    }
}