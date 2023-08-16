package NumberPrograms;

import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		int a=1;
		int n=5;
		for (int r=5;r>=1;r--)
		{
			for(int sp=0;sp<=n-r;sp++) {
			}
			System.out.print("  ");
		
		for (int st = 0; st < (2*r)-1; st++) {
			
		
			for (int c=1;c<=9;c++)
			{
			System.out.print(" "+a++);	
			}
		}
			System.out.println();
			a++;
		}
	}
}



