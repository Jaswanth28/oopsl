package wk7;

abstract class a{
	void hel()
	{
		System.out.println("hello guys");
	}
}
class b extends a{
	void he()
	{
		System.out.println("hey");
	}
}
public class abcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b f=new b();
		f.he();
		f.hel();
	}

}
