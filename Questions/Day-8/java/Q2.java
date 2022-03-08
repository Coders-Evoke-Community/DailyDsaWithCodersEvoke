class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String i: operations) {
            switch (i) {
                case "X++" -> x++;
                case "++X" -> ++x;
                case "--X" -> --x;
                case "X--" ->  x--;
            }
        }
        return x;
    }
}
