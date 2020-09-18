import java.util.Scanner;
public class Q18CheckPrime{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
    int n =sc.nextInt();
	int i;
    for(i=2;i<=n-1;i++){
        if(n%i==0)
		break;
    }
    if(i==n)
    System.out.println(n+" is prime number");
    else
    System.out.println(n+"is not a prime number");
	}

}
