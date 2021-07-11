package _20210711;

class Solution {
	public long solution(long n) {
		// Math Ŭ������ �����ϴ� ��� �޼���� �����̱� ������, Import�� MathŬ���� ���� ���� �ٷ� ��밡�ɤ�
		/*
		  Math.pow: Ư������ ���� ���ϱ�
		 		  : �Է°�, ��°� ��� double�� / Math.pow(����, ����)
		  Math.sqrt : Ư������ ������(��Ʈ) ���ϱ�
		  		    : �Է°�, ��°� ��� double�� / Math.sqrt(������)
		 */		    
        // n�� �������� ���ϰ� int�� �ٲ��ָ�, �Ҽ��� ���ϴ� ��������.
		// �� ���� �̿��� pow�޼��带 �̿��� ������ ���ϰ� n�̶� ������ ���Ѵ�.
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