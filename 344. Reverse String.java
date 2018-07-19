class Solution {
   public String reverseString(String s) {
	        
	        char[] temp=new char[s.length()];
	        for(int i=0;i<s.length();i++)
	        {
	            temp[i]=s.charAt(s.length()-i-1);
	        }
	        String ans=new String(temp);
	        return ans;
	    }

}
