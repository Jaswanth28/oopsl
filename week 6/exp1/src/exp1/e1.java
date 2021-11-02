package exp1;

class animals
{
	void eat()
	{
		System.out.println("eating......");
	}
}
class dog extends animals
{
	void sleep()
	{
		System.out.println("sleeping......");
	}
}
public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.eat();
		d.sleep();

	}

}
