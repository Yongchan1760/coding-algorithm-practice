package algorithm_java_LV1;

import java.util.HashMap;
/*
 *  달리기 경주
 *  https://school.programmers.co.kr/learn/courses/30/lessons/178871
 * 
 */
public class Pra_0706 {
    public static String[] main(String[] players, String[] callings){
        int n = players.length;
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i  < n; i++){
            indexMap.put(players[i], i);
        }

        for (String calling : callings){
            int idx = indexMap.get(calling);
            if (idx > 0){
                String temp = players[idx - 1];
                players[idx -1] = players[idx];
                players[idx] = temp;

                indexMap.put(players[idx - 1], idx - 1);
                indexMap.put(players[idx], idx);
            }
        }
        return players;
    }
}

