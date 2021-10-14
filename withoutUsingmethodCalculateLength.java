package MethodImplemation;

public class withoutUsingmethodCalculateLength {

	public static void main(String[] args) {
		String s="asbbdhbhbvhjsdbkj";
		int i=0;
		try {
			for (; ; i++) 
			{
				s.charAt(i);
			}
		} catch (Exception e) {
			System.out.println(i);
		}
	}

}
