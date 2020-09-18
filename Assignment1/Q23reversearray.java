import java.util.Scanner;
public classimport java.util.Scanner;

public class Q23reversearray {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array:");
     int size;
     size=sc.nextInt();
     int arr[ ]=new int[size];
  int j;
  System.out.println("Enter the Element of the array:");
        for(j=0;j<size;j++)
         {
         arr[j]=sc.nextInt(); 
         }
        System.out.println("After reversing array is :");
         for(int i=size-1;i>=0;i--)
        {
         System.out.print(arr[i]+" ");
         }
   
 }
}
