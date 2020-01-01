class Solution {
    public int balancedStringSplit(String s) {
        int count = 0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                max++;
            }
        }
        return max;
    }
}
