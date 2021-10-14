package MethodImplemation;

public class ToUpperCase {
    static String s="abcdgfh";
	public static void main(String[] args) 
	{
		String result=s.toUpperCase();
		System.out.println(result);
		String result1=toUpperCase();
		System.out.println(result1);
 
	}
	private static String toUpperCase() 
	{
		String s1="";
		for (int i = 0; i <s.length(); i++)
		{
		   if(s.charAt(i)>='a'&& s.charAt(i)<='z')
		   {  
			   s1=s1+(char)(s.charAt(i)-32);
		   }
		   else
		   {
			   s1=s1+s.charAt(i);
		   }
		}
		
		return s1;
	}

}
