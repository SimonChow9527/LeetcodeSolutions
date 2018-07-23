class Solution {
    public void moveZeroes(int[] nums) {
        for(int j=0;j<nums.length;j++)
		 {
			for(int i=nums.length-1;i>0;i--)
		 {
			 if((nums[i]!=0)&&(nums[i-1]==0))
			 {
				 int temp;
				 temp=nums[i];
				 nums[i]=nums[i-1];
				 nums[i-1]=temp;
			 }
		 } 
		 }
		 
		 
    }
}
