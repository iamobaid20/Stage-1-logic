import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Accept a number from user and print next 5 number.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int stop=num;
		System.out.println("The next "+num+" numbers after "+num+" are");
		for(int i = 0 ; i<stop;i++)
		{
			System.out.print(" "+(++num));
		}

	}

}
