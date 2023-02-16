class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        /* check the sum of squares of the numbers by other function called getNum(n) 
        if the sum is 1 then return true 
        if there is the cycle repeating detect by the set and add values to the set.
        */
        while(n!=1 && set.add(n))
        {
            n=getNum(n);
           

        }
        return n==1;
    }

    public int getNum(int n)
    {
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }

}
