import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Accept term from user and print Fibonacci series.
		
		int first=0;
		int second=1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("The fibonacci series are "+first+"  "+second);
		for(int i=0;i<num;i++)
		{
			int temp=second;
			second= second +first;
			first = temp;
			
			System.out.print("  "+second);
		}
	}

}
