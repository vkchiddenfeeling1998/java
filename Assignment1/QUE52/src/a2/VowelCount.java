package a2;
import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
	  int count=0;
	  String str=sc.nextLine();
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
			  count++;
		  }
	  }
	  System.out.print("Total Number Of vowels is: "+count);
	}

}
