/*
The statement of this problem is very simple: you are to determine how many squares of the chessboard can be attacked by
a knight standing alone on the board. Recall that a knight moves two squares forward (horizontally or vertically in any direction)
and then one square sideways (perpendicularly to the first direction).
Input
The first line contains the number N of test cases, 1 ≤ N ≤ 100.

Each of the following N lines contains a test: two characters.

The first character is a lowercase English letter from 'a' to 'h' and the second character is an integer from 1 to 8;

they specify the rank and file of the square at which the knight is standing.


Output
Output N lines. Each line should contain the number of the squares of the chessboard that are under attack by the knight.
Sample
input	output
3       2
a1      8
d4      6
g6
 */



import java.util.*;
import java.lang.*;

public class infosyss {
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        int[] move_row=new int[]{-2,-2,-1,-1, 1,1, 2,2};
        int[] move_col=new int[]{-1, 1,-2, 2,-2,2,-1,1};
        int input=inScanner.nextInt();
        String[] pos=new String[input];
        for(int i=0;i<pos.length;i++){
            pos[i]=inScanner.next();
        }


        for(int i=0;i<pos.length;i++){
            int ans=0;

           int row=pos[i].charAt(0)-'a';

           int col=Character.getNumericValue(pos[i].charAt(1))-1;

           for(int j=0;j<8;j++) {
               int row2;
               int col2;
               row2 = row + move_row[j];
               col2 = col + move_col[j];
               if (row2 >= 0 && row2 < 8 && col2 >= 0 && col2 < 8) ans++;
           }
           System.out.println(ans);
           }





        }



    }
