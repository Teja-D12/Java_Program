package Doublenumber;
import java.util.*;
public class DoubleNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number" );
		int num=scan.nextInt();
		int res=doubleTheNumber(num);
		System.out.println("Double result is " + res);
	}
	public static int doubleTheNumber(int num)
	{
		int res=num*2;
		return res;
	}
}
