class Solution {
    public  int[] shortestToChar(String S, char C) {
    List<Integer> index=new ArrayList<Integer>();
		char temp[]=S.toCharArray();
	for(int i=0;i<temp.length;i++)     
	{
		if(temp[i]==C)         // mark every char "c" in the string
		{
			index.add(i);
			temp[i]='0';
		}
	}
	if(!index.contains(0))  // deal with special case
	{
		for(int i=0;i<index.get(0);i++)
		{
			    int j=index.get(0)-i;
				temp[i]=(char) (j+'0');											
		}
	}
	if(!index.contains(temp.length-1)) // deal with special case
	{
		for(int i=temp.length-1;i>index.get(index.size()-1);i--)
		{
			    int j= i-(index.get(index.size()-1));
				temp[i]=(char) (j+'0');						
		}
	}
	for(int p=0;p<index.size()-1;p++)    // process the main part
	{
		int mid=(index.get(p+1)-index.get(p)-1)/2+((index.get(p+1)-index.get(p)-1)-((index.get(p+1)-index.get(p)-1)/2)*2);
		
		for(int u=1;u<=mid;u++)
		{
			temp[index.get(p)+u]=(char)(u+'0');
		}
		
		for(int k=mid;k>=1;k--)
		{
			temp[index.get(p+1)-k]=(char)(k+'0');
			
		}
		
	}
	int[]a=new int[temp.length];
	for(int t=0;t<temp.length;t++)  // from char[] to int[]
	{
		a[t]=(int)(temp[t]-'0');
		
	}
	
	return a;
    }

}
