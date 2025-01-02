package basics_of_java;

public class Repeatations {

	public static void main(String[] args) {
		// TODO Find how many times numbers are repeated in Array
		int arr[] = {100, 200, 201, 301, 101, 201, 301, 450, 451,100, 301, 100, 450, 101};
		int num = 101;
		int count = 0;
		for (int x: arr) {
			if (x == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
