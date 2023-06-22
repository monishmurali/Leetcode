class Solution {
    public int findPairs(int[] nums, int k) {
        //consider [3,1,4,1,5] , k=2
        // store number and its frequency by hashing
        //now iterate the map and check if 3+2 in map because 5-3=2, 3+2=5 check num+k if yes then increment
        //if k=0 means if same number is present more than 1 time then increment.
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int result=0;
        for(int x: map.keySet())
        {
            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x)>1)
            {
                result++;
            }
        }
        return result;
    }
}
