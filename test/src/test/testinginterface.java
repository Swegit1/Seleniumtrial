package test;

public class testinginterface implements firstinter,secinter{
	
	public void print() {
		System.out.println("am testing interface");
	}
public void display() {
	
	System.out.println("implementation");
}
public testinginterface(){
	System.out.println("constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstinter hi=new testinginterface(); //object instantiation of the class 
		testinginterface obj=new testinginterface();
		hi.print();
	}

}
