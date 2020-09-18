import java.util.*;

public class QUE11{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER TWO NUMBERS");

	int a = sc.nextInt();
	int b = sc.nextInt();

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("value of a = "+a);
	 System.out.println("value of b = "+b);
	}
}
