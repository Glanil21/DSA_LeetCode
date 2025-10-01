public class Solution {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return decode(0, s, memo);
    }
    private int decode(int i, String s, HashMap<Integer, Integer> memo) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int ways = decode(i + 1, s, memo);
        if (i + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(i, i + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += decode(i + 2, s, memo);
            }
        }
        memo.put(i, ways);
        return ways;
    }
}