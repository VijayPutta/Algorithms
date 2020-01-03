class Solution {
    public int rotatedDigits(int N) {
        int sum=0;
        for(int i=1;i<=N;i++){
            String s = Integer.toString(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                char x=s.charAt(j);
                if(x=='2' || x=='5' || x=='6' || x=='9') 
                    count++;
                else if(x=='3' || x=='4' || x=='7'){
                    count=0;
                    break;
                }
            }
            if(count>0){
                sum++;
            }
        }
        return sum;
    }
}
