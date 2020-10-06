package a3;
import java.util.Scanner;
public class WeekDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2[]= {"Sunday","Monday","Tuesady","Wednesday","Thurday","Friday","Saturady"};
		System.out.println("enter the day number");
		int a=sc.nextInt();
		for(int i=0;i<str2.length;i++) {
			if(i==(a-1)) {
				System.out.print(str2[i]);
				break;
			}
		}
		

	}

}


