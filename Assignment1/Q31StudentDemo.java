import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	void SetData(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	void showData(){
		System.out.println(rno+" "+name);
	}
}
class  Q31StudentDemo{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter rollno ");
	int rno=sc.nextInt();
	System.out.println("enter  name ");
	String name=sc.next();
	Student e= new Student();
	e.SetData(rno,name);
	e.showData();
	}
}
