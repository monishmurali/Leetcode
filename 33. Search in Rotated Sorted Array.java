class Solution {

public int search(int[] nums, int target) {
    int mid;
    int l=0;
    int r=nums.length-1;
    while(l<=r)
    {
        mid=(l+r)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else
        if(nums[mid]>=nums[l])
        { 
            if(nums[l]<=target && nums[mid]>=target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;

            }

        }
         else
        if(nums[mid]<=nums[l])
        { 
            if(nums[r]>=target && nums[mid]<=target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;

            }

        }
    }
    return -1;

}
  
          
}
