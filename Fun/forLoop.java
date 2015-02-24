
public class forLoop {

	public static void main(String[] args)
	{
		
		int x = 1;
		
		for (int i = 1; i <=36; i++)
		{	
			System.out.print(x);
			if (i == 12 || i == 18 || i == 24 || i == 30)
			{
				System.out.println("a");
				for (int j = 1; j <= 5; j++)
				{
					if (i == 18 && j == 5)
					{
						System.out.println("b");
						for (int k = 1; k <= 4; k++)
						{
							if (i == 30)
							{
								System.out.println("c");
								for (int m = 1; m <=3; m++)
								{
									
										System.out.println();
										for (int n = 1; n <=2; n++)
										{
											if (i == 36 && n == 2)
												System.out.println(x);
											System.out.print(x);
										}
									
									System.out.print(x);
								}
							}
							System.out.print(x);
						}
					}
					System.out.print(x);

				}
			}
			
			if (i == 6 || i == 12 || i == 18 || i == 24 || i == 30)
			{
				if (x <3)
					System.out.println("o");
				x++;
				
			}
		}
		
	}
}
