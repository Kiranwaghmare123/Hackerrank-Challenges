/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaStaticInitializerBlock {
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static boolean flag;
	static {
		try {
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
