class Solution {
    public String intToRoman(int num) {
        //make 2 arrays 1 array with array of STRINGS, other array with numbers indicating strings array symbols. 
        //-1 cases like 4,9,40,50,90,100 should be there in array
        //append string if nums is that range and return string finally.

        StringBuilder sb=new StringBuilder();
        String st[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int n[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<13;i++)
        {
            while(num>=n[i])
            {
                num=num-n[i];
                sb.append(st[i]);

            }
        }
        return sb.toString();
        
    }
}
