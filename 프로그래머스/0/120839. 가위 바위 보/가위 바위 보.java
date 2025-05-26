class Solution {
    public String solution(String rsp) {
        return rsp.replaceAll("2","temp").replaceAll("5","2").replaceAll("0","5").replaceAll("temp","0");
    }
}