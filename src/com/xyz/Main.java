package com.xyz;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);  

int a;
int b;

Calculator object = new Calculator();
System.out.println("Enter the first number:");
a =sc.nextInt();
System.out.println("Enter the second number:");
b=sc.nextInt();
System.out.println("Calculation of the number");
System.out.println("The sum of the first and second no : "+object.sum(a,b));
System.out.println("The sub of first and second no : "+object.sub(a,b));
System.out.println("The mul of first and second no: "+object.mul(a,b));
System.out.println("The divide of first and second no: "+object.divide(a,b));

sc.close();
	}

}