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
public class JavaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}