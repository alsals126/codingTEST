package _20210810;

// pursue503님의 풀이
class SolutionYou {
    public String solution(int[][] scores) {
    	// StringBuilder
    	// : String은 불변(immutable)객체이다. 그래서 String객체와 String객체를 더하면 
    	//   새로운 String을 생성하게 되어 성능적으로 좋지않다.
    	// : 이러한 점을 보완하고자 StringBuilder가 나오게 되었다.
    	//   String과 문자열을 더할 때 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
    	// : append()함수를 이용하여 문자열을 더할 수 있다.
        StringBuilder builder = new StringBuilder(); //결과값
        for(int i=0; i<scores.length; i++) {
            int max = 0;
            int min = 101; //scores의 원소는 0이상 100이하이기 때문에
            int sum = 0;
            int divide = scores.length; //길이
            for(int j=0; j<scores.length; j++) {
                int score = scores[j][i];
                if(i != j) { // 자기자신이 채점한 것이 아닐때 최저점과 최고점을 구한다.
                    if(score < min) {
                        min = score;
                    }
                    if(score > max) {
                        max = score;
                    }
                }
                sum += score; // 자기자신이 채점한 것을 포함한 내 점수를 모두 합한다.
            }
            // 자기자신이 채점한 점수가 유일한 최저점이나 최고점인지
            if(scores[i][i] < min || scores[i][i] > max) { // 그래서 같다(==)연산자를 넣지 않았다.
            	// 유일한 최저점이나 최고점이면,
                sum -= scores[i][i]; // sum변수에서 뺸다.
                divide--; // 길이에서도 뺸다.
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
