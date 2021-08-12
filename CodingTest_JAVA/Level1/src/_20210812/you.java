package _20210812;

// 유준혁, 류정문, Maro, 지수연, doh 외 3명의 풀이
class SolutionYou1 {
    public long solution(long price, long money, long count) {
    	// Math.max()
    	// : 입력받은 두 인자 값 중 큰 값을 리턴하는 함수
    	// 등차수열의 합 : n(a+l)/2 (n은 '제 1항부터 제 n항까지의 ~'할때 그 n, a는 첫 항, l은 마지막 항)    	
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
// 이태훈님의 풀이
class SolutionYou2 {
    public long solution(int price, int money, int count) {

        long answer = money;

        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1)); // 가지고 있는 돈에서 지불하는 금액을 뺀다 
        }

        return (answer > 0 ? 0 : -answer); // 삼항연산자 이용하기
    }
}

public class you {
	public static void main(String[] args) {
		SolutionYou1 s1 = new SolutionYou1();
		SolutionYou2 s2 = new SolutionYou2();
		
		System.out.println("SolutionYou1의 Testcase1: " + s1.solution(3, 20, 4));
		System.out.println("SolutionYou2의 Testcase1: " + s2.solution(3, 20, 4));
	}
}