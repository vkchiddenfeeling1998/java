import java.util.Scanner;
class Person{
	private int age;
	private String name;
	void set(int age,String name){
		this.age=age;
		this.name=name;
	}
	void display(){
		if(age>=18){
		System.out.println("age is ="+age);
		}
		else{
		System.out.println("default should be 18");
		}
		System.out.println("name is ="+name);
	}

}
class Q37PersonDemo{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the age");
	int age = sc.nextInt();
	System.out.println("Enter the name");
	String name = sc.next();
	Person p = new Person();
	p.set(age,name);
	p.display();
}
}
