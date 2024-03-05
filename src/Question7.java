import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Accept a number from user and print next 5 number.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The next 5 numbers after "+num+" are");
		for(int i = 0 ; i<5;i++)
		{
			System.out.print(" "+(++num));
		}

	}

}
