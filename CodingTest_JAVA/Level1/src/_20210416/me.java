package _20210416;

import java.util.*;

public class me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 1, 3, 3, 0, 1, 1};
		
		int[] answer = {};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int a = arr[0];
        int b = 0;
        
        al.add(a);
        for(int i=1; i<arr.length; i++){
            if(a != arr[i]){
                a = arr[i];
                al.add(a);
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(al);
	}
}
