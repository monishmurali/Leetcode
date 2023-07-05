class Solution {
    public String reverseStr(String s, int k) {
      //consider input strings = "abcdefg", k = 2
//Output: "bacdfeg" 
 // reverse i=0 to i=i+k(if n is less i+k consider n as j because in that substring we can reverse all as it is the substring and also no more extra letters to not reverse)
      //after reversing each substring check if i+2*k or n is min to know if its the last substring
        int n=s.length();
        StringBuilder sb=new StringBuilder(n);
        for(int i=0;i<n;i+=2*k)
        {
            int j=Math.min(i+k,n);
            StringBuilder rev=new StringBuilder(s.substring(i,j));
            rev.reverse();
            sb.append(rev);
            int rem=Math.min(i+2*k,n);
            sb.append(s.substring(j,rem));

        }
        return sb.toString();

    }
}
