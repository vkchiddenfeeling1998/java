import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	Double salary;
	Employee(int empId,String empName,Double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee"+ empId + " empName=" + empName + " salary=" + salary ;
	}
	int getid() {
		return empId;
	}
}
public class ToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee arr[]=new Employee[4];
		int count=0;
		outer:
		for(int i=0;i<arr.length;) {
		//outer:
			System.out.println("Enter Employee Id,name, salary");
		int eid=sc.nextInt();
		//sc.Next();
		String name1=sc.next();
		double sal=sc.nextDouble();
			for(int j=0;j<count;j++) {
				int k=arr[j].getid();
		        if(k==eid) {
		        	System.out.println("These Employee id already exist:");
		        	continue outer;
		        }
			}
		Employee e1=new Employee(eid,name1,sal);
		
		arr[i]=e1;
		count++;
		i++;
		}
		for(Employee e: arr) {
			System.out.println(e.toString());
		}
	}

}

