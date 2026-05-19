package java_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		
		String text ="cbufega"
				+ "ggr";
		String sentence = "java java selenium api api api";
		
		//text.chars().mapToObj(c -> Character.toUpperCase((char) c) ).forEach(System.out::println);
		
		//text.chars().mapToObj(ch -> (char) ch).filter(c -> "aeiou".indexOf(c) != -1).forEach(System.out::println);;
		
		//text.chars().distinct().mapToObj(ch -> String.valueOf((char)ch)).forEach(System.out::print);
		//System.out.println(out);
		
		//Map<String, Long> out = text.chars().mapToObj(ch ->  String.valueOf((char)ch)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//out.forEach((i,k)->System.out.println(i + " " +k));
		
		//Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((i,k)->System.out.println(i + " " +k));
		
		Set<Character> repeat = new HashSet<>();
		
	  Character output =	text.chars().mapToObj(ch -> (char) ch).filter(ch -> !repeat.add(ch)).findFirst().orElse(null);
		System.out.println(output);
	}
}
