/*
 * Copyright (C) 2017 Abdullah Shekhar
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
package hackerrankpractice.old.contest.WeekofCode29;

import java.util.Scanner;

/*
Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the  day of the year) during a year in the inclusive range from to .

From  to , Russia's official calendar was the Julian calendar; since  they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in , when the next day after January  was February . This means that in , February  was the  day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has days during a leap year, and  days during all other years. In the Julian calendar, leap years are divisible by ; in the Gregorian calendar, leap years are either of the following:

Divisible by .
Divisible by  and not divisible by .
Given a year, , find the date of the  day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .

Input Format

A single integer denoting year .

Constraints

Output Format

Print the full date of Day of the Programmer during year  in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .

Sample Input 0

2017
Sample Output 0

13.09.2017
Explanation 0

In the year , January has  days, February has  days, March has  days, April has  days, May has  days, June has  days, July has  days, and August has  days. When we sum the total number of days in the first eight months, we get . Day of the Programmer is the  day, so then calculate  to determine that it falls on day  of the  month (September). We then print the full date in the specified format, which is 13.09.2017.

Sample Input 1

2016
Sample Output 1

12.09.2016
Explanation 1

Year  is a leap year, so February has  days but all the other months have the same number of days as in . When we sum the total number of days in the first eight months, we get . Day of the Programmer is the  day, so then calculate  to determine that it falls on day  of the month (September). We then print the full date in the specified format, which is 12.09.2016.
*/

/**
 *
 * @author Abdullah Shekhar
 */
public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        boolean isLeapyear=false;
        if(y>=1700 && y<=1918){
            if(y%4==0){
                isLeapyear=true;
            }
        }else{
            if((y%400==0) || (y%4==0 && y%100!=0)){
                isLeapyear=true;
            }
        }
        if(isLeapyear){
            System.out.println("12.09."+y);
        }else{
            System.out.println("13.09."+y);
        }
    }
}
