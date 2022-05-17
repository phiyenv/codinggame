import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;
/* In this exercise, you must analyze a temperature reading to find out which temperature is closest to zero.
Write a program that displays the temperature closest to 0 among the input data. If two numbers are equally close 
to zero, then the positive integer will be considered to be closer to zero (for example, if the temperatures are 
-5 and 5, then display 5).

Inputs :
*******
Your program must read the data from the standard input and write the result to the standard output.

Input :
*******
Line 1 : The number N of temperatures to analyze.

Line 2 : A string containing the N temperatures expressed as integers from -273 to 5526

Output :
********
Display 0 (zero) if no temperature is provided. Otherwise, display the temperature closest to 0

Constraints
***********
0 ≤ N < 10000


*/
class Solution {

    public static void main(String args[]) {
        //Read inputs
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] t = new int[n];
        int closest2zero = 0 ;

        //if no temperatures 
		if(n <= 0) {
			System.out.println(0); 
			in.close();
			return;
		}

        for (int i = 0; i < n; i++) {
             //t[i] = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
             int result = in.nextInt();
             if( closest2zero == 0 || Math.abs(closest2zero) > Math.abs(result)
                    || Math.abs(closest2zero) == Math.abs(result) && closest2zero < result) {
                        closest2zero = result;
                    }

        }

        //Print closest temperature to 0
        System.out.println(closest2zero);
        in.close();

    }
}