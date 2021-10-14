package MethodImplemation;

public class ContainMethod {
      static String s="abcdfghsgcvgshc";
      static String s1="vgshc";
	public static void main(String[] args) 
	{
		boolean result=s.contains(s1);
		System.out.println(result);
		boolean result1=contains(s1);
		System.out.println(result1);
		
		

	}
	private static boolean contains(String s12) {
		if(s1.length()>s.length())
		return false;
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
					return true;
			}
		}
		return false;
	}

}
