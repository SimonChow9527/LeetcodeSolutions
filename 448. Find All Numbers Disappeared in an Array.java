class Solution {
   public List<Integer> findDisappearedNumbers(int[] nums) {
    Map<Integer,Integer>temp=new HashMap<Integer,Integer>();
    for(int i=1;i<=nums.length;i++)
    	temp.put(i, i);
    for(int i=0;i<nums.length;i++)
    {
    	if(temp.get(nums[i])!=0)
    		temp.put(nums[i], 0);
    }
    List<Integer> ans=new ArrayList<Integer>();
    for(int a:temp.values())
    {
    	if(a!=0)
    		ans.add(a);
    }
    return ans;
    }

}
