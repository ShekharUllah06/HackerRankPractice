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
package hackerrankpractice.java.introduction;

import java.util.Scanner;

/**
 *
 * @author Shekhar
 */
public class IfElse {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if(n>=2 &&n<=5){
                    ans = "Not Weird";
                }else if(n>=6 &&n<=20){
                    ans = "Weird";
                }else if(n>=20){
                    ans = "Not Weird";
                }
                
            }
            System.out.println(ans);
            
    }
}
