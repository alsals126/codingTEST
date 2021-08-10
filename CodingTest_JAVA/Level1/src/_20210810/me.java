package _20210810;

import java.util.Arrays;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int len = scores.length;
        int[][] students = new int[len][len]; // �л� �������� ������ �� �濡 ���� �迭
        double[] avgArr = new double[len]; // ����� ��Ƴ��� �迭
        
        // �л� �������� ������ �� �濡 ������
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
    
    // ����� ���ϴ� �޼���
    public double avg(int n[], int s){ // int s�� �ڱ��ڽ��� ä���� ������ �ε����� �ǹ�
        int sum = 0;
        int cnt = 0; // 1(�ڱ��ڽ��� ä���� ������ ������~~) �ƴϸ� 0�̴�. ���ǻ� int�� ��.
        // min�� max���� �ε����� ����.
        // min�� max���� ������ ������, ������ �ְ����̸� 2~10�� ���ڰ� ����. ���� �ƴϸ� 100�� ����.
        // => �л� ���� 2���̻� 10�����̱� ������
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
    
    // �����Ұ� ������ 100 ����
    // �����Ұ� ������ �ε��� ����
    public int min(int n[], int s){
        int m = n[0];
        int result = 0;
        
        // ������ ���ϱ�
        for(int i=1; i<n.length; i++){
            if(m>n[i]){
                m=n[i];
                result = i;
            }
        }
        // �������� ����������
        for(int i=0; i<n.length; i++)
            if(result!=i && m==n[i])
                return 100;
        // �ڱ��ڽ��� ���� ������
        if(result != s) return 100;        
        
        return result;        
    }
    public int max(int n[], int s){
        int m = n[0];
        int result = 0;
        
        // �ְ��� ���ϱ�
        for(int i=1; i<n.length; i++){
            if(m<n[i]){
                m=n[i];
                result = i;
            }
        }
        // �ְ����� ����������
        for(int i=0; i<n.length; i++)
            if(result!=i && m==n[i])
                return 100;
        // �ڱ��ڽ��� ���� ������
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
