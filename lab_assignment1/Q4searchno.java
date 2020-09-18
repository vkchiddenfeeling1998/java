import java.util.Scanner;
public class Q4searchno {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array:");
  int i,temp=0,size;
     size=sc.nextInt();
     int arr[ ]=new int[size];
  System.out.println("Enter the Element of the array:");
      for(i=0;i<size;i++)
     {
         arr[i]=sc.nextInt();
     }
      int ele;
      System.out.print("\nEnter the search element:");
      ele=sc.nextInt();

      System.out.print("\nArray elements are:");
      for(i=0;i<size;i++)
      {
       System.out.print(arr[i]+" ");
      }
      for(i=0;i<size;i++)
      {
          if(arr[i]==ele)
              temp=1;
      }
      if(temp==1)
       System.out.print("\nElement found....");
      else
       System.out.print("\nElement not found....");


 }
}