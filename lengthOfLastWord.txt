public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
      /*  LinkedList<String> words = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            while(i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }
            String word = sb.toString();
            if (!word.equals(""))
                words.add(sb.toString());
        }
        int length = words.size();
        if (length == 0)
            return 0;
        return words.get(length - 1).length(); */
        int length = s.length();
        int i = length - 1;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        int wordLength = 0;
        while(i >= 0 && s.charAt(i) != ' ') {
            wordLength++;
            i--;
        }
        return wordLength;
    }