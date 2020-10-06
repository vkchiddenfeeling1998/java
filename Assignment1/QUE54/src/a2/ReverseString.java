package a2;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string u wanna to reverse");
		String s= sc.next();
		StringBuffer ss=new StringBuffer(s);
		ss.reverse();
		System.out.print(ss);
	}

}
