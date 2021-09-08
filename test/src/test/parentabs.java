package test;

public class  parentabs extends Checkingabs{
	public void abs() {
		System.out.println("abstract class");
	}
	public void methiof(){
		System.out.println("test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parentabs obj=new parentabs();
obj.methiof();
obj.display();
obj.abs();
	}

}
