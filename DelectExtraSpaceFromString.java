package MethodImplemation;

public class DelectExtraSpaceFromString {

	public static void main(String[] args) {
		String s1="          dgdg        vcsgcvm  vcdvgd   cvdgshcvjh             ";
		int Start=0;
		int end=s1.length()-1;
		
	     while(true)
	     {
	    	 if(s1.charAt(Start)==' ')
	    		 Start++;
	    	 else
	    		 break;
	     }
	     
	     while(true)
	     {
	    	 if(s1.charAt(end)==' ')
	    		 end--;
	    	 else
	    		 break;
	     }
	     String s="";
	     for (int i = Start; i <=end; i++) 
	     {
			if(s1.charAt(i)==' '  && s1.charAt(i+1)==' ')
			{
				
			}
			else
				s=s+s1.charAt(i);
		 }
	     System.out.println(s);
	}

}
