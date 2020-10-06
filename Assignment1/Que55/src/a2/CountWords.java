package a2;
import java.util.Scanner;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the strings");
			String str3=sc.nextLine();
			String str2[]=str3.split(" ");
			for(String ss:str2) {
				System.out.print(" "+ss);
			}
			System.out.println("");
			int i=str2.length;
			System.out.println(i);
	}

}
