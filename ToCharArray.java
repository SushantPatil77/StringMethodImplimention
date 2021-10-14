package MethodImplemation;

import java.util.Arrays;

public class ToCharArray {
   static String s="cbvdhvhjdfv";
	public static void main(String[] args)
	{
		 char[] ch=s.toCharArray();
		 System.out.println(Arrays.toString(ch));
		 char[] ch1=toCharArray();
		 System.out.println();
		 System.out.println(Arrays.toString(ch1));
		 

	}
	private static char[] toCharArray() 
	{
		char[] ch3=new char[s.length()];
		for (int i = 0; i < s.length(); i++) 
		{
			ch3[i]=s.charAt(i);
		}
		return ch3;
	}

}
