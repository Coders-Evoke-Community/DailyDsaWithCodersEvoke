class Solution {
    public boolean checkString(String s) {
        int countA = 0;
        for (int i=0; i<s.length(); ++i) {
            if(s.trim().charAt(i) == 'a') {
                countA++;
            }
        }
        int i=0;
        for(i=0; i<countA; ++i) {
            if (s.trim().charAt(i) == 'b') {
                return false;
            }
        }
        return true;
    }
}
