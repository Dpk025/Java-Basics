package basics_of_java;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO sort the array
		int arr[] = {301, 205, 409, 508, 124, 391, 469, 223, 297};
		System.out.println("Array before Sorting...");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // it will not sort in descending order
		System.out.println("Array After Sorting...");
		System.out.println(Arrays.toString(arr));
		
		
		// Sorting Strings 
		
		String s[] = {"Deepak", "Kamal", "Anuj", "himanshu", "aashish"};
		System.out.println("String array before Sorting .... " + Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("String array after Sorting .... "+ Arrays.toString(s));
		
		// Sorting characters
		
		char ch[] = {'D', 'K', 'A', 'h', 'a', 'C'};
		System.out.println("Character array before Sorting .... " + Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println("Character array after Sorting .... "+ Arrays.toString(ch));
	}

}
