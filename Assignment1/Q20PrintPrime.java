import java.util.Scanner;
public class Q20PrintPrime{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numbers u want to find prime");
	int l =sc.nextInt();
	int u =sc.nextInt();
	int x,i;
	for(x=l+1;x<=u-1;x++){
		for(i=2;i<x;i++){
		if(x%i==0)
		break;
		}
		if(i==x)
		System.out.println("prime number are = "+x);
	}

  	
}
}