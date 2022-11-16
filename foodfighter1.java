package programmers;

public class foodfighter1 {
	public static void main(String[] args) {
		
	}
	public static String solution1(int[] food) {
		String answer = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 != 0){
                food[i] -= 1;
            }
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        StringBuffer a = new StringBuffer(answer);
        a = a.reverse();
        answer += "0";
        answer += a;

        return answer;
	}
	
	//개선1: food[i]가 홀수일때의 처리를 따로 안해줘도 됨 ////////////////////////
	public static String solution2(int[] food) {
		String answer = "";
        for(int i = 1; i < food.length; i++){
        	//if(food[i] % 2 != 0){           <- 불필요한 코드 
            //    food[i] -= 1;
            //}
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        StringBuffer a = new StringBuffer(answer);
        a = a.reverse();
        answer += "0";
        answer += a;

        return answer;
	}
	
	//개선2: food배열의 끝부터 역순으로 loop, answer의 가운데부터 동시에 양쪽으로 붙여나감 ///////////////////////
	public static String solution3(int[] food) {
		String answer = "0";  // <- 0을 추가하고 시작
        for(int i = food.length-1; i > 0; i--){ // <- 역순으로
            for(int j = 0; j < food[i]/2; j++){
                answer = i + answer + i;
            }
        }
        StringBuffer a = new StringBuffer(answer);
        a = a.reverse();
        answer += "0";
        answer += a;

        return answer;
	}
	
}
