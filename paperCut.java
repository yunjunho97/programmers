package programmers;

public class paperCut {
	public static void main(String[] args) {
		
	}
	public int solution(int M, int N) {
        int answer = 0;
        answer += N-1;
        answer += N*(M-1);
        return answer;
    }
}
