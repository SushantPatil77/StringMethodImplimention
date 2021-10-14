package MethodImplemation;

import java.util.Arrays;

public class SecondMaxOccurance {

	public static void main(String[] args) {
		 String s="aabbbccbhdvdgggggggdds";
		 String s1="";
		 for (int i = 0; i <s.length(); i++)
		 {
			 int c=0;
			for (int j =i+1; j <s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
					break;
				}
			}
			if(c==0)
				s1=s1+s.charAt(i);
		 }
		
		 int a[]=new int[s1.length()];
		 for (int i = 0; i <s.length(); i++)
		 { 
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					 a[j]++; 
				}
				
			}
		}
		char[] ch=s1.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =i+1; j <a.length; j++)
			{
				if(a[i]>a[j])
					{
					     int temp=a[i];
					            a[i]=a[j];
					            a[j]=temp;
					            
					      char temp1=ch[i];
					             ch[i]=ch[j];
					             ch[j]=temp1;
					}
			}
		}
		
		System.out.println(ch[ch.length-2]+" "+a[a.length-2]);
		


	}

}
