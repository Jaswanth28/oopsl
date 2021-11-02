package exp1;

class c
{
	static int a=10;
	static void display()
	{
		System.out.println("static method");
	}
	static 
	{
		System.out.println("in static block");
	}
	static
	{
		System.out.println("in second static block");
	}
}
public class e7
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b.display();
		System.out.println(c.a);
	}

}
