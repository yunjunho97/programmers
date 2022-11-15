package programmers;

import java.util.Arrays;
import java.util.Stack;

public class fruit1 {
	public static void main(String[] args) {
		int[] list = {1,2,3,1,2,3,1}; // 1 1 1 2 2 3 3
		System.out.println(solution(3, 4, list));
		System.out.println(solution1(3, 4, list));
		
	}
	
	public static int solution(int k, int m, int score[]) {
		int answer = 0;
		int sum = 0;
		Arrays.sort(score);
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < score.length; i++) {
			stack.push(score[i]);
		}
		while(stack.isEmpty() == false) {
			for(int i = 0; i < m; i++) {
				if(stack.isEmpty() == true) {
					sum = 0;
					break;
				}
				if(i < m-1) {
					stack.pop();
				} else {
					sum = stack.peek();
					stack.pop();
				}
			}
			answer += sum*m;
		}
		
		
		return answer;
		
	}
	
	public static int solution1(int k, int m, int score[]) {
		int answer = 0;
		Arrays.sort(score);
		for(int i = score.length; i >= m; i -= m) {
			answer += score[i-m]*m;
		}
		return answer;
	}
}
