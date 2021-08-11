package _20210810;

// pursue503���� Ǯ��
class SolutionYou {
    public String solution(int[][] scores) {
    	// StringBuilder
    	// : String�� �Һ�(immutable)��ü�̴�. �׷��� String��ü�� String��ü�� ���ϸ� 
    	//   ���ο� String�� �����ϰ� �Ǿ� ���������� �����ʴ�.
    	// : �̷��� ���� �����ϰ��� StringBuilder�� ������ �Ǿ���.
    	//   String�� ���ڿ��� ���� �� ������ �����Ϳ� ���ϴ� ����� ����ϱ� ������ �ӵ��� ������ ��������� ���ϰ� ����.
    	// : append()�Լ��� �̿��Ͽ� ���ڿ��� ���� �� �ִ�.
        StringBuilder builder = new StringBuilder(); //�����
        for(int i=0; i<scores.length; i++) {
            int max = 0;
            int min = 101; //scores�� ���Ҵ� 0�̻� 100�����̱� ������
            int sum = 0;
            int divide = scores.length; //����
            for(int j=0; j<scores.length; j++) {
                int score = scores[j][i];
                if(i != j) { // �ڱ��ڽ��� ä���� ���� �ƴҶ� �������� �ְ����� ���Ѵ�.
                    if(score < min) {
                        min = score;
                    }
                    if(score > max) {
                        max = score;
                    }
                }
                sum += score; // �ڱ��ڽ��� ä���� ���� ������ �� ������ ��� ���Ѵ�.
            }
            // �ڱ��ڽ��� ä���� ������ ������ �������̳� �ְ�������
            if(scores[i][i] < min || scores[i][i] > max) { // �׷��� ����(==)�����ڸ� ���� �ʾҴ�.
            	// ������ �������̳� �ְ����̸�,
                sum -= scores[i][i]; // sum�������� �A��.
                divide--; // ���̿����� �A��.
            }
            double score = (double) sum / divide;
            builder.append(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 50 ? "D" : "F" );
        }
        return builder.toString();
    }
}

public class you {

	public static void main(String[] args) {
		int[][] scores1 = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
		int[][] scores2 = {{50, 90}, {50, 87}};
		int[][] scores3 = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
		
		SolutionYou s1 = new SolutionYou();
		SolutionYou s2 = new SolutionYou();
		SolutionYou s3 = new SolutionYou();
		
		System.out.println("Testcase1: " + s1.solution(scores1));
		System.out.println("Testcase2: " + s2.solution(scores2));
		System.out.println("Testcase3: " + s3.solution(scores3));
	}

}
