package assistedProjects;

import java.util.Scanner;

//myCode
//public class typeCasting{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a;
//		System.out.println("enter a");
//		a=sc.nextInt();
//		double b=a;
//		System.out.println("Implicit type Conversion a to b "+a+" "+b);
//		
//		double c;
//		System.out.println("enter c");
//		c=sc.nextDouble();
//		int d=(int) c;
//		System.out.println("Implicit type Conversion a to b "+c+" "+d);
//	}
//}
public class typeCasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}
