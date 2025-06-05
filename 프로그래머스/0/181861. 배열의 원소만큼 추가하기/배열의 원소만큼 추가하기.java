import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i : arr) {
            len += i;
        }
        int[] answer = new int[len];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        for(int k=0; k < len; k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}