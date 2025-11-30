class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum = sum+nums[i];
        }
        int rem = (int)(sum%p);
        if(rem==0){
            return 0;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,-1);

        long presum = 0;
        int minLen = nums.length;
        for(int i = 0; i<nums.length;i++){
            presum = presum+nums[i];
            int current = (int)(presum%p);
            int target = (current - rem + p)%p;
            if (map.containsKey(target)) {
                minLen = Math.min(minLen, i - map.get(target));
            }
            map.put(current, i);
        }
        return minLen == nums.length ? -1 : minLen;
    }
}