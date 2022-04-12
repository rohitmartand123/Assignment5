package com.BridgeLabzAssignment5;

import java.util.Scanner;

import Utility.Util;

public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter year is a Leap Year or not : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		Util.leapYear(num);
	}

}


