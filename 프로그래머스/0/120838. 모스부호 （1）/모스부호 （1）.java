class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] split = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i < split.length; i++) {
            for(int j=0; j < morse.length; j++) {
                if(split[i].equals(morse[j])) {
                    answer += (char)(j+'a');
                }
            }
        }
        return answer;
    }
}