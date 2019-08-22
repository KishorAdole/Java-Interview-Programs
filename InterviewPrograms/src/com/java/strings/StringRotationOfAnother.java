package com.java.strings;

import java.util.Scanner;

/*
 * Check Given String is Rotation of Another String 
 * Say String 1 : abcd
 * Say String 2 : bcda
 * String 2 is rotation of string 1
 * Rotation means order should be maintained, same set of characters forming another 
 * string without changing its order ( like b follows a, d follows c)
 */
public class StringRotationOfAnother {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string 1 ::");
		String str1 = scanner.nextLine().trim();
		System.out.println("Enter the string 2 ::");
		String str2 = scanner.nextLine().trim();
		
		if(checkStringRotation(str1, str2))
			System.out.println("String 2 is rotation of String 1");
		else
			System.out.println("Both strings are matched by rotation.");
	}
	
	private static boolean checkStringRotation(String str1,String str2){
		if(str1 == null || str2 == null)
			return false;
		if(str1.length() != str2.length())
			return false;
		
		//adding both string
		str1 = str1 + str1;
		
		if(str1.contains(str2))
			return true;
		
		return false;
	}
}

/*
	OUTPUT
	
	Enter the string 1 :: greeting
	Enter the string 2 :: inggreet
	String 2 is rotation of String 1
	
	Enter the string 1 :: abcdef
	Enter the string 2 :: bcdefa
	String 2 is rotation of String 1

	Enter the string 1 :: java
	Enter the string 2 :: jaav
	Both strings are matched by rotation.

*/