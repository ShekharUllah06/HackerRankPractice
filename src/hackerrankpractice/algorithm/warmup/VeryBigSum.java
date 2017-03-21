/*
 * Copyright (C) 2017 Shekhar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package hackerrankpractice.algorithm.warmup;
/**
 * Problem Statements
 * You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.
 * Input Format
 * The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.
 * Output Format
 * Print a single value equal to the sum of the elements in the array.
 * Constraints 
 * Sample Input
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * 5000000015
 * Note:

* The range of the 32-bit integer is .
* When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.
*/
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author Shekhar
 */
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        BigInteger sum=BigInteger.ZERO;
        for(int arr_i=0; arr_i < n; arr_i++){
            sum=sum.add(new BigInteger(""+arr[arr_i]));
        }
        System.out.println(sum);
    }
}
