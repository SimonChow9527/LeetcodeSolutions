class Solution {
  public static boolean detectCapitalUse(String word) {
        boolean ans=true;
        int count=0;
        for(int i=0;i<word.length();i++)
        {
        	if(Character.isUpperCase(word.charAt(i)))
        		count+=1;
        }
        
        if(count==1)
        	{if(!Character.isUpperCase(word.charAt(0)))
        		ans=false;}
        else if((count!=0)&&(count!=word.length()))
        	ans=false;
        
        return ans;
}
}
