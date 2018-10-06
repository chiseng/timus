/*
You probably know that Alex is a very serious mathematician and he likes to solve serious problems. This is another problem from Alex.


You are given three non-negative integers a, b, c. You have to arrange them in some order and put +, − or × signs between
them to minimize the outcome of the resulting expression. You are not allowed to use unary minus and parentheses in the
expression. There must be exactly one sign between every pair of neighbouring numbers.
You should use standard order for performing operations (multiplication first, addition and subtraction then).

There are three lines with one integer in each line. The numbers are arranged in non-decreasing order (0 ≤ a ≤ b ≤ c ≤ 100)

Output
Print one number — the minimal outcome.

Sample
input	output
1        -5
2
3
 */


import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class infosyss {
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        int count=0;
           inScanner.nextLine();

            HashSet<String> eigen1 = new HashSet<>(Arrays.asList(inScanner.nextLine().split(" ")));



            inScanner.nextLine();
           HashSet<String> newHS= new HashSet<>(Arrays.asList(inScanner.nextLine().split(" ")));
            inScanner.nextLine();

            HashSet<String> eigen3 = new HashSet<>(Arrays.asList(inScanner.nextLine().split(" ")));
            Iterator iter =eigen1.iterator();
            while(iter.hasNext()){
                if (newHS.contains(iter.next()) && eigen3.contains(iter.next())) {
                    count++;
                }

            }




        System.out.println(count);








        }



    }
