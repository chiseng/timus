/*
Little Boy wants to use Karlsson's addiction to the games of chance and suggests playing the following game.
A chocolate bar can be considered as a rectangle of square “units” arranged in m rows and n columns and separated by “lines”.

Two players take alternate turns. At his turn, a player must take one piece of chocolate and split it into two along one of the lines.
If a player can't make a legal move (which happens when all pieces of chocolate consist of a single unit square), he loses, and the winner takes all the chocolate.
But Karlsson is smart enough! He immediately understood who should make the first turn in order for Karlsson to win, assuming that players take optimal turns. Can you guess that?


Input
The only line of the input contains space-separated integers m and n (1 ≤ m, n ≤ 50).

Output
If Karlsson should start the game in order to win, output “[:=[first]”; otherwise, output “[second]=:]”.
Samples
input	output
2 4     [:=[first]
1 3     [second]=:]
 */


import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class infosyss {
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        int count=0;
        String[] splits=inScanner.nextLine().split(" ");
            if(Integer.valueOf(splits[0])%2==0 || Integer.valueOf(splits[1])%2==0){
                System.out.println("[:=[first]");
            }
            else System.out.println("[second]=:]");
        }












    }
