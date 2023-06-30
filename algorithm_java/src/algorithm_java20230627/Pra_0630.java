package algorithm_java20230627;

public class Pra_0630 {
    /* 
     <뒤에 있는 큰 수 찾기>
     - 조건
     자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
     (1 ≤ numbers[i] ≤ 1,000,000)
     1. 자신보다 뒤 -> i, i+1
     2. 자신보다 크면서 -> arr[i] < arr[i+1]
     3. 가장 가까이 있는 큰수  차례대로 체크할때 큰수가 있는 경우 cnt를 1씩 증가시키고 cnt가 1인경우 가장 가까이 있는 큰수이다.
     4. for문 비교 마지막 단계에서 i가 3인경우 j는 4라서 4는 값이 없으므로 0이다. 이 경우 마지막 값이 0이 나올수있다. 
        값이 없는 배열 j 4는 0으로 보이는데 보통 마지막 숫자의 경우 -1로 나오므로 0의 값을 가졌다면 0으로 변환.
            
     */
    //https://school.programmers.co.kr/learn/courses/30/lessons/154539
    public static void main(String[] args){
        //int arr[] = {9,1,5,3,6,2};
        int arr[] = {2,3,3,5};
        int crr[] = new int[10]; 
        int cnt=0;
        /*
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        for(int i=0 ; i<arr.length ; i++){
            cnt=0;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] < arr[j] ){
                    cnt++;
                    if(cnt==1){
                        crr[i] = arr[j];
                        System.out.println("현재 순서 i는"+i+"  j 순서는"+j);
                        System.out.println("crr 배열의 값은?"+crr[i]);
                        break;
                    }
                }else {
                    crr[i] = -1;
                    System.out.println("조건에 부합하지않음! 현재 순서 i는"+i+"  j 순서는"+j);
                }
            }    
        }
             for(int i=0;i<arr.length;i++){
                if(crr[i]==0){
                    crr[i] = -1;
                }
                System.out.println("crr ? "+crr[i]);
            }
    }
}
