class Solution {
    public String solution(int age) {
        String answer = "";
        String alpha = "abcdefghij";
        String agestring = age+"";
        for(int i=0; i < agestring.length(); i++) {
            answer += alpha.charAt((agestring.charAt(i)-'0'));
        }
        return answer;
    }
}