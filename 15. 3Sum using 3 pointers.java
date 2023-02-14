class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       /* // declare list in the set

       Sort Array
  for(int i=0;i<=len-2;i++)
  {
        -4,-1,-1,0,1,2

        1st i=4

        while
        {
            j at -1 (1) to j=len-1 (2);
            -4, -1,-1,0,1,2
            sum=nums[i]+nums[j]+nums[k];

            if(sum=0)
            {
                set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                add to set by converting arrays as list

            }

            increment j++ if sum of nums[i]+nums[j]+nums[k] value is less than target here target 0;
            decrement k-- if sum of nums[i]+nums[j]+nums[k] value is greater than target here target is 0;


        }

        return 
        
    }
        */
        HashSet<List<Integer>> set=new HashSet<>();
        int len=nums.length;
        int sum=0;
        Arrays.sort(nums);

        for(int i=0;i<len-2;i++)
        {
            int j=i+1;
            int k=len-1;

            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                if(sum<0)
                {
                    j++;
                }
                if(sum>0)
                {
                    k--;
                }
            }

        }
        return new ArrayList<>(set);
        
    }
}
