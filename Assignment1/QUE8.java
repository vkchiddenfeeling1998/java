import java.util.*;

public class QUE8{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter PRINCIPAL AMOUNT,Rate of Interest,time");

	int p =sc.nextInt();
	int roi =sc.nextInt();
	int t =sc.nextInt();

	double SI = (p*roi*t)/100;
	System.out.println("Simple Interset is = " +SI);

	}
}
