package programs;
import java.util.Scanner;
public class Vowels {
	
		public static void main(String[] args) {
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter an Alphabet");
			char x=ip.next().charAt(0);
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'
				||	x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
			{
				System.out.println(x+" is a Vowel");
			}
			else
			{
				System.out.println(x+" is a consonant");
			}
		}

}
