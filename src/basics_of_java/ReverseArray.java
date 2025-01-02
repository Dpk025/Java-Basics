package basics_of_java;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Reverse a array
		int arr[] = {301, 205, 409, 508, 124, 391, 469, 223, 297};
		System.out.println("Array before reversing...");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array before reversing...");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}

	}

}
