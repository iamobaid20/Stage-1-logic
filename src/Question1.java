import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//Accept 10 numbers from user and do sum of it.(do not use array)

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 number");
		int num =0;
		for(int i=0;i<10;i++)
		{
			num+=sc.nextInt();
		}
		System.out.println("Your answer is "+num);

	}

}
