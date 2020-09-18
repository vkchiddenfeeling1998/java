import java.util.Scanner;
public class Q21SumAvg{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[10];
	int s=0;
	float avg;
	System.out.println("Enter any 10 numbers");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int a:arr){
		System.out.print(" "+a);
	}
	System.out.println("");
	for(int i=0;i<arr.length;i++)
	{
	    s=s+arr[i];
	}
	System.out.println("sum is = "+s);
	avg= (float)s/10;
    System.out.println("avg is = "+avg);


}
}
