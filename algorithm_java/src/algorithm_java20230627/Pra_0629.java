package algorithm_java20230627;


public class Pra_0629 {
    //최댓값과 최솟값
    //https://school.programmers.co.kr/learn/courses/30/lessons/12939
    public static void main(String[] args){
        //String answer = "";
        String test = "7 3 5 4";
        String[] str = test.split("\\s");
        int[] arr=new int[10];
        for(int i=0 ; i<str.length ; i++){
            arr[i] = Integer.parseInt(str[i]);
            System.out.println("arr 값 확인####"+arr[i]);
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0 ; i<str.length ;i++ ){
                if( arr[i] < min){
                    //최소
                    min = arr[i];        
                }
                else if ( arr[i] > max){
                    //최대
                    max = arr[i];
                }
        }
        System.out.println("min = "+min+"  max = "+max);
    }
}
