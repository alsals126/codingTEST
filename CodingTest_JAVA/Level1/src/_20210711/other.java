package _20210711;

class Solution {
	public long solution(long n) {
		// Math 클래스가 제공하는 모든 메서드는 정적이기 때문에, Import나 Math클래스 선언 없이 바로 사용가능ㄴ
		/*
		  Math.pow: 특정값의 제곱 구하기
		 		  : 입력값, 출력값 모두 double형 / Math.pow(숫자, 지수)
		  Math.sqrt : 특정값의 제곱근(루트) 구하기
		  		    : 입력값, 출력값 모두 double형 / Math.sqrt(대상숫자)
		 */		    
        // n의 제곱근을 구하고 int로 바꿔주면, 소수점 이하는 없어진다.
		// 그 점을 이용해 pow메서드를 이용해 제곱을 구하고 n이랑 같은지 비교한다.
		if (Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
	    }
		return -1;
	}
}

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solution(121));
		System.out.println(s.solution(3));
		System.out.println(Math.sqrt(122));
	}

}
