class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                start = i;
                int j = i;
                while(j < nums.length && nums[start] == nums[j])
                {
                    end = j;
                    j++;
                }
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }
}