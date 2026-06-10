class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<List<Character>> l = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            l.add(new ArrayList<>());
        }
        int ind = 0;
        int pos = 0;

        for (char c : s.toCharArray()) {
            l.get(pos).add(c);

            if (ind == 0) {
                if (pos == numRows - 1) {
                    ind = 1;
                    pos--;
                } else {
                    pos++;
                }
            } else {
                if (pos == 0) {
                    ind = 0;
                    pos++;
                } else {
                    pos--;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : l) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
}