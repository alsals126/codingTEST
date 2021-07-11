package _20210417;
// 주석은 내가 삽입
// '다른 사람의 풀이'중 가장 상단에 있는 풀이 가져옴...(개편된 문제의 정답을 가져옴)
// 다들 천재시네욥.. ><
import java.util.Arrays;

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 36, 1, 3};
		int divisor = 1;
		
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		// 배열을 stream 객체를 만든다. 그런 다음 필터링을 한다. 
		// 람다함수 : 익명 함수를 지칭하는 용어(함수의 이름이 없는)	   /    (매개변수) -> {실행문}
		// 람다식을 이용 => factor(arr의 값)라는 매개변수를 만들고 factor%divisor이 0이라면 
		// toArray()함수를 이용해 answer배열에 넣는다.
		
		if(answer.length == 0)         // answer 길이가 0이라면 
			answer = new int[] {-1};   // -1값만 넣어준다.
		Arrays.sort(answer); //정렬
		
		// 결과가 잘나오는지 출력
		System.out.print("[ ");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print("]");
	}
}
