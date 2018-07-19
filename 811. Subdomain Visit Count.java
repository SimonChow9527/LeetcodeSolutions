//the first part is my code, which is a pile of shit, and the second part is the official solution.
/*public static List<String> subdomainVisits(String[] cpdomains) {

		Map<String,Integer> mymap= new HashMap<String,Integer>();
		for (int j = 0; j < cpdomains.length; j++) {
			String numStr = "";
			String[] str= {};
			
			for (int i = 0; i < cpdomains[j].length(); i++) //take out numbers of visit and split string by dot
			{
				char charCheck = cpdomains[j].charAt(i);     //should use split twice, what the fuck i was thinking?!
				if (Character.isDigit(charCheck)) {
					numStr += charCheck;
				}
				if (Character.isWhitespace(charCheck)) {
					String temp = cpdomains[j].substring(i+1);
					 str = temp.split("\\.");
					
				}
			}
			for(int o=0;o<str.length;o++) // add values to HashMap   // I can break domain into parts, but could't figure out a way to combine them together
			{
				if(!mymap.containsKey(str[o]))                         // and got stuck
				{
					mymap.put(str[o], Integer.parseInt(numStr));
					
				}
				else if(mymap.containsKey(str[o]))
				{
					mymap.put(str[o], mymap.get(str[o])+Integer.parseInt(numStr));
					
				}
			}
			
			for(String e:str)
			{
				System.out.println(e);
			}
			
		}

		
		
		List<String> result = new ArrayList<String>(mymap.keySet());
		
		
		
		
		
		return result;
	}*/
	
	public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap();
        for (String domain: cpdomains) {
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; i--) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;  //  I know the expression(? Y:N) but I've never used it before
                System.out.println(cur);
                counts.put(cur, counts.getOrDefault(cur, 0) + count); // getOrDefault solve the problem in a genius way, instead of involving a if loop
            }
            
        }

        List<String> ans = new ArrayList();
        for (String dom: counts.keySet())
            ans.add("" + counts.get(dom) + " " + dom);
        return ans;
    }
