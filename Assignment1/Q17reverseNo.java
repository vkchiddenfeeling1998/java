import java.util.Scanner;
public class Q17reverse No{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	int r =0;
	while (n != 0)
  	{
    		r = r * 10;
    		r = r + n%10;
    		n = n/10;
  	}

  	System.out.println("Reverse of the number = "+r);
}
}
