package a3;
import java.util.Scanner;
public class ReverseWords {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String reverceWord="";
	String str1[]=str.split(" ");
	
	for(String ss:str1) {
		StringBuilder ss1=new StringBuilder(ss);
		ss1.reverse();
		reverceWord+=ss1+" ";
	}
	System.out.print(reverceWord);
	
}
}


