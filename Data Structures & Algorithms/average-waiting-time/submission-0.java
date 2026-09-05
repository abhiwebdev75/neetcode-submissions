public class Solution {
    public double averageWaitingTime(int[][] customers) {
        long t = 0, total = 0;

        for (int[] c : customers) {
            int arrival = c[0], order = c[1];
            t = Math.max(t, arrival) + order;
            total += t - arrival;
        }

        return (double) total / customers.length;
    }
}