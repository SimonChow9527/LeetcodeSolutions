class Solution {
   public String toGoatLatin(String S) {
	       
			String[] splited = S.split("\\s+"); // split a string by space
			for(int i=0;i<splited.length;i++)
			{
				if(Character.toLowerCase(splited[i].charAt(0))=='a'||
						Character.toLowerCase(splited[i].charAt(0))=='e'||
								Character.toLowerCase(splited[i].charAt(0))=='i'||
										Character.toLowerCase(splited[i].charAt(0))=='o'||
												Character.toLowerCase(splited[i].charAt(0))=='u')
				{
					splited[i]+="ma";
				}else
				{
					char[] temp=splited[i].toCharArray();
					char[] temp2=Arrays.copyOf(temp, temp.length+1);
					temp2[splited[i].length()]=temp[0];
                    temp2[0]=' ';
					
					splited[i]= new String(temp2).trim();
					splited[i]+="ma";
				}
			}
			
			String ans="";
					for(int i=0;i<splited.length;i++){
						ans+=splited[i]+new String(new char[i+1]).replace("\0", "a")+(i<splited.length-1?" ":"");
					}
			
			return ans;
			
		    }
}
