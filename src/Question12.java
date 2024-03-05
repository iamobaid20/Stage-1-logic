import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// Accept 10 numbers from user and print highest and 2nd highest number
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int second_max = arr[1];
		for (int i = 0; i < 10; i++) {

			if (arr[i] > max) {
				second_max = max;
				max = arr[i];
			} else if (arr[i] > second_max) {
				second_max = arr[i];
			}
		}

		System.out.println("The highest and the second highest values are " + max + " " + second_max);

	}

}
