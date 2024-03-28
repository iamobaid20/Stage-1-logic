import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//  Accept a number from user and find a factorial of a number.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rem = 1;
		while(num>1)
		{
			rem=rem*num;
			num--;
		}
		System.out.println("Factorial is "+rem);

	}

}
