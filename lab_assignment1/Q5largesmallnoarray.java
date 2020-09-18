import java.util.Scanner;
public class Q5largesmallnoarray {

	public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
 	 System.out.println("Enter the size of the array:");
     	int size;
    	 size=sc.nextInt();
    	 int arr[ ]=new int[size];
  	int i,j=0;
	int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
  	System.out.println("Enter the Element of the array:");
     	 while(j<size)
     	{
         arr[j]=sc.nextInt();
         j++;

     	}
     	for(i=0;i<size;i++)
     	{
         if(arr[i]>=max)
         max=arr[i];
    	 }
     System.out.println("The largest element of array: "+max);
	for(i=0;i<size;i++)
     	{
         if(arr[i]<=min)
         min=arr[i];
    	 }
     System.out.println("The small element of array: "+min);

 }
}
