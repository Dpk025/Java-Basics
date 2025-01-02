package basics_of_java;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Linear search in Array
		int arr[] = {100, 200, 205, 360, 121, 341, 987, 452,891};
		int se = 891;  // element to be search 
		boolean flag = false;
		
		for(int x: arr) {
			if (x == se) {
				System.out.println("Element Found");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Element Not Found!!!!");
		}

	}

}
