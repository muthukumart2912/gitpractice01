package java_project;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing {
	public static void main(String[] args) {
		
		String str = "MADAM";
		
		String rev = "";
		
		for(int i = str.length()-1 ; i >= 0; i--) {
			
			rev = rev +str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
