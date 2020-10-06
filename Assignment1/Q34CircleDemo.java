import java.util.Scanner;
class Circle{
	private int radius;
	private float area;
	void init(int radius){
		this.radius=radius;
	}
	void CalculateArea(int radius){
		area=3.14f*radius*radius;
	}
	void display(){
		System.out.println("radius is = "+radius);
		System.out.println("area is = "+area);
	}
}
class  Q34CircleDemo{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter radius ");
	int radius=sc.nextInt();
	Circle c = new Circle();
	c.init(radius);
	c.CalculateArea(radius);
	c.display();
	}
}
