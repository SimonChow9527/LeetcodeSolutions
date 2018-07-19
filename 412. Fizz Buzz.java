class Solution {
  	public static List<String> fizzBuzz(int n) {

		List<String> ans = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if(((double)i/3%1==0)&&((double)i/5%1!=0))
			{ans.add("Fizz");}
			else if(((double)i/3%1!=0)&&((double)i/5%1==0))
			{
			ans.add("Buzz");
			}else if(((double)i/3%1==0)&&((double)i/5%1==0))
			{
				ans.add("FizzBuzz");
			}else {
				ans.add(Integer.toString(i));
			}
		}
		return ans;
	}

}
