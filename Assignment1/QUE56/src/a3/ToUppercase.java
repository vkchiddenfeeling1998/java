package a3;
import java.util.Scanner;
public class ToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		char ch=' ';
		System.out.println("enter the string in lowercase");
		String str= sc.next();
		for(int i=0;i<str.length();i++) {
			if(ch==' ' && str.charAt(i)!=' ') 
				s.append(Character.toUpperCase(str.charAt(i)));
		   else
		                s.append(str.charAt(i)); 
				ch=str.charAt(i);
			
		}
		
		System.out.print(s.toString().trim());
	}

}