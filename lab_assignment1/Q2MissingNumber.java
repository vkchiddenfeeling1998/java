import java.util.Scanner;
public class Q2MissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of the array:");
		     int size,i;
		     size=sc.nextInt();
		     int arr[ ]=new int[size];
		     System.out.println("Enter the Element of the array:");
		      for(i=0;i<size;i++)
		     {
		         arr[i]=sc.nextInt();
		     }
		     
		      int sum=0;
		      for(i=0;i<size;i++)
		      {
		          sum+=arr[i];
		      }
		      int size2=size+1;
		      int miss=(size2*(size2+1))/2;
		      System.out.println("Missing Number is: "+Math.abs(miss-sum));
		  
	}
}