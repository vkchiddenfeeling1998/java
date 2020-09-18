import java.util.*;

public class QUE9{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter DAYS");

	int d = sc.nextInt();

	double month = d/30;
	System.out.println("month is = " +month +"month");
	 int y = d/365;
	System.out.println("year is = " +y + "years");
	}
}
