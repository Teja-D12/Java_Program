package Halveit;

public class NumberHalver {
	
	    public static double halveTheNumber(double num) {
	        // Calculate the half of the number
	        double half = num / 2;
	        return half;
	    }

	    public static void main(String[] args) {
	        double num = 150.00;
	        double result = halveTheNumber(num);
	        System.out.printf("%.2f%n", result);
	    }
	}


