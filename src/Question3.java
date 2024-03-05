import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//Accept a number from user and do sum of digit
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int ans = 0;
		while(num>0)
		{
			int ans1 = num%10;
			ans+=ans1;
			num=num/10;
		}
		System.out.println("addition of the digit is "+ans);
	}

}
