package MethodImplemation;

public class DuplicatedRemoveFromString {

	public static void main(String[] args) {
	  String s="aaabbbbccccccddfff";
	  String s1="";
	  for (int i = 0; i <s.length(); i++)
	  {  int c=0;
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
	  System.out.println(s1);

	}

}
