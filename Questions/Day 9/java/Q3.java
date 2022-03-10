class Solution {
   public static String restoreString(String s, int[] indices) {
        char[] a = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
			a[indices[i]] = s.charAt(i);
		}
		return new String(a);
    }
}
