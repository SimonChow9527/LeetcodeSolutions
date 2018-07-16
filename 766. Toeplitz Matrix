class Solution {
  public static boolean isToeplitzMatrix(int[][] matrix) {
       boolean flag=true; 
	for(int i=0;i<matrix.length;i++)
		for(int j=0;j<matrix[0].length;j++)
	{
			
		if((i+1<=matrix.length-1)&&(j+1<=matrix[0].length-1))
		{
			
			if(matrix[i][j]!=matrix[i+1][j+1])
			{
				flag=false;
			}
		}
		
	}
	return flag;
    }
}
