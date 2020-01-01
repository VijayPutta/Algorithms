class Solution {
    public String toLowerCase(String str) {
        int c = 0;
        String s = "";
        for(int i=0;i<str.length();i++){
            c = 0;
            c = (int)str.charAt(i);
            if(c > 64 && c < 91){
                c += 32;
            }
            s += (char)c;
        }
        return s;
    }
}
