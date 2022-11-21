package programmers;

public class nextNumber1 {
	public static void main(String[] args) {
		int[] common = {1, 2, 3};
		System.out.println(solution(common));
	}
	public static int solution(int[] common) {
		int answer = 0;
        if((common[1]-common[0]) == (common[2] - common[1])){
            answer = common[common.length-1] + (common[1] - common[0]);
        } else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        return answer;
	}
}
