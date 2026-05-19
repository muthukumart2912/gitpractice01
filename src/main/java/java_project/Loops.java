package java_project;

public class Loops {

	public static void main(String[] args) {
		
		int[] arr = {3,8,9,2,5,7,4,9,1,3,-2};

		int largest = arr[0];
		int smallest = arr[0];
		
		int start = 0;
		while(start < arr.length ) {
			if(arr[start] > largest) {
				largest = arr[start];
			}
			
			if(arr[start] < smallest) {
				smallest = arr[start];
			}
			start++;
		}
		
		System.out.println(largest);
		System.out.println(smallest);

	}

}
