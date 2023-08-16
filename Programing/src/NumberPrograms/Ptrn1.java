package NumberPrograms;

public class Ptrn1 {
	public static void main(String[] args) {
		char ch='z';
		int n=5;
		for (int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch);
				ch=--ch;
			}
			System.out.println();
		}
	}

}
