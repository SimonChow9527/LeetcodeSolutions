class Solution {
  
     public List<String> commonChars(String[] A) {
		
		 List<String> answer=new ArrayList<>();
		 HashMap<Character,Integer> temp=readString(A[0]);
		 HashMap<Character,Integer> temp2=new HashMap<>();
		
		 for(int i=1;i<A.length;i++)
		 {			  
			  temp2=readString(A[i]);
			  temp=compareMap(temp, temp2);
		 }
			
		 for(Character c:temp.keySet())
		 {
			 for(int i=1;i<=temp.get(c);i++)
				 answer.add(Character.toString(c));
		 }
		 
		 return answer;
	    }
	 public HashMap<Character,Integer> readString(String s)
	{
		HashMap<Character,Integer> temp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(temp.get(c)==null)
				temp.put(c, 1);
			else
				temp.put(c, temp.get(c)+1);
		}
		return temp;
	}
	
	public  HashMap<Character,Integer> compareMap(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2)
	{
		HashMap<Character,Integer> temp=new HashMap<>();
		
		for(char c:map1.keySet())
			if(map2.keySet().contains(c)&&map2.get(c)!=null)
			{
				if(map1.get(c)==map2.get(c))
					temp.put(c, map1.get(c));
				else
					temp.put(c,Math.min(map1.get(c),map2.get(c)));
			}
		
		return temp;
		
	}

}
