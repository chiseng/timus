/*
...Of course, a number was a team's eigenvalue if it was an eigenvalue for each of its players....

The input data consist of three blocks two lines each. The first line of each block contains the number n of a player's eigenvalues (1 ≤ n ≤ 4 000). In the second line you are given n distinct integers in ascending order, which are the eigenvalues. All the eigenvalues are positive integers not exceeding 109.

Output the number of eigenvalues of the Psych Up team.

Sample
input	            output
5                   3
13 20 22 43 146
4
13 22 43 146
5
13 43 67 89 146
*/



import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class infosyss {
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        int count=0;
           inScanner.nextLine();

            String[] eigen1 = inScanner.nextLine().split(" ");
           
           inScanner.nextLine();
           HashSet<String> newHS= new HashSet<>(Arrays.asList(inScanner.nextLine().split(" ")));
            
            inScanner.nextLine();
            HashSet<String> eigen3 = new HashSet<>(Arrays.asList(inScanner.nextLine().split(" ")));
            for(int i=0;i<eigen1.length;i++){
                if (newHS.contains(eigen1[i]) && eigen3.contains(eigen1[i])) {
                    count++;
                }

            }

        System.out.println(count);








        }



    }
