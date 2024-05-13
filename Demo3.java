/*
  Inheritance : Property of a class to acquire the properties of another class.
  
  Form of Inheritance:
  
  A) Single Inheritance :        X      Base/Parent/Super Class
                                 |
                                 Y      Derived/Child/Sub Class
                                 
  B) Multilevel Inheritance :    X
                                 |
                                 Y
                                 |
                                 Z
                               
  C) Hierarchical Inheritance:    X
                                _|_
                               |     |
                               Y     Z
                          
  D) Hybrid Inheritance:          X
                                  |
                                  Y
                                _|_
                               |     |
                               W     Z
                               
  * Multiple Inheritance : Java Doesn't Support it.
                             X      Y
                             ||
                                 |
                                 Z
  
 */
class Person  //Person is a base/parent/super class
{
	String name;
	String email;
	String phone;
	Person(String n, String e, String p)  // constructor 
	{
		name=n;
		email=e;
		phone=p;
	}
	/*void set_data(String n, String e, String p)
	{
		name=n;
		email=e;
		phone=p;
	}*/
	void display()
	{
		System.out.println("NAME : "+name+"\nEMAIL : "+email+"\nPHONE : "+phone);
	}
}
class Student extends Person //Student is a derived/child/sub class
{
	int roll;
	String cls;
	int marks;
	Student(String n, String e, String p,int r, String c,int m)
	{
		super(n,e,p);  // call to the base class constructor
		roll=r;
		cls=c;
		marks=m;
	}
	/*
	void set_student_data(int r, String c,int m)
	{
		roll=r;
		cls=c;
		marks=m;
	*/
	void show()
	{
		System.out.println("ROLL : "+roll+"\nCLASS : "+cls+"\nMARKS : "+marks);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Student obj=new Student("Abc Def", "abc@def.com", "9876543210",1, "XII", 999);
		//obj.set_data("Abc Def", "abc@def.com", "9876543210");
        //obj.set_student_data(1, "XII", 999);
        obj.display();
        obj.show();
	}

}