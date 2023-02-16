class Solution {

    public String longestCommonPrefix(String[] strs) {

        // take first string from array and make it as prefix string
        // start from 2 string in the array in for loop
        //strs[1].indexOf(prefix)
        //this checks if there is is any match of prefix in the array and returns zero
        //in this case flower and flow flower is not in flow so decrement prefix flower by length 1 until it finds match.
        //flower decrements until flow whhich gives zero at strs[1].indexOf(prefix)
        //prefix becomes flow which is in the 2nd string and comes out of loop and i shifts to3rd string
        //now in while check if prefix flow is in strs[2] flight
        //decrement prefix flow until it finds match. in this case decrements until fl which is our output and returns prefix.
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
        
    }
}
