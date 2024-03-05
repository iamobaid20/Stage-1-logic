import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//  Accept a number from user and count number of digits.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int count =0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("NUmber of digit "+count);
				;

	}

}
