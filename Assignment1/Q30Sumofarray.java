import java.util.Scanner;
class Q30Sumofarray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int r= sc.nextInt();
		int arr[][]=new int[r][];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("eneter the cols");
			int cols=sc.nextInt();
			arr[i]=new int[cols];
			for(int j=0;j<arr.length;j++){
				System.out.println("eneter the elements");
				arr[i][j]=sc.nextInt();
			}
		}

		for(int ar[]:arr){
			for(int a:ar){
				System.out.print(" "+a);
			}
		System.out.println(" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				sum=sum+arr[i][j];
			}
		System.out.println("sum = " + sum);
		}
	}
}