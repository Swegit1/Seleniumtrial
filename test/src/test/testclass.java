package test;

public class testclass {
  
 
	public static void main(String[] args) {
		
		testclass obj=new testclass();
		int result=obj.display(10, 15);
		System.out.println(result);
		int result1=obj.display(10, 15, 25);
				System.out.println(result1);
	}		

public int display(int a,int d) { 

	

return (a+d);
	
}		
	
public int display(int a,int d,int x)	{
	
	
	return (a+d+x);
	
}	
				

}
