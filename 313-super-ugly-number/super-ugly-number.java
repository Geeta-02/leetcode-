class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
      int[] ugly = new int[n];
        ugly[0] = 1;
        int[] index = new int[primes.length];
        long[] values = new long[primes.length];
        Arrays.fill(values, 1);
        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                values[j] = (long) ugly[index[j]] * primes[j];
                next = Math.min(next, values[j]);
            }
            ugly[i] = (int) next;

            for (int j = 0; j < primes.length; j++) {
                if (values[j] == next) {
                    index[j]++;
                }
            }
        }
        return ugly[n - 1];
    }
}