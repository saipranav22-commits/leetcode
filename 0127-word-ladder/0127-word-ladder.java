class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      HashSet<String>set=new HashSet<>(wordList);
      if(!set.contains(endWord)){
        return 0;
      }  
      Queue<String>q=new LinkedList<>();
    int steps=1;
    q.add(beginWord);
    while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
            String word=q.poll();
            if(endWord.equals(word)){
                return steps;
            }
            for(int j=0;j<word.length();j++){
              for(int c='a';c<='z';c++){
                char a[] = word.toCharArray();
                a[j] = (char) c;
                String str = new String(a);
                if(set.contains(str)){
                q.add(str);
                set.remove(str); 
                } 
              }
            }
        }
        steps++;
    }
    return 0;
    }
}