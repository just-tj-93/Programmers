class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        if(split[1].equals("+")) return Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
        if(split[1].equals("-")) return Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
        if(split[1].equals("*")) return Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        return answer;
    }
}