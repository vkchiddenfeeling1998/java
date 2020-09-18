import java.util.*;

public class QUE5{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter radius");

	int r =sc.nextInt();
	double PI = 3.14;

	double area = Math.pow(r,2)*PI;
	System.out.println(area);

	double cirm = 2*PI*r;
	System.out.println(cirm);
	}
}
