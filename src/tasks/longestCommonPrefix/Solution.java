package tasks.longestCommonPrefix;
public class Solution {

    public boolean isCharOnIndex(String[] strs, int index, String symbol) {

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()-1 < index) {
                return false;
            }
            if (!strs[i].split("")[index].equals(symbol)) {
                return false;
            }
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {

        String prefix = "";

        for (int i = 0; i < strs[0].length(); i++) {
            String symbol =  strs[0].split("")[i];
            if (isCharOnIndex(strs, i, symbol)){
                prefix = prefix.concat(symbol);
            } else {
                return prefix;
            }
        }

        return prefix;
    }
}