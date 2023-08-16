package NumberPrograms;

public class Ptrn {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for (int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if (col==1 || col==4 || row==1 || row==4)
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
