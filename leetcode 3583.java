class Solution {
    public int specialTriplets(int[] nums) {
         final int MOD = 1000000007;
        int n = nums.length;
        Map<Integer, Integer> countRight = new HashMap<>();
        for (int num : nums) {
            countRight.put(num, countRight.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> countLeft = new HashMap<>();

        long ans = 0;

        for (int j = 0; j < n; j++) {
            int mid = nums[j];
            countRight.put(mid, countRight.get(mid) - 1);
            if (countRight.get(mid) == 0) {
                countRight.remove(mid);
            }
            int target = 2 * mid;
            long leftCount = countLeft.getOrDefault(target, 0);
            long rightCount = countRight.getOrDefault(target, 0);
            ans = (ans + (leftCount * rightCount) % MOD) % MOD;
            countLeft.put(mid, countLeft.getOrDefault(mid, 0) + 1);
        }
        return (int) ans;
    }
}