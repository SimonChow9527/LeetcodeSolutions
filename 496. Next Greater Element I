class Solution {
		public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		int[] ans = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			temp.put(nums2[i], i);
		}
		for (int j = 0; j < nums1.length ; j++) {
			int [] range=Arrays.copyOfRange(nums2, temp.get(nums1[j])+1, nums2.length);
			
			if(range.length==0)
			ans[j] = -1;
			else {
				ans[j]=-1;
				for(int i=0;i<range.length;i++)
				{
					if(nums1[j]<range[i])
						{ans[j]=range[i];
					break;}
				}
			}
			
				

		}

		return ans;

	}
}
