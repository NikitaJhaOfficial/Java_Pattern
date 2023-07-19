public class Pattern15
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<=5;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				int ascii=65;
				char ch=(char)ascii;
				ascii++;	
				System.out.print(ch + " ");
			}
				System.out.println();
		}
	}
	}