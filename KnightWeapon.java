package programmers;

public class KnightWeapon {
	public static void main(String[] args) {
		System.out.println(solution3(100000, 3, 2));
		
	}
	
	public static int solution3(int number, int limit, int power) {
		int answer = 1;
		for(int i = 2; i <= number; i++) {
			int count = 0;
			int end = i;
			for(int j = 1; j < end; j++) {
				if(i % j == 0) {
					end = i / j;
					if(j == end) {
						count += 1;
					} else {
						count += 2;
					}
					if(count > limit) {
						break;
					}
				}
			}
			if(count > limit) {
				answer += power;
			} else {
				answer += count;
			}
		}
		return answer;
	}
}
