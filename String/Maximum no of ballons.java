class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        for(int i=0;i<text.length();i++){
            arr[text.charAt(i)-'a']++;
        }
        int maxballons = 0;
        while(true){
            if(arr['b'-'a'] >= 1 && arr['a'-'a'] >= 1 &&arr['l'-'a'] >= 2 && arr['o'-'a'] >= 2 &&arr['n'-'a'] >= 1){
                maxballons++;
                arr['b'-'a'] -= 1;
                arr['a'-'a'] -= 1;
                 arr['l'-'a'] -= 2;
                arr['o'-'a'] -= 2;
                 arr['n'-'a'] -= 1;
            }else{
                return maxballons;
            }
        }
    }
}
