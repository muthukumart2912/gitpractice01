package java_project;

public class ArraysTut {
	
	public static void main(String[] args) {
		
		String text = "hello world   selenium";
		
		char[] ch = text.toCharArray();
		
		boolean[] isVisited = new boolean[ch.length];
		
		for(int i = 0 ; i < ch.length ; i++) {
			if(isVisited[i]) {
				continue;
			}
			
			int count = 1;
			
			for(int j = i+1; j < ch.length ;j++) {
				if(ch[i] == ch[j]) {
					count++;
					isVisited[j] = true;
				}
			}
			
			System.out.println(ch[i] + "->"+count);
		}
		
		
	}

}
