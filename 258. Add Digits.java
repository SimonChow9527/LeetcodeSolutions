=================================================a very clever solution===================================================================
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        else return 1 + (num - 1) % 9;
    }
}

==========================================================================================================================================

======================================================my shit=============================================================================
class Solution {
public static int addDigits(int num) {
    
	int ans=addit(num);
		while(ans>=10){
		ans=addit(ans);
	};
		return ans ;
	   }
   
public static int addit(int num)
{
	int ans=0;
	while(num>0)
		{
				ans+= num%10;
				num=num/10;
			}
	
	return ans;
	}
		}
    
===========================================================================================================================================
