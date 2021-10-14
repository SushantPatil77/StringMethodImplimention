package MethodImplemation;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String s="cvgvc dcgvdg cvggh vcv";
		int c=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		//System.out.println(c);
		String s1[]=new String [++c];
		String s2="";
		int index=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				s1[index++]=s2;
				s2="";
			}
			else if(i==s.length()-1)
			{
				 s2=s2+s.charAt(i);
				s1[index++]=s2;
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(Arrays.toString(s1));
	}

}
