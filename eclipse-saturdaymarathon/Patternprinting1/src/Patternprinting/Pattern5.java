package Patternprinting;

public class Pattern5 {
public static void main(String[] args) {
	int i;
	int j;
	int n=5;
	
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)	
		{
			if(i==1 || i==n || j==1 || j==n)
			{
			System.out.print( i );	
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
