class Solution {
  public int[][] matrixReshape(int[][] nums, int r, int c) {
        
	int[][] ans=new int[r][c];int index=0;
	try {
		List<Integer> temp=new ArrayList<Integer>();
		for(int[] a:nums)
			for(int b:a)
			{
				temp.add(b);
			}
		for(int i=0;i<r;i++)
		   for(int j=0;j<c;j++)
			{
			ans[i][j]=temp.get(index);
			index++;
			}
		return ans;
	}catch(IndexOutOfBoundsException e)
	{
		return nums;
	}	
    }
}
