package programmers;

import java.util.*;

public class HallOfFame {
	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int[] answer = solution(k, score);
		for(int i = 0; i < score.length; i++) {
			System.out.println(answer[i]);
		}
		System.out.println();
		int[] answer1 = solution1(k, score);
		for(int i = 0; i < score.length; i++) {
			System.out.println(answer1[i]);
		}
	}
	//min heap
	public static int[] solution(int k, int[] score) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int[] answer = new int[score.length];
		int i = 0;
		while(i < k && i < score.length) {
			queue.add(score[i]);
			answer[i] = queue.peek();
			i += 1;
		}
		while(i < score.length) {
			queue.add(score[i]);
			queue.remove();
			answer[i] = queue.peek();
			i += 1;
		}
		
		return answer;
	}
	
	//max heap
	public static int[] solution1(int k, int[] score) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		int[] answer = new int[score.length];
		int i = 0;
		while(i < k && i < score.length) {
			queue.add(score[i]);
			answer[i] = queue.peek();
			i += 1;
		}
		while(i < score.length) {
			queue.add(score[i]);
			queue.remove();
			answer[i] = queue.peek();
			i += 1;
		}
		
		return answer;
	}
}
