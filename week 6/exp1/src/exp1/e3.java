package exp1;

import java.util.*;

class veh
{
	void ar(int a)
	{
		if(a==1)
		{
			System.out.println("TWO WHEELERS");
		}
		if(a==2)
		{
			System.out.println("FOUR WHEELERS");	
		}
	}
}

class tws extends veh
{
	void asr()
	{
		System.out.println("1.tvs");
		System.out.println("2.yamaha");
		System.out.println("3.honda");
	}
	void bsr ()
	{
		System.out.println("1.harley david son");
		System.out.println("2.bmw");
		System.out.println("triumph");
	}
}
class sct extends tws
{
	void ttrs()
	{
		System.out.println("1.scotey");
		System.out.println("2.bikes");
		System.out.println("enter the choice");
		Scanner h=new Scanner(System.in);
		int m=h.nextInt();
		if(m==1)
		{
			asr();
		}
		if(m==2)
		{
			bsr();
		}
	}
}
class fws extends veh
{
	void hel()
	{
		System.out.println("1.mustang");
		System.out.println("2.ferrari");
		System.out.println("3.ford");
	}
	void hell()
	{
		System.out.println("1.TESLA");
		System.out.println("2.AUDI E-TRON");
		System.out.println("BMW I- 8");
	}
}
class nng extends fws
{
	void ffrs()
	{
		System.out.println("1.regular cars");
		System.out.println("2.electrical");
		System.out.println("enter the choice");
		Scanner h=new Scanner(System.in);
		int n=h.nextInt();
		if(n==1)
		{
			hel();
		}
		if(n==2)
		{
			hell();
		}
	}
}
public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.two weelers");
		System.out.println("2.four weelers");
		System.out.println("enter the choice");
		Scanner h=new Scanner(System.in);
		int m=h.nextInt();
		if(m==1)
		{
			sct s=new sct();
			s.ar(m);
			s.ttrs();
		}
		if(m==2)
		{
			nng n=new nng();
			n.ar(m);
			n.ffrs();
		}
	}

}
