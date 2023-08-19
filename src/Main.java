import java.util.Scanner;

public class Main {
	
	static int gcd(int num1 ,int num2) {
		int remainder = num1%num2;
		int gcd = 1;
		while(remainder != 0) {
			int quotient = num1 / num2;
			int r = num1 - (quotient * num2);
			if(r == 0)
				break;
			gcd = r;
			num1 = num2;
			num2 = r;
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1 >= num2)
			System.out.println("GCD of " + num1 + " and " + num2 +" is: " + gcd(num1,num2));
		else
			System.out.println("GCD of " + num1 + " and " + num2 +" is: " + gcd(num2,num1));
	}
}
