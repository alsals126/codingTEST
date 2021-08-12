package _20210812;

// ������, ������, Maro, ������, doh �� 3���� Ǯ��
class SolutionYou1 {
    public long solution(long price, long money, long count) {
    	// Math.max()
    	// : �Է¹��� �� ���� �� �� ū ���� �����ϴ� �Լ�
    	// ���������� �� : n(a+l)/2 (n�� '�� 1�׺��� �� n�ױ����� ~'�Ҷ� �� n, a�� ù ��, l�� ������ ��)    	
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
// �����ƴ��� Ǯ��
class SolutionYou2 {
    public long solution(int price, int money, int count) {

        long answer = money;

        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1)); // ������ �ִ� ������ �����ϴ� �ݾ��� ���� 
        }

        return (answer > 0 ? 0 : -answer); // ���׿����� �̿��ϱ�
    }
}

public class you {
	public static void main(String[] args) {
		SolutionYou1 s1 = new SolutionYou1();
		SolutionYou2 s2 = new SolutionYou2();
		
		System.out.println("SolutionYou1�� Testcase1: " + s1.solution(3, 20, 4));
		System.out.println("SolutionYou2�� Testcase1: " + s2.solution(3, 20, 4));
	}
}