public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < 9 ; i++) {
            set.clear();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j]))
                        return false;
                    else
                        set.add(board[i][j]);
                }
            }
        }
        for(int i = 0; i < 9 ; i++) {
            set.clear();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    if(set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);
                }
            }
        }
        
        for(int i = 0; i < 3; i++ ) {
            for(int j = 0; j < 3; j++) {
                set.clear();
                for(int m = i*3; m < i*3 + 3; m++) {
                    for(int n = j*3; n < j*3 + 3;n++) {
                        if(board[m][n] != '.') {
                            if(set.contains(board[m][n]))
                                return false;
                            else
                                set.add(board[m][n]);
                        }
                    }
                }
            }
        }
        return true;
    }
}