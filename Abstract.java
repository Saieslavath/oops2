package oops2;
abstract class Demo{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class Firstchild extends Demo{
	public void m1() {
		System.out.println("inside m1");
	}
}
class Secondchild extends Firstchild{
public void m2() {
	System.out.println("inside m2");
}
public void m3() {
	System.out.println("inside m3");
}
}


public abstract class Abstract {

	public static void main(String[] args) {
		Secondchild s =new Secondchild();
		s.m1();
		s.m2();
		s.m3();
		
		// TODO Auto-generated method stub

	}

}
