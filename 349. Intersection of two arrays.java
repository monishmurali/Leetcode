class Solution {

    //create hashset with 1st array elements
    //create other hashset with 2nd array
    //hash set contains without duplicate elements
    //now common elements in both sets are transfered to other set called final set
    //finally put all the elements in final set in to array to return the array
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 =new HashSet<>();
         HashSet<Integer> set2 =new HashSet<>();
         HashSet<Integer> finalSet =new HashSet<>();
       
    for(int i: nums1)
    {
        set1.add(i);

    }
    for(int i: nums2)
    {
        set2.add(i);

    }
    for(Integer var: set1)
    {
        if(set2.contains(var))
        {
            finalSet.add(var);
        }

    }
    int Arr[]=new int[finalSet.size()];
    int idx=0;
    for(Integer var:finalSet)
    {
        Arr[idx]=var;
        idx++;

    }
    return Arr;

    
        
    }
}
