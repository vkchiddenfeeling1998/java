import java.util.*;

public class QUE6{
	public static void main( String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter sub");

	int subjects= sc.nextInt();
	int sum=0;
	for(int i=0;i<subjects;i++){
	int marks = sc.nextInt();
	sum+=marks;
	}
	int totalmarks= subjects*100;
	System.out.println(totalmarks);
	System.out.println(sum);
	float per = (float)((sum*100)/totalmarks);
	System.out.println("percent is" + per + "%");
}
}
