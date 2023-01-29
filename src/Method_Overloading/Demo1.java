package Method_Overloading;

public class Demo1
{
	//Example of Method Overloading
	
	// 2int parameter pass
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	// 3int parameter pass with same method name

	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) 
	{
		Demo1 D =new Demo1();
		D.add(10, 10);
		D.add(1, 2, 03);
		
	}
}
