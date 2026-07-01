class Solution {
    public boolean canJump(int[] nums) {
        int maxlen=0 , index=0 , size=nums.length;
        while(index<size){
            if(index>maxlen){
                return false;
            }
            maxlen = Math.max(maxlen , index+nums[index]);
            index++;    
        }
        return true;
    }
}
