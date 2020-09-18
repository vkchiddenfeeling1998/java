import java.util.Scanner;
public class Q25SumEvenOdd{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[10];
	int s1=0;
	int s2=0;
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
		if(a[i]%2==0){
		System.out.println(a[i]);
		s1=s1+a[i];
		}
		else{
		System.out.println(a[i]);
		s2=s2+a[i];
		}
	}
	System.out.println("sum of even = "+s1);
	System.out.println("sum of odd = "+s2);


}
}
