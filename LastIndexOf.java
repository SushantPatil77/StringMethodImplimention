package MethodImplemation;

public class LastIndexOf {
     static String s="cdgjhdsvcdgcdghhbv";
     static String s2="cdg";
	public static void main(String[] args) 
	{
		 int result=s.lastIndexOf(s2);
		 System.out.println(result);
		 int result1=lastIndexOf(s2);
		 System.out.println(result1);

	}
	private static int lastIndexOf(String s22) 
	{
		if(s2.length()>s.length())
			return -1;
		for (int i =s.length()-1; i>=0; i--) 
		{
			if(s.charAt(i)==s2.charAt(0))
			{
				int sindex=i+1;
				int s2index=1;
				int c=1;
				 while(sindex<s.length() && s2index<s2.length())
				 {
					 if(s.charAt(sindex)==s2.charAt(s2index))
					       c++;
					  sindex++;
					   s2index++;
				 }
				 if(c==s2.length())
					 return i;
			}
		}
		return 0;
	}

}
