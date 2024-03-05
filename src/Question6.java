import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Accept a number from user and check if it is palindrome number or not eg (121)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int ogNum=num;
		int reverse=0;
		
		while(num>0)
		{
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		if(ogNum==reverse)
		{
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
