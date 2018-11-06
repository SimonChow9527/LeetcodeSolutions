class Solution {
 public boolean isMonotonic(int[] A) {
	        boolean ans=true;
	        boolean Increasing=false;
	        boolean Decreasing=false;
	        
	        for(int i=1;i<A.length-1;i++)
	        {
	        	if(Increasing==false&&Decreasing==false)
	        	{
	        		if(A[i]>A[i-1])
	        			Increasing=true;
	        		if(A[i]<A[i-1])
	        			Decreasing=true;
	        	}
	        	if(Increasing==true&&A[i+1]<A[i])
	        		ans=false;
	        	if(Decreasing==true&&A[i+1]>A[i])
	        		ans=false;
	        }
	        return ans;
	    }
}
