package programmers.summer_winter_coding;

import java.util.Arrays;

public class budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i : d){
            if(budget >= i){
                budget -= i;
                answer++;
            }
        }
        return answer;
    }
}
