package NumberPrograms;

import java.util.Scanner;

public class ElgbleForBloodDonateOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the age");
		int age=sc.nextInt();
		System.out.println("plz enter the wt");
		double wt=sc.nextDouble();
		if(age>=18 && wt>=45.0)
		{
			System.out.println("elgble for bld donate");
		}
		else
		{
			System.out.println("not elgble for vot");
		}
	}

}
