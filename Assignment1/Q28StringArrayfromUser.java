import java.util.Scanner;
public class Q27LargeSmallNo {

 	public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter the size of the array:");
     	int size;
     	size=sc.nextInt();
     	int arr[ ]=new int[size];
  	int i=0,max=arr[0],j=0;
 	System.out.println("Enter the Element of the array:");
      	while(j<size)
     	{
         arr[j]=sc.nextInt();
         j++;

     	}
     	while(i<size)
     	{
         if(arr[i]>=max)
         max=arr[i];
         i++;
     	}
     	System.out.println("The largest element of array: "+max);
 }
}