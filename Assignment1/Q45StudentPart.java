import java.util.Scanner;
class Student{
	private int rollno;
	private double percentage;
	Student(){
	percentage=0;	
	}
	Student(int rollno,double percentage){
		this.rollno=rollno;
		this.percentage=percentage;
	}
	void show(){
		System.out.println("Rollno is = "+rollno+" percentage  "+percentage+"%");
	}
	int getRoll(){return rollno;}
	double getPercentage(){
		return percentage;
	}
}
class Collegestudent extends Student{
	private int semester;
	Collegestudent(){
		semester=0;
	}
	Collegestudent(int rollno,double percentage,int semester){
		super(rollno,percentage);
		this.semester=semester;
	}
	void show(){
		super.show();
		System.out.println("semester is = "+semester);
	}
}
class Schoolstudent extends Student{
	private int classname;
	Schoolstudent(){
		classname=0;
	}
	Schoolstudent(int rollno,double percentage,int classname){
		super(rollno,percentage);
		this.classname=classname;
	}
	void show(){
		super.show();
		System.out.println("classnameis = "+classname);
	}
}
class  Q45StudentPart{
	public static void main(String args[]){
		Student sArr[]={ new Collegestudent(101,60,1),
			new Collegestudent(102,70,2),
			new Schoolstudent(201,90,10),
			new Schoolstudent(202,85,8),
			new Schoolstudent(203,65,5)};
		for(Student s:sArr){
			s.show();
		}
		 int searchRollNo = 15;

        	for (Student s : sArr) {
           	 	if (s.getRoll() == searchRollNo) {

                	if (s instanceof Collegestudent)
                    		System.out.println("This is a college student with following details:");
               		else if (s instanceof Schoolstudent)
                   	 	System.out.println("This is a School student with following details:");
               		s.show();
           	 	}
        	}
        	int count = 0;
        	for (Student s : sArr) {
          		if (s.getPercentage() >= 75) {
                	System.out.print("Grade = A  ");
                	s.show();
                	count++;
            		}
        	}

       		 System.out.println("No of students with A grade: " + count);

    		}
}

