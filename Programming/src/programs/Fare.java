package programs;
import java.util.Scanner;
public class Fare {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=5; int c=15; int d=5; int e=10;
		System.out.println("Enter where sh is");
		char sh=sc.next().charAt(0);
		System.out.println("Enter where as is");
		char as=sc.next().charAt(0);
		switch (sh) 
		{
		case 'h':
			if (as == 'd')
				System.out.println(2*a);
			else if (as == 'k')
				System.out.println(2*(a+b));
			else if (as == 'm')
				System.out.println(2*(a+b+c));
			else if (as == 'a')
				System.out.println(2*(a+b+c+d));
			else if (as == 'l')
				System.out.println(2*(a+b+c+d+e));
			break;
		case 'd':
			if (as == 'k')
				System.out.println(2*b);
			else if (as == 'm')
				System.out.println(2*(b+c));
			else if (as == 'a')
				System.out.println(2*(b+c+d));
			else if (as == 'l')
				System.out.println(2*(b+c+d+e));
			break;
		case 'k':
			if (as == 'm')
				System.out.println(2*c);
			else if (as == 'a')
				System.out.println(2*(c+d));
			else if (as == 'l')
				System.out.println(2*(c+d+e));
			break;
		case 'm':
			if (as == 'a')
				System.out.println(2*d);
			else if (as == 'l')
				System.out.println(2*(d + e));
			break;
		case 'a':
			if (as == 'l')
				System.out.println(2*e);
			break;
		default:
			System.out.println("Invalid Character");
		
		}
	}

}
