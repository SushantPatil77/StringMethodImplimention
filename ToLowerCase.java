package MethodImplemation;

public class ToLowerCase {
	 static String s="ABCDFEHJSK";
	public static void main(String[] args) 
	{
		 String result=s.toLowerCase();
		 System.out.println(result);
		 String result1=toLowerCase();
		 System.out.println(result1);

	}
	private static String toLowerCase() 
	{
		String s1="";
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)>='A'  && s.charAt(i)<='Z')
				{
				  s1=s1+(char)(s.charAt(i)+32);
				}
			else
			{
				s1=s1+s.charAt(i);
			}
			
		}
		return s1;
	}

}
