class Solution {
   public int countPrimeSetBits(int L, int R) {
     
	int ans=0;
	for(int i=L;i<=R;i++)
	{
		String temp=Integer.toBinaryString(i);
		int countsetbit=0;
		for(int j=0;j<temp.length();j++)
		{
			if(temp.charAt(j)=='1')
				countsetbit+=1;
		}
		boolean isprime=true;
		if(countsetbit==1)
		{
			isprime=false;
		}else {
			for(int j=2;j<=countsetbit-1;j++)
			{
				if(countsetbit%j==0)
					isprime=false;
			}
		}
		if(isprime)
			ans+=1;
		
	}
	return ans;
    }
}
