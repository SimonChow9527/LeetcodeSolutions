public class Solution {




		
		
		    public static int numJewelsInStones(String J, String S) {
		        
		     
		   
		       int count=0;
		       
		            for(int i=0; i<J.length();i++)
		            {
		            
		                char temp1=J.charAt(i);
		               
		                for(int j=0; j<S.length();j++)
		                {
		                    char temp2=S.charAt(j);
		                    if(temp1==temp2)
		                        count+=1;
		                }   
		            };
		                
		                return count;
		        }
		        
		     
		    
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  String J="z";
		    	  String S="ZZ";
		    	  int c=numJewelsInStones(J,S);
		    	  
		    	  System.out.println(c);
		    	  
	}

}
