package wk7;

interface p{
	public void c();
}
class x implements p{
	public void c()
	{
		System.out.println("he");
	}
}
public class ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x g=new x();
		g.c();
	}

}
