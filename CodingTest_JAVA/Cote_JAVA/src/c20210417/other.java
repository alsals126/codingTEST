package c20210417;
// �ּ��� ���� ����
// '�ٸ� ����� Ǯ��'�� ���� ��ܿ� �ִ� Ǯ�� ������...
// �ٵ� õ��ó׿�.. ><
import java.util.*;

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 1, 3, 3, 0, 1, 1};
		
		ArrayList<Integer> tempList = new ArrayList<Integer>(); // ArrayList ����
		int preNum = 10; // 0~9�� ���ڸ� �������ϱ� 10�� �־��ش�.
		                 // �׷��� ù��° �ε����� ���� ArrayList�� �� ==> "���� �� �κ��� �������� ����"
		for(int num : arr) { // arr ������
			if(preNum != num)       // num�̶� preNum�� ���� ������
				tempList.add(num);  // ArrayList�� num ����
		    preNum = num;           // preNum�� num�� ����
		}       
		
		// ArrayList�� �ִ� ������ answer�� �־��ֱ�
		int[] answer = new int[tempList.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = tempList.get(i).intValue();
		}
		
		// ����� �߳������� ���
		System.out.print("[ ");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print("]");
	}
}
