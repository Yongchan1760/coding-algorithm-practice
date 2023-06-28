package algorithm_java20230627;

import java.util.Scanner;

public class Pra_0628_1 {
    //a와 b 출력하기
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /* 
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String str3 = "a = "+str1;
        String str4 = "b = "+str2;
        if( a >= -100000 && a <= 100000 && b >= -100000 && b <= 100000 ){
            //String a = 
        }
        문제 접근 방식 실패
        1. sys 출력문을 변경하지 않고 풀어야하는줄 알았다.
        2. 사실 엄청 간단했다..
        
        ## 실패한 접근 방법
        1. 입력된 정수를 String으로 변경하고 "a =" + a 같은 형태로 변경하려했음   
        */
        System.out.println("a = "+a+"\n"+"b = "+b);
     }
}
