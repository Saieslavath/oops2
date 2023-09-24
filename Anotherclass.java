package oops2;

public class Anotherclass implements MyInterface 
{
public static void main(String[] args) {
	//accessing instant variable
	int instantvalue=instantvariable;
	System.out.println("instant variable:"+instantvalue);
	//accessing static variable
	int staticvalue=instantvariable;
	System.out.println("static variable:"+staticvalue);
	//accessing final variable
int finalvalue=finalvariable;
System.out.println("final variable:"+finalvalue);
}
}
//1