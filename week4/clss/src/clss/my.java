package clss;
import java.util.*;
public class my {
int a[];
int b[];
String c[];
a=new int[2];
b=new int[2];
c=new String[2];
Scanner d=new Scanner(System.in);
Scanner e=new Scanner(System.in);
Scanner f=new Scanner(System.in);
for(int i=0;i<2;i++)
{
	System.out.println("enter student"+i+"data");
	a[i]=d.nextInt();
	b[i]=e.nextInt();
	c[i]=f.nextLine();
}
d.close();
e.close();
f.close();
	public  static void main(String[] args){
		// TODO Auto-generated method stu//
		my obj=new my();
		for(int i=0;i<2;i++)
		{
			System.out.println("data of"+i+"student");
			System.out.println("the roll no is"+obj.a);
			System.out.println("the age is"+obj.b);
			System.out.println("the name is"+obj.c);
		}
		
	}

}
