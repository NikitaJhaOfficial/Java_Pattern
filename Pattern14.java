public class Pattern14
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<=5;i++)
		{
			int ascii=65;
			for(int j=1; j<=i; j++)
			{
				
				char ch=(char)ascii;
				ascii++;	
				System.out.print(ch + " ");
			}
				System.out.println();
		}
	}
	}