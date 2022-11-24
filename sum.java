package programmers;

public class sum {
	public static void main(String[] args) {
		System.out.println(solution(4,14));
		
	}
	public static int solution(int num, int total) {
		
	        int[] answer = new int[num];
	        int mid = total / num;
	        if(mid * num != total){
	            for(int i = 0; i < num; i++){
	                answer[i] = (mid - (num/2)) + 1 + i;
	            }
	        } else {
	            for(int i = 0; i < num; i++){
	                answer[i] = (mid - (num/2)) + i;
	            }   
	        }
	        return answer[0];
	    
	}
}
