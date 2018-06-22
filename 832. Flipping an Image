class Solution {
    public  int[][] flipAndInvertImage(int[][] A) {
	int[][] B=new int[A.length][A[0].length];
	int[][] C=new int[A.length][A[0].length];
	for(int i=0;i<A.length;i++)
		for(int j=0;j<=A[0].length-1;j++)
	{
		B[i][j]=A[i][A[0].length-j-1];
	}
	
	for(int i=0;i<A.length;i++)
		for(int j=0;j<A[0].length;j++)
	{
		if(B[i][j]==0)
			C[i][j]=1;
		if(B[i][j]==1) 
            C[i][j]=0;
	}

        return C;
    }
}
