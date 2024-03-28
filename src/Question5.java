import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		//Accept a number from user and reverse it
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int reverse=0;
		while(num>0)
		{
			int num1=num%10;
			//System.out.println(num1);
			reverse = reverse *10 +num1;
			num=num/10;
			
		}
		System.out.println(reverse);
	}

}
