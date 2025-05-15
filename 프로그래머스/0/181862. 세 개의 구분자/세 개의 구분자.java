class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        myStr = myStr.replaceAll("[abc]+"," ").replace("//s+"," ").trim();
        if(myStr.length() == 0) return answer;
        answer = myStr.split(" ");
        return answer;
    }
}