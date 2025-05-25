class Solution {
    public int solution(int[] num_list) {
        
        int sum1 = 0;
        int sum2 = 1;
        if(num_list.length >= 11){
            for(int i=0; i < num_list.length; i++) {
                sum1 += num_list[i];
            }
            return sum1;
        }else{
            for(int i=0; i < num_list.length; i++) {
                sum2 *= num_list[i];
            }
            return sum2;
        }
    }
}