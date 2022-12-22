package programmers;

import java.util.*;

public class NearSameChar {
	public static void main(String[] args) {
		String a = "banana";
		int[] answer = solution(a);
		for(int i = 0; i < a.length(); i++) {
			System.out.println(answer[i]);
		}
		int[] answer1 = solution1(a);
		for(int i = 0; i < a.length(); i++) {
			System.out.println(answer1[i]);
		}
	}
	public static int[] solution(String a) {
		ArrayList<String> list = new ArrayList<>();
		int[] answer = new int[a.length()];
		for(int i = 0; i < a.length(); i++) {
			String s = Character.toString(a.charAt(i));
			int index = list.indexOf(s);
			if(index == -1) {
				list.add(s);	
				answer[i] = -1;
			} else {
				answer[i] = list.size() - list.lastIndexOf(s);
				list.add(s);
			}
		}
		return answer;
	}

	public static int[] solution1(String a) {
		HashMap<Character, Integer> map = new HashMap<>();
		int[] answer = new int[a.length()];
		for(int i = 0; i < a.length(); i++) {
			if(map.containsKey(a.charAt(i)) == false) {
				map.put(a.charAt(i), i);
				answer[i] = -1;
			} else {
				answer[i] = i - map.get(a.charAt(i));
				map.put(a.charAt(i), i);
			}
		}
		
		return answer;
	}
}
