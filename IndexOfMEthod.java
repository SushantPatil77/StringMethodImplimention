package MethodImplemation;

public class IndexOfMEthod {
      static String s="gcvhgdcvsdgh";
      static String s1="dcv";
	public static void main(String[] args) 
	{
		int result=s.indexOf(s1);
		System.out.println(result);
		int result1=IndexOf(s1);
		System.out.println(result1);
	}
	private static int IndexOf(String s12) 
	{
		if(s1.length()>s.length())
			return -1;
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				int sIndex=i+1;
				int s1Index=1;
				 int c=1;
				 while(sIndex<s.length() && s1Index<s1.length())
				 {
					 if(s.charAt(sIndex)==s1.charAt(s1Index))
						     c++;
					         sIndex++;
					          s1Index++;
					 
				 }
				 if(c==s1.length())
				 return i;
			}
		}
		return -1;
	}

}
