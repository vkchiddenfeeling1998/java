import java.util.Scanner;
public class Q24search{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	int size;
	size= sc.nextInt();
	int arr[]=new int[size];
	int j,temp=0;
	System.out.println("enter the elements");
	for(j=0;j<size;j++){
		arr[j]=sc.nextInt();
	}
	int ele;
	System.out.println("enter the element u wanna to search");
	ele= sc.nextInt();
	for(j=0;j<size;j++){
		if(arr[j]==ele){
		temp=1;
		}
	}
	if(temp==1)
		System.out.println(ele+" element found");
	else
		System.out.println(ele+" element not found");
	}

}
