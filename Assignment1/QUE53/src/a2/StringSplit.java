package a2;
public class StringSplit {

	public static void main(String[] args) {
		String s[]= {"67","89","23","12","55","66","67"};
		
		for(String a : s) {
			System.out.println(a);
		}
		double sum=0;
		for(String ss:s) {
			int a=Integer.parseInt(ss);
			sum+=a;
		}
		System.out.println("Sum of Integers are:"+sum);

	}

}
