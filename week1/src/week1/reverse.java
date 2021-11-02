package week1;

public class reverse {
	public static void main(String args[]) {
		int n=135;
		int r=0,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(""+s);
	}

}
