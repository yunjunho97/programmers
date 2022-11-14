package programmers;

public class babbling1 {
	public static void main(String[] args) {
		String[] list = {"ayaye", "wooayayema", "aweareg"};
		
		System.out.println(aaa(list));
	}
	public static int aaa(String[] lista) {
		int answer = 0;
		String[] list = {"aya", "ye", "woo", "ma"};
		
		for(int i = 0; i < lista.length; i++) {
			int k = 0;
			while(true) {
				if(k >= lista[i].length()) {
					answer += 1;
					break;
				}
				try {
				if(lista[i].charAt(k) == 'a') {
					String a = lista[i].substring(k, k+3);
					if(a.equals(list[0])) {
						k += 3;
					} else {
						break;
					}
				} else if(lista[i].charAt(k) == 'y') {
					String a = lista[i].substring(k, k+2);
					if(a.equals(list[1])) {
						k += 2;
					} else {
						break;
					}
				} else if(lista[i].charAt(k) == 'w') {
					String a = lista[i].substring(k, k+3);
					if(a.equals(list[2])) {
						k += 3;
					} else {
						break;
					}
				} else if(lista[i].charAt(k) == 'm') {
					String a = lista[i].substring(k, k+2);
					if(a.equals(list[3])) {
						k += 2;
					} else {
						break;
					}
				} else {
					break;
				}
				} catch(Exception e) {
					break;
				}
			}
		}			
		
		return answer;
	}
}
