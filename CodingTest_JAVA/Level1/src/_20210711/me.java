package _20210711;

public class me {
	public static long solution(long n) {
        long answer = 0;
        
        for(answer = 1; answer <= n; answer++){
            if(answer*answer == n)
                return (answer+1)*(answer+1);
        }
        return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
}
