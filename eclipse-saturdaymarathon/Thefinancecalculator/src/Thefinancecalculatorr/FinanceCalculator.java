package Thefinancecalculatorr;

public class FinanceCalculator {

	    public double calculateSimpleInterest(double principal, double rate, double time) {
	        // Calculate the simple interest using the formula I = P * R * T
	        double interest = principal * rate * time;
	        return interest;
	    }

	    public static void main(String[] args) {
	        FinanceCalculator calculator = new FinanceCalculator();
	        double principal = 1000.0;
	        double rate = 0.05;
	        double time = 2.0;
	        double interest = calculator.calculateSimpleInterest(principal, rate, time);
	        System.out.printf("%.2f%n", interest);
	    }
	}


