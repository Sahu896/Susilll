package NumberPrograms;

import java.util.Scanner;

public class ElgblForVtOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the age");
		int age=sc.nextInt();
		System.out.println("plz enter the ctgn");
		String ctgn=sc.next();
		if(age>=18 && ctgn.equals("india"))
		{
			System.out.println("elgbl for vt");
		}
		else
		{
			System.out.println("not elgbl for vt");
		}
	}

}
