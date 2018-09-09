class Solution {
 public String reverseStr(String s, int k) {
        
	int remainder=s.length()%(2*k);
	int quotient=s.length()/(2*k);
	char[] temp=s.toCharArray();
	if(remainder==0)
	{
		if(quotient==0)
			quotient+=2;
        for(int i=0;i<quotient;i++)
			for(int j=0;j<k/2;j++)
			{
				char c=temp[k-j-1+i*2*k];
				temp[k-j-1+i*2*k]=temp[j+i*2*k];
				temp[j+i*2*k]=c;
			}
	}else if(remainder<k)
	{
		for(int i=0;i<quotient;i++)
			for(int j=0;j<k/2;j++)
			{
				char c=temp[k-j-1+i*2*k];
				temp[k-j-1+i*2*k]=temp[j+i*2*k];
				temp[j+i*2*k]=c;
			}
		for(int j=0;j<remainder/2;j++)
		{
			char c=temp[remainder-j-1+quotient*2*k];
			temp[remainder-j-1+quotient*2*k]=temp[j+quotient*2*k];
			temp[j+quotient*2*k]=c;
		}
		
	}else if(remainder>=k)
	{
		for(int i=0;i<=quotient;i++)
			for(int j=0;j<k/2;j++)
			{
				char c=temp[k-j-1+i*2*k];
				temp[k-j-1+i*2*k]=temp[j+i*2*k];
				temp[j+i*2*k]=c;
			}
	}
	
	return new String(temp);
	
	
    }
}
