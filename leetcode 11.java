class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxar = 0;
        while(left<right){
            int width = right - left;
            int current = Math.min(height[left],height[right])*width;
            maxar = Math.max(maxar , current);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxar;
    }
}