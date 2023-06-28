package algorithm_java20230627;

import java.util.Scanner;

public class Pra_0628_2 {
    // 문자열 반복해서 출력하기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for( int i=0 ; i<n ; i++ ){
            System.out.print(str);
        }
    }
}
