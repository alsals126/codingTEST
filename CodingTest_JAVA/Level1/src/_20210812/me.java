package _20210812;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;        
        
        for(int i=1; i<=count; i++)
            answer += price*i;
        if(answer-money<=0)
            answer = 0;
        else answer = answer-money;
            
        return answer;
    }
}

public class me {
	public static void main(String[] args) {
		Solution s1 = new Solution();
		
		System.out.println("Testcase1: " + s1.solution(3, 20, 4));
	}
}