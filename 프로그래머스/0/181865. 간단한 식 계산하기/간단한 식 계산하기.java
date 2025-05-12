class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split("[+\\-*]");
        char operator = ' ';
        for(char c : binomial.toCharArray()) {
            if(c=='+'||c=='-'||c=='*') {
                operator = c;
                break;
            }
        }
        if(operator == '+') return Integer.parseInt(split[0].trim()) + Integer.parseInt(split[1].trim());
        if(operator == '-') return Integer.parseInt(split[0].trim()) - Integer.parseInt(split[1].trim());
        if(operator == '*') return Integer.parseInt(split[0].trim()) * Integer.parseInt(split[1].trim());
        return answer;
    }
}