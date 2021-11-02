package exp1;

class b
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
}
public class e6
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b.display();
		System.out.println(b.a);
	}

}
