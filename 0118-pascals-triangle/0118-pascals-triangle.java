class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        if (numRows == 1) {
            l.add(List.of(1));
            return l;
        }

        l.add(List.of(1));
        l.add(List.of(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);

            for (int j = 1; j < l.get(i - 1).size(); j++) {
                int sum = l.get(i - 1).get(j) + l.get(i - 1).get(j - 1);
                list1.add(sum);
            }

            list1.add(1);
            l.add(list1);
        }

        return l;
    }
}