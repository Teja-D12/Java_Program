package Arithmaticoperator;

public class ArithmaticOperatorr {
	public static void main(String[] args) {
		
	int res1=subtractNumbers(20,5);
	System.out.println(res1);
	
	int res2=multiplicationNumbers(4,5);
	System.out.println(res2);
	
	double res3=divisionNumbers(20,4);
	System.out.printf("%.2f\n",res3);
	
	int res4=remainderNumbers(4,3);
	System.out.println(res4);
	}

	
	
	public static int subtractNumbers(int num1,int num2)
	{
		return num2-num1; 
	}
	public static int multiplicationNumbers(int num1,int num2)
	{
		return num1*num2; 
	}
	public static double divisionNumbers(int num1,int num2)
	{
		return num1/num2; 
}
	public static int remainderNumbers(int num1,int num2)
	{
		return num1%num2; 
	}
}
	
