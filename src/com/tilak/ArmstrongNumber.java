package com.tilak;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int value=number;
		int sum=0;
		while(number>0) {
			int rem=number%10;
			number/=10;
			sum= sum + rem*rem*rem;
		}
		//System.out.println(sum);
		
		if(value==sum) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		sc.close();
	}
}
