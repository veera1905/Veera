import java.util.*;

public class Babu{
	public static void main(String[] args) {
		
//		Scanner obj = new Scanner(System.in);
		String name = "veera babu";
		
//		System.out.println("Enter your name:");
		System.out.println("Your name is:" +name);
//		String name = obj.next();
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		char InputChar[] = name.toCharArray();
		for(int i=0;i<InputChar.length;i++) {
			
			if (count.containsKey(InputChar[i])) {
			   count.put(InputChar[i], count.get(InputChar[i])+1); 
			}
			else {
				count.put(InputChar[i], 1);
				}
		}
		System.out.println(count);
	}
}