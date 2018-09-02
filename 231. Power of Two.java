class Solution {
      public static boolean isPowerOfTwo(int n) {
	     
		double temp=n;
		 while((temp%1==0)&&(temp!=1)&&(temp!=0))
		 {
			 temp=temp/2;			 
		 }
	
		 if(temp==1)
			 return true;
		 else return false;
	 }
	
}
