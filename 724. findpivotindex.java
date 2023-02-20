class Solution {
    public int pivotIndex(int[] nums) {
        //first find total sum.
        int leftsum=0;
        int totalsum=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        for(i=0;i<nums.length;i++)
        {
            //if subtract totalsum from leftsum,currentelement which gives right sum. indirectly if leftsum==rightsum return i;
            if(leftsum==totalsum-leftsum-nums[i])
            return i;

           
            leftsum=leftsum+nums[i];
        }

     return -1;
        
    }
}
