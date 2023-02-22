class Solution {
    public int singleNonDuplicate(int[] nums) {
        // if mid is even than start from 0 index total there will be odd elements till mid 1,1,2*,2 check with
        //right element if mid and mid+1 same then single digit din't exist left side shift low to mid+1'
        //if mid  is odd then start from 0 index total there will be even elements till mid 1,1,2,2* check with left value to know if single digit exists in left side and shift left to mid +1;
        //else shift right to middle.
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(mid%2 == 0 && nums[mid+1]==nums[mid] || mid%2==1 && nums[mid]==nums[mid-1])
            {
                left=mid+1;
            }
            else
            right=mid;
        }
        return nums[left];
        

        
    }
}
