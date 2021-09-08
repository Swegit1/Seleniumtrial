package test;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev="SAS";
		String str="";
		int length = rev.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         str = str + rev.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(rev+" is a palindrome");
	      else
	         System.out.println(rev+" is not a palindrome");

	}

}
