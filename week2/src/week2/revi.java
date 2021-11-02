package week2;
import java.util.*;
public class revi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n=0;
		System.out.print("enter the value to find its reverse");
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		while(a!=0)
		{
			r=a%10;
			n=n*10+r;
			a=a/10;
		}
		b.close();
		System.out.println(n);
	}

}
