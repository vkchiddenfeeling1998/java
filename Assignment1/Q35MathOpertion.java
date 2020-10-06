import java .util.Scanner;
class Operation{
	private float num1;
	private float num2;
	void sum(float num1,float num2){
		float sum;
		sum=num1+num2;
		System.out.println("Sum is = "+sum);
	}
	void subract(float num1,float num2){
		float subract;
		subract=num1-num2;
		System.out.println("Subraction is = "+subract);
	}
	void multiply(float num1,float num2){
		float multiply;
		multiply=num1*num2;
		System.out.println("product is = "+multiply);
	}

	void power(float num1,float num2){
		double power;
		power=Math.pow(num1,num2);
		System.out.println("power is = "+power);
	}


}
class Q35MathOpertion{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	float num1=sc.nextFloat();
	float num2=sc.nextFloat();
	Operation o= new Operation();
	o.sum(num1,num2);
	o.subract(num1,num2);
	o.multiply(num1,num2);
	o.power(num1,num2);
	}

}
