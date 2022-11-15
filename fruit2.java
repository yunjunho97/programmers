package programmers;

import java.util.Arrays;

public class fruit2 {
	public static void main(String[] args) {
		int[] list = {1,2,3,1,2,3,1}; // 1 1 1 2 2 3 3
		System.out.println(solution1(3, 4, list));
		
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