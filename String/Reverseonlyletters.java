class Solution {
    public String reverseOnlyLetters(String S) {
        int i = 0, j = S.length() - 1;
		char[] s = S.toCharArray();

		while (i < j) {
			while (i < s.length && !isAlphabet(s[i]))
				++i;
			if (i == s.length)
				break;
			while (j >= 0 && !isAlphabet(s[j]))
				--j;
			if (i < j) {
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				++i;
				--j;
			}
		}

		return new String(s);
	}

	public boolean isAlphabet(char c) {
		if (c < 65 || (90 < c && c < 97) || 122 < c)
			return false;
		else
			return true;
	}
}
