package _20210810;

import java.util.Arrays;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int len = scores.length;
        int[][] students = new int[len][len]; // 학생 개개인의 점수를 한 방에 모은 배열
        double[] avgArr = new double[len]; // 평균을 모아놓은 배열
        
        // 학생 개개인의 점수를 한 방에 모으기
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                students[i][j] = scores[j][i];
            }
        }
        
        for(int i=0; i<len; i++){
            avgArr[i] = avg(students[i], i);
        }
        
        for(double a : avgArr){
            if(a>=90)
                answer += 'A';
            else if(a>=80)
                answer += 'B';
            else if(a>=70)
                answer += 'C';
            else if(a>=50)
                answer += 'D';
            else
                answer += 'F';
        }
        return answer;
    }
    
    // 평균을 구하는 메서드
    public double avg(int n[], int s){ // int s는 자기자신이 채점한 점수의 인덱스를 의미
        int sum = 0;
        int cnt = 0; // 1(자기자신이 채점한 점수가 유일한~~) 아니면 0이다. 편의상 int로 함.
        // min과 max에는 인덱스가 들어간다.
        // min과 max에는 유일한 최저점, 유일한 최고점이면 2~10의 숫자가 들어간다. 만약 아니면 100이 들어간다.
        // => 학생 수는 2명이상 10이하이기 떄문에
        int min = min(n, s);
        int max = max(n, s);
        
        for(int i=0; i<n.length; i++){
            if(i!=min && i!=max) 
                sum += n[i];
            else
                cnt++;
        }
        
        return (double)(sum/(n.length-cnt));
    }
    
    // 제외할게 없으면 100 리턴
    // 제외할게 있으면 인덱스 리턴
    public int min(int n[], int s){
        int m = n[0];
        int result = 0;
        
        // 최저점 구하기
        for(int i=1; i<n.length; i++){
            if(m>n[i]){
                m=n[i];
                result = i;
            }
        }
        // 최저점이 여러개인지
        for(int i=0; i<n.length; i++)
            if(result!=i && m==n[i])
                return 100;
        // 자기자신이 평가한 것인지
        if(result != s) return 100;        
        
        return result;        
    }
    public int max(int n[], int s){
        int m = n[0];
        int result = 0;
        
        // 최고점 구하기
        for(int i=1; i<n.length; i++){
            if(m<n[i]){
                m=n[i];
                result = i;
            }
        }
        // 최고점이 여러개인지
        for(int i=0; i<n.length; i++)
            if(result!=i && m==n[i])
                return 100;
        // 자기자신이 평가한 것인지
        if(result != s) return 100;
        
        return result;        
    }
}
public class me {
	public static void main(String[] args) {
		int[][] scores1 = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
		int[][] scores2 = {{50, 90}, {50, 87}};
		int[][] scores3 = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
		
		Solution s1 = new Solution();
		Solution s2 = new Solution();
		Solution s3 = new Solution();
		
		System.out.println("Testcase1: " + s1.solution(scores1));
		System.out.println("Testcase2: " + s2.solution(scores2));
		System.out.println("Testcase3: " + s3.solution(scores3));
	}
}
