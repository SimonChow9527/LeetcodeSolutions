class Solution {
    
        public  List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(left);
		temp.add(1, right);
        List<Integer> remove= new ArrayList<>();
		for (int i = right - 1; i > left; i--) {
			temp.add(1, i);
		}
		for (int j = 0; j < temp.size(); j++) {

			String num = Integer.toString(temp.get(j));

			for (int i = 0; i < num.length(); i++) {

				if (Integer.parseInt(Character.toString(num.charAt(i))) == 0) {
					remove.add(temp.get(j));
				} else if ((temp.get(j)%Integer.parseInt(Character.toString((num.charAt(i))))) != 0) {
					remove.add(temp.get(j));
					
				}
			}

		}
        temp.removeAll(remove);
		
		return temp;
	}
        
    
}
