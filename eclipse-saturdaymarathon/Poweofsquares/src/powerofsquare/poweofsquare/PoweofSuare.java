package powerofsquare.poweofsquare;
import java.util.*;
public class PoweofSuare {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int res=powerOfSquares(num);
	System.out.println("power square of the number " +res);
	}
	public static int powerOfSquares(int num)
	{
		int res=num*num;
		return res;
	}
	}


