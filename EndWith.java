package MethodImplemation;

public class EndWith {
	static String s="abcdefghik";
    static String s1="ghik";
	public static void main(String[] args) 
	{
		boolean result=s.endsWith(s1);
		System.out.println(result);
		
	    boolean result1=endsWith(s1);
	    System.out.println(result1);
		

	}
	private static boolean endsWith(String s12)
	{
		if(s1.length()>s.length())
			return false;
		
		for (int i =s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				int sindex=i+1;
				int s1index=1;
				int count=1;
				
				while(sindex<s.length() && s1index<s1.length())
				{
					if(s.charAt(sindex)==s1.charAt(s1index))
					
						count++;
						sindex++;
						s1index++;
					
				}
				if(count==s1.length())
					return true;
			}
		}
		return false;
		
	}

}
