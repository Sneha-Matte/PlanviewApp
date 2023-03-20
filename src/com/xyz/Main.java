package com.xyz;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);  

int a;
int b;

Calculator object = new Calculator();
System.out.println("Enter first number:");
a =sc.nextInt();
System.out.println("Enter second number:");
b=sc.nextInt();
System.out.println("The sum of first and second no : "+object.sum(a,b));
System.out.println("The sub of first and second no : "+object.sub(a,b));
System.out.println("The mul of first and second no: "+object.mul(a,b));
System.out.println("The divide of first and second no: "+object.divide(a,b));

sc.close();
	}

}