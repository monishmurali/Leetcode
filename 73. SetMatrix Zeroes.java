class Solution {
    public void setZeroes(int[][] matrix) {
        int rowlen=matrix.length;
        int collen=matrix[0].length;

        Boolean isCol=false;

        for(int i=0;i<rowlen;i++)
        {
            // if first cell of each row is zero (or zero column) is 0
            // then we need to turn the flag to true (to remember to make first column as 0)
            if(matrix[i][0]==0)
            {
                isCol=true;
            }
          
            for(int j=1;j<collen;j++)
            {
            // if any elements in matrix zero then make 0 row and 1 st column zero for corresponding element
                   if(matrix[i][j]==0)
                   {
                       matrix[i][0]=0;
                       matrix[0][j]=0;
                   }  
                
            }
        }
//if o row or 1st column is zero then make corresponding element zero
        for(int i=1;i<rowlen;i++)
        {
            for(int j=1;j<collen;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
//as we checked 0 row cases except (0,0) check it and make entire o row zero.
        if(matrix[0][0]==0)
        {
            for(int j=0;j<collen;j++)
            {
                matrix[0][j]=0;
            }
        }
// in first for loop we checked if any element in zero column is 0 now make full 0 column elements as 0
         if(isCol)
        {
            for(int i=0;i<rowlen;i++)
            {
                matrix[i][0]=0;
            }
        }
        
    }
}
