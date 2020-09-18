import java.util.Scanner;
public class Q19Series{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	int i;
	int num=2;
	int sum=0;
	for(i=0;i<n;i++){
		num+=10;
		if(i==n-1){
		System.out.print(num);
		break;
		}
		System.out.print(num+"+");
  	}
}
}