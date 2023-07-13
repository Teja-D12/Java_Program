package Kodnestcalculator;
import java.util.*;
public class KodnestCalculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
	void add() {
	System.out.println("Addition result "+((num1+num2)));
	}
	
	void sub() {
	System.out.println("Subtraction result "+((num1-num2)));
	}
	
	void mul() {
	System.out.println("Multiplication result "+((num1*num2)));
	}
	
	void div()
	{
		System.out.println("Division result "+((num1/num2)));
	}
	
	void rem()
	{
	System.out.println("Remainder result "+((num1%num2)));
	}
	
	void square() {
	System.out.println("square result "+((num1*num2)));
	}
	
	void stop() {
		System.out.println("stop number "+!num);
	}
	
}
	
}
