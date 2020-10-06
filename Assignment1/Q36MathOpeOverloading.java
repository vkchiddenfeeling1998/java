import java .util.Scanner;
class Operation{
	void multiply(int num1,int num2){
		int multiply;
		multiply=num1*num2;
		System.out.println("product is = "+multiply);
	}
	void multiply(float num1,float num2,float num3){
		float multiply;
		multiply=num1*num2*num3;
		System.out.println("product is = "+multiply);
	}

	void multiply(double num1,int num2){
		double multiply;
		multiply=num1*(double)num2;
		System.out.println("product is = "+multiply);
	}
	


}
class Q36MathOpeOverloading{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Operation o= new Operation();
	o.multiply(12,13);
	o.multiply(12.5f,14.5f,13.5f);
	o.multiply(12.25,13);
	}

}