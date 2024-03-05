import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		//  Accept 10 numbers from user and print highest number.
		int arr[]= new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<10;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}
