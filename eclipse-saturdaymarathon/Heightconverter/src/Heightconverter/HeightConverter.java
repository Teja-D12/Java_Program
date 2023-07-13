package Heightconverter;

public class HeightConverter {
	
 public double convertInchesToFeet(double inches) {
// Convert inches to feet using the conversion factor 1 foot = 12 inches
	    double feet = inches / 12;
	    return feet;
	    }

	    public static void main(String[] args) {
	    HeightConverter converter = new HeightConverter();
	     double inches = 72.0;
	     double feet = converter.convertInchesToFeet(inches);
	     System.out.printf("%.2f%n", feet);
	    }
	}


