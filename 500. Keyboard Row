class Solution {
    	public static String[] findWords(String[] words) {
		List<String> ans= new ArrayList<String>(Arrays.asList(words));
		List<String> trash= new ArrayList<String>();
		for (int j = 0; j <ans.size(); j++) {
			
			int[] flag = new int[ans.get(j).length()];
			for (int i = 0; i < ans.get(j).length(); i++) {
				switch (Character.toLowerCase(ans.get(j).charAt(i))) {
				case 'q':
					flag[i] = 1;
					break;
				case 'w':
					flag[i] = 1;
					break;
				case 'e':
					flag[i] = 1;
					break;
				case 'r':
					flag[i] = 1;
					break;
				case 't':
					flag[i] = 1;
					break;
				case 'y':
					flag[i] = 1;
					break;
				case 'u':
					flag[i] = 1;
					break;
				case 'i':
					flag[i] = 1;
					break;
				case 'o':
					flag[i] = 1;
					break;
				case 'p':
					flag[i] = 1;
					break;
				case 'a':
					flag[i] = 2;
					break;
				case 's':
					flag[i] = 2;
					break;
				case 'd':
					flag[i] = 2;
					break;
				case 'f':
					flag[i] = 2;
					break;
				case 'g':
					flag[i] = 2;
					break;
				case 'h':
					flag[i] = 2;
					break;
				case 'j':
					flag[i] = 2;
					break;
				case 'k':
					flag[i] = 2;
					break;
				case 'l':
					flag[i] = 2;
					break;
				case 'z':
					flag[i] = 3;
					break;
				case 'x':
					flag[i] = 3;
					break;
				case 'c':
					flag[i] = 3;
					break;
				case 'v':
					flag[i] = 3;
					break;
				case 'b':
					flag[i] = 3;
					break;
				case 'n':
					flag[i] = 3;
					break;
				case 'm':
					flag[i] = 3;
					break;
				}

			}
			
			for(int i=0;i<flag.length-1;i++)
			{
				if(flag[i]!=flag[i+1])
				{
					trash.add(ans.get(j));
					
				}
			}

		}
		ans.removeAll(trash);
		return ans.toArray(new String[ans.size()]);
		
	}

}
