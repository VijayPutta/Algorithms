  class Solution {
      public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        int pLen = pattern.length();
        for (String word : words) {
            int[] w = new int[26];
            int[] p = new int[26];
            boolean matches = true;
            for (int i = 0; i < pLen; i++) {
                int wCh = word.charAt(i) - 'a';
                int pCh = pattern.charAt(i) - 'a';
                if (w[wCh] != p[pCh]) {
                    matches = false;
                    break;
                }
                w[wCh] = p[pCh] = i + 1;
            }
            if (matches)
                res.add(word);
        }
        return res;
    }
  }
