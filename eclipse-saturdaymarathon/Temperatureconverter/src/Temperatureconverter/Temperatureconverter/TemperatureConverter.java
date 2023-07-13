package Temperatureconverter.Temperatureconverter;
import java.util.*;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double a=scan.nextDouble();
		double res=Fahrentocelsius(a);
		System.out.println(res);
		
		
	}
	public static double Fahrentocelsius(double a)
	{
		double c=(a-32)*5/9;
		return c;
	}
}

