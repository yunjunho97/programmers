package programmers;

import java.util.Arrays;
import java.util.Stack;

public class hamburger {
	public static void main(String[] args) {
		int[] ingredient = {1, 2, 1, 2, 3, 1, 3, 1, 1, 2, 3, 1};
		System.out.println(solution5(ingredient));
		
		//0 1 2 3 4 5
		//1 2 3 4
	}
	
	
	//solution5 성공 
	public static int solution5(int[] ingredient) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb1 = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]", ""));
		int[][] table = new int[5][5];
		table[0][1] = 1;
		table[0][2] = 0;
		table[0][3] = 0;
		table[1][1] = 1;
		table[1][2] = 2;
		table[1][3] = 0;
		table[2][1] = 1;
		table[2][2] = 0;
		table[2][3] = 3;
		table[3][1] = 4;
		table[3][2] = 0;
		table[3][3] = 0;
		
		int state = 0;
		int i = 0;
		while(i != sb1.length()) {
			state = table[state][sb1.charAt(i)-48];
			stack.push(state);
			if(state == 4) {
				answer += 1;
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				sb1.replace(i-3, i+1, "");
				System.out.println(sb1);
				i = i-3;
				if(stack.isEmpty() == false) {
					state = stack.peek();
				}
			} else {
				i += 1;
			}
			//System.out.println(i + " " + sb1.length());
		}
		if(sb1.indexOf("1231") != -1) {
			answer += 1;
		}
		if(sb1.equals("1231")) {
			System.out.println("wef");
		}
		
		
		return answer;
	}
	
	//solution1 ~ 4 시간초과 
	
	public static int solution1(int[] ingrediant) {
		int answer = 0;
		
		String a = Arrays.toString(ingrediant);
		String b = a.replace(", ", "");
		String c = b.substring(1, b.length()-1);
		while(c.indexOf("1231") != -1) {
			int p = c.indexOf("1231");
            c = c.substring(0, p) + c.substring(p+4, c.length());
            answer += 1;
		}
		return answer;
	}
	
	public static int solution2(int[] ingredient) {
		int answer = 0;
		
		String a = Arrays.toString(ingredient);
		String b = a.replace(", ", "");
		String c = b.substring(1, b.length()-1);
		while(c.indexOf("1231") != -1) {
			c = c.replaceAll("1231", "0");
			while(c.indexOf("0") != -1) {
				c = c.replaceFirst("0", "");
				answer += 1;
			}
		}
		return answer;
	}
	
	public static int solution4(int[] ingredient) {
		int answer = 0;
		
		String a = Arrays.toString(ingredient);
		String b = a.replace(", ", "");
		String c = b.substring(1, b.length()-1);
		while(c.indexOf("1231") != -1) {
			c = c.replaceFirst("1231", "");
			answer += 1;
		}
		return answer;
	}
	
	
}
