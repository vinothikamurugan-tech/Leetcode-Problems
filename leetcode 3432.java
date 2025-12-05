class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int temp = 0;
        int var;
        for(int i = 0; i<nums.length -1 ; i++){
            int sum = 0;
            for(int j = i+1; j<nums.length ; j++){
                sum = sum +nums[j];
            }
            temp = temp + nums[i];
            var = temp-sum;
            if(var%2==0){
                count = count+1;
            }

        }
        return count;
    }
}