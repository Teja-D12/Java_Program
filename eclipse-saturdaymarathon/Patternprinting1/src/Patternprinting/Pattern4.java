package Patternprinting;

public class Pattern4 {
	public static void main(String[] args) {
		int i;
		int j;
		 int n=5;
		 for(i=1;i<=n;i++)
		 {
		for(j=1;j<=n;j++)	 
		{
			if(i==1 || i==5 || j==1 || j==5)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
			System.out.println();
		
		 }
	}
	}

