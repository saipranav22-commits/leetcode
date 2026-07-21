class Solution {
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int sum = 0;

        for (int i : machines) {
            sum += i;
        }
        if (sum % n != 0) {
            return -1;
        }
        int k = sum / n;
        int move = 0, bal = 0;
        for (int i : machines) {
            int rem = i - k;
            bal += rem;

            move = Math.max(move, Math.max(Math.abs(bal), rem));

        }

        return move;
    }
}