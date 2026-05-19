package java_project;

public class HashMapTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,6,9,4,5,0,-2};
		
		int largest = arr[0], smallest = arr[0] ,start = 0;
		int secondlargest=arr[0];
		
		while(start < arr.length) {
			if(arr[start] > largest) {
				largest = arr[start];
				secondlargest = largest;
			}
			
			start++;
		}
		
		System.out.println(largest);
		System.out.println(secondlargest);

	}

}
