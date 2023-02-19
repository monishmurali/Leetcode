class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //convert 2d matrix to single array as elements are sorted already and then perform binary search to the array.
        int rows=matrix.length;
        int columns=matrix[0].length;
        int[] arr=new int[rows*columns];
        int idx=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {

                arr[idx++]=matrix[i][j];

            }
        }
       int first=0;
       int last=arr.length-1;
       while(first<=last)
       {
           
           int mid=first+(last-first)/2;
           if(target==arr[mid])
           {
               return true;
           }
           if(target<arr[mid])
           {
               last=mid-1;

           }
           if(target>arr[mid])
           {
               first=mid+1;
           }

       }
       return false;
        
    }
}
