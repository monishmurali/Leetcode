class Solution {

    /*
    consiser 3,4,7,2,-3,1,4,2
    1st put (0,1) in map here 0 is sum and 1 is the frequency of sum
    k is target
    1st consider 3 above
    sum-k i.e., 3-7 =-4
    put sum in map (3,1)

    2nd. consider 4 above sum =3+4 =7
    sum-k i.e., 7-7=0
     {
         already (0,1) is there. so if map contains 0 increment count by map.get(sum-k)
         
     }

     always put sum and frequency in map.
    */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
       return count; 
    }
}
