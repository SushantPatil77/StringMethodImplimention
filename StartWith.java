package MethodImplemation;

public class StartWith {
      static String s="abcdefghik";
      static String s1="abc";
	public static void main(String[] args)
	{
	   boolean result=s.startsWith(s1);
	   System.out.println(result);
	   boolean result1=startsWith(s1);
	   System.out.println(result1);

	}
	private static boolean startsWith(String s12) 
	{ 
		if(s1.length()>s.length())
			return false;
		
		 for (int i = 0; i <s.length(); i++) 
		 {
			if(s.charAt(i)==s1.charAt(0))
			{
				int sindex=i+1;
				int s1index=1;
				int c=1;
				
				while(sindex<s.length() && s1index<s1.length())
				{
					if(s.charAt(s1index)==s1.charAt(s1index))
						c++;
					sindex++;
					s1index++;
				}
				if(c==s1.length())
					return true;
			}
		 }
		return false;
	}

}
