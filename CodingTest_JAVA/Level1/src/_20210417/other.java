package _20210417;
// �ּ��� ���� ����
// '�ٸ� ����� Ǯ��'�� ���� ��ܿ� �ִ� Ǯ�� ������...(����� ������ ������ ������)
// �ٵ� õ��ó׿�.. ><
import java.util.Arrays;

public class other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 36, 1, 3};
		int divisor = 1;
		
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		// �迭�� stream ��ü�� �����. �׷� ���� ���͸��� �Ѵ�. 
		// �����Լ� : �͸� �Լ��� ��Ī�ϴ� ���(�Լ��� �̸��� ����)	   /    (�Ű�����) -> {���๮}
		// ���ٽ��� �̿� => factor(arr�� ��)��� �Ű������� ����� factor%divisor�� 0�̶�� 
		// toArray()�Լ��� �̿��� answer�迭�� �ִ´�.
		
		if(answer.length == 0)         // answer ���̰� 0�̶�� 
			answer = new int[] {-1};   // -1���� �־��ش�.
		Arrays.sort(answer); //����
		
		// ����� �߳������� ���
		System.out.print("[ ");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print("]");
	}
}
