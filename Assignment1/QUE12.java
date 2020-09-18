import java.util.*;

public class QUE12{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER Three NUMBERS");

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c= sc.nextInt();

	if((a>b) && (a>c)){
		System.out.println("value of a is greatest = "+a);
	}
	if(b>c){
	 	System.out.println("value of b is greatest = "+b);
	}
	else{
		System.out.println("value of c is greatest = "+c);
	}
}
}
