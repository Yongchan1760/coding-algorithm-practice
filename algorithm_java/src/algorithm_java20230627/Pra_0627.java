package algorithm_java20230627;

public class Pra_0627 {
    public static int main(String[] babbling) {
        //babbling를 매개변수로 전달 받았을때
        int answer = 0;
        for(int i=0 ; i<babbling.length; i++){//전달받은 매개변수 길이 만큼
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma)+$)")){
                answer++;// 매개변수 배열 0번째 부터 차례대로 원하는 값이 있을때 
                        // 아이가 옹알거린 횟수만큼 answer 값을 증가 시킨다.
                        // ? : 앞의 표현식이 없거나 최대 한번만.
            }
        }
        return answer;
    }
}

//머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 
//조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
//문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

//문제 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120956