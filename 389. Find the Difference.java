class Solution {
  public char findTheDifference(String s, String t) {
        
	int[] scount=new int[26];
	int[] tcount=new int[26];
	Arrays.fill(scount, 0);
	Arrays.fill(tcount, 0);
	char ans=' ';
	for(int i=0;i<s.length();i++)
	{
		switch (s.charAt(i))
		{
		case 'a':scount[0]+=1;break;case 'c':scount[2]+=1;break;
		case 'd':scount[3]+=1;break;case 'b':scount[1]+=1;break;
		case 'e':scount[4]+=1;break;case 'g':scount[6]+=1;break;
		case 'h':scount[7]+=1;break;case 'f':scount[5]+=1;break;
		case 'i':scount[8]+=1;break;case 'j':scount[9]+=1;break;
		case 'k':scount[10]+=1;break;case 'm':scount[12]+=1;break;
		case 'n':scount[13]+=1;break;case 'p':scount[15]+=1;break;
		case 'l':scount[11]+=1;break;case 'o':scount[14]+=1;break;
		case 'q':scount[16]+=1;break;case 'u':scount[20]+=1;break;
		case 'v':scount[21]+=1;break;case 'y':scount[24]+=1;break;
		case 'z':scount[25]+=1;break;case 't':scount[19]+=1;break;
		case 'w':scount[22]+=1;break;case 'r':scount[17]+=1;break;
		case 's':scount[18]+=1;break;case 'x':scount[23]+=1;break;
				
		}
	}
	for(int j=0;j<t.length();j++)
	{
		switch (t.charAt(j))
		{
		case 'a':tcount[0]+=1;break;case 'c':tcount[2]+=1;break;
		case 'd':tcount[3]+=1;break;case 'e':tcount[4]+=1;break;
		case 'f':tcount[5]+=1;break;case 'g':tcount[6]+=1;break;
		case 'h':tcount[7]+=1;break;case 'j':tcount[9]+=1;break;
		case 'k':tcount[10]+=1;break;case 'i':tcount[8]+=1;break;
		case 'b':tcount[1]+=1;break;case 'm':tcount[12]+=1;break;
		case 'n':tcount[13]+=1;break;case 'p':tcount[15]+=1;break;
		case 'q':tcount[16]+=1;break;case 't':tcount[19]+=1;break;
		case 'u':tcount[20]+=1;break;case 's':tcount[18]+=1;break;
		case 'o':tcount[14]+=1;break;case 'w':tcount[22]+=1;break;
		case 'r':tcount[17]+=1;break;case 'x':tcount[23]+=1;break;
		case 'y':tcount[24]+=1;break;case 'l':tcount[11]+=1;break;
		case 'v':tcount[21]+=1;break;case 'z':tcount[25]+=1;break;		
		}
	}
		
		for(int p=0;p<scount.length;p++)
		{
			if(scount[p]!=tcount[p])
				ans=(char)(97+p);
		}
		
	return ans;
    }
}
