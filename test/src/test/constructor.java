package test;



public class constructor {
	
	int a=10;
	String b="call";
	public constructor() {
		System.out.println("Constructor example ");
		
	}
public constructor(int k,String b) {
	
this.a=k;
this.b=b;
	
	System.out.println("trying constructor overloading" +"  "+  k +"  " + b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor cons=new constructor();
//constructor cons1=new constructor(10,"sss");


	}
}