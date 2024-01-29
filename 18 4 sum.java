class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res =  new ArrayList<>();
      
        
        int len = nums.length;
        if(nums == null || len<4)
        {
           return res;
        }

        Arrays.sort(nums);
    
        
        for(int i=0;i<len-3;i++)
        {
            if((i>0) && (nums[i-1]==nums[i]))
            continue;
            
            for(int j=i+1;j<len-2;j++)
            {
                if((j>i+1) && (nums[j]==nums[j-1]))
                continue;
           
                int k=j+1;
                int l=len-1;
                while(k<l)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                         li.add(nums[j]);
                          li.add(nums[k++]);
                           li.add(nums[l--]);
                           res.add(li);
                    
                     while(k<l && (nums[k]==nums[k-1]))
                        {
                            k++;
                        }
                        while(k<l && (nums[l]==nums[l+1]))
                        {
                            l--;
                        }
                        
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    
                }
            }
        

        }
        return res;
        
    }
}
