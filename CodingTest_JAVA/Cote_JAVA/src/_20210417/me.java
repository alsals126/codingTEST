package _20210417;

import java.util.*;

public class me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 36, 1, 3};
		int divisor = 1;
		
		int[] answer = {};
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                al.add(arr[i]);
            }
        }
        
        Collections.sort(al);
        
        int size = al.size();
        
        if(size == 0){
            answer = new int[1];
            answer[0] = -1;
        }else
            answer = new int[size];
      
        for(int i=0; i<size; i++)
            answer[i] = al.get(i).intValue();
        
        // ����� �߳������� ���
     	System.out.print("[ ");
     	for(int i=0; i<answer.length; i++) {
     		System.out.print(answer[i] + " ");
     	}
     	System.out.print("]");           
	}
}