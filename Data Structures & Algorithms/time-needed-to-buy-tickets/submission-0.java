public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int idx = 0;

        int time = 0;
        while (true) {
            time++;
            tickets[idx]--;
            if (tickets[idx] == 0) {
                if (idx == k) {
                    return time;
                }
            }
            idx = (idx + 1) % n;
            while (tickets[idx] == 0) {
                idx = (idx + 1) % n;
            }
        }
    }
}