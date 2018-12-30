class Solution {
   	 public int smallestRangeI(int[] A, int K) {
	        
		 Arrays.sort(A);
		 if((A[A.length-1]-A[0])>2*K)
			 return (A[A.length-1]-A[0]-2*K);
		 else
			 return 0;
	    }
}
