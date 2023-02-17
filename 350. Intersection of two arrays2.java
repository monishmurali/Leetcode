class Solution {
    //create hash map and insert all the elements of array in it key is element and values is the frequency of elements occuring.
    //create list and insert elements in the map in to list if it present in map already by array 1 and decrement value by 1 after inserting in to list.
    //shift elements in list in to array and return.
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i: nums1)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        for(int i:nums2)
        {
            if(map.containsKey(i) && map.get(i)>0)
            {
                list.add(i);
                map.put(i,map.get(i)-1);
            }

        }
        int[] arr=new int[list.size()];
        int idx=0;
        for(Integer i:list)
        {
            arr[idx++]=i;
        }

        return arr;
    }
}
