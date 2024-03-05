import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		//  Accept 10 numbers from user and print lowest number.
		int arr[]= new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<10;i++)
		{
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
