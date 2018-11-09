class Solution {
	public static int findShortestSubArray(int[] nums) {

		HashMap<Integer, List<Integer>> temp = new HashMap<>();
		for (int j = 0; j < nums.length; j++) {
			if (temp.containsKey(nums[j])) {
				temp.get(nums[j]).add(j);
			} else {
				ArrayList<Integer> temp1 = new ArrayList<>();
				temp1.add(j);
				temp.put(nums[j], temp1);
			}
		}
		ArrayList<Integer> temp2 = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (List<Integer> a : temp.values()) {
			if (a.size() > temp2.size()) {
				temp2 = (ArrayList<Integer>) a;				
			}
		}
		for(List<Integer> a:temp.values())
		{
			if (a.size() == temp2.size()) {
			ans.add(a.get(a.size() - 1) - a.get(0) + 1);				
			}
		}		
		Collections.sort(ans);
		return ans.get(0);
	}

}
