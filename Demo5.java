/*
  thread : light weight process (flow of control)
  Multi-thread : Multiple flow of control 
  Lifecyle : start -> ready <-> running <->blocked/stop
  How to create threads - 1. creating the thread class 
                          2. implementing the Runnable interface
 */
/*class A extends Thread
{
	public void run() 
	{
		System.out.println("From thread A");
		for(int i=1;i<=10;i++)
			System.out.println("i="+i);
	}
}
class B extends Thread
{
	public void run() 
	{
		System.out.println("From thread B");
		for(int j=1;j<=10;j++)
			System.out.println("j="+j);
	}
}
class C extends Thread
{
	public void run() 
	{
		System.out.println("From thread C");
		for(int k=1;k<=10;k++)
			System.out.println("k="+k);
	}
}
*/
class A implements Runnable
{
	public void run()
	{
		System.out.println("From thread A");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		A obj1=new A();
		Thread x=new Thread(obj1);
		//B obj2=new B();
		//C obj3=new C();
		x.start();
		//obj2.start();
		//obj3.start();

	}

}