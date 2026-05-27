class Solution {
    public int numberOfSpecialChars(String word) {
        
        int n = word.length();
        int ans = 0;

        int[] map = new int[52];

        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                map[c - 'a'] = i;
            } else {
                map[c - 'A' + 26] = i;
            }
        }

        boolean[] set = new boolean[26];

        for (int i = 0; i < n; i++) {

            char c = word.charAt(i);

            if (Character.isUpperCase(c)) {

                char ch = Character.toLowerCase(c);

                if (map[ch - 'a'] != -1 &&
                    map[ch - 'a'] < i &&
                    !set[c - 'A']) {

                    ans++;
                }

                set[c - 'A'] = true;
            }
        }

        return ans;
    }
}