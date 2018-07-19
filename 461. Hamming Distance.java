class Solution {
    
    public  int hammingDistance(int x, int y) {
		String transa=Long.toBinaryString(x);
        String transb=Long.toBinaryString(y);
        int num=0;
        ArrayList<Integer> anum= new ArrayList<Integer>();
        ArrayList<Integer> bnum= new ArrayList<Integer>();
       
   
        for(int i=0;i<transa.length();i++)
        	{
        	anum.add(Integer.parseInt(transa.substring(i, i+1)));
        	}
        for(int j=0;j<transb.length();j++)
    	{
    	bnum.add(Integer.parseInt(transb.substring(j, j+1)));
    	}
     if(anum.size()>bnum.size())
        {
        	for (int p = anum.size()-bnum.size(); p>0; p--) {
				bnum.add(0, 0);
        }
     }
    if (anum.size() < bnum.size()) {			
			for (int p = bnum.size()-anum.size(); p>0; p--) {
				anum.add(0, 0);
			}
		}
	 
    for(int d=0;d<anum.size();d++)
    {
    	if(anum.get(d)!=bnum.get(d))
    		{    		
    		num+=1;
    		}
    	
    }
   
  
	
        
	
   return num; 
    }
}
