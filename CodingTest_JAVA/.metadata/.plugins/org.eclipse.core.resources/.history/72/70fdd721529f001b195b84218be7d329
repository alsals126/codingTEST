package c20210417;
// 주석은 내가 삽입
// '다른 사람의 풀이'중 가장 상단에 있는 풀이 가져옴...
// 다들 천재시네욥.. ><
import java.util.*;

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 1, 3, 3, 0, 1, 1};
		
		ArrayList<Integer> tempList = new ArrayList<Integer>(); // ArrayList 선언
		int preNum = 10; // 0~9의 숫자만 들어가있으니까 10을 넣어준다.
		                 // 그러면 첫번째 인덱스가 먼저 ArrayList에 들어감 ==> "내가 이 부분을 생각하지 못함"
		for(int num : arr) { // arr 돌리기
			if(preNum != num)       // num이랑 preNum이 같지 않으면
				tempList.add(num);  // ArrayList에 num 삽입
		    preNum = num;           // preNum에 num을 삽입
		}       
		
		// ArrayList에 있는 값들을 answer에 넣어주기
		int[] answer = new int[tempList.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = tempList.get(i).intValue();
		}
		
		// 결과가 잘나오는지 출력
		System.out.print("[ ");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print("]");
	}
}
