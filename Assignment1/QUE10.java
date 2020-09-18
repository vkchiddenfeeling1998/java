import java.util.*;

public class QUE10{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter TEMPERATURE in fahernite ");

	int f = sc.nextInt();

	double c = (5*(f-32)/9);
	System.out.println("Temp in celcius is = " +c +"degree");
	
	}
}
