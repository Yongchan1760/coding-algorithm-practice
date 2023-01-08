package algorithm_java202301;

import java.util.Iterator;
import java.util.Scanner;

public class lv001 {
	// 옹알이_001 
	public static void main(String[] args) {
		//배열 선언
		String[] speak = new String[10];
		int sum = 0;
		//입력값 받음
		System.out.println("baby speak :");
		Scanner baby = new Scanner(System.in);
		//아기가 말한 내용 배열에 저장
		int size = speak.length;//초기값은 speak 배열의 크기 10이 저장.
		for(int i=0 ; i<size ; i++) {
			speak [i] = baby.next();
			System.out.println("speak "+ i +" "+ speak[i]);
			switch(speak[i]) {
				case "aya": 
					sum+=1;
					continue;
				case "ye": 
					sum+=1;
					continue;
				case "woo": 
					sum+=1;
					continue;
				case "ma": 
					sum+=1;
					continue;	
				default :
					break;
			}
		}
		System.out.println("baby sum ?"+sum);
	}

}
