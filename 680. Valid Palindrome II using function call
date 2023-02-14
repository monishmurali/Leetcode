/*
check palindrome if string is palindrome or not after removing one character in the string

1. consider string abca
if b or c is removed it is palindrome
initialize i=0 and j=len-1
while
{
if(char[i]!=char[j])
{
    func(s,i+1,j) check i+1 to j string;     for palindrome
    func(s,i,j-1) check i to j+1 string;

}
i++;
j--;
}
func(s,i,j)
{
    while
    {
    check palindrome;
    if not return false;

    }
    return true;
    
}*/

class Solution {
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
                // if(true){

                

                //if(false)
                
            }
            i++;
            j--;
            

        }
        return true;
    }
        public boolean isPalindrome(String s, int i,int j)
        {
            System.out.println(s.charAt(i)+" "+""+s.charAt(j));
            while(i<j)
            {
                if(s.charAt(i++)!=s.charAt(j--))
                {
                    System.out.println(s.charAt(i)+" "+""+s.charAt(j));
                    System.out.println("false");

                    return false;
                }
            }
            return true;
        }
        
    
}
