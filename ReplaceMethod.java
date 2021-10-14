package MethodImplemation;

public class ReplaceMethod {
   static String s="abcdfg";
	public static void main(String[] args) 
	{
	      String s1=s.replace('d', 'w');
	      System.out.println(s1);
	      String s2=replace('d', 'w');
	      System.out.println(s2);
	      

	}
	private static String replace(char Oldc, char newC) 
	{  

		String s3="";
		for (int i = 0; i <s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch==Oldc)
			{
				    ch=newC;
				    s3=s3+ch;
			}	
			else
			{
				 s3=s3+ch;
			}
			  
		}
		
		return s3;
	}

}
