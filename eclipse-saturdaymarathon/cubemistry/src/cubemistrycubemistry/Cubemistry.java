package cubemistrycubemistry;
import java.util.*;
public class Cubemistry {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=scan.nextInt();
		int res=cubeOfNumbers(num);
		System.out.println("cube of the number is " +res);
	}
	public static int cubeOfNumbers(int num)
	{
		int res=num*num*num;
		return res;
	}
	}


