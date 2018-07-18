class Solution {
    public int singleNumber(int[] nums) {
        
		Set<Integer> temp1=new HashSet<Integer>();
		Set<Integer> temp2=new HashSet<Integer>();
		int ans=0;
		for(int a:nums) {
			if(!temp1.add(a))
			{
				temp2.add(a);
			}
		}
		temp1.removeAll(temp2);
		for(int a:nums)
		{
			if(temp1.contains(a))
			{
				ans=a;
			}
		}
		return ans;
    }

}
