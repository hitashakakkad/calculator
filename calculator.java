import java.util.Scanner;
public class calculator {
	static int a,b,total;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 ");
		a=sc.nextInt();
		System.out.println("enter num2");
		b=sc.nextInt();
		System.out.println("select +,-,*,/");
		String sym=sc.next();
		switch(sym)
		{
		case"+": total=a+b;
		System.out.println("addition is : "+total);
		break;
		case"-": total =a-b;
		System.out.println("subtraction is : "+total);
		break;
		case"*": total =a*b;
		System.out.println("multiplication is : "+total);
		break;
		case"/": total =a/b;
		System.out.println("division is : "+total);
		break;
		default: System.out.println("invalid symbol");
		break;
		}
		 
	}
}
