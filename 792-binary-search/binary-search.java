class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1  )
        {
            if(nums[0] == target)
            {
                return 0;
            }
            else
                return -1;
        }
        if(nums.length == 2  )
        {
            if(nums[0] == target)
            {
                return 0;
            }
            else if (nums[1] == target)
            {
                return 1;
            }
            else
                return -1;
        }
       int start = 0,end = nums.length-1;
        
         while(start <= end)
         {
             int mid = start + (end - start) / 2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] < target)
        {
            start = mid + 1;
        }
        else
           {
               end = mid - 1;
           }
         }
         return -1;
    }
}